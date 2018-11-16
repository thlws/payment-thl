package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.inventory.out.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:59:10
 */
public class MybankCreditSupplychainInventoryOutApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4141715638569861915L;

	/** 
	 * 待还正常利息
	 */
	@ApiField("normal_int_amt")
	private String normalIntAmt;

	/** 
	 * 待还逾期利息
	 */
	@ApiField("ovd_int_amt")
	private String ovdIntAmt;

	/** 
	 * 待还逾期利息罚息
	 */
	@ApiField("ovd_int_pen_int_amt")
	private String ovdIntPenIntAmt;

	/** 
	 * 待还逾期本金罚息
	 */
	@ApiField("ovd_prin_pen_int_amt")
	private String ovdPrinPenIntAmt;

	/** 
	 * 待还款本金
	 */
	@ApiField("prin_amt")
	private String prinAmt;

	/** 
	 * 实际待还款总金额=水位差+所有利息(正常利息+逾期利息+逾期本金罚息+逾期利息罚息)，水位差 ＝ 正常本金-水位额度
	 */
	@ApiField("repay_amt")
	private String repayAmt;

    /**
     * Sets normal int amt.
     *
     * @param normalIntAmt the normal int amt
     */
    public void setNormalIntAmt(String normalIntAmt) {
		this.normalIntAmt = normalIntAmt;
	}

    /**
     * Gets normal int amt.
     *
     * @return the normal int amt
     */
    public String getNormalIntAmt( ) {
		return this.normalIntAmt;
	}

    /**
     * Sets ovd int amt.
     *
     * @param ovdIntAmt the ovd int amt
     */
    public void setOvdIntAmt(String ovdIntAmt) {
		this.ovdIntAmt = ovdIntAmt;
	}

    /**
     * Gets ovd int amt.
     *
     * @return the ovd int amt
     */
    public String getOvdIntAmt( ) {
		return this.ovdIntAmt;
	}

    /**
     * Sets ovd int pen int amt.
     *
     * @param ovdIntPenIntAmt the ovd int pen int amt
     */
    public void setOvdIntPenIntAmt(String ovdIntPenIntAmt) {
		this.ovdIntPenIntAmt = ovdIntPenIntAmt;
	}

    /**
     * Gets ovd int pen int amt.
     *
     * @return the ovd int pen int amt
     */
    public String getOvdIntPenIntAmt( ) {
		return this.ovdIntPenIntAmt;
	}

    /**
     * Sets ovd prin pen int amt.
     *
     * @param ovdPrinPenIntAmt the ovd prin pen int amt
     */
    public void setOvdPrinPenIntAmt(String ovdPrinPenIntAmt) {
		this.ovdPrinPenIntAmt = ovdPrinPenIntAmt;
	}

    /**
     * Gets ovd prin pen int amt.
     *
     * @return the ovd prin pen int amt
     */
    public String getOvdPrinPenIntAmt( ) {
		return this.ovdPrinPenIntAmt;
	}

    /**
     * Sets prin amt.
     *
     * @param prinAmt the prin amt
     */
    public void setPrinAmt(String prinAmt) {
		this.prinAmt = prinAmt;
	}

    /**
     * Gets prin amt.
     *
     * @return the prin amt
     */
    public String getPrinAmt( ) {
		return this.prinAmt;
	}

    /**
     * Sets repay amt.
     *
     * @param repayAmt the repay amt
     */
    public void setRepayAmt(String repayAmt) {
		this.repayAmt = repayAmt;
	}

    /**
     * Gets repay amt.
     *
     * @return the repay amt
     */
    public String getRepayAmt( ) {
		return this.repayAmt;
	}

}
