package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.smilepay.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-01-17 16:33:04
 */
public class ZolozAuthenticationCustomerSmilepayInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2362149874465268166L;

	/** 
	 * 返回值
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
