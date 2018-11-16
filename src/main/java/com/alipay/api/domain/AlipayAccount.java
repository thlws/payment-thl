package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户账户信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AlipayAccount extends AlipayObject {

	private static final long serialVersionUID = 4611944681975353445L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 不可用余额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 余额总额
	 */
	@ApiField("total_amount")
	private String totalAmount;

    /**
     * Gets alipay user id.
     *
     * @return the alipay user id
     */
    public String getAlipayUserId() {
		return this.alipayUserId;
	}

    /**
     * Sets alipay user id.
     *
     * @param alipayUserId the alipay user id
     */
    public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

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
     * Gets freeze amount.
     *
     * @return the freeze amount
     */
    public String getFreezeAmount() {
		return this.freezeAmount;
	}

    /**
     * Sets freeze amount.
     *
     * @param freezeAmount the freeze amount
     */
    public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
