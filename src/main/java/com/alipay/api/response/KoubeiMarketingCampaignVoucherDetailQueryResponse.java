package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Voucher;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.voucher.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-03 14:54:26
 */
public class KoubeiMarketingCampaignVoucherDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3835578157997831771L;

	/** 
	 * 券状态列表如下：
VALID：可用；WRITED_OFF：已核销；EXPIRED：已过期；CLOSED：已关闭；WAIT_APPLY：已冻结；DELETED：已删除；
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券详情对象
	 */
	@ApiField("voucher")
	private Voucher voucher;

	/** 
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets voucher.
     *
     * @param voucher the voucher
     */
    public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

    /**
     * Gets voucher.
     *
     * @return the voucher
     */
    public Voucher getVoucher( ) {
		return this.voucher;
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

}
