package org.thlws.payment.alipay.entity.response;

/**
 * 支付异步通知,核心返回参数
 *
 * @author hanley @thlws.com
 *  2018 /11/16
 */
public class AlipayNotifyResponse {


    /**验证是否成功 true 成功,false 失败*/
    private boolean verifyFlg;

    /**商户订单号*/
    private String outTradeNo;

    /**支付宝交易号*/
    private String tradeNo;

    /***
     * WAIT_BUYER_PAY	交易创建，等待买家付款
     * TRADE_CLOSED	    未付款交易超时关闭，或支付完成后全额退款
     * TRADESUCCESS	    交易支付成功
     * TRADEFINISHED	交易结束，不可退款
     */
    private String tradeStatus;

    /**
     * Is verify flg boolean.
     *
     * @return the boolean
     */
    public boolean isVerifyFlg() {
        return verifyFlg;
    }

    /**
     * Sets verify flg.
     *
     * @param verifyFlg the verify flg
     */
    public void setVerifyFlg(boolean verifyFlg) {
        this.verifyFlg = verifyFlg;
    }

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * Gets trade status.
     *
     * @return the trade status
     */
    public String getTradeStatus() {
        return tradeStatus;
    }

    /**
     * Sets trade status.
     *
     * @param tradeStatus the trade status
     */
    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }
}
