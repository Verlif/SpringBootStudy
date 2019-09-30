package com.study.weixin;

import com.study.utils.HttpUtil;

import java.util.SortedMap;
import java.util.TreeMap;

public class WeiXinCommonUtil {

    public static String weixinPay(String orderNumber,String clientIP,int totalFee){
        SortedMap<String, Object> parameters =new TreeMap<String, Object>();
        parameters.put("appid", WeiXinConfig.appid);
        parameters.put("body", WeiXinConfig.body);
        parameters.put("mch_id", WeiXinConfig.mch_id);
        parameters.put("nonce_str", WeiXinPayCommonUtil.genNonceStr());
        parameters.put("notify_url", WeiXinConfig.notify_url);
        parameters.put("out_trade_no", orderNumber);//订单号
        parameters.put("spbill_create_ip", clientIP);//用户IP
        parameters.put("total_fee", totalFee+"");//金额
        parameters.put("trade_type", WeiXinConfig.trade_type);
        //生成签名
        parameters.put("sign", WeiXinPayCommonUtil.createSign("UTF-8", parameters));
        //生成xml请求
        String reXml= WeiXinPayCommonUtil.getRequestXml(parameters);
        System.out.println(reXml);
        //请求xml
//        String xml= HttpRequest.sendPost(WeiXinConfig.gatewayUrl, reXml);
//        //解析xml
//        String codeUrl= WeiXinXMLUtil.readCodeUrl(xml);

//        System.out.println(codeUrl);                                                //test
//        if("error".equals(codeUrl)){
//            return codeUrl;
//        }
//        return codeUrl;
        return "";
    }
}
