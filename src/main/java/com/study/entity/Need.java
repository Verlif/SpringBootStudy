package com.study.entity;

import com.alibaba.fastjson.JSONObject;
import java.util.Date;

public class Need extends JSONBuilder {

    private String needId;
    private String userId;
    private String needName;
    private String needKeywords;
    private String needType;
    private Date createTime;

    public Need() {}
    public Need(JSONObject need) {
        super(need);
    }

    public String getNeedId() {
        return needId;
    }

    public void setNeedId(String needId) {
        this.needId = needId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNeedName() {
        return needName;
    }

    public void setNeedName(String needName) {
        this.needName = needName;
    }

    /**
     * 请通过此方法添加关键词
     * @param kw    关键词
     */
    public void addKeyword(String kw) {
        if (needKeywords != null) {
            needKeywords += "," + kw;
        } else needKeywords = kw;
    }

    /**
     * 获取关键词数组
     * @return  关键词数组
     */
    public String[] getKeywordList() {
        return needKeywords.split(",");
    }

    public String getNeedKeywords() {
        return needKeywords;
    }

    public void setNeedKeywords(String needKeywords) {
        this.needKeywords = needKeywords;
    }

    public String getNeedType() {
        return needType;
    }

    public void setNeedType(String needType) {
        this.needType = needType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
