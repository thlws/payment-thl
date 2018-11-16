package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.message.label.send response.
 *
 * @author auto create
 * @since 1.0, 2016-03-31 21:05:48
 */
public class AlipayMobilePublicMessageLabelSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5732559214334634891L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果信息
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 消息ID
	 */
	@ApiField("msg_id")
	private String msgId;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

    /**
     * Sets msg id.
     *
     * @param msgId the msg id
     */
    public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

    /**
     * Gets msg id.
     *
     * @return the msg id
     */
    public String getMsgId( ) {
		return this.msgId;
	}

}
