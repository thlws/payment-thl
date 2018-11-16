package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.sync.update response.
 *
 * @author auto create
 * @since 1.0, 2017-12-07 20:19:03
 */
public class AlipayPassSyncUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8535512756468524165L;

	/** 
	 * 更新成功时的业务信息
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 当新增alipass不成功时，产生的错误码.
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否更新成功的标识。
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Sets biz result.
     *
     * @param bizResult the biz result
     */
    public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}

    /**
     * Gets biz result.
     *
     * @return the biz result
     */
    public String getBizResult( ) {
		return this.bizResult;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
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
