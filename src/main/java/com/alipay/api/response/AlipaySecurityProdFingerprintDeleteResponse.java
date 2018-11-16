package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.fingerprint.delete response.
 *
 * @author auto create
 * @since 1.0, 2018-08-17 16:53:32
 */
public class AlipaySecurityProdFingerprintDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7419874462574861592L;

	/** 
	 * 去注册阶段服务端返回的协议体数据，对应《IFAA本地免密技术规范》中的IFAFMessage，内容中包含服务端的去注册数据。
	 */
	@ApiField("server_response")
	private String serverResponse;

    /**
     * Sets server response.
     *
     * @param serverResponse the server response
     */
    public void setServerResponse(String serverResponse) {
		this.serverResponse = serverResponse;
	}

    /**
     * Gets server response.
     *
     * @return the server response
     */
    public String getServerResponse( ) {
		return this.serverResponse;
	}

}
