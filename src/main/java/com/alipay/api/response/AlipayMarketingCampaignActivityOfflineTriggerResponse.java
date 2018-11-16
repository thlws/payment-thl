package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.activity.offline.trigger response.
 *
 * @author auto create
 * @since 1.0, 2017-10-24 11:22:59
 */
public class AlipayMarketingCampaignActivityOfflineTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 1166765716746787167L;

	/** 
	 * 外部奖品ID
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

    /**
     * Sets out prize id.
     *
     * @param outPrizeId the out prize id
     */
    public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}

    /**
     * Gets out prize id.
     *
     * @return the out prize id
     */
    public String getOutPrizeId( ) {
		return this.outPrizeId;
	}

}
