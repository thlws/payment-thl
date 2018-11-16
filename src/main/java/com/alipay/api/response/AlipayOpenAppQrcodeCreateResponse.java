package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.qrcode.create response.
 *
 * @author auto create
 * @since 1.0, 2018-01-15 16:43:22
 */
public class AlipayOpenAppQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1858339848156455469L;

	/** 
	 * 二维码图片链接地址
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

    /**
     * Sets qr code url.
     *
     * @param qrCodeUrl the qr code url
     */
    public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

    /**
     * Gets qr code url.
     *
     * @return the qr code url
     */
    public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
