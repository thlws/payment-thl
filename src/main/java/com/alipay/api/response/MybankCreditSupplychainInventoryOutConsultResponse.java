package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.inventory.out.consult response.
 *
 * @author auto create
 * @since 1.0, 2018-07-28 01:11:33
 */
public class MybankCreditSupplychainInventoryOutConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6448182962768732273L;

	/** 
	 * 警戒额度
	 */
	@ApiField("alert_amt")
	private String alertAmt;

	/** 
	 * 标识客户的当前贷款状态
	 */
	@ApiField("arg_status")
	private String argStatus;

	/** 
	 * CONTROL 可以出库
BAN 禁止出库
WARNING 达到警戒比例（此时也可以出库）
	 */
	@ApiField("controll_status")
	private String controllStatus;

	/** 
	 * 授信额度
	 */
	@ApiField("credit_amt")
	private String creditAmt;

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
	 * 实际待还款总金额=待还款本金+所有利息(正常利息+逾期利息+逾期本金罚息+逾期利息罚息)
	 */
	@ApiField("repay_amt")
	private String repayAmt;

	/** 
	 * 水位额度
	 */
	@ApiField("water_level_amt")
	private String waterLevelAmt;

    /**
     * Sets alert amt.
     *
     * @param alertAmt the alert amt
     */
    public void setAlertAmt(String alertAmt) {
		this.alertAmt = alertAmt;
	}

    /**
     * Gets alert amt.
     *
     * @return the alert amt
     */
    public String getAlertAmt( ) {
		return this.alertAmt;
	}

    /**
     * Sets arg status.
     *
     * @param argStatus the arg status
     */
    public void setArgStatus(String argStatus) {
		this.argStatus = argStatus;
	}

    /**
     * Gets arg status.
     *
     * @return the arg status
     */
    public String getArgStatus( ) {
		return this.argStatus;
	}

    /**
     * Sets controll status.
     *
     * @param controllStatus the controll status
     */
    public void setControllStatus(String controllStatus) {
		this.controllStatus = controllStatus;
	}

    /**
     * Gets controll status.
     *
     * @return the controll status
     */
    public String getControllStatus( ) {
		return this.controllStatus;
	}

    /**
     * Sets credit amt.
     *
     * @param creditAmt the credit amt
     */
    public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}

    /**
     * Gets credit amt.
     *
     * @return the credit amt
     */
    public String getCreditAmt( ) {
		return this.creditAmt;
	}

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

    /**
     * Sets water level amt.
     *
     * @param waterLevelAmt the water level amt
     */
    public void setWaterLevelAmt(String waterLevelAmt) {
		this.waterLevelAmt = waterLevelAmt;
	}

    /**
     * Gets water level amt.
     *
     * @return the water level amt
     */
    public String getWaterLevelAmt( ) {
		return this.waterLevelAmt;
	}

}
