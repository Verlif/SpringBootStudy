package com.study.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.study.filter.tokenFilter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean tokenFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new tokenFilter());
        registration.addUrlPatterns("/*");
        registration.setName("tokenFilter");
        registration.setOrder(1);
        return registration;
    }

}