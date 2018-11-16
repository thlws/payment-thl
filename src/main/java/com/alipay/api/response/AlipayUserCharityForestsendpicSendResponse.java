package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.charity.forestsendpic.send response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:20:00
 */
public class AlipayUserCharityForestsendpicSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8284481813152652127L;

	/** 
	 * 结果代码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果文案
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 是否上传成功
	 */
	@ApiField("success")
	private String success;

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode( ) {
		return this.resultCode;
	}

    /**
     * Sets result desc.
     *
     * @param resultDesc the result desc
     */
    public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

    /**
     * Gets result desc.
     *
     * @return the result desc
     */
    public String getResultDesc( ) {
		return this.resultDesc;
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
