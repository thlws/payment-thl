package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.xwbsss.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-12 14:06:20
 */
public class AlipayOpenAppXwbsssQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8675859355363599423L;

	/** 
	 * 1
	 */
	@ApiField("a")
	private String a;

    /**
     * Sets a.
     *
     * @param a the a
     */
    public void setA(String a) {
		this.a = a;
	}

    /**
     * Gets a.
     *
     * @return the a
     */
    public String getA( ) {
		return this.a;
	}

}
