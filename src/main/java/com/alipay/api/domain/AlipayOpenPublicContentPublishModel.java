package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号素材内容落库接口
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:37:58
 */
public class AlipayOpenPublicContentPublishModel extends AlipayObject {

	private static final long serialVersionUID = 8838356985645916646L;

	/**
	 * action_url 文章地址url，用于文章列表显示，用户点击后的跳转地址。
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * article_id 为调用方的文章id，用于生活号对输入的文章进行去重检测
	 */
	@ApiField("article_id")
	private String articleId;

	/**
	 * content 为写文章完整的正文文本内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * cover_img 用于内容在文章列表中展示时的配图
	 */
	@ApiField("cover_img")
	private String coverImg;

	/**
	 * desc 用于描述文章简介
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * endTime 用于描述文章内容有效截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * source 用于描述调用接口的业务方
	 */
	@ApiField("source")
	private String source;

	/**
	 * title 用于描述文章标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets action url.
     *
     * @return the action url
     */
    public String getActionUrl() {
		return this.actionUrl;
	}

    /**
     * Sets action url.
     *
     * @param actionUrl the action url
     */
    public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

    /**
     * Gets article id.
     *
     * @return the article id
     */
    public String getArticleId() {
		return this.articleId;
	}

    /**
     * Sets article id.
     *
     * @param articleId the article id
     */
    public void setArticleId(String articleId) {
		this.articleId = articleId;
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
     * Gets cover img.
     *
     * @return the cover img
     */
    public String getCoverImg() {
		return this.coverImg;
	}

    /**
     * Sets cover img.
     *
     * @param coverImg the cover img
     */
    public void setCoverImg(String coverImg) {
		this.coverImg = coverImg;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
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
