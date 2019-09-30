package com.study.entity;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.Date;

public class Patent extends JSONBuilder {

    public static final String DEAL_TYPE_DISPOSABLE = "disposable";         // 一次性买断
    public static final String DEAL_TYPE_SUPPORT = "support";               // 一次性买断+技术支持
    public static final String DEAL_TYPE_COOPERATION = "cooperation";       // 产学研联合开发、运营
    public static final String DEAL_TYPE_AUTHORIZATION = "authorization";   // 仅授权
    public static final String DEAL_TYPE_CONSULT = "consult";               // 顾问聘用方式

    private String patentId;        //专利id
    private String patentCode;      //专利编号
    private String patentName;      //专利名称
    private String userId;          //用户id
    private String patentDetails;   //专利说明
    private String patentArea;      //专利领域
    private String patentKeyword;   //专利关键词集
    private String patentDealTypes; //专利出售方式
    private BigDecimal patentPrice; //专利预售价格
    private boolean isSale;         //专利是否已卖出
    private Date createTime;        //专利创建时间
    private Date updateTime;        //专利信息更新时间

    public Patent() {}
    public Patent(JSONObject json) {
        super(json);
    }

    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId;
    }

    public String getPatentCode() {
        return patentCode;
    }

    public void setPatentCode(String patentCode) {
        this.patentCode = patentCode;
    }

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPatentDetails() {
        return patentDetails;
    }

    public void setPatentDetails(String patentDetails) {
        this.patentDetails = patentDetails;
    }

    public String getPatentArea() {
        return patentArea;
    }

    public void setPatentArea(String patentArea) {
        this.patentArea = patentArea;
    }

    /**
     * 请通过此方法添加关键词
     * @param kw    关键词
     */
    public void addPatentKeyword(String kw) {
        if (patentKeyword != null) {
            patentKeyword += "," + kw;
        } else patentKeyword = kw;
    }

    public String getPatentKeyword() {
        return patentKeyword;
    }

    public void setPatentKeyword(String patentKeyword) {
        this.patentKeyword = patentKeyword;
    }

    /**
     * 获取关键词数组
     * @return  关键词数组
     */
    public String[] getKeywordList() {
        return patentKeyword.split(",");
    }

    public String getPatentDealTypes() {
        return patentDealTypes;
    }

    /**
     * 获取交易方式数组
     * @return  交易方式数组
     */
    public String[] getDealTypesList() {
        return patentDealTypes.split(",");
    }

    /**
     * 添加交易方式，请使用内置参数
     * @param dealType  交易方式
     */
    public void addDealType(String dealType) {
        if (patentDealTypes != null) {
            patentDealTypes += "," + dealType;
        } else patentDealTypes = dealType;
    }

    public void setPatentDealTypes(String patentDealTypes) {
        this.patentDealTypes = patentDealTypes;
    }

    public BigDecimal getPatentPrice() {
        return patentPrice;
    }

    public void setPatentPrice(BigDecimal patentPrice) {
        this.patentPrice = patentPrice;
    }

    public boolean isSale() {
        return isSale;
    }

    public void setSale(boolean sale) {
        isSale = sale;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}