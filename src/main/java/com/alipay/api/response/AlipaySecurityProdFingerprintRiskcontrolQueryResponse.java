package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.riskcontrol.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:25
 */
public class AlipaySecurityProdFingerprintRiskcontrolQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1293926558471926442L;

	/** 
	 * IFAA服务端查询结果，true为支持指纹功能，false为不支持
	 */
	@ApiField("check_result")
	private Boolean checkResult;

    /**
     * Sets check result.
     *
     * @param checkResult the check result
     */
    public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}

    /**
     * Gets check result.
     *
     * @return the check result
     */
    public Boolean getCheckResult( ) {
		return this.checkResult;
	}

}
