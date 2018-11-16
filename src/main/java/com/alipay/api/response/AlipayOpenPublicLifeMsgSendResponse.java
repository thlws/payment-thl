package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.msg.send response.
 *
 * @author auto create
 * @since 1.0, 2018-04-17 14:24:09
 */
public class AlipayOpenPublicLifeMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7351453787157757576L;

	/** 
	 * 生活号消息唯一标识
	 */
	@ApiField("alipay_msg_id")
	private String alipayMsgId;

    /**
     * Sets alipay msg id.
     *
     * @param alipayMsgId the alipay msg id
     */
    public void setAlipayMsgId(String alipayMsgId) {
		this.alipayMsgId = alipayMsgId;
	}

    /**
     * Gets alipay msg id.
     *
     * @return the alipay msg id
     */
    public String getAlipayMsgId( ) {
		return this.alipayMsgId;
	}

}
