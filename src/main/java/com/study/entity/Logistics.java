package com.study.entity;

import java.util.Date;

public class Logistics extends JSONBuilder {
    private String logisticsId;
    private String orderId;
    private String courierFirm;   //快递公司
    private String courierNum;    //运单号
    private String courierStatus; //快递状态
    private Date createTime;
    private Date updateTime;

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCourierFirm() {
        return courierFirm;
    }

    public void setCourierFirm(String courierFirm) {
        this.courierFirm = courierFirm;
    }

    public String getCourierNum() {
        return courierNum;
    }

    public void setCourierNum(String courierNum) {
        this.courierNum = courierNum;
    }

    public String getCourierStatus() {
        return courierStatus;
    }

    public void setCourierStatus(String courierStatus) {
        this.courierStatus = courierStatus;
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