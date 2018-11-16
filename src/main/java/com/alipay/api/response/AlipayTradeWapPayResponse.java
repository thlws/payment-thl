package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.wap.pay response.
 *
 * @author auto create
 * @since 1.0, 2018-08-06 12:35:00
 */
public class AlipayTradeWapPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4673596721767869767L;

	/** 
	 * 商户网站唯一订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 收款支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 该笔订单的资金总额，单位为RMB-Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 该交易在支付宝系统中的交易流水号。最长64位。
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId( ) {
		return this.sellerId;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount( ) {
		return this.totalAmount;
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
