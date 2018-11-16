package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.benefit.create response.
 *
 * @author auto create
 * @since 1.0, 2018-03-07 11:30:59
 */
public class AlipayUserBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5449916522653711935L;

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
