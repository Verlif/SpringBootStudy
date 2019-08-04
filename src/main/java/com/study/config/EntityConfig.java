package com.study.config;

import com.study.entity.User;
import org.springframework.context.annotation.Bean;

public class EntityConfig {

    @Bean(name = "user_verlif")
    public User getUser() {
        return new User(1, "Verlif");
    }
}
