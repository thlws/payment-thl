package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.equity.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-12-26 14:07:08
 */
public class AlipayMarketingDataEquitySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1521926415645717292L;

	/** 
	 * true/false
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
