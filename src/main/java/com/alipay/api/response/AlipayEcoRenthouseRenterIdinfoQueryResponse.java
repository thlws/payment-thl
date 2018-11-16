package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.renter.idinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-25 14:49:18
 */
public class AlipayEcoRenthouseRenterIdinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6779583795358962148L;

	/** 
	 * 状态值（已授权、未授权、未知）
	 */
	@ApiField("status_value")
	private String statusValue;

    /**
     * Sets status value.
     *
     * @param statusValue the status value
     */
    public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}

    /**
     * Gets status value.
     *
     * @return the status value
     */
    public String getStatusValue( ) {
		return this.statusValue;
	}

}
