package com.study.entity;

import lombok.Data;

@Data
public class PersonImpl implements Person {

    private String mame = "123";

    @Override
    public String sayHello() {
        return null;
    }
}
