package com.study.entity;

import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.objects.Global;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class JSONBuilder {

    public JSONBuilder() {}

    public JSONBuilder(JSONObject json) {
        Field[] fs = getClass().getDeclaredFields();        // 获取所有参数
        try {
            for (Field field : fs) {
                field.setAccessible(true);                  // 设置参数可访问
                if (json.containsKey(field.getName()))              // 剔除空白量
                    field.set(this, json.getObject(field.getName(), field.getType()));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public JSONObject toJSONObject() {
        JSONObject json = new JSONObject();
        Field[] fs = getClass().getDeclaredFields();        // 获取所有参数
        try {
            for (Field field : fs) {
                field.setAccessible(true);                  // 设置参数可访问
                if (field.get(this) != null && !Modifier.isStatic(field.getModifiers()))
                    json.put(field.getName(), field.get(this)); // 将数据放入json中
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return json;
    }
}
