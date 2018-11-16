package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝带更新功能单聊发消息
 *
 * @author auto create
 * @since 1.0, 2018-03-22 14:31:13
 */
public class AlipaySocialBaseChatNewmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 3392725757639882643L;

	/**
	 * 消息简短描述，显示在会话列表上，必填
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 消息业务类型，申请接入时和我们申请，用于统计和限流
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客户端的消息id，需要全局唯一，必填
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 消息隐藏方案 默认不隐藏 1:上行隐藏 0:下行隐藏,例如 ：A给B发消息 
默认(空): A 看到一条上行消息 B看到一条下行消息(消息文本一样) 
上行隐藏(1): A给B 发消息 ，A 看不到消息 B看到消息
下行隐藏(0): A给B发消息，A看到消息 ，B 看不到消息
	 */
	@ApiField("hidden_side")
	private String hiddenSide;

	/**
	 * 点击消息card跳转的地址，选填
	 */
	@ApiField("link")
	private String link;

	/**
	 * 传update表示更新指定消息,消息用ClientMsgId字段唯一标示.目前仅支持update
	 */
	@ApiField("msg_op_type")
	private String msgOpType;

	/**
	 * 用于在用户客户端没有前台打开情况下，给用户通知提醒，示例值"发来一个红包"最终显示为"${发送者昵称}发来一个红包"
	 */
	@ApiField("push_str")
	private String pushStr;

	/**
	 * 接收消息者的userid，必填
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/**
	 * 模板code值，根据这个值获取对应的模板填充数据协议
	 */
	@ApiField("template_code")
	private String templateCode;

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
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
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
     * Gets hidden side.
     *
     * @return the hidden side
     */
    public String getHiddenSide() {
		return this.hiddenSide;
	}

    /**
     * Sets hidden side.
     *
     * @param hiddenSide the hidden side
     */
    public void setHiddenSide(String hiddenSide) {
		this.hiddenSide = hiddenSide;
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
     * Gets msg op type.
     *
     * @return the msg op type
     */
    public String getMsgOpType() {
		return this.msgOpType;
	}

    /**
     * Sets msg op type.
     *
     * @param msgOpType the msg op type
     */
    public void setMsgOpType(String msgOpType) {
		this.msgOpType = msgOpType;
	}

    /**
     * Gets push str.
     *
     * @return the push str
     */
    public String getPushStr() {
		return this.pushStr;
	}

    /**
     * Sets push str.
     *
     * @param pushStr the push str
     */
    public void setPushStr(String pushStr) {
		this.pushStr = pushStr;
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
     * Gets template code.
     *
     * @return the template code
     */
    public String getTemplateCode() {
		return this.templateCode;
	}

    /**
     * Sets template code.
     *
     * @param templateCode the template code
     */
    public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
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

}
