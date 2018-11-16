package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑外部券使用接口
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:05
 */
public class AlipayOfflineMarketingVoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 3539742256849497976L;

	/**
	 * 约定的扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部活动id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 外部交易信息
	 */
	@ApiField("external_trade_info")
	private VoucherUserExternalTradeInfo externalTradeInfo;

	/**
	 * 外部券码
	 */
	@ApiField("external_voucher_code")
	private String externalVoucherCode;

    /**
     * Gets extend params.
     *
     * @return the extend params
     */
    public String getExtendParams() {
		return this.extendParams;
	}

    /**
     * Sets extend params.
     *
     * @param extendParams the extend params
     */
    public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

    /**
     * Gets external id.
     *
     * @return the external id
     */
    public String getExternalId() {
		return this.externalId;
	}

    /**
     * Sets external id.
     *
     * @param externalId the external id
     */
    public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

    /**
     * Gets external trade info.
     *
     * @return the external trade info
     */
    public VoucherUserExternalTradeInfo getExternalTradeInfo() {
		return this.externalTradeInfo;
	}

    /**
     * Sets external trade info.
     *
     * @param externalTradeInfo the external trade info
     */
    public void setExternalTradeInfo(VoucherUserExternalTradeInfo externalTradeInfo) {
		this.externalTradeInfo = externalTradeInfo;
	}

    /**
     * Gets external voucher code.
     *
     * @return the external voucher code
     */
    public String getExternalVoucherCode() {
		return this.externalVoucherCode;
	}

    /**
     * Sets external voucher code.
     *
     * @param externalVoucherCode the external voucher code
     */
    public void setExternalVoucherCode(String externalVoucherCode) {
		this.externalVoucherCode = externalVoucherCode;
	}

}
