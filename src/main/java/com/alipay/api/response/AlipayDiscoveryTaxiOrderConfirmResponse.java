package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.discovery.taxi.order.confirm response.
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:59
 */
public class AlipayDiscoveryTaxiOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5226692254646756815L;

	/** 
	 * 返回结果码
	 */
	@ApiField("result_code")
	private String resultCode;

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
	}

}
