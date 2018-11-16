package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.point.budget.get response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:54:17
 */
public class AlipayPointBudgetGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3171244764431651656L;

	/** 
	 * 还可以发放的集分宝个数
	 */
	@ApiField("budget_amount")
	private Long budgetAmount;

    /**
     * Sets budget amount.
     *
     * @param budgetAmount the budget amount
     */
    public void setBudgetAmount(Long budgetAmount) {
		this.budgetAmount = budgetAmount;
	}

    /**
     * Gets budget amount.
     *
     * @return the budget amount
     */
    public Long getBudgetAmount( ) {
		return this.budgetAmount;
	}

}
