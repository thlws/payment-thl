package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.advertising.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-08-31 13:06:40
 */
public class KoubeiMarketingAdvertisingModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7771748249931421578L;

	/** 
	 * 正常操作返回当前操作的广告id。如果操作失败，返回的广告id为空
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
