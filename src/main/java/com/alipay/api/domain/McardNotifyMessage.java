package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知消息
 *
 * @author auto create
 * @since 1.0, 2017-06-06 17:13:14
 */
public class McardNotifyMessage extends AlipayObject {

	private static final long serialVersionUID = 4356258963312436394L;

	/**
	 * 用户提醒信息，按如下格式拼装，需要ISV提供change_reason。
积分变动模板：{change_reason}，您的积分有变动
余额变动模板：{change_reason}，您的余额有变动
等级变更无需提供原因。
	 */
	@ApiField("change_reason")
	private String changeReason;

	/**
	 * JSON格式扩展信息，主要是发送消息中的变量
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 消息类型，每种消息都定义了固定消息模板，
POINT_UPDATE：积分变更消息
BALANCE_UPDATE：余额变更消息
LEVEL_UPDATE：等级变更消息
	 */
	@ApiField("message_type")
	private String messageType;

    /**
     * Gets change reason.
     *
     * @return the change reason
     */
    public String getChangeReason() {
		return this.changeReason;
	}

    /**
     * Sets change reason.
     *
     * @param changeReason the change reason
     */
    public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
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
     * Gets message type.
     *
     * @return the message type
     */
    public String getMessageType() {
		return this.messageType;
	}

    /**
     * Sets message type.
     *
     * @param messageType the message type
     */
    public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

}
