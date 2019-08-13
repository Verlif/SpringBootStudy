package com.study.controller;

import com.study.entity.User;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
public class Controller {

    @Autowired
    @Qualifier(value = "user_verlif")
    private User user;

    @RequestMapping("/name")
    @ResponseBody
    String getName(
            @RequestAttribute String userId,
            String name,
            HttpServletResponse response
    ) {
        StringBuffer result = new StringBuffer()
                .append("Hello ")
                .append(name)
                .append(", user's id: ")
                .append(userId);
        response.setHeader("test", "hahahahahahahaha");
        return result.toString();
    }

    @RequestMapping("")
    @ResponseBody
    String index() {
        return "Hello " + user.getUserName();
    }

    @RequestMapping("/login")
    @ResponseBody
    String login(
            @RequestHeader("ClientToken") String token,
            @RequestParam(required = false) String account,
            @RequestParam(required = false) String password
    ) {
        return null;
    }
}
