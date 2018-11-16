package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房平台其他费用
 *
 * @author auto create
 * @since 1.0, 2017-08-02 14:51:23
 */
public class EcoRenthouseOtherAmount extends AlipayObject {

	private static final long serialVersionUID = 3373293824145845612L;

	/**
	 * 30
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 费用名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 费用单位
	 */
	@ApiField("unit")
	private String unit;

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
     * Gets unit.
     *
     * @return the unit
     */
    public String getUnit() {
		return this.unit;
	}

    /**
     * Sets unit.
     *
     * @param unit the unit
     */
    public void setUnit(String unit) {
		this.unit = unit;
	}

}
