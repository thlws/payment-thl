package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.enterprise.staffinfo.upload response.
 *
 * @author auto create
 * @since 1.0, 2017-07-25 15:32:34
 */
public class KoubeiMarketingDataEnterpriseStaffinfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8299128347292832592L;

	/** 
	 * 人群ID
	 */
	@ApiField("crowd_id")
	private String crowdId;

    /**
     * Sets crowd id.
     *
     * @param crowdId the crowd id
     */
    public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}

    /**
     * Gets crowd id.
     *
     * @return the crowd id
     */
    public String getCrowdId( ) {
		return this.crowdId;
	}

}
