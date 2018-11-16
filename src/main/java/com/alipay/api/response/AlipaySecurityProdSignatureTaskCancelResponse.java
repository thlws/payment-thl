package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.cancel response.
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:25:04
 */
public class AlipaySecurityProdSignatureTaskCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 3716883784431559138L;

	/** 
	 * 是否更新成功
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
