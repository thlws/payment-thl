package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.seller.sign response.
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:29:11
 */
public class AlipayInsMarketingSellerSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4497439841963366739L;

	/** 
	 * 协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

    /**
     * Sets agreement no.
     *
     * @param agreementNo the agreement no
     */
    public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

    /**
     * Gets agreement no.
     *
     * @return the agreement no
     */
    public String getAgreementNo( ) {
		return this.agreementNo;
	}

}
