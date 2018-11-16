package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.send response.
 *
 * @author auto create
 * @since 1.0, 2018-02-26 17:56:05
 */
public class AlipaySocialBaseChatSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7486888423715889826L;

	/** 
	 * msg_index:msgid+sessionId
	 */
	@ApiField("msg_index")
	private String msgIndex;

    /**
     * Sets msg index.
     *
     * @param msgIndex the msg index
     */
    public void setMsgIndex(String msgIndex) {
		this.msgIndex = msgIndex;
	}

    /**
     * Gets msg index.
     *
     * @return the msg index
     */
    public String getMsgIndex( ) {
		return this.msgIndex;
	}

}
