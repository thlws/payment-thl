package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放活动－预算
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class OpenPromoBudget extends AlipayObject {

	private static final long serialVersionUID = 5311939227981373617L;

	/**
	 * 预算数量，支持1～999999999之间。默认为999999999
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型，现在支持CAMP_BUDGET_AMOUNT：表示数量预算
	 */
	@ApiField("budget_type")
	private String budgetType;

    /**
     * Gets budget total.
     *
     * @return the budget total
     */
    public String getBudgetTotal() {
		return this.budgetTotal;
	}

    /**
     * Sets budget total.
     *
     * @param budgetTotal the budget total
     */
    public void setBudgetTotal(String budgetTotal) {
		this.budgetTotal = budgetTotal;
	}

    /**
     * Gets budget type.
     *
     * @return the budget type
     */
    public String getBudgetType() {
		return this.budgetType;
	}

    /**
     * Sets budget type.
     *
     * @param budgetType the budget type
     */
    public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

}
