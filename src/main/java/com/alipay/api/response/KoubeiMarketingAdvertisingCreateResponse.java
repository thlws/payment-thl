package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.advertising.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-31 13:06:06
 */
public class KoubeiMarketingAdvertisingCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6354278982157718156L;

	/** 
	 * 创建广告唯一标识
	 */
	@ApiField("ad_id")
	private String adId;

    /**
     * Sets ad id.
     *
     * @param adId the ad id
     */
    public void setAdId(String adId) {
		this.adId = adId;
	}

    /**
     * Gets ad id.
     *
     * @return the ad id
     */
    public String getAdId( ) {
		return this.adId;
	}

}
