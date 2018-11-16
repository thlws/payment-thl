package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝群聊发消息
 *
 * @author auto create
 * @since 1.0, 2018-03-15 14:16:27
 */
public class AlipaySocialBaseChatGmsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 4442717521789662997L;

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
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线客户端的消息id，需要全局唯一，必填时间。
	 */
	@ApiField("client_msg_id")
	private String clientMsgId;

	/**
	 * 投递方式 1: 群里所有人都收到 2:部分人可见,只发给群里的部分人员看到,rangeUsers是接受者的userId列表 3:部分人不可见,只有部分人无法看到,rangeUsers是不投递的userId列表
	 */
	@ApiField("delivery_mode")
	private String deliveryMode;

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
	 * 用于在用户客户端没有前台打开情况下，给用户通知提醒，示例值"发来一个红包"最终显示为"${发送者昵称}发来一个红包"
	 */
	@ApiField("push_str")
	private String pushStr;

	/**
	 * 部分投递的用户uid列表
	 */
	@ApiListField("range_users")
	@ApiField("string")
	private List<String> rangeUsers;

	/**
	 * 群的id，必填
	 */
	@ApiField("receiver_id")
	private String receiverId;

	/**
	 * 接受者的用户类型，群组2，讨论组3，必填
	 */
	@ApiField("receiver_usertype")
	private String receiverUsertype;

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
     * Gets delivery mode.
     *
     * @return the delivery mode
     */
    public String getDeliveryMode() {
		return this.deliveryMode;
	}

    /**
     * Sets delivery mode.
     *
     * @param deliveryMode the delivery mode
     */
    public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
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
     * Gets range users.
     *
     * @return the range users
     */
    public List<String> getRangeUsers() {
		return this.rangeUsers;
	}

    /**
     * Sets range users.
     *
     * @param rangeUsers the range users
     */
    public void setRangeUsers(List<String> rangeUsers) {
		this.rangeUsers = rangeUsers;
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
