package com.study.utils;

import okhttp3.*;

import java.util.HashMap;
import java.util.Objects;

public class HttpUtil {

    private OkHttpClient client;

    public HttpUtil() {
        client = new OkHttpClient();
    }

    public String touchURL(String url, HashMap<String, String> params) {
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

}
