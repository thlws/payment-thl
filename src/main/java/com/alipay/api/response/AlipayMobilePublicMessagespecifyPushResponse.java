package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.messagespecify.push response.
 *
 * @author auto create
 * @since 1.0, 2017-04-14 20:30:54
 */
public class AlipayMobilePublicMessagespecifyPushResponse extends AlipayResponse {

	private static final long serialVersionUID = 3367273979588586391L;

	/** 
	 * 成功
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 消息ID
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 成功
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData( ) {
		return this.data;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
