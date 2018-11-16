package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.xwbtestabc.abc.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-17 11:00:06
 */
public class AlipaySecurityProdXwbtestabcAbcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4353193779747112986L;

	/** 
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

    /**
     * Sets xwb.
     *
     * @param xwb the xwb
     */
    public void setXwb(String xwb) {
		this.xwb = xwb;
	}

    /**
     * Gets xwb.
     *
     * @return the xwb
     */
    public String getXwb( ) {
		return this.xwb;
	}

}
