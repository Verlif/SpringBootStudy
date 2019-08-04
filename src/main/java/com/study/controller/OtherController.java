package com.study.controller;

import com.study.entity.Person;
import com.study.entity.User;
import com.study.proxy.Introduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;

@RestController
public class OtherController {

    @Autowired
    @Qualifier(value = "user_verlif")
    private User user;

    @RequestMapping("/hello")
    public String hello() {
        Person person = (Person) Proxy.newProxyInstance(User.class.getClassLoader(),
                User.class.getInterfaces(), new Introduction(user));
        System.out.println(person.sayHello());
        return "hello";
    }
}
