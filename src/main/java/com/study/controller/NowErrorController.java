package com.study.controller;

import com.study.entity.Results;
import com.study.entity.ext.FailResults;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${server.error.path:${error.path:/error}}")
public class NowErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping
    @ResponseBody
    public Results doHandleError() {
        System.out.println("异常异常异常");
        return new FailResults(FailResults.UNKNOWN_ERROR);
    }
}
