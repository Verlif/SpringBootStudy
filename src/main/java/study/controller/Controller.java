package study.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import study.utils.QMegCodeUtil;

import java.util.Arrays;

@RestController
@EnableAutoConfiguration
public class Controller {

//    @Autowired
//    @Qualifier(value = "user_verlif")
//    private User user;

    @GetMapping(value = "/name")
    @ResponseBody
    String getName(String name) {
        return "Hello " + name;
    }

//    @GetMapping(value = "/")
//    @ResponseBody
//    String index() {
//        return "Hello " + user.getUserName();
//    }

    @GetMapping("/sendCode")
    @ResponseBody
    String sendMessage(String number) {
        QMegCodeUtil QMegCodeUtil = new QMegCodeUtil();
        return String.valueOf(QMegCodeUtil.sendCode(new String[]{number}, new String[]{"1234"}));
    }

    @PostMapping("/login")
    @ResponseBody
    String login(
            @RequestHeader("ClientToken") String token,
            @RequestParam(required = false) String account,
            @RequestParam(required = false) String password
    ) {
        return null;
    }
}
