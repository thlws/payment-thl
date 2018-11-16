package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抹零优惠模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class ResetZeroDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 5387879612957232223L;

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
	 * 单笔上限金额只能填写数字，大于等于0，小数点后最多2位，整数部分不能超过5位
	 */
	@ApiField("max_discount_amt")
	private String maxDiscountAmt;

	/**
	 * 对应的值分别为100,1000,10000,100000
小数点取整，交易金额必须大于1元，最大优惠幅度0.99元，EG：交易金额1.36元，取整后优惠后金额为1元
个位数取整，交易金额必须大于10元，最大优惠幅度9.99元，EG：交易金额13.56元，取整后优惠后金额为10元
十位数取整，交易金额必须大于100元，最大优惠幅度99.99元，EG：交易金额125.56元，取整后优惠后金额为100元
百位数取整，交易金额必须大于1000元，最大优惠幅度999.99元，EG：交易金额1125.56元，取整后优惠后金额为1000元
	 */
	@ApiField("reset_zero_amt")
	private String resetZeroAmt;

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
     * Gets reset zero amt.
     *
     * @return the reset zero amt
     */
    public String getResetZeroAmt() {
		return this.resetZeroAmt;
	}

    /**
     * Sets reset zero amt.
     *
     * @param resetZeroAmt the reset zero amt
     */
    public void setResetZeroAmt(String resetZeroAmt) {
		this.resetZeroAmt = resetZeroAmt;
	}

}
