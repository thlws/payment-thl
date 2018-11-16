package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.initialize response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 11:08:38
 */
public class AlipaySecurityRiskVerifyidentityInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 1493367322735414419L;

	/** 
	 * 返回给调用方的数据集合，具体数据由对接过程中双方共同确认
	 */
	@ApiField("biz_data")
	private String bizData;

	/** 
	 * 身份核实校验结果失败时，返回的失败错误原因说明
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 身份核实校验结果失败时，返回的失败错误码身份核实校验结果失败时，返回的失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 核身初始化是否成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 核身页面url
	 */
	@ApiField("verify_url")
	private String verifyUrl;

	/** 
	 * 核身校验token，核身会话中唯一性token，用于后续核身结果二次校验时参数传入
	 */
	@ApiField("veritfy_token")
	private String veritfyToken;

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData( ) {
		return this.bizData;
	}

    /**
     * Sets err msg.
     *
     * @param errMsg the err msg
     */
    public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

    /**
     * Gets err msg.
     *
     * @return the err msg
     */
    public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets is success.
     *
     * @param isSuccess the is success
     */
    public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

    /**
     * Gets is success.
     *
     * @return the is success
     */
    public String getIsSuccess( ) {
		return this.isSuccess;
	}

    /**
     * Sets verify url.
     *
     * @param verifyUrl the verify url
     */
    public void setVerifyUrl(String verifyUrl) {
		this.verifyUrl = verifyUrl;
	}

    /**
     * Gets verify url.
     *
     * @return the verify url
     */
    public String getVerifyUrl( ) {
		return this.verifyUrl;
	}

    /**
     * Sets veritfy token.
     *
     * @param veritfyToken the veritfy token
     */
    public void setVeritfyToken(String veritfyToken) {
		this.veritfyToken = veritfyToken;
	}

    /**
     * Gets veritfy token.
     *
     * @return the veritfy token
     */
    public String getVeritfyToken( ) {
		return this.veritfyToken;
	}

}
