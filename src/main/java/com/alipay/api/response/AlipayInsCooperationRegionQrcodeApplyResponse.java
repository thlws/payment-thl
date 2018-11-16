package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.region.qrcode.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-10-24 10:29:59
 */
public class AlipayInsCooperationRegionQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3367737743314182346L;

	/** 
	 * 快捷投保产品二维码图片链接URL
	 */
	@ApiField("code_url")
	private String codeUrl;

    /**
     * Sets code url.
     *
     * @param codeUrl the code url
     */
    public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

    /**
     * Gets code url.
     *
     * @return the code url
     */
    public String getCodeUrl( ) {
		return this.codeUrl;
	}

}
