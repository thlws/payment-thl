package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.data.upload.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-04-08 13:55:00
 */
public class ZhimaMerchantDataUploadInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6242818512272766697L;

	/** 
	 * 行业模板
	 */
	@ApiField("template_url")
	private String templateUrl;

    /**
     * Sets template url.
     *
     * @param templateUrl the template url
     */
    public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}

    /**
     * Gets template url.
     *
     * @return the template url
     */
    public String getTemplateUrl( ) {
		return this.templateUrl;
	}

}
