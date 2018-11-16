package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.cancel response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayTradeCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1757321478556929967L;

	/** 
	 * 本次撤销触发的交易动作
close：关闭交易，无退款
refund：产生了退款
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry_flag")
	private String retryFlag;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction( ) {
		return this.action;
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
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

    /**
     * Sets retry flag.
     *
     * @param retryFlag the retry flag
     */
    public void setRetryFlag(String retryFlag) {
		this.retryFlag = retryFlag;
	}

    /**
     * Gets retry flag.
     *
     * @return the retry flag
     */
    public String getRetryFlag( ) {
		return this.retryFlag;
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
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

}
