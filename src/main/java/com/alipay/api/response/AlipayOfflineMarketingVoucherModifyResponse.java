package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:33
 */
public class AlipayOfflineMarketingVoucherModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1818385943269965288L;

	/** 
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/** 
	 * 券模板状态,EFFECTIVE=生效，INVALID=失效
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

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

    /**
     * Sets voucher status.
     *
     * @param voucherStatus the voucher status
     */
    public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

    /**
     * Gets voucher status.
     *
     * @return the voucher status
     */
    public String getVoucherStatus( ) {
		return this.voucherStatus;
	}

}
