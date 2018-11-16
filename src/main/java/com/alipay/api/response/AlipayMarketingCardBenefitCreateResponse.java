package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.create response.
 *
 * @author auto create
 * @since 1.0, 2018-01-11 17:31:14
 */
public class AlipayMarketingCardBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5481186383456887924L;

	/** 
	 * 权益ID
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
