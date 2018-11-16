package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.codec.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-16 16:30:00
 */
public class ZhimaCreditEpCodecCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7223843375258446376L;

	/** 
	 * 二维码地址
	 */
	@ApiField("codec_img_url")
	private String codecImgUrl;

	/** 
	 * 二维码生码订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 二维码码值
	 */
	@ApiField("token")
	private String token;

    /**
     * Sets codec img url.
     *
     * @param codecImgUrl the codec img url
     */
    public void setCodecImgUrl(String codecImgUrl) {
		this.codecImgUrl = codecImgUrl;
	}

    /**
     * Gets codec img url.
     *
     * @return the codec img url
     */
    public String getCodecImgUrl( ) {
		return this.codecImgUrl;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

    /**
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken( ) {
		return this.token;
	}

}
