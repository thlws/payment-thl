package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.content.publish response.
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:37:58
 */
public class AlipayOpenPublicContentPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7889848345229372416L;

	/** 
	 * message_id 用于描述生成的消息id
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
