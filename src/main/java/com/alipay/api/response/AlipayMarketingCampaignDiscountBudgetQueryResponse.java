package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.budget.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-21 23:42:43
 */
public class AlipayMarketingCampaignDiscountBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5391152968898538116L;

	/** 
	 * 预算ID
	 */
	@ApiField("budget_id")
	private String budgetId;

	/** 
	 * 预算剩余冻结金额(元)
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/** 
	 * 预算已回收退回保证金账户金额(元)
	 */
	@ApiField("recycle_amount")
	private String recycleAmount;

	/** 
	 * 交易已退款金额(元)
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 预算总金额(元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 交易已使用金额(元)
	 */
	@ApiField("used_amount")
	private String usedAmount;

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

    /**
     * Sets freeze amount.
     *
     * @param freezeAmount the freeze amount
     */
    public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

    /**
     * Gets freeze amount.
     *
     * @return the freeze amount
     */
    public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

    /**
     * Sets recycle amount.
     *
     * @param recycleAmount the recycle amount
     */
    public void setRecycleAmount(String recycleAmount) {
		this.recycleAmount = recycleAmount;
	}

    /**
     * Gets recycle amount.
     *
     * @return the recycle amount
     */
    public String getRecycleAmount( ) {
		return this.recycleAmount;
	}

    /**
     * Sets refund amount.
     *
     * @param refundAmount the refund amount
     */
    public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

    /**
     * Gets refund amount.
     *
     * @return the refund amount
     */
    public String getRefundAmount( ) {
		return this.refundAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount( ) {
		return this.totalAmount;
	}

    /**
     * Sets used amount.
     *
     * @param usedAmount the used amount
     */
    public void setUsedAmount(String usedAmount) {
		this.usedAmount = usedAmount;
	}

    /**
     * Gets used amount.
     *
     * @return the used amount
     */
    public String getUsedAmount( ) {
		return this.usedAmount;
	}

}
