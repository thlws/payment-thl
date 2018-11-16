package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.umid.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-29 11:15:43
 */
public class AlipaySecurityProdUmidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6726187483939361754L;

	/** 
	 * umid:客户端对应的UMID值，从UMID系统获取。
	 */
	@ApiField("umid")
	private String umid;

    /**
     * Sets umid.
     *
     * @param umid the umid
     */
    public void setUmid(String umid) {
		this.umid = umid;
	}

    /**
     * Gets umid.
     *
     * @return the umid
     */
    public String getUmid( ) {
		return this.umid;
	}

}
