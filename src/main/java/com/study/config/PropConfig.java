package com.study.config;

import com.study.utils.PropFileUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropConfig {

    private PropFileUtil ptu;

    public PropConfig() {
        ptu = new PropFileUtil("path.properties");
    }

    @Bean("image_path")
    public String getPath() {
        String path = ptu.getProperty("image_path");
        if (!path.endsWith("/"))
            path += "/";
        return path;
    }
}
