package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.image.route.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-30 11:33:08
 */
public class AlipayIserviceCognitiveImageRouteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1633318764585984959L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误详细描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 业务识别内容
	 */
	@ApiField("res")
	private String res;

	/** 
	 * true: 成功
false:失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg( ) {
		return this.errorMsg;
	}

    /**
     * Sets res.
     *
     * @param res the res
     */
    public void setRes(String res) {
		this.res = res;
	}

    /**
     * Gets res.
     *
     * @return the res
     */
    public String getRes( ) {
		return this.res;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

}
