package com.study.controller;

import com.study.entity.Results;
import com.study.entity.ext.SusResults;
import com.study.utils.QMegCodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MegController {

    private static final int CODE_OVER_TIME = 60;

    /**
     * 向目标手机号发送短信验证码
     * @param phoneNumber   目标手机号
     * @return  验证码发送情况
     */
    @RequestMapping("/sendCode")
    public Results sendMsgCode(
            HttpSession session,
            String phoneNumber
    ) {
        //设置session过期时间
        session.setMaxInactiveInterval(CODE_OVER_TIME);
        String code = ranCode();
        QMegCodeUtil qmcu = new QMegCodeUtil();
        if (qmcu.sendCode(new String[]{phoneNumber}, new String[]{code})) {
            session.setAttribute("phone", phoneNumber);
            session.setAttribute("code", code);
        }
        return new SusResults();
    }

    //生成6位随机数字码
    public String ranCode() {
        StringBuilder string = new StringBuilder();
        short part;
        for (int i = 6; i > 0; i--) {
            part = (short) (Math.random() * 10);
            string.append(part);
        }
        return string.toString();
    }
}
