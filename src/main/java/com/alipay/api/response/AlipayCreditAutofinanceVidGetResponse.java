package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.vid.get response.
 *
 * @author auto create
 * @since 1.0, 2017-05-10 09:44:36
 */
public class AlipayCreditAutofinanceVidGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8392141225165296971L;

	/** 
	 * 核身VID
	 */
	@ApiField("verifyid")
	private String verifyid;

    /**
     * Sets verifyid.
     *
     * @param verifyid the verifyid
     */
    public void setVerifyid(String verifyid) {
		this.verifyid = verifyid;
	}

    /**
     * Gets verifyid.
     *
     * @return the verifyid
     */
    public String getVerifyid( ) {
		return this.verifyid;
	}

}
