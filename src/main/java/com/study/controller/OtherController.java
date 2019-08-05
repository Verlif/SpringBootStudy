package com.study.controller;

import com.study.entity.Person;
import com.study.entity.User;
import com.study.proxy.Introduction;
import com.study.utils.FilePathBuilder;
import com.study.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.lang.reflect.Proxy;
import java.util.Properties;

@RestController
public class OtherController {

    @Autowired
    @Qualifier(value = "user_verlif")
    private User user;

    @Autowired
    @Qualifier("image_path")
    private String imagePath;

    @RequestMapping("/hello")
    public String hello() {
        Person person = (Person) Proxy.newProxyInstance(User.class.getClassLoader(),
                User.class.getInterfaces(), new Introduction(user));
        System.out.println(person.sayHello());
        return "hello";
    }

    @RequestMapping("url")
    public String url(String url) {
        HttpUtil httpUtil = new HttpUtil();
        return httpUtil.touchURL(url, null);
    }

    @RequestMapping("image")
    public String image(
            @RequestParam("file") MultipartFile file
    ) {

        if (!file.isEmpty()) {
            try {
                File res = new File(file.getOriginalFilename());
                File target = new File(imagePath + res.getName());
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(res));
                System.out.println(res.getName());
                out.write(file.getBytes());
                out.flush();
                out.close();
                res.renameTo(target);
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
            return "上传成功";

        } else {
            return "上传失败，因为文件是空的.";
        }
    }
}
