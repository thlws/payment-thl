package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.auth.send response.
 *
 * @author auto create
 * @since 1.0, 2017-06-19 11:27:25
 */
public class AlipayMarketingVoucherAuthSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1839521163171974144L;

	/** 
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId( ) {
		return this.voucherId;
	}

}
