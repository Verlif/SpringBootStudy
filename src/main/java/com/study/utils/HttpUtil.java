package com.study.utils;

import okhttp3.*;

import java.util.HashMap;
import java.util.Objects;

public class HttpUtil {

    private static OkHttpClient client;
    static {
        client = new OkHttpClient();
    }

    public static String postURL(String url, HashMap<String, String> params) {
        try {
            FormBody.Builder formBody = new FormBody.Builder();
            if (params != null)
                for (String key : params.keySet()) {
                    String value = params.get(key);
                    formBody.add(key, value);
                }
            Request req =  new Request.Builder()
                    .url(url)
                    .post(formBody.build())
                    .build();
            Call call = client.newCall(req);
            Response rp = call.execute();
            return Objects.requireNonNull(rp.body()).string();
        } catch (Exception e) {
            return null;
        }
    }

    public static String getURL(String url, HashMap<String, String> params) {
        try {
            StringBuilder urlBuilder = new StringBuilder(url);
            if (params != null) {
                urlBuilder.append("?");
                for (String key : params.keySet()) {
                    String value = params.get(key);
                    urlBuilder.append(key).append("=").append(value).append("&");
                }
                urlBuilder.append("1=1");
            }
            System.out.println(urlBuilder.toString());
            Request req =  new Request.Builder()
                    .url(url)
                    .build();
            Call call = client.newCall(req);
            Response rp = call.execute();
            return Objects.requireNonNull(rp.body()).string();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
