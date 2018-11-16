package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增图文消息素材接口
 *
 * @author auto create
 * @since 1.0, 2018-01-19 12:14:09
 */
public class AlipayOpenPublicMessageContentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8822785985323519348L;

	/**
	 * 活动利益点，图文类型ctype为activity类型时才需要传，最多10个字符
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 消息正文（支持富文本）
	 */
	@ApiField("content")
	private String content;

	/**
	 * 是否允许评论 T:允许 F:不允许，默认不允许
	 */
	@ApiField("could_comment")
	private String couldComment;

	/**
	 * 封面图url, 尺寸为996*450，最大不超过3M，支持格式:.jpg、.png ，请先调用<a href="https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload"> 图片上传接口</a>获得图片url。
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 图文类型  activity: 活动图文，不填默认普通图文
	 */
	@ApiField("ctype")
	private String ctype;

	/**
	 * 关键词列表，英文逗号分隔，最多不超过5个
	 */
	@ApiField("ext_tags")
	private String extTags;

	/**
	 * 可预览支付宝账号列表，需要预览时才填写， 英文逗号分隔，最多不超过10个
	 */
	@ApiField("login_ids")
	private String loginIds;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets benefit.
     *
     * @return the benefit
     */
    public String getBenefit() {
		return this.benefit;
	}

    /**
     * Sets benefit.
     *
     * @param benefit the benefit
     */
    public void setBenefit(String benefit) {
		this.benefit = benefit;
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
     * Gets could comment.
     *
     * @return the could comment
     */
    public String getCouldComment() {
		return this.couldComment;
	}

    /**
     * Sets could comment.
     *
     * @param couldComment the could comment
     */
    public void setCouldComment(String couldComment) {
		this.couldComment = couldComment;
	}

    /**
     * Gets cover.
     *
     * @return the cover
     */
    public String getCover() {
		return this.cover;
	}

    /**
     * Sets cover.
     *
     * @param cover the cover
     */
    public void setCover(String cover) {
		this.cover = cover;
	}

    /**
     * Gets ctype.
     *
     * @return the ctype
     */
    public String getCtype() {
		return this.ctype;
	}

    /**
     * Sets ctype.
     *
     * @param ctype the ctype
     */
    public void setCtype(String ctype) {
		this.ctype = ctype;
	}

    /**
     * Gets ext tags.
     *
     * @return the ext tags
     */
    public String getExtTags() {
		return this.extTags;
	}

    /**
     * Sets ext tags.
     *
     * @param extTags the ext tags
     */
    public void setExtTags(String extTags) {
		this.extTags = extTags;
	}

    /**
     * Gets login ids.
     *
     * @return the login ids
     */
    public String getLoginIds() {
		return this.loginIds;
	}

    /**
     * Sets login ids.
     *
     * @param loginIds the login ids
     */
    public void setLoginIds(String loginIds) {
		this.loginIds = loginIds;
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
