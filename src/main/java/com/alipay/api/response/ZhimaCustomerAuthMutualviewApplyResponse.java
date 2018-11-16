package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.auth.mutualview.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-09-06 15:05:00
 */
public class ZhimaCustomerAuthMutualviewApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8312443168925796745L;

	/** 
	 * 查询用户信用状态的id
	 */
	@ApiField("auth_id")
	private String authId;

	/** 
	 * 取消授权结果，true为成功，false为失败，其他值表示非取消授权的操作
	 */
	@ApiField("cancel_result")
	private String cancelResult;

	/** 
	 * 用于展示本次查询结果的描述，例如信用良好，信用一般
	 */
	@ApiField("describe")
	private String describe;

	/** 
	 * 本次业务操作的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 本次业务操作的错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 此值接口提供方不做消费，仅用来给商户端透传的字段；用于商户端在调用此接口时回传到自己的业务逻辑中，用于自己的业务逻辑校验使用的；
此值的来源参见接口入参中的ext_biz_param 中
	 */
	@ApiField("outer_sign")
	private String outerSign;

    /**
     * Sets auth id.
     *
     * @param authId the auth id
     */
    public void setAuthId(String authId) {
		this.authId = authId;
	}

    /**
     * Gets auth id.
     *
     * @return the auth id
     */
    public String getAuthId( ) {
		return this.authId;
	}

    /**
     * Sets cancel result.
     *
     * @param cancelResult the cancel result
     */
    public void setCancelResult(String cancelResult) {
		this.cancelResult = cancelResult;
	}

    /**
     * Gets cancel result.
     *
     * @return the cancel result
     */
    public String getCancelResult( ) {
		return this.cancelResult;
	}

    /**
     * Sets describe.
     *
     * @param describe the describe
     */
    public void setDescribe(String describe) {
		this.describe = describe;
	}

    /**
     * Gets describe.
     *
     * @return the describe
     */
    public String getDescribe( ) {
		return this.describe;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets error message.
     *
     * @param errorMessage the error message
     */
    public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

    /**
     * Gets error message.
     *
     * @return the error message
     */
    public String getErrorMessage( ) {
		return this.errorMessage;
	}

    /**
     * Sets outer sign.
     *
     * @param outerSign the outer sign
     */
    public void setOuterSign(String outerSign) {
		this.outerSign = outerSign;
	}

    /**
     * Gets outer sign.
     *
     * @return the outer sign
     */
    public String getOuterSign( ) {
		return this.outerSign;
	}

}
