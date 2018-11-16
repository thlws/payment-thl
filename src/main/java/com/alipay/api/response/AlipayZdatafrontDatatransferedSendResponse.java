package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.send response.
 *
 * @author auto create
 * @since 1.0, 2017-05-18 11:27:33
 */
public class AlipayZdatafrontDatatransferedSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6876769115373754911L;

	/** 
	 * 表示数据传输是否成功
	 */
	@ApiField("success")
	private String success;

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
