package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.ycstest.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-06 15:35:23
 */
public class AlipayOpenServicemarketYcstestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5246181576868251594L;

	/** 
	 * 111
	 */
	@ApiField("out_1")
	private String out1;

	/** 
	 * 222
	 */
	@ApiField("out_2")
	private String out2;

    /**
     * Sets out 1.
     *
     * @param out1 the out 1
     */
    public void setOut1(String out1) {
		this.out1 = out1;
	}

    /**
     * Gets out 1.
     *
     * @return the out 1
     */
    public String getOut1( ) {
		return this.out1;
	}

    /**
     * Sets out 2.
     *
     * @param out2 the out 2
     */
    public void setOut2(String out2) {
		this.out2 = out2;
	}

    /**
     * Gets out 2.
     *
     * @return the out 2
     */
    public String getOut2( ) {
		return this.out2;
	}

}
