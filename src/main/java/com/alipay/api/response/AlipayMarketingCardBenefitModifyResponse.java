package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingCardBenefitModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8246956865177856811L;

	/** 
	 * 权益修改结果；true成功：false失败
	 */
	@ApiField("result")
	private Boolean result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(Boolean result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public Boolean getResult( ) {
		return this.result;
	}

}
