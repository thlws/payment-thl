package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CampDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingCampaignActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6428473146829473694L;

	/** 
	 * 活动详情
	 */
	@ApiField("camp_detail")
	private CampDetail campDetail;

    /**
     * Sets camp detail.
     *
     * @param campDetail the camp detail
     */
    public void setCampDetail(CampDetail campDetail) {
		this.campDetail = campDetail;
	}

    /**
     * Gets camp detail.
     *
     * @return the camp detail
     */
    public CampDetail getCampDetail( ) {
		return this.campDetail;
	}

}
