package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销位内容
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:22:08
 */
public class TopicItem extends AlipayObject {

	private static final long serialVersionUID = 4838619561239345197L;

	/**
	 * 内容图片url, 尺寸为300*300，最大不超过3M，支持格式:.jpg、.png ，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 跳转链接，点击营销位内容图片跳到的链接url
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 内容说明
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 内容标题
	 */
	@ApiField("title")
	private String title;

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

    /**
     * Gets sub title.
     *
     * @return the sub title
     */
    public String getSubTitle() {
		return this.subTitle;
	}

    /**
     * Sets sub title.
     *
     * @param subTitle the sub title
     */
    public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
