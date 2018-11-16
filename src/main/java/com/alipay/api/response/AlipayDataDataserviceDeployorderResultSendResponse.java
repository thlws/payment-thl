package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.deployorder.result.send response.
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:50:53
 */
public class AlipayDataDataserviceDeployorderResultSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4191197523776774122L;

	/** 
	 * 处理是否成功
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
