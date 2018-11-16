package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠立减奖品折扣模式
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class DiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 7279898883524123861L;

	/**
	 * 预算id,商户先调预算创建接口得到预算id,传入
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 折扣幅度必须为0.1到1之间的小数(保留小数点后2位)
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/**
	 * 奖品id  修改传值 ，新增可以不传
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单次优惠上限(元),单笔上限金额只能填写数字，大于等于0，小数点后最多2位，整数部分不能超过10位
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

    /**
     * Gets budget id.
     *
     * @return the budget id
     */
    public String getBudgetId() {
		return this.budgetId;
	}

    /**
     * Sets budget id.
     *
     * @param budgetId the budget id
     */
    public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

    /**
     * Gets discount rate.
     *
     * @return the discount rate
     */
    public String getDiscountRate() {
		return this.discountRate;
	}

    /**
     * Sets discount rate.
     *
     * @param discountRate the discount rate
     */
    public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets max discount amt.
     *
     * @return the max discount amt
     */
    public String getMaxDiscountAmt() {
		return this.maxDiscountAmt;
	}

    /**
     * Sets max discount amt.
     *
     * @param maxDiscountAmt the max discount amt
     */
    public void setMaxDiscountAmt(String maxDiscountAmt) {
		this.maxDiscountAmt = maxDiscountAmt;
	}

}
