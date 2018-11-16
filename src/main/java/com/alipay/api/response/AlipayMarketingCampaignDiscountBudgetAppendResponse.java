package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.budget.append response.
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:19:00
 */
public class AlipayMarketingCampaignDiscountBudgetAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6321728265578888119L;

	/** 
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

    /**
     * Sets budget id.
     *
     * @param budgetId the budget id
     */
    public void setBudgetId(String budgetId) {
		this.budgetId = budgetId;
	}

    /**
     * Gets budget id.
     *
     * @return the budget id
     */
    public String getBudgetId( ) {
		return this.budgetId;
	}

}
