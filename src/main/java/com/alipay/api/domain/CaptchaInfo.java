package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 图片验证码信息
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:44:31
 */
public class CaptchaInfo extends AlipayObject {

	private static final long serialVersionUID = 8668397572492225561L;

	/**
	 * 图片特殊描述信息
	 */
	@ApiField("captcha_desc")
	private String captchaDesc;

	/**
	 * 图片内容，base64编码
	 */
	@ApiField("image_content")
	private String imageContent;

	/**
	 * 图片类型，jpeg|bmp
	 */
	@ApiField("image_type")
	private String imageType;

    /**
     * Gets captcha desc.
     *
     * @return the captcha desc
     */
    public String getCaptchaDesc() {
		return this.captchaDesc;
	}

    /**
     * Sets captcha desc.
     *
     * @param captchaDesc the captcha desc
     */
    public void setCaptchaDesc(String captchaDesc) {
		this.captchaDesc = captchaDesc;
	}

    /**
     * Gets image content.
     *
     * @return the image content
     */
    public String getImageContent() {
		return this.imageContent;
	}

    /**
     * Sets image content.
     *
     * @param imageContent the image content
     */
    public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

    /**
     * Gets image type.
     *
     * @return the image type
     */
    public String getImageType() {
		return this.imageType;
	}

    /**
     * Sets image type.
     *
     * @param imageType the image type
     */
    public void setImageType(String imageType) {
		this.imageType = imageType;
	}

}
