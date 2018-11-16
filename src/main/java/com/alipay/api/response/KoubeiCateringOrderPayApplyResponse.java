package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.pay.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:29:45
 */
public class KoubeiCateringOrderPayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8599686731997836314L;

	/** 
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/** 
	 * 口碑内部支付订单号,和外部支付订单号一一映射
	 */
	@ApiField("pay_no")
	private String payNo;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Sets out pay no.
     *
     * @param outPayNo the out pay no
     */
    public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}

    /**
     * Gets out pay no.
     *
     * @return the out pay no
     */
    public String getOutPayNo( ) {
		return this.outPayNo;
	}

    /**
     * Sets pay no.
     *
     * @param payNo the pay no
     */
    public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

    /**
     * Gets pay no.
     *
     * @return the pay no
     */
    public String getPayNo( ) {
		return this.payNo;
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
