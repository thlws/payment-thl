package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cert.create response.
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:21:57
 */
public class AlipayMarketingCampaignCertCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1669235276754354188L;

	/** 
	 * 凭证id
	 */
	@ApiField("lot_number")
	private String lotNumber;

    /**
     * Sets lot number.
     *
     * @param lotNumber the lot number
     */
    public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

    /**
     * Gets lot number.
     *
     * @return the lot number
     */
    public String getLotNumber( ) {
		return this.lotNumber;
	}

}
