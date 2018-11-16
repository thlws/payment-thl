package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销立减活动预算查询
 *
 * @author auto create
 * @since 1.0, 2017-12-21 23:42:04
 */
public class AlipayMarketingCampaignDiscountBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1333335767157466618L;

	/**
	 * 预算名称
	 */
	@ApiField("budget_id")
	private String budgetId;

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

}
