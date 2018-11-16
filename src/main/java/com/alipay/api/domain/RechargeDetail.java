package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值订单明细
 *
 * @author auto create
 * @since 1.0, 2018-05-18 22:32:06
 */
public class RechargeDetail extends AlipayObject {

	private static final long serialVersionUID = 8796969766659159297L;

	/**
	 * 真实资金，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 面额，单位元
	 */
	@ApiField("assetamount")
	private String assetamount;

	/**
	 * 内部订单号
	 */
	@ApiField("orderno")
	private String orderno;

	/**
	 * 外部订单号
	 */
	@ApiField("outorderno")
	private String outorderno;

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
     * Gets assetamount.
     *
     * @return the assetamount
     */
    public String getAssetamount() {
		return this.assetamount;
	}

    /**
     * Sets assetamount.
     *
     * @param assetamount the assetamount
     */
    public void setAssetamount(String assetamount) {
		this.assetamount = assetamount;
	}

    /**
     * Gets orderno.
     *
     * @return the orderno
     */
    public String getOrderno() {
		return this.orderno;
	}

    /**
     * Sets orderno.
     *
     * @param orderno the orderno
     */
    public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

    /**
     * Gets outorderno.
     *
     * @return the outorderno
     */
    public String getOutorderno() {
		return this.outorderno;
	}

    /**
     * Sets outorderno.
     *
     * @param outorderno the outorderno
     */
    public void setOutorderno(String outorderno) {
		this.outorderno = outorderno;
	}

}
