package com.study.entity;

import org.json.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Field;

public class JSONBuilder implements Serializable {

    public JSONBuilder() {}

    public JSONBuilder(JSONObject json) {
        Field[] fs = getClass().getDeclaredFields();        //获取所有参数
        try {
            for (Field field : fs) {
                field.setAccessible(true);                  //设置参数可访问
                if (json.has(field.getName()))              //剔除空白量
                    field.set(this, json.get(field.getName()));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public JSONObject toJSONObject() {
        JSONObject json = new JSONObject();
        Field[] fs = getClass().getDeclaredFields();        //获取所有参数
        try {
            for (Field field : fs) {
                field.setAccessible(true);                  //设置参数可访问
                json.put(field.getName(), field.get(this)); //将数据放入json中
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return json;
    }
}
