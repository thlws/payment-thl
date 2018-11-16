package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送消息查询
 *
 * @author auto create
 * @since 1.0, 2017-09-20 17:31:09
 */
public class PublicMessageInfo extends AlipayObject {

	private static final long serialVersionUID = 7843544677952428975L;

	/**
	 * 消息id
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 消息发送时间
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 发送状态。INIT：未开始发送、RUNNING：发送中、SUCCESS：发送成功、FAILURE：发送失败、RECALLING：撤回中、RECALLED：撤回失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 消息状态：未开始发送、发送失败、正在处理中、撤回中、撤回成功、发送成功
	 */
	@ApiField("status_desc")
	private String statusDesc;

    /**
     * Gets message id.
     *
     * @return the message id
     */
    public String getMessageId() {
		return this.messageId;
	}

    /**
     * Sets message id.
     *
     * @param messageId the message id
     */
    public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

    /**
     * Gets send time.
     *
     * @return the send time
     */
    public String getSendTime() {
		return this.sendTime;
	}

    /**
     * Sets send time.
     *
     * @param sendTime the send time
     */
    public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status desc.
     *
     * @return the status desc
     */
    public String getStatusDesc() {
		return this.statusDesc;
	}

    /**
     * Sets status desc.
     *
     * @param statusDesc the status desc
     */
    public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}
