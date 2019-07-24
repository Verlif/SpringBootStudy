package study.controller;

import study.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Controller {

    @Autowired
    @Qualifier(value = "user_verlif")
    private User user;

    @GetMapping(value = "/name")
    @ResponseBody
    String getName(String name) {
        return "Hello " + name;
    }

    @GetMapping(value = "/")
    @ResponseBody
    String index() {
        return "Hello " + user.getUserName();
    }
}
