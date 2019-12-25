package org.thlws.payment.wechat.type;

/**
 * @author HanleyTang
 */
public enum  WechatTradeType {

    /**微信支付类型*/
    JSAPI("JSAPI","公众号支付"),
    NATIVE("NATIVE","POS客户端扫码支付"),
    APP("APP","手机APP支付");

    public final String type;
    public final String desc;


    WechatTradeType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String type() {
        return type;
    }

    public String desc() {
        return desc;
    }
}
