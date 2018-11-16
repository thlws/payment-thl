package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.crowd.count response.
 *
 * @author auto create
 * @since 1.0, 2016-12-19 15:27:28
 */
public class AlipayMarketingCampaignRuleCrowdCountResponse extends AlipayResponse {

	private static final long serialVersionUID = 3655562238551127168L;

	/** 
	 * 统计规则或标签所圈定的人群数目
	 */
	@ApiField("crowdcount")
	private String crowdcount;

    /**
     * Sets crowdcount.
     *
     * @param crowdcount the crowdcount
     */
    public void setCrowdcount(String crowdcount) {
		this.crowdcount = crowdcount;
	}

    /**
     * Gets crowdcount.
     *
     * @return the crowdcount
     */
    public String getCrowdcount( ) {
		return this.crowdcount;
	}

}
