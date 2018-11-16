package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilelive.initialize response.
 *
 * @author auto create
 * @since 1.0, 2017-12-19 22:07:33
 */
public class ZolozAuthenticationCustomerSmileliveInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3746248793844291317L;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

}
