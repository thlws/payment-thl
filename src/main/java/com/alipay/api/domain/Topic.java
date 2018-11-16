package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销位
 *
 * @author auto create
 * @since 1.0, 2017-12-06 11:22:08
 */
public class Topic extends AlipayObject {

	private static final long serialVersionUID = 7387973626889415959L;

	/**
	 * 营销位图片url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 营销位跳转地址，点击营销位头图跳到的链接url。
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 营销位描述
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 营销位名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 营销位id
	 */
	@ApiField("topic_id")
	private String topicId;

	/**
	 * 营销位内容列表
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
     * Gets topic id.
     *
     * @return the topic id
     */
    public String getTopicId() {
		return this.topicId;
	}

    /**
     * Sets topic id.
     *
     * @param topicId the topic id
     */
    public void setTopicId(String topicId) {
		this.topicId = topicId;
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
