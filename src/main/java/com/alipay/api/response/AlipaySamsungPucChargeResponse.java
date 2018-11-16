package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.samsung.puc.charge response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:55:58
 */
public class AlipaySamsungPucChargeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8877466249179598559L;

	/** 
	 * zhijiefanhui yemian
	 */
	@ApiField("page_retrun")
	private String pageRetrun;

    /**
     * Sets page retrun.
     *
     * @param pageRetrun the page retrun
     */
    public void setPageRetrun(String pageRetrun) {
		this.pageRetrun = pageRetrun;
	}

    /**
     * Gets page retrun.
     *
     * @return the page retrun
     */
    public String getPageRetrun( ) {
		return this.pageRetrun;
	}

}
