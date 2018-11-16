package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送分享消息
 *
 * @author auto create
 * @since 1.0, 2018-02-26 17:56:05
 */
public class AlipaySocialBaseChatSendModel extends AlipayObject {

	private static final long serialVersionUID = 2288367885721155647L;

	/**
	 * 消息简短描述，显示在会话列表上，必填
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 客户端的消息id，需要全局唯一，必填
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 点击消息card跳转的地址，选填
	 */
	@ApiField("link")
	private String link;

	/**
	 * 如果是个人消息，是接收消息者的userid，如果是群消息，是群的id，必填
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/**
	 * 接受者的用户类型，支付宝1，群组2，讨论组3，必填
	 */
	@ApiField("receiver_usertype")
	private String receiverUsertype;

	/**
	 * 消息体的内容，形式为json字符串，必填
分享模板
{
	"title":支付宝聊天,
	"desc":"支付宝聊天",
	"image":"图片地址",
	"thumb":"缩略图地址"
}
文本模板
{
         "m":"文本消息"
}
	 */
	@ApiField("template_data")
	private String templateData;

	/**
	 * 消息模板的类型，分享SHARE，文本TEXT，图片IMAGE，必填
	 */
	@ApiField("template_type")
	private String templateType;

    /**
     * Gets biz memo.
     *
     * @return the biz memo
     */
    public String getBizMemo() {
		return this.bizMemo;
	}

    /**
     * Sets biz memo.
     *
     * @param bizMemo the biz memo
     */
    public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

    /**
     * Gets client msg id.
     *
     * @return the client msg id
     */
    public String getClientMsgId() {
		return this.clientMsgId;
	}

    /**
     * Sets client msg id.
     *
     * @param clientMsgId the client msg id
     */
    public void setClientMsgId(String clientMsgId) {
		this.clientMsgId = clientMsgId;
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
     * Gets receiver id.
     *
     * @return the receiver id
     */
    public String getReceiverId() {
		return this.receiverId;
	}

    /**
     * Sets receiver id.
     *
     * @param receiverId the receiver id
     */
    public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

    /**
     * Gets receiver usertype.
     *
     * @return the receiver usertype
     */
    public String getReceiverUsertype() {
		return this.receiverUsertype;
	}

    /**
     * Sets receiver usertype.
     *
     * @param receiverUsertype the receiver usertype
     */
    public void setReceiverUsertype(String receiverUsertype) {
		this.receiverUsertype = receiverUsertype;
	}

    /**
     * Gets template data.
     *
     * @return the template data
     */
    public String getTemplateData() {
		return this.templateData;
	}

    /**
     * Sets template data.
     *
     * @param templateData the template data
     */
    public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

    /**
     * Gets template type.
     *
     * @return the template type
     */
    public String getTemplateType() {
		return this.templateType;
	}

    /**
     * Sets template type.
     *
     * @param templateType the template type
     */
    public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
