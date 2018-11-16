package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.group.send response.
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:53:43
 */
public class AlipayOpenPublicMessageGroupSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8838624642824978625L;

	/** 
	 * 2013121100055554f1000b64-3f05-4581-a5e1-16e29d242950
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
