package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.shortlink.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMobilePublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3798147989263387612L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 成功
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 短链接url
	 */
	@ApiField("shortlink")
	private String shortlink;

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
     * Sets shortlink.
     *
     * @param shortlink the shortlink
     */
    public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}

    /**
     * Gets shortlink.
     *
     * @return the shortlink
     */
    public String getShortlink( ) {
		return this.shortlink;
	}

}
