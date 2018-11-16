package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.qrcode.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5289289935267155213L;

	/** 
	 * 二维码图片地址，可跳转到实际图片
	 */
	@ApiField("code_img")
	private String codeImg;

	/** 
	 * 二维码有效时间，单位（秒）。永久码暂时忽略该信息
	 */
	@ApiField("expire_second")
	private String expireSecond;

    /**
     * Sets code img.
     *
     * @param codeImg the code img
     */
    public void setCodeImg(String codeImg) {
		this.codeImg = codeImg;
	}

    /**
     * Gets code img.
     *
     * @return the code img
     */
    public String getCodeImg( ) {
		return this.codeImg;
	}

    /**
     * Sets expire second.
     *
     * @param expireSecond the expire second
     */
    public void setExpireSecond(String expireSecond) {
		this.expireSecond = expireSecond;
	}

    /**
     * Gets expire second.
     *
     * @return the expire second
     */
    public String getExpireSecond( ) {
		return this.expireSecond;
	}

}
