package com.study.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Logistics extends JSONBuilder {
    private String logisticsId;     // 物流存表号
    private String orderId;         // 订单id
    private String courierFirm;     // 快递公司
    private String courierNum;      // 运单号
    private String courierStatus;   // 快递状态
    private Date createTime;        // 物流单创建时间?待商榷
    private Date updateTime;        // 物流单更新时间

}