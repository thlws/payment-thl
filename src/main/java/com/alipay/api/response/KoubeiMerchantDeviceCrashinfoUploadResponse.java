package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.device.crashinfo.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-08-24 17:07:27
 */
public class KoubeiMerchantDeviceCrashinfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5437377551163296392L;

	/** 
	 * 系统错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * "错误信息描述"
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 接口调用是否重试的标识
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 接口调用是否成功的标识
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
     * Sets retry.
     *
     * @param retry the retry
     */
    public void setRetry(Boolean retry) {
		this.retry = retry;
	}

    /**
     * Gets retry.
     *
     * @return the retry
     */
    public Boolean getRetry( ) {
		return this.retry;
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
