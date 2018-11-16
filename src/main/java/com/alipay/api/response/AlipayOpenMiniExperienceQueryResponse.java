package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.experience.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-25 00:12:45
 */
public class AlipayOpenMiniExperienceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7838153781539982681L;

	/** 
	 * 小程序体验版二维码地址
	 */
	@ApiField("exp_qr_code_url")
	private String expQrCodeUrl;

	/** 
	 * 体验版打包状态，expVersionPackged-体验版打包成功，expVersionPackaging-体验版打包中，notExpVersion-非体验版
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets exp qr code url.
     *
     * @param expQrCodeUrl the exp qr code url
     */
    public void setExpQrCodeUrl(String expQrCodeUrl) {
		this.expQrCodeUrl = expQrCodeUrl;
	}

    /**
     * Gets exp qr code url.
     *
     * @return the exp qr code url
     */
    public String getExpQrCodeUrl( ) {
		return this.expQrCodeUrl;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
