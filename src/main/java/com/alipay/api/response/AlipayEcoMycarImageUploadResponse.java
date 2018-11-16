package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.image.upload response.
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:18
 */
public class AlipayEcoMycarImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6327862692968342141L;

	/** 
	 * 图片Id
	 */
	@ApiField("img_id")
	private String imgId;

	/** 
	 * 图片地址，url全是小写
	 */
	@ApiField("img_url")
	private String imgUrl;

    /**
     * Sets img id.
     *
     * @param imgId the img id
     */
    public void setImgId(String imgId) {
		this.imgId = imgId;
	}

    /**
     * Gets img id.
     *
     * @return the img id
     */
    public String getImgId( ) {
		return this.imgId;
	}

    /**
     * Sets img url.
     *
     * @param imgUrl the img url
     */
    public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

    /**
     * Gets img url.
     *
     * @return the img url
     */
    public String getImgUrl( ) {
		return this.imgUrl;
	}

}
