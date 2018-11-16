package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yiyiyiwu.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-15 13:09:47
 */
public class AlipayOpenAppYiyiyiwuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6441167329917496117L;

	/** 
	 * 12
	 */
	@ApiField("chucan")
	private String chucan;

    /**
     * Sets chucan.
     *
     * @param chucan the chucan
     */
    public void setChucan(String chucan) {
		this.chucan = chucan;
	}

    /**
     * Gets chucan.
     *
     * @return the chucan
     */
    public String getChucan( ) {
		return this.chucan;
	}

}
