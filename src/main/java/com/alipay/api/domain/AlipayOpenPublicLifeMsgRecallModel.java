package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号消息撤回接口
 *
 * @author auto create
 * @since 1.0, 2017-08-28 17:30:50
 */
public class AlipayOpenPublicLifeMsgRecallModel extends AlipayObject {

	private static final long serialVersionUID = 6673299353436124351L;

	/**
	 * 消息id
	 */
	@ApiField("message_id")
	private String messageId;

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

}
