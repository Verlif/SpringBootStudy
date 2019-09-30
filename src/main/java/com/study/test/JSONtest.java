package com.study.test;

import com.study.entity.*;
import com.study.entity.ext.FailResults;
import com.study.entity.ext.SusResults;
import org.json.JSONArray;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JSONtest {

    public static void main (String[] args) {
        JSONArray json = new JSONArray();
        json.put("4a34ac674e4240ea8fb7c46435b7f777");
        json.put("abc");
        System.out.println(json.toString());
        System.out.println(getUser().toJSONObject().toString());
    }

    public static User getUser() {
        User u = new User();
        u.setUserName("User.Verlif");
        u.setUserPassword("Passord.ajsie");
        u.setUserAccount("18200258008");
        return u;
    }
}
