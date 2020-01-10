package com.study.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.study.utils.HttpUtil;
import lombok.Data;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger("mainLog");

    final static String appId = "4438783907";
    final static String secret = "82c03946ac69a139f0aef8fe57c3e5bc";

    public static void main(String[] args) throws IOException {

        inputMsg();
//        authenticate();

    }


    private static void inputMsg() {

        HttpUtil httpUtil = new HttpUtil();
        HashMap<String, String> tokenParams = new HashMap<>();
        tokenParams.put("appId", appId);
        tokenParams.put("secret", secret);
        tokenParams.put("grantType", "client_credentials");
        String tokenBody = httpUtil.doGet("https://smlopenapi.esign.cn/v1/oauth2/access_token", null, tokenParams);

        System.out.println("tokenBody: " + tokenBody);
        JSONObject tokenJson = JSON.parseObject(tokenBody);
        String token = tokenJson.getJSONObject("data").getString("token");

        HashMap<String, String> flowIdHeader = new HashMap<>();
        flowIdHeader.put("X-Tsign-Open-App-Id", appId);
        flowIdHeader.put("X-Tsign-Open-Token", token);
        flowIdHeader.put("Content-Type", "application/json");
        HashMap<String, String> flowParams = new HashMap<>();
        flowParams.put("name", "杭州天谷信息科技有限公司");
        flowParams.put("orgCode", "913301087458306077");
        flowParams.put("legalRepName", "何一兵");
        flowParams.put("legalRepIdNo", "110108xxxxxxx2xxx");

        flowParams.put("contextId", "1001");
        String flowIdBody = httpUtil.doPost("https://smlopenapi.esign.cn/v2/identity/auth/api/organization/enterprise/fourFactors", flowIdHeader, flowParams);
//        String flowIdBody = httpUtil.doPost("http://127.0.0.1:8080/ShowData", flowIdHeader, flowParams);

        System.out.println("flowIdBody: " + flowIdBody);
        JSONObject flowIdJson = JSON.parseObject(flowIdBody);
        String flowId = flowIdJson.getJSONObject("data").getString("flowId");

        System.out.println("flowId: " + flowId);
    }

    private static void authenticate() {
        final String flowId = "1070452950091957947";
        final String authCode = "122737";
        final String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJnSWQiOiI4N2I4YmJhNGY2N2U0ZjRiODQ3Njc2M2FmNTRjZGYxYSIsImFwcElkIjoiNDQzODc4MzkwNyIsIm9JZCI6ImJiZDNlYTExZWY0ZDQyNmI4NTYzNDhmYjg1MDYxM2ZmIiwidGltZXN0YW1wIjoxNTc4NTM5OTY3NTQ5fQ.ICpt5mcRlqX3QAnZ4NpszOeIp-RSd0vtxkoGo7oggTY";
        final String uri = "https://smlopenapi.esign.cn/v2/identity/auth/pub/individual/" + flowId + "/telecom3Factors";

        HttpUtil httpUtil = new HttpUtil();
        HashMap<String, String> finishHeader = new HashMap<>();
        finishHeader.put("X-Tsign-Open-App-Id", appId);
        finishHeader.put("X-Tsign-Open-Token", token);
        HashMap<String, String> finishParams = new HashMap<>();
        finishParams.put("authcode", authCode);

        String finishBody = httpUtil.doPut(uri, finishHeader, finishParams);
        System.out.println("finishBody: " + finishBody);

    }

    private static void showData() {

    }
}

@Data
class Test {
    private List<String> list;
}