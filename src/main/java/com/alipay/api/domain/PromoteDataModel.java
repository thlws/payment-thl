package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广数据结构
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:10
 */
public class PromoteDataModel extends AlipayObject {

	private static final long serialVersionUID = 6724545619595416743L;

	/**
	 * 核销数
	 */
	@ApiField("checked_voucher_num")
	private Long checkedVoucherNum;

	/**
	 * 领券数
	 */
	@ApiField("claim_voucher_num")
	private Long claimVoucherNum;

	/**
	 * 分佣金额
	 */
	@ApiField("commission_amount")
	private String commissionAmount;

    /**
     * Gets checked voucher num.
     *
     * @return the checked voucher num
     */
    public Long getCheckedVoucherNum() {
		return this.checkedVoucherNum;
	}

    /**
     * Sets checked voucher num.
     *
     * @param checkedVoucherNum the checked voucher num
     */
    public void setCheckedVoucherNum(Long checkedVoucherNum) {
		this.checkedVoucherNum = checkedVoucherNum;
	}

    /**
     * Gets claim voucher num.
     *
     * @return the claim voucher num
     */
    public Long getClaimVoucherNum() {
		return this.claimVoucherNum;
	}

    /**
     * Sets claim voucher num.
     *
     * @param claimVoucherNum the claim voucher num
     */
    public void setClaimVoucherNum(Long claimVoucherNum) {
		this.claimVoucherNum = claimVoucherNum;
	}

    /**
     * Gets commission amount.
     *
     * @return the commission amount
     */
    public String getCommissionAmount() {
		return this.commissionAmount;
	}

    /**
     * Sets commission amount.
     *
     * @param commissionAmount the commission amount
     */
    public void setCommissionAmount(String commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

}
