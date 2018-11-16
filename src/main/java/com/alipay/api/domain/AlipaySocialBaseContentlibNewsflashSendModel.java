package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容中台快讯插入接口
 *
 * @author auto create
 * @since 1.0, 2018-05-14 14:10:07
 */
public class AlipaySocialBaseContentlibNewsflashSendModel extends AlipayObject {

	private static final long serialVersionUID = 3894453863784295578L;

	/**
	 * 作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展信息，json格式数据
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 配图地址
	 */
	@ApiField("images")
	private String images;

	/**
	 * 标签, 多个用逗号隔开
	 */
	@ApiField("opr_tags")
	private String oprTags;

	/**
	 * 发布时间
	 */
	@ApiField("publish_date")
	private Date publishDate;

	/**
	 * 推荐权重，0：不可用，1：显示，2：加权
	 */
	@ApiField("recommend")
	private Long recommend;

	/**
	 * 来源渠道
	 */
	@ApiField("source_channel_key")
	private String sourceChannelKey;

	/**
	 * 快讯来源id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
		return this.author;
	}

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(String author) {
		this.author = author;
	}

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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets images.
     *
     * @return the images
     */
    public String getImages() {
		return this.images;
	}

    /**
     * Sets images.
     *
     * @param images the images
     */
    public void setImages(String images) {
		this.images = images;
	}

    /**
     * Gets opr tags.
     *
     * @return the opr tags
     */
    public String getOprTags() {
		return this.oprTags;
	}

    /**
     * Sets opr tags.
     *
     * @param oprTags the opr tags
     */
    public void setOprTags(String oprTags) {
		this.oprTags = oprTags;
	}

    /**
     * Gets publish date.
     *
     * @return the publish date
     */
    public Date getPublishDate() {
		return this.publishDate;
	}

    /**
     * Sets publish date.
     *
     * @param publishDate the publish date
     */
    public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

    /**
     * Gets recommend.
     *
     * @return the recommend
     */
    public Long getRecommend() {
		return this.recommend;
	}

    /**
     * Sets recommend.
     *
     * @param recommend the recommend
     */
    public void setRecommend(Long recommend) {
		this.recommend = recommend;
	}

    /**
     * Gets source channel key.
     *
     * @return the source channel key
     */
    public String getSourceChannelKey() {
		return this.sourceChannelKey;
	}

    /**
     * Sets source channel key.
     *
     * @param sourceChannelKey the source channel key
     */
    public void setSourceChannelKey(String sourceChannelKey) {
		this.sourceChannelKey = sourceChannelKey;
	}

    /**
     * Gets source id.
     *
     * @return the source id
     */
    public String getSourceId() {
		return this.sourceId;
	}

    /**
     * Sets source id.
     *
     * @param sourceId the source id
     */
    public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

    /**
     * Gets summary.
     *
     * @return the summary
     */
    public String getSummary() {
		return this.summary;
	}

    /**
     * Sets summary.
     *
     * @param summary the summary
     */
    public void setSummary(String summary) {
		this.summary = summary;
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
