package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.tpl.content.update response.
 *
 * @author auto create
 * @since 1.0, 2017-12-07 16:33:36
 */
public class AlipayPassTplContentUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6132695145726678355L;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 业务结果数据：包含serialNumber, pass_Id和操作类型
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作是否成功标识：T标识成功；F标识失败
	 */
	@ApiField("success")
	private String success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(String success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public String getSuccess( ) {
		return this.success;
	}

}
