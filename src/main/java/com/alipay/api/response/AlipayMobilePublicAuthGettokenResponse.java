package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.auth.gettoken response.
 *
 * @author auto create
 * @since 1.0, 2017-08-02 17:36:19
 */
public class AlipayMobilePublicAuthGettokenResponse extends AlipayResponse {

	private static final long serialVersionUID = 1267942637362167125L;

	/** 
	 * 返回码。处理成功：200；处理失败：请参考返回码。
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 支付宝返回的处理结果说明，请参考返回码
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 跳转到授权页面需要的Token
	 */
	@ApiField("token")
	private String token;

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
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken( ) {
		return this.token;
	}

}
