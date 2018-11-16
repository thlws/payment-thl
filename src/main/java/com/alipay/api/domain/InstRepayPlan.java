package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约还款计划
 *
 * @author auto create
 * @since 1.0, 2017-06-05 13:55:45
 */
public class InstRepayPlan extends AlipayObject {

	private static final long serialVersionUID = 7393266612988966383L;

	/**
	 * 是否是当期。 默认值为不是当期计划。如果合约最后一期计划都已经逾期，就不再存在当期计划，合约下所有计划明细的该值都为false
	 */
	@ApiField("cur_term")
	private Boolean curTerm;

	/**
	 * 当期利息，单位：元
	 */
	@ApiField("cur_term_interest")
	private String curTermInterest;

	/**
	 * 当期利息罚息，单位：元
	 */
	@ApiField("cur_term_interest_penalty")
	private String curTermInterestPenalty;

	/**
	 * 当期本金，单位：元
	 */
	@ApiField("cur_term_principal")
	private String curTermPrincipal;

	/**
	 * 当期本金罚息，单位：元
	 */
	@ApiField("cur_term_principal_penalty")
	private String curTermPrincipalPenalty;

	/**
	 * 当期已还利息，单位：元
	 */
	@ApiField("repaid_interest")
	private String repaidInterest;

	/**
	 * 当期已还利息罚息，单位：元
	 */
	@ApiField("repaid_interest_penalty")
	private String repaidInterestPenalty;

	/**
	 * 当期已还本金，单位：元
	 */
	@ApiField("repaid_principal")
	private String repaidPrincipal;

	/**
	 * 当期已还本金罚息，单位：元
	 */
	@ApiField("repaid_principal_penalty")
	private String repaidPrincipalPenalty;

	/**
	 * 分期状态（NORMAL：正常，OVD：逾期，CLEAR：已结清)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 本期到期日
	 */
	@ApiField("term_end_date")
	private String termEndDate;

	/**
	 * 期次号
	 */
	@ApiField("term_no")
	private Long termNo;

	/**
	 * 本期开始日
	 */
	@ApiField("term_start_date")
	private String termStartDate;

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
     * Gets cur term interest.
     *
     * @return the cur term interest
     */
    public String getCurTermInterest() {
		return this.curTermInterest;
	}

    /**
     * Sets cur term interest.
     *
     * @param curTermInterest the cur term interest
     */
    public void setCurTermInterest(String curTermInterest) {
		this.curTermInterest = curTermInterest;
	}

    /**
     * Gets cur term interest penalty.
     *
     * @return the cur term interest penalty
     */
    public String getCurTermInterestPenalty() {
		return this.curTermInterestPenalty;
	}

    /**
     * Sets cur term interest penalty.
     *
     * @param curTermInterestPenalty the cur term interest penalty
     */
    public void setCurTermInterestPenalty(String curTermInterestPenalty) {
		this.curTermInterestPenalty = curTermInterestPenalty;
	}

    /**
     * Gets cur term principal.
     *
     * @return the cur term principal
     */
    public String getCurTermPrincipal() {
		return this.curTermPrincipal;
	}

    /**
     * Sets cur term principal.
     *
     * @param curTermPrincipal the cur term principal
     */
    public void setCurTermPrincipal(String curTermPrincipal) {
		this.curTermPrincipal = curTermPrincipal;
	}

    /**
     * Gets cur term principal penalty.
     *
     * @return the cur term principal penalty
     */
    public String getCurTermPrincipalPenalty() {
		return this.curTermPrincipalPenalty;
	}

    /**
     * Sets cur term principal penalty.
     *
     * @param curTermPrincipalPenalty the cur term principal penalty
     */
    public void setCurTermPrincipalPenalty(String curTermPrincipalPenalty) {
		this.curTermPrincipalPenalty = curTermPrincipalPenalty;
	}

    /**
     * Gets repaid interest.
     *
     * @return the repaid interest
     */
    public String getRepaidInterest() {
		return this.repaidInterest;
	}

    /**
     * Sets repaid interest.
     *
     * @param repaidInterest the repaid interest
     */
    public void setRepaidInterest(String repaidInterest) {
		this.repaidInterest = repaidInterest;
	}

    /**
     * Gets repaid interest penalty.
     *
     * @return the repaid interest penalty
     */
    public String getRepaidInterestPenalty() {
		return this.repaidInterestPenalty;
	}

    /**
     * Sets repaid interest penalty.
     *
     * @param repaidInterestPenalty the repaid interest penalty
     */
    public void setRepaidInterestPenalty(String repaidInterestPenalty) {
		this.repaidInterestPenalty = repaidInterestPenalty;
	}

    /**
     * Gets repaid principal.
     *
     * @return the repaid principal
     */
    public String getRepaidPrincipal() {
		return this.repaidPrincipal;
	}

    /**
     * Sets repaid principal.
     *
     * @param repaidPrincipal the repaid principal
     */
    public void setRepaidPrincipal(String repaidPrincipal) {
		this.repaidPrincipal = repaidPrincipal;
	}

    /**
     * Gets repaid principal penalty.
     *
     * @return the repaid principal penalty
     */
    public String getRepaidPrincipalPenalty() {
		return this.repaidPrincipalPenalty;
	}

    /**
     * Sets repaid principal penalty.
     *
     * @param repaidPrincipalPenalty the repaid principal penalty
     */
    public void setRepaidPrincipalPenalty(String repaidPrincipalPenalty) {
		this.repaidPrincipalPenalty = repaidPrincipalPenalty;
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
    public String getTermEndDate() {
		return this.termEndDate;
	}

    /**
     * Sets term end date.
     *
     * @param termEndDate the term end date
     */
    public void setTermEndDate(String termEndDate) {
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
    public String getTermStartDate() {
		return this.termStartDate;
	}

    /**
     * Sets term start date.
     *
     * @param termStartDate the term start date
     */
    public void setTermStartDate(String termStartDate) {
		this.termStartDate = termStartDate;
	}

}
