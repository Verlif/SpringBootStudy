package com.study.bean;

import com.study.entity.JSONBuilder;

public class PaidItem extends JSONBuilder {
    public String body;                    // 商品描述
    public String detail;                  // 商品详情
    public String attach;                  // 附加数据
    public String out_trade_no;            // 商户订单号
    public String device_info;             // 设备号
    public String fee_type;                // 货币类型
    public String total_fee;               // 总金额
    public String spbill_create_ip;        // 终端IP
    public String notify_url;              // 通知地址
    public String trade_type;              // 交易类型
    public String time_start;              // 交易起始时间
    public String time_expire;             // 交易结束时间
    public String product_id;              // 商品Id

    {
        device_info = "WEB";
        fee_type = "CNY";
        spbill_create_ip = "140.70.213.176";
        trade_type = "APP";
    }
}
