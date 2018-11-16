package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.status.update response.
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:21:52
 */
public class AlipayMarketingCampaignDrawcampStatusUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3888914345933886646L;

	/** 
	 * 修改状态操作结果状态，业务维度，网关返回成功状态码并且业务维度返回true才成功
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
