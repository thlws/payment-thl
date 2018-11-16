package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销位添加接口
 *
 * @author auto create
 * @since 1.0, 2018-01-05 17:37:49
 */
public class AlipayOpenPublicTopicCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7192223648341821961L;

	/**
	 * 营销位图片url, 尺寸为996*450，最大不超过5M，支持格式:.jpg、.png ，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url。营销位需要展示头图时，必须填写该参数。
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 跳转类型，网页:HTTP、小程序:APP，不传默认HTTP
	 */
	@ApiField("link_type")
	private String linkType;

	/**
	 * 营销位跳转地址，点击营销位头图跳到的链接url。营销位需要展示头图时，必须填写该参数。
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 营销位描述。营销位需要展示头图时，必须填写该参数。
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 营销位名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 营销位内容，数量限制：大于4个，小于8个
	 */
	@ApiListField("topic_items")
	@ApiField("topic_item")
	private List<TopicItem> topicItems;

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
     * Gets link type.
     *
     * @return the link type
     */
    public String getLinkType() {
		return this.linkType;
	}

    /**
     * Sets link type.
     *
     * @param linkType the link type
     */
    public void setLinkType(String linkType) {
		this.linkType = linkType;
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

    /**
     * Gets topic items.
     *
     * @return the topic items
     */
    public List<TopicItem> getTopicItems() {
		return this.topicItems;
	}

    /**
     * Sets topic items.
     *
     * @param topicItems the topic items
     */
    public void setTopicItems(List<TopicItem> topicItems) {
		this.topicItems = topicItems;
	}

}
