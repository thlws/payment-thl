package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号广告位轮播内容
 *
 * @author auto create
 * @since 1.0, 2017-11-02 16:05:41
 */
public class AdvertItem extends AlipayObject {

	private static final long serialVersionUID = 8569617333872492598L;

	/**
	 * 广告图片url, 尺寸为996*240，最大不超过5M，支持格式:.jpg、.png ，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 跳转链接，点击广告图片跳到的链接url
	 */
	@ApiField("link_url")
	private String linkUrl;

    /**
     * Gets img url.
     *
     * @return the img url
     */
    public String getImgUrl() {
		return this.imgUrl;
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
     * Gets link url.
     *
     * @return the link url
     */
    public String getLinkUrl() {
		return this.linkUrl;
	}

    /**
     * Sets link url.
     *
     * @param linkUrl the link url
     */
    public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

}
