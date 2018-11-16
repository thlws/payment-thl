package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.prize.amount.query response.
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:22:01
 */
public class AlipayMarketingCampaignPrizeAmountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6821353199618829377L;

	/** 
	 * 奖品剩余数量，数值
	 */
	@ApiField("remain_amount")
	private String remainAmount;

    /**
     * Sets remain amount.
     *
     * @param remainAmount the remain amount
     */
    public void setRemainAmount(String remainAmount) {
		this.remainAmount = remainAmount;
	}

    /**
     * Gets remain amount.
     *
     * @return the remain amount
     */
    public String getRemainAmount( ) {
		return this.remainAmount;
	}

}
