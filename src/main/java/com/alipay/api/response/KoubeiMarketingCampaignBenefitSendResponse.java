package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.benefit.send response.
 *
 * @author auto create
 * @since 1.0, 2018-09-15 23:35:00
 */
public class KoubeiMarketingCampaignBenefitSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3151449281487494751L;

	/** 
	 * 领取的权益列表
	 */
	@ApiListField("benefit_ids")
	@ApiField("string")
	private List<String> benefitIds;

    /**
     * Sets benefit ids.
     *
     * @param benefitIds the benefit ids
     */
    public void setBenefitIds(List<String> benefitIds) {
		this.benefitIds = benefitIds;
	}

    /**
     * Gets benefit ids.
     *
     * @return the benefit ids
     */
    public List<String> getBenefitIds( ) {
		return this.benefitIds;
	}

}
