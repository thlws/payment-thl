package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 异步单发消息
 *
 * @author auto create
 * @since 1.0, 2018-08-14 13:54:21
 */
public class AlipayOpenPublicMessageCustomSendModel extends AlipayObject {

	private static final long serialVersionUID = 2351573361726142489L;

	/**
	 * 图文消息，当msg_type为image-text时，必须存在相对应的值
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 是否是聊天消息。支持值：0，1，当值为0时，代表是非聊天消息，消息显示在生活号主页，当值为1时，代表是聊天消息，消息显示在咨询反馈列表页。默认值为0
	 */
	@ApiField("chat")
	private String chat;

	/**
	 * 触发消息的事件类型，默认为空。代表商户未改造。如果是follow，代表关注消息。click代表菜单点击，enter_ppchat代表进入事件；请注意事件类型的大小写
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 消息类型，text：文本消息，image-text：图文消息
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 当msg_type为text时，必须设置相对应的值
	 */
	@ApiField("text")
	private Text text;

	/**
	 * 消息接收用户的userid
	 */
	@ApiField("to_user_id")
	private String toUserId;

    /**
     * Gets articles.
     *
     * @return the articles
     */
    public List<Article> getArticles() {
		return this.articles;
	}

    /**
     * Sets articles.
     *
     * @param articles the articles
     */
    public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

    /**
     * Gets chat.
     *
     * @return the chat
     */
    public String getChat() {
		return this.chat;
	}

    /**
     * Sets chat.
     *
     * @param chat the chat
     */
    public void setChat(String chat) {
		this.chat = chat;
	}

    /**
     * Gets event type.
     *
     * @return the event type
     */
    public String getEventType() {
		return this.eventType;
	}

    /**
     * Sets event type.
     *
     * @param eventType the event type
     */
    public void setEventType(String eventType) {
		this.eventType = eventType;
	}

    /**
     * Gets msg type.
     *
     * @return the msg type
     */
    public String getMsgType() {
		return this.msgType;
	}

    /**
     * Sets msg type.
     *
     * @param msgType the msg type
     */
    public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

    /**
     * Gets text.
     *
     * @return the text
     */
    public Text getText() {
		return this.text;
	}

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(Text text) {
		this.text = text;
	}

    /**
     * Gets to user id.
     *
     * @return the to user id
     */
    public String getToUserId() {
		return this.toUserId;
	}

    /**
     * Sets to user id.
     *
     * @param toUserId the to user id
     */
    public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
