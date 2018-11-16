package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融账单信息
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:53:48
 */
public class SceneProdBillDetail extends AlipayObject {

	private static final long serialVersionUID = 1455622335473932969L;

	/**
	 * 账单类型，包括：正常，手续费，保证金 等类型，根据机构需求可以进行扩展。非必填，不填默认为正常。
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 到期日，时间格式为yyyy-MM-dd
	 */
	@ApiField("due_date")
	private String dueDate;

	/**
	 * 应还利息，单位分
	 */
	@ApiField("int_amt")
	private String intAmt;

	/**
	 * 逾期天数，只能为数字，无逾期传0
	 */
	@ApiField("overdue_days")
	private String overdueDays;

	/**
	 * 应还罚息
	 */
	@ApiField("pen_amt")
	private String penAmt;

	/**
	 * 应还本金，单位分
	 */
	@ApiField("prin_amt")
	private String prinAmt;

	/**
	 * 账单备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 当期账单状态，可以选择的枚举值为：正常(NORMAL)，已结清(CLEAR)，逾期(OVERDUE), 已处置（DISPOSAL）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 期数，只能填写大于0的数字
	 */
	@ApiField("term")
	private String term;

	/**
	 * 应还总金额，单位分
	 */
	@ApiField("total_amt")
	private String totalAmt;

    /**
     * Gets bill type.
     *
     * @return the bill type
     */
    public String getBillType() {
		return this.billType;
	}

    /**
     * Sets bill type.
     *
     * @param billType the bill type
     */
    public void setBillType(String billType) {
		this.billType = billType;
	}

    /**
     * Gets due date.
     *
     * @return the due date
     */
    public String getDueDate() {
		return this.dueDate;
	}

    /**
     * Sets due date.
     *
     * @param dueDate the due date
     */
    public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

    /**
     * Gets int amt.
     *
     * @return the int amt
     */
    public String getIntAmt() {
		return this.intAmt;
	}

    /**
     * Sets int amt.
     *
     * @param intAmt the int amt
     */
    public void setIntAmt(String intAmt) {
		this.intAmt = intAmt;
	}

    /**
     * Gets overdue days.
     *
     * @return the overdue days
     */
    public String getOverdueDays() {
		return this.overdueDays;
	}

    /**
     * Sets overdue days.
     *
     * @param overdueDays the overdue days
     */
    public void setOverdueDays(String overdueDays) {
		this.overdueDays = overdueDays;
	}

    /**
     * Gets pen amt.
     *
     * @return the pen amt
     */
    public String getPenAmt() {
		return this.penAmt;
	}

    /**
     * Sets pen amt.
     *
     * @param penAmt the pen amt
     */
    public void setPenAmt(String penAmt) {
		this.penAmt = penAmt;
	}

    /**
     * Gets prin amt.
     *
     * @return the prin amt
     */
    public String getPrinAmt() {
		return this.prinAmt;
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
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets term.
     *
     * @return the term
     */
    public String getTerm() {
		return this.term;
	}

    /**
     * Sets term.
     *
     * @param term the term
     */
    public void setTerm(String term) {
		this.term = term;
	}

    /**
     * Gets total amt.
     *
     * @return the total amt
     */
    public String getTotalAmt() {
		return this.totalAmt;
	}

    /**
     * Sets total amt.
     *
     * @param totalAmt the total amt
     */
    public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

}
