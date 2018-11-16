package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.verifyidentity.confirm response.
 *
 * @author auto create
 * @since 1.0, 2018-01-15 15:48:35
 */
public class AlipaySecurityRiskVerifyidentityConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 6546371891122284433L;

	/** 
	 * 身份核实校验结果失败时，返回的失败错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 身份核实校验结果失败时，返回的失败错误原因说明
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 身份核验结果
	 */
	@ApiField("verify_result")
	private Boolean verifyResult;

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
     * Sets verify result.
     *
     * @param verifyResult the verify result
     */
    public void setVerifyResult(Boolean verifyResult) {
		this.verifyResult = verifyResult;
	}

    /**
     * Gets verify result.
     *
     * @return the verify result
     */
    public Boolean getVerifyResult( ) {
		return this.verifyResult;
	}

}
