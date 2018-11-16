package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtstabc.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:01:26
 */
public class AlipayOpenAppXwbtstabcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5387753426111676435L;

	/** 
	 * 1
	 */
	@ApiField("xwbbbdd")
	private String xwbbbdd;

    /**
     * Sets xwbbbdd.
     *
     * @param xwbbbdd the xwbbbdd
     */
    public void setXwbbbdd(String xwbbbdd) {
		this.xwbbbdd = xwbbbdd;
	}

    /**
     * Gets xwbbbdd.
     *
     * @return the xwbbbdd
     */
    public String getXwbbbdd( ) {
		return this.xwbbbdd;
	}

}
