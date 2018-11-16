package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销预算信息
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:20:23
 */
public class InteligentBudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 6358267841637639466L;

	/**
	 * 预算数量
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型，枚举（QUANTITY：数量预算）
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
