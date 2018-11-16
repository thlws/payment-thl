package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 减至指定折扣奖品模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class ReduceToDiscountDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 2529124147177315691L;

	/**
	 * 折扣预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 单次优惠上限(元)
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

	/**
	 * 折扣幅度减至必须为0.3到1之间的小数(保留小数点后2位)
	 */
	@ApiField("reduce_to_discount_rate")
	private String reduceToDiscountRate;

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

    /**
     * Gets reduce to discount rate.
     *
     * @return the reduce to discount rate
     */
    public String getReduceToDiscountRate() {
		return this.reduceToDiscountRate;
	}

    /**
     * Sets reduce to discount rate.
     *
     * @param reduceToDiscountRate the reduce to discount rate
     */
    public void setReduceToDiscountRate(String reduceToDiscountRate) {
		this.reduceToDiscountRate = reduceToDiscountRate;
	}

}
