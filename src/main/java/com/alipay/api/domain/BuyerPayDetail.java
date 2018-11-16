package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家支付明细，包含支付渠道与对应的金额
 *
 * @author auto create
 * @since 1.0, 2018-07-09 23:01:19
 */
public class BuyerPayDetail extends AlipayObject {

	private static final long serialVersionUID = 6585121184996564613L;

	/**
	 * 买家支付金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets pay channel.
     *
     * @return the pay channel
     */
    public String getPayChannel() {
		return this.payChannel;
	}

    /**
     * Sets pay channel.
     *
     * @param payChannel the pay channel
     */
    public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

}
