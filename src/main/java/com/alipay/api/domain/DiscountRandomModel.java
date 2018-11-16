package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随机立减折扣幅度模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class DiscountRandomModel extends AlipayObject {

	private static final long serialVersionUID = 3419787569636644639L;

	/**
	 * 最高优惠金额
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 最低优惠金额
	 */
	@ApiField("min_amount")
	private String minAmount;

	/**
	 * 概率 金额区间、占比支持小数点后两位
区间为前闭、后闭，最多可以设置10种金额区间，所有区间占比和需要等于100%
	 */
	@ApiField("probability")
	private String probability;

    /**
     * Gets max amount.
     *
     * @return the max amount
     */
    public String getMaxAmount() {
		return this.maxAmount;
	}

    /**
     * Sets max amount.
     *
     * @param maxAmount the max amount
     */
    public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

    /**
     * Gets min amount.
     *
     * @return the min amount
     */
    public String getMinAmount() {
		return this.minAmount;
	}

    /**
     * Sets min amount.
     *
     * @param minAmount the min amount
     */
    public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}

    /**
     * Gets probability.
     *
     * @return the probability
     */
    public String getProbability() {
		return this.probability;
	}

    /**
     * Sets probability.
     *
     * @param probability the probability
     */
    public void setProbability(String probability) {
		this.probability = probability;
	}

}
