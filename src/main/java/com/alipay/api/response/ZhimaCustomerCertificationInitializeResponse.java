package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.certification.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-09-11 17:55:00
 */
public class ZhimaCustomerCertificationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1183464393658662328L;

	/** 
	 * 本次认证的唯一标识，商户需要记录，后续的操作都需要用到
	 */
	@ApiField("biz_no")
	private String bizNo;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

}
