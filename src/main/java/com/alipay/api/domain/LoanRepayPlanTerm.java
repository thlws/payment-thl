package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款计划分期信息
 *
 * @author auto create
 * @since 1.0, 2017-10-30 11:35:46
 */
public class LoanRepayPlanTerm extends AlipayObject {

	private static final long serialVersionUID = 3684672795314488758L;

	/**
	 * 是否当前期
	 */
	@ApiField("current_term")
	private Boolean currentTerm;

	/**
	 * 当期已还金额
	 */
	@ApiField("paid_amt")
	private LoanMoneyTypeAmt paidAmt;

	/**
	 * 剩余应还金额
	 */
	@ApiField("remain_amt")
	private LoanMoneyTypeAmt remainAmt;

	/**
	 * 分期状态，目前支持的分期状态有：
NORMAL: 正常
OVD: 逾期
CLEAR: 结清
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
	 * 本期开始日
	 */
	@ApiField("term_start_date")
	private Date termStartDate;

	/**
	 * 当期总金额
	 */
	@ApiField("total_amt")
	private LoanMoneyTypeAmt totalAmt;

    /**
     * Gets current term.
     *
     * @return the current term
     */
    public Boolean getCurrentTerm() {
		return this.currentTerm;
	}

    /**
     * Sets current term.
     *
     * @param currentTerm the current term
     */
    public void setCurrentTerm(Boolean currentTerm) {
		this.currentTerm = currentTerm;
	}

    /**
     * Gets paid amt.
     *
     * @return the paid amt
     */
    public LoanMoneyTypeAmt getPaidAmt() {
		return this.paidAmt;
	}

    /**
     * Sets paid amt.
     *
     * @param paidAmt the paid amt
     */
    public void setPaidAmt(LoanMoneyTypeAmt paidAmt) {
		this.paidAmt = paidAmt;
	}

    /**
     * Gets remain amt.
     *
     * @return the remain amt
     */
    public LoanMoneyTypeAmt getRemainAmt() {
		return this.remainAmt;
	}

    /**
     * Sets remain amt.
     *
     * @param remainAmt the remain amt
     */
    public void setRemainAmt(LoanMoneyTypeAmt remainAmt) {
		this.remainAmt = remainAmt;
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

    /**
     * Gets total amt.
     *
     * @return the total amt
     */
    public LoanMoneyTypeAmt getTotalAmt() {
		return this.totalAmt;
	}

    /**
     * Sets total amt.
     *
     * @param totalAmt the total amt
     */
    public void setTotalAmt(LoanMoneyTypeAmt totalAmt) {
		this.totalAmt = totalAmt;
	}

}
