package com.study.entity;

import org.springframework.stereotype.Component;

@Component
public class User implements Person{

    private int id;
    private String userName;

    public User() {}

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public String sayHello() {
        return userName + ": hello";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
