package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.ep.certification.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class ZhimaCustomerEpCertificationInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 5787711594143217594L;

	/** 
	 * 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
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
