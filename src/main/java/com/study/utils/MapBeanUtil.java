package com.study.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class MapBeanUtil {

    public static Map<String, String> BeanToMap(Object object) {
        Map<String, String> map = new HashMap<>();
        Field[] fs = object.getClass().getDeclaredFields();        // 获取所有参数
        try {
            for (Field field : fs) {
                field.setAccessible(true);                  // 设置参数可访问
                Object o = field.get(object);
                if (o != null)
                    map.put(field.getName(), String.valueOf(o)); // 将数据放入json中
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static <T> T MapToBean(Map<String, String> map, Class<T> cl) {
        T t = null;
        try {
            t = (T) Class.forName(cl.getName()).newInstance();
            Field[] fs = t.getClass().getDeclaredFields();        // 获取所有参数
            for (Field field : fs) {
                field.setAccessible(true);                  // 设置参数可访问
                if (map.containsKey(field.getName()))              // 剔除空白量
                    field.set(t, map.get(field.getName()));
            }
        } catch (IllegalAccessException | ClassNotFoundException | InstantiationException e) {
            e.printStackTrace();
        }
        return t;
    }
}
