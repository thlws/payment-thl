package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备中心消息发送
 *
 * @author auto create
 * @since 1.0, 2018-02-07 11:15:49
 */
public class AlipayCommerceIotMsgcenterSendModel extends AlipayObject {

	private static final long serialVersionUID = 4583361518257775585L;

	/**
	 * 消息内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 消息发送的时间，毫秒级的时间戳
	 */
	@ApiField("datetime")
	private Long datetime;

	/**
	 * 扩展参数，json序列化后的字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息是否支持跳转链接
	 */
	@ApiField("is_support_link")
	private Boolean isSupportLink;

	/**
	 * 消息跳转链接
	 */
	@ApiField("link")
	private String link;

	/**
	 * 消息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 消息类型, 0：普通消息、1：发送push的消息
	 */
	@ApiField("type")
	private Long type;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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
     * Gets datetime.
     *
     * @return the datetime
     */
    public Long getDatetime() {
		return this.datetime;
	}

    /**
     * Sets datetime.
     *
     * @param datetime the datetime
     */
    public void setDatetime(Long datetime) {
		this.datetime = datetime;
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
     * Gets is support link.
     *
     * @return the is support link
     */
    public Boolean getIsSupportLink() {
		return this.isSupportLink;
	}

    /**
     * Sets is support link.
     *
     * @param isSupportLink the is support link
     */
    public void setIsSupportLink(Boolean isSupportLink) {
		this.isSupportLink = isSupportLink;
	}

    /**
     * Gets link.
     *
     * @return the link
     */
    public String getLink() {
		return this.link;
	}

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(String link) {
		this.link = link;
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
     * Gets type.
     *
     * @return the type
     */
    public Long getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(Long type) {
		this.type = type;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
