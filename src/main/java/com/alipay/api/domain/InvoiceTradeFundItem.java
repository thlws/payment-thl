package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝交易支付工具
 *
 * @author auto create
 * @since 1.0, 2017-06-05 21:24:37
 */
public class InvoiceTradeFundItem extends AlipayObject {

	private static final long serialVersionUID = 3251953996229961585L;

	/**
	 * 当前支付工具支付的金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付宝支付工具描述
	 */
	@ApiField("payment_tool_name")
	private String paymentToolName;

	/**
	 * 支付宝支付工具类型
	 */
	@ApiField("payment_tool_type")
	private String paymentToolType;

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
     * Gets payment tool name.
     *
     * @return the payment tool name
     */
    public String getPaymentToolName() {
		return this.paymentToolName;
	}

    /**
     * Sets payment tool name.
     *
     * @param paymentToolName the payment tool name
     */
    public void setPaymentToolName(String paymentToolName) {
		this.paymentToolName = paymentToolName;
	}

    /**
     * Gets payment tool type.
     *
     * @return the payment tool type
     */
    public String getPaymentToolType() {
		return this.paymentToolType;
	}

    /**
     * Sets payment tool type.
     *
     * @param paymentToolType the payment tool type
     */
    public void setPaymentToolType(String paymentToolType) {
		this.paymentToolType = paymentToolType;
	}

}
