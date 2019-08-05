package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class PictureController {

    @Autowired
    @Qualifier("image_path")
    private String imagePath;

    @Autowired
    @Qualifier("user_image")
    private int imageQuantity;

    @Autowired
    @Qualifier("name_avatars")
    private String avatarsName;

    @RequestMapping("uploadAvatars")
    public String upAvatars(
            @RequestParam("userId") String userId,
            @RequestParam("file") MultipartFile file
    ) {
        if (!file.isEmpty()) {
            String path = getAvatarsPath(userId);
            if (saveImage(file, path + avatarsName)) {
                //当图片成功上传时
                return "上传成功";
            } else {
                //当图片上传失败时
                return "上传失败";
            }
        }
        return "上传失败";
    }

    /**
     * 上传用户资源图片，包括荣誉资质等图片资源，有数量限制
     * @param userId    用户id
     * @param file      图片资源
     * @return  上传结果
     */
    @RequestMapping("uploadImage")
    public String upImage(
            @RequestParam("userId") String userId,
            @RequestParam("file") MultipartFile file
    ) {
        if (!file.isEmpty()) {
            String path = getImagePath(userId);
            File dir = new File(path);
            if (dir.listFiles().length < imageQuantity
                    && saveImage(file, path + new File(file.getOriginalFilename()).getName())) {
                //当图片成功上传时
                return "上传成功";
            } else {
                //当图片上传失败时
                return "上传失败";
            }
        }
        return "上传失败";
    }

    @RequestMapping("getAvatars")
    public String AvatarsPath(
            String userId
    ) {
        return getAvatars(userId);
    }

    /**
     * 将网络上传图片存放于服务器文件系统中
     * @param file          目标网络文件
     * @param targetName    目标文件路径
     * @return  保存是否成功
     */
    private boolean saveImage(MultipartFile file, String targetName) {
        try {
            //获取客户端文件
            File res = new File(file.getOriginalFilename());
            File target = new File(targetName);
            BufferedOutputStream out = new BufferedOutputStream(
                    new FileOutputStream(res));
            out.write(file.getBytes());
            out.flush();
            out.close();
            res.renameTo(target);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * 存放用户头像目录，当目录不存在时，自动创建
     * @param userId    用户Id，用于找寻用户目录
     * @return  本地图片路径
     */
    private String getAvatarsPath(String userId) {
        String path = imagePath + userId + "/";
        File file = new File(path);
        if (!file.exists())
            file.mkdirs();
        return path;
    }
    /**
     * 存放用户资源图片目录，当目录不存在时，自动创建
     * @param userId    用户Id，用于找寻用户目录
     * @return  本地图片路径
     */
    private String getImagePath(String userId) {
        String path = imagePath + userId + "/res/";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }
        return path;
    }
    private String getAvatars(String userId) {
        String path = getAvatarsPath(userId);
        File file = new File(path + avatarsName);
        return file.getAbsolutePath();
    }
}
