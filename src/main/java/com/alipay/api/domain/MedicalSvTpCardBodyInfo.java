package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参见“body_info参数说明”
 * 1提醒类body_info固定为主副及可选布局格式
 * 2应用类body_info固定为图文连接的格式布局
 *
 * @author auto create
 * @since 1.0, 2016-11-16 15:16:20
 */
public class MedicalSvTpCardBodyInfo extends AlipayObject {

	private static final long serialVersionUID = 2693755992525946213L;

	/**
	 * 模板消息主体主要内容题,开发者自定义
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("content")
	private String content;

	/**
	 * 模板消息主体内同图标URL
图片大小（长*宽,单位px）328*328
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 模板消息主体内容的URL链接
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 模板消息主体内容的备注
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 模板消息主体内容的副内容
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("sub_contenet")
	private String subContenet;

	/**
	 * 模板消息主体内容的副标题
备注：根据模板样式编码来确认是否可空
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 主体内容中的标题,开发者自定义
备注：根据模板类型确定属性是否可空
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
		return this.content;
	}

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
		this.content = content;
	}

    /**
     * Gets image url.
     *
     * @return the image url
     */
    public String getImageUrl() {
		return this.imageUrl;
	}

    /**
     * Sets image url.
     *
     * @param imageUrl the image url
     */
    public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets sub contenet.
     *
     * @return the sub contenet
     */
    public String getSubContenet() {
		return this.subContenet;
	}

    /**
     * Sets sub contenet.
     *
     * @param subContenet the sub contenet
     */
    public void setSubContenet(String subContenet) {
		this.subContenet = subContenet;
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
