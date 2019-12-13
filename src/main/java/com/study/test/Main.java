package com.study.test;

import com.study.entity.Person;
import com.study.entity.PersonImpl;

import java.io.IOException;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger("mainLog");

    public static void main(String[] args) throws IOException {
        Person person = new PersonImpl();
        System.out.println(person.getClass().getSimpleName());
    }

}
