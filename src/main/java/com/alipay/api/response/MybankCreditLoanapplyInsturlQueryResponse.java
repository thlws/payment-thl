package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.insturl.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-17 18:00:00
 */
public class MybankCreditLoanapplyInsturlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8187872161962928337L;

	/** 
	 * 机构目标跳转链接地址
	 */
	@ApiField("target_url")
	private String targetUrl;

    /**
     * Sets target url.
     *
     * @param targetUrl the target url
     */
    public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

    /**
     * Gets target url.
     *
     * @return the target url
     */
    public String getTargetUrl( ) {
		return this.targetUrl;
	}

}
