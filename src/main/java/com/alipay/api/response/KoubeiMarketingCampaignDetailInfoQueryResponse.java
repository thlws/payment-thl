package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.detail.info.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-10 14:14:30
 */
public class KoubeiMarketingCampaignDetailInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1663947469513742223L;

	/** 
	 * 适用门店:门店与门店之间用“,”隔开
	 */
	@ApiField("limit_shops")
	private String limitShops;

    /**
     * Sets limit shops.
     *
     * @param limitShops the limit shops
     */
    public void setLimitShops(String limitShops) {
		this.limitShops = limitShops;
	}

    /**
     * Gets limit shops.
     *
     * @return the limit shops
     */
    public String getLimitShops( ) {
		return this.limitShops;
	}

}
