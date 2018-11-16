package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.advert.create response.
 *
 * @author auto create
 * @since 1.0, 2018-04-09 11:00:00
 */
public class AlipayOpenPublicAdvertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4275662974876433834L;

	/** 
	 * 广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

    /**
     * Sets advert id.
     *
     * @param advertId the advert id
     */
    public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

    /**
     * Gets advert id.
     *
     * @return the advert id
     */
    public String getAdvertId( ) {
		return this.advertId;
	}

}
