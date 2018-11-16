package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerbaseinfo.create response.
 *
 * @author auto create
 * @since 1.0, 2018-02-26 16:15:41
 */
public class AlipayOpenMiniInnerbaseinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1349297343469189443L;

	/** 
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

    /**
     * Sets mini app id.
     *
     * @param miniAppId the mini app id
     */
    public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

    /**
     * Gets mini app id.
     *
     * @return the mini app id
     */
    public String getMiniAppId( ) {
		return this.miniAppId;
	}

}
