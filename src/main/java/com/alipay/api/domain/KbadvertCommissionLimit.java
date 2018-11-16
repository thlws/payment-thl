package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分佣配置
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:20
 */
public class KbadvertCommissionLimit extends AlipayObject {

	private static final long serialVersionUID = 8629778985164623521L;

	/**
	 * 推广者类型
	 */
	@ApiField("commission_user_type")
	private String commissionUserType;

	/**
	 * 层级
	 */
	@ApiField("level")
	private Long level;

	/**
	 * 比例分佣的最大金额
	 */
	@ApiField("max_max_amount")
	private String maxMaxAmount;

	/**
	 * 固定金额上限
	 */
	@ApiField("max_quota_amount")
	private String maxQuotaAmount;

	/**
	 * 最小分佣比例
	 */
	@ApiField("min_commission_percentage")
	private String minCommissionPercentage;

	/**
	 * 最小固定金额
	 */
	@ApiField("min_quota_amount")
	private String minQuotaAmount;

    /**
     * Gets commission user type.
     *
     * @return the commission user type
     */
    public String getCommissionUserType() {
		return this.commissionUserType;
	}

    /**
     * Sets commission user type.
     *
     * @param commissionUserType the commission user type
     */
    public void setCommissionUserType(String commissionUserType) {
		this.commissionUserType = commissionUserType;
	}

    /**
     * Gets level.
     *
     * @return the level
     */
    public Long getLevel() {
		return this.level;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(Long level) {
		this.level = level;
	}

    /**
     * Gets max max amount.
     *
     * @return the max max amount
     */
    public String getMaxMaxAmount() {
		return this.maxMaxAmount;
	}

    /**
     * Sets max max amount.
     *
     * @param maxMaxAmount the max max amount
     */
    public void setMaxMaxAmount(String maxMaxAmount) {
		this.maxMaxAmount = maxMaxAmount;
	}

    /**
     * Gets max quota amount.
     *
     * @return the max quota amount
     */
    public String getMaxQuotaAmount() {
		return this.maxQuotaAmount;
	}

    /**
     * Sets max quota amount.
     *
     * @param maxQuotaAmount the max quota amount
     */
    public void setMaxQuotaAmount(String maxQuotaAmount) {
		this.maxQuotaAmount = maxQuotaAmount;
	}

    /**
     * Gets min commission percentage.
     *
     * @return the min commission percentage
     */
    public String getMinCommissionPercentage() {
		return this.minCommissionPercentage;
	}

    /**
     * Sets min commission percentage.
     *
     * @param minCommissionPercentage the min commission percentage
     */
    public void setMinCommissionPercentage(String minCommissionPercentage) {
		this.minCommissionPercentage = minCommissionPercentage;
	}

    /**
     * Gets min quota amount.
     *
     * @return the min quota amount
     */
    public String getMinQuotaAmount() {
		return this.minQuotaAmount;
	}

    /**
     * Sets min quota amount.
     *
     * @param minQuotaAmount the min quota amount
     */
    public void setMinQuotaAmount(String minQuotaAmount) {
		this.minQuotaAmount = minQuotaAmount;
	}

}
