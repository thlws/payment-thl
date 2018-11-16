package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.total.send response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicMessageTotalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8217953175653886269L;

	/** 
	 * 消息ID
	 */
	@ApiField("message_id")
	private String messageId;

    /**
     * Sets message id.
     *
     * @param messageId the message id
     */
    public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

    /**
     * Gets message id.
     *
     * @return the message id
     */
    public String getMessageId( ) {
		return this.messageId;
	}

}
