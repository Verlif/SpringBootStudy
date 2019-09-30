package com.study.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.*;
import org.springframework.web.context.support.ServletRequestHandledEvent;

@Configuration
public class ApplicationEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        // 在这里可以监听到Spring Boot的生命周期
        // 应用停止
        if (event instanceof ContextStoppedEvent) {
            System.out.println("ContextStoppedEvent");
        }
        // 应用抛出异常
        else if(event instanceof ServletRequestHandledEvent){
            System.out.println(((ServletRequestHandledEvent) event).getRequestUrl());
        }
    }

}