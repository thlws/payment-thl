package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销立减活动预算追加
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:19:00
 */
public class AlipayMarketingCampaignDiscountBudgetAppendModel extends AlipayObject {

	private static final long serialVersionUID = 2629423439531255738L;

	/**
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/**
	 * 追加后的预算总金额（注意：是追加后的预算总金额，不是在原基础上追加的金额），单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

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
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
