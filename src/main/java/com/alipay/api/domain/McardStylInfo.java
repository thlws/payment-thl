package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡卡面样式
 *
 * @author auto create
 * @since 1.0, 2017-06-06 17:13:14
 */
public class McardStylInfo extends AlipayObject {

	private static final long serialVersionUID = 8753846116391657827L;

	/**
	 * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；
尺寸不小于1020*643px；
图片不得有圆角，不得拉伸变形
	 */
	@ApiField("background_id")
	private String backgroundId;

	/**
	 * 背景色
	 */
	@ApiField("bg_color")
	private String bgColor;

	/**
	 * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片

图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；
尺寸不小于500*500px的正方形；
请优先使用商家LOGO；
	 */
	@ApiField("logo_id")
	private String logoId;

    /**
     * Gets background id.
     *
     * @return the background id
     */
    public String getBackgroundId() {
		return this.backgroundId;
	}

    /**
     * Sets background id.
     *
     * @param backgroundId the background id
     */
    public void setBackgroundId(String backgroundId) {
		this.backgroundId = backgroundId;
	}

    /**
     * Gets bg color.
     *
     * @return the bg color
     */
    public String getBgColor() {
		return this.bgColor;
	}

    /**
     * Sets bg color.
     *
     * @param bgColor the bg color
     */
    public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

    /**
     * Gets logo id.
     *
     * @return the logo id
     */
    public String getLogoId() {
		return this.logoId;
	}

    /**
     * Sets logo id.
     *
     * @param logoId the logo id
     */
    public void setLogoId(String logoId) {
		this.logoId = logoId;
	}

}
