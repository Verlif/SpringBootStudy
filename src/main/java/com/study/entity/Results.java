package com.study.entity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

public class Results extends JSONObject implements Serializable {

    private JSONObject jsonO = new JSONObject();
    {
        put("data", jsonO);
        put("code", 200);
        put("msg", "");
    }

    public String getCode() {
        return getString("code");
    }

    public void setCode(String code) {
        put("code", code);
    }

    public String getMsg() {
        return getString("msg");
    }

    public void setMsg(String msg) {
        put("msg", msg);
    }

    /**
     * 获取data的JSONObject对象
     * @return  data对象
     */
    public Object getData() {
        return get("data");
    }

    /**
     * 获取data中的List对象
     * @param generics  List泛型
     * @return
     */
    public List getDataList(Object generics) {
        String keyName = generics.getClass().getSimpleName() + List.class.getSimpleName();
        return (List) jsonO.get(keyName);
    }

    /**
     * 获取data中的指定类的数据
     * @param cl
     * @return
     */
    public Object getData(Class cl) {
        return jsonO.get(cl.getSimpleName());
    }

    public void setData(JSONBuilder data) {
        jsonO.put(data.getClass().getSimpleName(), data.toJSONObject());
    }

    public void setData(List list) {
        String keyName;
        if (list.size() > 0) {
            keyName = list.get(0).getClass().getSimpleName() + list.getClass().getSimpleName();
            jsonO.put(keyName, list);
        } else jsonO.put("list", new JSONArray());
    }
}