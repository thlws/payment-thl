package com.alipay.trade.model.hb;

/**
 * Created by liuyangkly on 15/8/27.
 */
public enum HbStatus {
    /**
     * S hb status.
     */
    S // 交易成功（包括支付宝返回“处理中”）

    ,
    /**
     * hb status.
     */
    I // 支付宝返回处理中

    ,
    /**
     * F hb status.
     */
    F // 支付宝返回失败

    ,
    /**
     * P hb status.
     */
    P // POSP返回失败，或商户系统失败

    ,
    /**
     * X hb status.
     */
    X // 建立连接异常

    ,
    /**
     * Y hb status.
     */
    Y // 报文上送异常

    ,
    /**
     * Z hb status.
     */
    Z // 报文接收异常

    ,
    /**
     * C hb status.
     */
    C // 收银员取消
}
