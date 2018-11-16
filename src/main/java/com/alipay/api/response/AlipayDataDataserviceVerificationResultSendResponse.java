package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.verification.result.send response.
 *
 * @author auto create
 * @since 1.0, 2018-05-07 15:10:00
 */
public class AlipayDataDataserviceVerificationResultSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2169978881139215141L;

	/** 
	 * 反馈是否成功
	 */
	@ApiField("success")
	private Boolean success;

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
