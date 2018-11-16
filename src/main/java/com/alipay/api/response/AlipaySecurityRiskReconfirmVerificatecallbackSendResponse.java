package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.reconfirm.verificatecallback.send response.
 *
 * @author auto create
 * @since 1.0, 2018-04-23 15:07:57
 */
public class AlipaySecurityRiskReconfirmVerificatecallbackSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4566938731775361539L;

	/** 
	 * 额外返回信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

    /**
     * Sets extend info.
     *
     * @param extendInfo the extend info
     */
    public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

    /**
     * Gets extend info.
     *
     * @return the extend info
     */
    public String getExtendInfo( ) {
		return this.extendInfo;
	}

}
