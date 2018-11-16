package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.XXXXsdasdasd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.test.practice response.
 *
 * @author auto create
 * @since 1.0, 2016-03-30 10:16:33
 */
public class ZhimaMerchantTestPracticeResponse extends AlipayResponse {

	private static final long serialVersionUID = 2748578268153265641L;

	/** 
	 * xxxx
	 */
	@ApiField("dddd")
	private XXXXsdasdasd dddd;

	/** 
	 * ccc
	 */
	@ApiField("sss")
	private String sss;

    /**
     * Sets dddd.
     *
     * @param dddd the dddd
     */
    public void setDddd(XXXXsdasdasd dddd) {
		this.dddd = dddd;
	}

    /**
     * Gets dddd.
     *
     * @return the dddd
     */
    public XXXXsdasdasd getDddd( ) {
		return this.dddd;
	}

    /**
     * Sets sss.
     *
     * @param sss the sss
     */
    public void setSss(String sss) {
		this.sss = sss;
	}

    /**
     * Gets sss.
     *
     * @return the sss
     */
    public String getSss( ) {
		return this.sss;
	}

}
