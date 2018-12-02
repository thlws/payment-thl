package com.alipay.trade.service.impl.hb;

/**
 * Created by liuyangkly on 15/10/27.
 */
public interface TradeListener {

    /**
     * On pay trade success.
     *
     * @param outTradeNo the out trade no
     * @param beforeCall the before call
     */
// 支付成功
    public void onPayTradeSuccess(String outTradeNo, long beforeCall);

    /**
     * On pay in progress.
     *
     * @param outTradeNo the out trade no
     * @param beforeCall the before call
     */
// 支付处理中
    public void onPayInProgress(String outTradeNo, long beforeCall);

    /**
     * On pay failed.
     *
     * @param outTradeNo the out trade no
     * @param beforeCall the before call
     */
// 支付失败
    public void onPayFailed(String outTradeNo, long beforeCall);

    /**
     * On connect exception.
     *
     * @param outTradeNo the out trade no
     * @param beforeCall the before call
     */
// 建立连接异常
    public void onConnectException(String outTradeNo, long beforeCall);

    /**
     * On send exception.
     *
     * @param outTradeNo the out trade no
     * @param beforeCall the before call
     */
// 报文上送异常
    public void onSendException(String outTradeNo, long beforeCall);

    /**
     * On receive exception.
     *
     * @param outTradeNo the out trade no
     * @param beforeCall the before call
     */
// 报文接收异常
    public void onReceiveException(String outTradeNo, long beforeCall);
}
