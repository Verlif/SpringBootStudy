package com.study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({EntityConfig.class})
public class MainConfig {
}
