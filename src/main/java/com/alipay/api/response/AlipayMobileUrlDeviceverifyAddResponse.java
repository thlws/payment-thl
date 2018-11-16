package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.url.deviceverify.add response.
 *
 * @author auto create
 * @since 1.0, 2014-08-14 19:40:00
 */
public class AlipayMobileUrlDeviceverifyAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4131532544527437718L;

	/** 
	 * 返回业务操作是否成功
	 */
	@ApiField("response")
	private Boolean response;

    /**
     * Sets response.
     *
     * @param response the response
     */
    public void setResponse(Boolean response) {
		this.response = response;
	}

    /**
     * Gets response.
     *
     * @return the response
     */
    public Boolean getResponse( ) {
		return this.response;
	}

}
