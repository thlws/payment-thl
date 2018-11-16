package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算信息
 *
 * @author auto create
 * @since 1.0, 2017-11-15 19:55:36
 */
public class BudgetInfo extends AlipayObject {

	private static final long serialVersionUID = 4457228427651315619L;

	/**
	 * 预算数量
	 */
	@ApiField("budget_total")
	private String budgetTotal;

	/**
	 * 预算类型
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 设置每天的预算，如每天的预算设置为100，即该活动一天最多发放100次
	 */
	@ApiField("sub_budget_dimension")
	private String subBudgetDimension;

	/**
	 * 用于控制子纬度的预算数量
	 */
	@ApiField("sub_value")
	private String subValue;

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

    /**
     * Gets sub budget dimension.
     *
     * @return the sub budget dimension
     */
    public String getSubBudgetDimension() {
		return this.subBudgetDimension;
	}

    /**
     * Sets sub budget dimension.
     *
     * @param subBudgetDimension the sub budget dimension
     */
    public void setSubBudgetDimension(String subBudgetDimension) {
		this.subBudgetDimension = subBudgetDimension;
	}

    /**
     * Gets sub value.
     *
     * @return the sub value
     */
    public String getSubValue() {
		return this.subValue;
	}

    /**
     * Sets sub value.
     *
     * @param subValue the sub value
     */
    public void setSubValue(String subValue) {
		this.subValue = subValue;
	}

}
