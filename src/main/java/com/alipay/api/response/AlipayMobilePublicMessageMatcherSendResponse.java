package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.message.matcher.send response.
 *
 * @author auto create
 * @since 1.0, 2017-06-15 11:44:12
 */
public class AlipayMobilePublicMessageMatcherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6589312224953262863L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 对应toUserId，标准Alipay UserId
	 */
	@ApiField("to_alipay_user_id")
	private String toAlipayUserId;

	/** 
	 * 消息接收人的用户ID，值取的openId
	 */
	@ApiField("to_user_id")
	private String toUserId;

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
     * Sets to alipay user id.
     *
     * @param toAlipayUserId the to alipay user id
     */
    public void setToAlipayUserId(String toAlipayUserId) {
		this.toAlipayUserId = toAlipayUserId;
	}

    /**
     * Gets to alipay user id.
     *
     * @return the to alipay user id
     */
    public String getToAlipayUserId( ) {
		return this.toAlipayUserId;
	}

    /**
     * Sets to user id.
     *
     * @param toUserId the to user id
     */
    public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

    /**
     * Gets to user id.
     *
     * @return the to user id
     */
    public String getToUserId( ) {
		return this.toUserId;
	}

}
