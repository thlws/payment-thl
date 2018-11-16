package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.update response.
 *
 * @author auto create
 * @since 1.0, 2017-03-23 14:22:20
 */
public class AlipayMarketingCampaignDrawcampUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4244997673725557928L;

	/** 
	 * 操作结果状态，true表示修改成功立即生效，false表示修改失败
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
