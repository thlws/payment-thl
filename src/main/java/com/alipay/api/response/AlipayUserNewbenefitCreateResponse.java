package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.newbenefit.create response.
 *
 * @author auto create
 * @since 1.0, 2017-06-15 15:43:45
 */
public class AlipayUserNewbenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4177988818812548658L;

	/** 
	 * 权益的ID，可以根据此ID对权益进行操作
	 */
	@ApiField("benefit_id")
	private String benefitId;

    /**
     * Sets benefit id.
     *
     * @param benefitId the benefit id
     */
    public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

    /**
     * Gets benefit id.
     *
     * @return the benefit id
     */
    public String getBenefitId( ) {
		return this.benefitId;
	}

}
