package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.status.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:31:38
 */
public class AlipayOfflineMarketingVoucherStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3449377296785144312L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 券模板id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/** 
	 * 券模板状态。EFFECTIVE=生效，INVALID=失效。
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo( ) {
		return this.extInfo;
	}

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
