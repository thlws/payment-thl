package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsMktCampaignDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.campaign.query response.
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:25
 */
public class AlipayInsMarketingCampaignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4782696612778662512L;

	/** 
	 * 保险营销活动信息
	 */
	@ApiField("mkt_campaign")
	private InsMktCampaignDTO mktCampaign;

    /**
     * Sets mkt campaign.
     *
     * @param mktCampaign the mkt campaign
     */
    public void setMktCampaign(InsMktCampaignDTO mktCampaign) {
		this.mktCampaign = mktCampaign;
	}

    /**
     * Gets mkt campaign.
     *
     * @return the mkt campaign
     */
    public InsMktCampaignDTO getMktCampaign( ) {
		return this.mktCampaign;
	}

}
