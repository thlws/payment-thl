package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.budget.query response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:58:03
 */
public class AlipayAssetPointBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1653921195261133116L;

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
