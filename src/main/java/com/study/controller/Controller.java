package com.study.controller;

import com.study.entity.Person;
import com.study.entity.User;
import com.study.proxy.Introduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import com.study.utils.QMegCodeUtil;

import java.lang.reflect.Proxy;

@RestController
@EnableAutoConfiguration
public class Controller {

    @Autowired
    @Qualifier(value = "user_verlif")
    private User user;

    @RequestMapping("/name")
    @ResponseBody
    String getName(
            @RequestAttribute String userId,
            String name
    ) {
        StringBuffer result = new StringBuffer()
                .append("Hello ")
                .append(name)
                .append(", user's id: ")
                .append(userId);
        return result.toString();
    }

    @RequestMapping(value = "/")
    @ResponseBody
    String index() {
        return "Hello " + user.getUserName();
    }

    @RequestMapping("/sendCode")
    @ResponseBody
    String sendMessage(String number) {
        QMegCodeUtil QMegCodeUtil = new QMegCodeUtil();
        return String.valueOf(QMegCodeUtil.sendCode(new String[]{number}, new String[]{"1234"}));
    }

    @RequestMapping("/login")
    @ResponseBody
    String login(
            @RequestHeader("ClientToken") String token,
            @RequestParam(required = false) String account,
            @RequestParam(required = false) String password
    ) {
        return null;
    }
}
