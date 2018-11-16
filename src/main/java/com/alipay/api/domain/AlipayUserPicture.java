package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权信息查询图片信息对象
 *
 * @author auto create
 * @since 1.0, 2017-09-06 14:47:55
 */
public class AlipayUserPicture extends AlipayObject {

	private static final long serialVersionUID = 4882753512267218775L;

	/**
	 * 图片类型，包括身份证正反面、营业执照等
	 */
	@ApiField("picture_type")
	private String pictureType;

	/**
	 * 用于调用alipay.user.certify.image.fetch接口，获取图片资源
	 */
	@ApiField("picture_url")
	private String pictureUrl;

    /**
     * Gets picture type.
     *
     * @return the picture type
     */
    public String getPictureType() {
		return this.pictureType;
	}

    /**
     * Sets picture type.
     *
     * @param pictureType the picture type
     */
    public void setPictureType(String pictureType) {
		this.pictureType = pictureType;
	}

    /**
     * Gets picture url.
     *
     * @return the picture url
     */
    public String getPictureUrl() {
		return this.pictureUrl;
	}

    /**
     * Sets picture url.
     *
     * @param pictureUrl the picture url
     */
    public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}
