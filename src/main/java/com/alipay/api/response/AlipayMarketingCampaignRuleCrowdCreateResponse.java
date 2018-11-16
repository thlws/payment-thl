package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.rule.crowd.create response.
 *
 * @author auto create
 * @since 1.0, 2016-12-23 18:16:35
 */
public class AlipayMarketingCampaignRuleCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8731787226847433293L;

	/** 
	 * 圈人规则id
	 */
	@ApiField("ruleid")
	private String ruleid;

    /**
     * Sets ruleid.
     *
     * @param ruleid the ruleid
     */
    public void setRuleid(String ruleid) {
		this.ruleid = ruleid;
	}

    /**
     * Gets ruleid.
     *
     * @return the ruleid
     */
    public String getRuleid( ) {
		return this.ruleid;
	}

}
