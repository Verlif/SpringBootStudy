package com.study.config;

import com.study.utils.PropFileUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class PropConfig {

    private PropFileUtil ptu;

    public PropConfig() {
        ptu = new PropFileUtil("params.properties");
    }

    @Bean("image_path")
    public String getImagePath() {
        String path = ptu.getProperty("path_image");
        if (!path.endsWith("/"))
            path += "/";
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return path;
    }

    @Bean("user_image")
    public int imageQuantity() {
        String quantity = ptu.getProperty("quantity_user_image");
        return Integer.parseInt(quantity);
    }

    @Bean("name_avatars")
    public String avatars() {
        return ptu.getProperty("name_avatars");
    }
}
