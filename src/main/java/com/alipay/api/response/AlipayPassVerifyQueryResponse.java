package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.verify.query response.
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:02
 */
public class AlipayPassVerifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8832675148579178933L;

	/** 
	 * 查询成功时返回的结果信息
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 返回码。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 查询是否成功的标识
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
