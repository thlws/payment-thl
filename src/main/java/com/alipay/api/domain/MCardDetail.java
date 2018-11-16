package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户储值卡信息
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:31:32
 */
public class MCardDetail extends AlipayObject {

	private static final long serialVersionUID = 5156466299386757967L;

	/**
	 * 储值卡可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 储值卡名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 储值卡支付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

    /**
     * Gets available amount.
     *
     * @return the available amount
     */
    public String getAvailableAmount() {
		return this.availableAmount;
	}

    /**
     * Sets available amount.
     *
     * @param availableAmount the available amount
     */
    public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

}
