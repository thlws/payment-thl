package org.thlws.payment.wechat.type;

/**
 * Created by  HanleyTang on 2019-01-03
 */
public enum  WechatTradeType {

    JSAPI("JSAPI","公众号支付"),
    NATIVE("NATIVE","POS客户端扫码支付"),
    APP("APP","手机APP支付");

    public final String type;
    public final String desc;


    WechatTradeType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }}
