package com.study.test;

import com.study.utils.JwtUtils;
import io.jsonwebtoken.Claims;

import java.util.HashMap;

public class BuildToken {

    public static void main (String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("userId", "1234567asdfgh");
        String token = JwtUtils.createJWT(data);
        System.out.println("token: " + token);
        Claims claims = JwtUtils.parseJWT(token);
        String userId = (String) claims.get("userId");
        System.out.println("user's id: " + userId);
    }
}
