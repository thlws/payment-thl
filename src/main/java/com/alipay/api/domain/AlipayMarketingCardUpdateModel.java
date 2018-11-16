package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 会员卡更新
 *
 * @author auto create
 * @since 1.0, 2017-08-24 15:51:39
 */
public class AlipayMarketingCardUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 7225428686258317217L;

	/**
	 * 需要修改的最新卡信息
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/**
	 * 扩展信息(暂时无用)
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 注意：此字段已废弃，卡面样式以模板中的定义为准。
会员卡卡面展示样式
参考：展示位置详情参考"商户会员卡->快速接入文档->第四步" 
备注：mcard_style_info与card_info下的template_id不能同时更新
	 */
	@ApiField("mcard_style_info")
	private McardStylInfo mcardStyleInfo;

	/**
	 * 卡信息变更通知消息
1、在列表中定义的消息，才会发送给用户，消息格式一定。
2、根据卡信息变更情况，一次可发送多个消息
	 */
	@ApiListField("notify_messages")
	@ApiField("mcard_notify_message")
	private List<McardNotifyMessage> notifyMessages;

	/**
	 * 标识业务发生的时间
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 支付宝业务卡号，开卡接口中返回获取
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型
BIZ_CARD：支付宝业务卡号
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

    /**
     * Gets card info.
     *
     * @return the card info
     */
    public MerchantCard getCardInfo() {
		return this.cardInfo;
	}

    /**
     * Sets card info.
     *
     * @param cardInfo the card info
     */
    public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
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
     * Gets mcard style info.
     *
     * @return the mcard style info
     */
    public McardStylInfo getMcardStyleInfo() {
		return this.mcardStyleInfo;
	}

    /**
     * Sets mcard style info.
     *
     * @param mcardStyleInfo the mcard style info
     */
    public void setMcardStyleInfo(McardStylInfo mcardStyleInfo) {
		this.mcardStyleInfo = mcardStyleInfo;
	}

    /**
     * Gets notify messages.
     *
     * @return the notify messages
     */
    public List<McardNotifyMessage> getNotifyMessages() {
		return this.notifyMessages;
	}

    /**
     * Sets notify messages.
     *
     * @param notifyMessages the notify messages
     */
    public void setNotifyMessages(List<McardNotifyMessage> notifyMessages) {
		this.notifyMessages = notifyMessages;
	}

    /**
     * Gets occur time.
     *
     * @return the occur time
     */
    public Date getOccurTime() {
		return this.occurTime;
	}

    /**
     * Sets occur time.
     *
     * @param occurTime the occur time
     */
    public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

    /**
     * Gets target card no.
     *
     * @return the target card no
     */
    public String getTargetCardNo() {
		return this.targetCardNo;
	}

    /**
     * Sets target card no.
     *
     * @param targetCardNo the target card no
     */
    public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

    /**
     * Gets target card no type.
     *
     * @return the target card no type
     */
    public String getTargetCardNoType() {
		return this.targetCardNoType;
	}

    /**
     * Sets target card no type.
     *
     * @param targetCardNoType the target card no type
     */
    public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
