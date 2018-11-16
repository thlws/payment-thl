package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单笔减奖品模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class SingleDstCampPrizeModel extends AlipayObject {

	private static final long serialVersionUID = 3694252431564195875L;

	/**
	 * 预算id
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 奖品id,新增不传，修改传
	 */
	@ApiField("id")
	private String id;

	/**
	 * 折扣幅度只能填写数字，大于0，小数点后最多2位，整数部分不能超过8位
	 */
	@ApiField("reduce_amt")
	private String reduceAmt;

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
     * Gets reduce amt.
     *
     * @return the reduce amt
     */
    public String getReduceAmt() {
		return this.reduceAmt;
	}

    /**
     * Sets reduce amt.
     *
     * @param reduceAmt the reduce amt
     */
    public void setReduceAmt(String reduceAmt) {
		this.reduceAmt = reduceAmt;
	}

}
