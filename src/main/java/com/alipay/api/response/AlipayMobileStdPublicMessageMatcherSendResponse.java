package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.message.matcher.send response.
 *
 * @author auto create
 * @since 1.0, 2018-06-21 19:00:00
 */
public class AlipayMobileStdPublicMessageMatcherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3173927634244154784L;

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
