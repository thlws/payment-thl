package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.exchangevoucher.use response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayMarketingExchangevoucherUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6326277455818726325L;

	/** 
	 * 被核销的券ID
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
