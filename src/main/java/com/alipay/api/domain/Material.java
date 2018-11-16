package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发送消息内容
 *
 * @author auto create
 * @since 1.0, 2016-12-02 15:56:25
 */
public class Material extends AlipayObject {

	private static final long serialVersionUID = 6691431473413281135L;

	/**
	 * 图文消息子消息项集合，单条消息最多6个子项，否则会发送失败
	 */
	@ApiListField("articles")
	@ApiField("article")
	private List<Article> articles;

	/**
	 * 消息类型，text：文本类型，image-text：图文类型。当消息类型为text时，text参数必传，当消息类型为image-text时，articles参数必传
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * 文本消息内容
	 */
	@ApiField("text")
	private Text text;

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

}
