package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.whitelist.create response.
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:21:46
 */
public class AlipayMarketingCampaignDrawcampWhitelistCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2236891451859662467L;

	/** 
	 * 操作结果状态，业务维度，网关返回成功状态码并且业务维度返回true才成功
	 */
	@ApiField("camp_result")
	private Boolean campResult;

    /**
     * Sets camp result.
     *
     * @param campResult the camp result
     */
    public void setCampResult(Boolean campResult) {
		this.campResult = campResult;
	}

    /**
     * Gets camp result.
     *
     * @return the camp result
     */
    public Boolean getCampResult( ) {
		return this.campResult;
	}

}
