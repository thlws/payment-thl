package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台查询得到的每期还款计划
 *
 * @author auto create
 * @since 1.0, 2016-12-21 15:13:12
 */
public class InstallmentRepayPlan extends AlipayObject {

	private static final long serialVersionUID = 1533775822951187669L;

	/**
	 * 是否是当期 ?? 默认值为不是当期计划。如果合约最后一期计划都已经逾期，就不再存在当期计划，合约下所有计划明细的该值都为false
	 */
	@ApiField("cur_term")
	private Boolean curTerm;

	/**
	 * 当期已还利息
	 */
	@ApiField("paid_int_bal")
	private String paidIntBal;

	/**
	 * 当期已还本金
	 */
	@ApiField("paid_prin_bal")
	private String paidPrinBal;

	/**
	 * 分期状态（NORMAL：正常，OVD：逾期，CLEAR：已结清)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 本期到期日
	 */
	@ApiField("term_end_date")
	private Date termEndDate;

	/**
	 * 期次号
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 当期利息
	 */
	@ApiField("term_nom_int")
	private String termNomInt;

	/**
	 * 当期本金
	 */
	@ApiField("term_nom_prin")
	private String termNomPrin;

	/**
	 * 当期已还利息罚息
	 */
	@ApiField("term_ovd_int")
	private String termOvdInt;

	/**
	 * 当期利息罚息
	 */
	@ApiField("term_ovd_int_pen_int")
	private String termOvdIntPenInt;

	/**
	 * 当期已还本金罚息
	 */
	@ApiField("term_ovd_prin")
	private String termOvdPrin;

	/**
	 * 当期本金罚息
	 */
	@ApiField("term_ovd_prin_pen_int")
	private String termOvdPrinPenInt;

	/**
	 * 本期开始日
	 */
	@ApiField("term_start_date")
	private Date termStartDate;

    /**
     * Gets cur term.
     *
     * @return the cur term
     */
    public Boolean getCurTerm() {
		return this.curTerm;
	}

    /**
     * Sets cur term.
     *
     * @param curTerm the cur term
     */
    public void setCurTerm(Boolean curTerm) {
		this.curTerm = curTerm;
	}

    /**
     * Gets paid int bal.
     *
     * @return the paid int bal
     */
    public String getPaidIntBal() {
		return this.paidIntBal;
	}

    /**
     * Sets paid int bal.
     *
     * @param paidIntBal the paid int bal
     */
    public void setPaidIntBal(String paidIntBal) {
		this.paidIntBal = paidIntBal;
	}

    /**
     * Gets paid prin bal.
     *
     * @return the paid prin bal
     */
    public String getPaidPrinBal() {
		return this.paidPrinBal;
	}

    /**
     * Sets paid prin bal.
     *
     * @param paidPrinBal the paid prin bal
     */
    public void setPaidPrinBal(String paidPrinBal) {
		this.paidPrinBal = paidPrinBal;
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
     * Gets term end date.
     *
     * @return the term end date
     */
    public Date getTermEndDate() {
		return this.termEndDate;
	}

    /**
     * Sets term end date.
     *
     * @param termEndDate the term end date
     */
    public void setTermEndDate(Date termEndDate) {
		this.termEndDate = termEndDate;
	}

    /**
     * Gets term no.
     *
     * @return the term no
     */
    public Long getTermNo() {
		return this.termNo;
	}

    /**
     * Sets term no.
     *
     * @param termNo the term no
     */
    public void setTermNo(Long termNo) {
		this.termNo = termNo;
	}

    /**
     * Gets term nom int.
     *
     * @return the term nom int
     */
    public String getTermNomInt() {
		return this.termNomInt;
	}

    /**
     * Sets term nom int.
     *
     * @param termNomInt the term nom int
     */
    public void setTermNomInt(String termNomInt) {
		this.termNomInt = termNomInt;
	}

    /**
     * Gets term nom prin.
     *
     * @return the term nom prin
     */
    public String getTermNomPrin() {
		return this.termNomPrin;
	}

    /**
     * Sets term nom prin.
     *
     * @param termNomPrin the term nom prin
     */
    public void setTermNomPrin(String termNomPrin) {
		this.termNomPrin = termNomPrin;
	}

    /**
     * Gets term ovd int.
     *
     * @return the term ovd int
     */
    public String getTermOvdInt() {
		return this.termOvdInt;
	}

    /**
     * Sets term ovd int.
     *
     * @param termOvdInt the term ovd int
     */
    public void setTermOvdInt(String termOvdInt) {
		this.termOvdInt = termOvdInt;
	}

    /**
     * Gets term ovd int pen int.
     *
     * @return the term ovd int pen int
     */
    public String getTermOvdIntPenInt() {
		return this.termOvdIntPenInt;
	}

    /**
     * Sets term ovd int pen int.
     *
     * @param termOvdIntPenInt the term ovd int pen int
     */
    public void setTermOvdIntPenInt(String termOvdIntPenInt) {
		this.termOvdIntPenInt = termOvdIntPenInt;
	}

    /**
     * Gets term ovd prin.
     *
     * @return the term ovd prin
     */
    public String getTermOvdPrin() {
		return this.termOvdPrin;
	}

    /**
     * Sets term ovd prin.
     *
     * @param termOvdPrin the term ovd prin
     */
    public void setTermOvdPrin(String termOvdPrin) {
		this.termOvdPrin = termOvdPrin;
	}

    /**
     * Gets term ovd prin pen int.
     *
     * @return the term ovd prin pen int
     */
    public String getTermOvdPrinPenInt() {
		return this.termOvdPrinPenInt;
	}

    /**
     * Sets term ovd prin pen int.
     *
     * @param termOvdPrinPenInt the term ovd prin pen int
     */
    public void setTermOvdPrinPenInt(String termOvdPrinPenInt) {
		this.termOvdPrinPenInt = termOvdPrinPenInt;
	}

    /**
     * Gets term start date.
     *
     * @return the term start date
     */
    public Date getTermStartDate() {
		return this.termStartDate;
	}

    /**
     * Sets term start date.
     *
     * @param termStartDate the term start date
     */
    public void setTermStartDate(Date termStartDate) {
		this.termStartDate = termStartDate;
	}

}
