package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.message.push response.
 *
 * @author auto create
 * @since 1.0, 2016-03-31 21:05:52
 */
public class AlipayMobilePublicMessagePushResponse extends AlipayResponse {

	private static final long serialVersionUID = 4689272688911189869L;

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
