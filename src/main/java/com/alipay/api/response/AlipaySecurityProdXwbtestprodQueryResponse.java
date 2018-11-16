package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.xwbtestprod.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-09 19:50:00
 */
public class AlipaySecurityProdXwbtestprodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5795659942724168576L;

	/** 
	 * 11000
	 */
	@ApiField("out_a")
	private String outA;

	/** 
	 * xxxx
	 */
	@ApiField("out_b")
	private Long outB;

    /**
     * Sets out a.
     *
     * @param outA the out a
     */
    public void setOutA(String outA) {
		this.outA = outA;
	}

    /**
     * Gets out a.
     *
     * @return the out a
     */
    public String getOutA( ) {
		return this.outA;
	}

    /**
     * Sets out b.
     *
     * @param outB the out b
     */
    public void setOutB(Long outB) {
		this.outB = outB;
	}

    /**
     * Gets out b.
     *
     * @return the out b
     */
    public Long getOutB( ) {
		return this.outB;
	}

}
