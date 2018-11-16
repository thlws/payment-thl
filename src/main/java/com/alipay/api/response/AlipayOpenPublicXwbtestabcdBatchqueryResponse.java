package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.xwbtestabcd.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-12-21 18:51:53
 */
public class AlipayOpenPublicXwbtestabcdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4197374868565232781L;

	/** 
	 * 1111
	 */
	@ApiField("b")
	private String b;

    /**
     * Sets b.
     *
     * @param b the b
     */
    public void setB(String b) {
		this.b = b;
	}

    /**
     * Gets b.
     *
     * @return the b
     */
    public String getB( ) {
		return this.b;
	}

}
