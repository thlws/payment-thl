package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbtestabc.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-04 17:55:09
 */
public class AlipayOpenAppXwbtestabcQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2328516884819698153L;

	/** 
	 * 1
	 */
	@ApiField("xw")
	private String xw;

    /**
     * Sets xw.
     *
     * @param xw the xw
     */
    public void setXw(String xw) {
		this.xw = xw;
	}

    /**
     * Gets xw.
     *
     * @return the xw
     */
    public String getXw( ) {
		return this.xw;
	}

}
