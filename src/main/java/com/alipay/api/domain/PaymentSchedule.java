package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用还款计划（包括虚拟还款和真实还款）
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class PaymentSchedule extends AlipayObject {

	private static final long serialVersionUID = 8384587491154395336L;

	/**
	 * 还款日
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 已还利息总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_interest_total")
	private String repaidInterestTotal;

	/**
	 * 已还罚息总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_penalty_total")
	private String repaidPenaltyTotal;

	/**
	 * 已还本金总和，单位为元，小数点保留2位
	 */
	@ApiField("repaid_principal_total")
	private String repaidPrincipalTotal;

	/**
	 * 期初时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 期次
	 */
	@ApiField("term")
	private Long term;

	/**
	 * 应还利息总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_interest_total")
	private String unpaidInterestTotal;

	/**
	 * 应还罚息总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_penalty_total")
	private String unpaidPenaltyTotal;

	/**
	 * 应还本金总和，单位为元，小数点保留2位
	 */
	@ApiField("unpaid_principal_total")
	private String unpaidPrincipalTotal;

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
		return this.date;
	}

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
		this.date = date;
	}

    /**
     * Gets repaid interest total.
     *
     * @return the repaid interest total
     */
    public String getRepaidInterestTotal() {
		return this.repaidInterestTotal;
	}

    /**
     * Sets repaid interest total.
     *
     * @param repaidInterestTotal the repaid interest total
     */
    public void setRepaidInterestTotal(String repaidInterestTotal) {
		this.repaidInterestTotal = repaidInterestTotal;
	}

    /**
     * Gets repaid penalty total.
     *
     * @return the repaid penalty total
     */
    public String getRepaidPenaltyTotal() {
		return this.repaidPenaltyTotal;
	}

    /**
     * Sets repaid penalty total.
     *
     * @param repaidPenaltyTotal the repaid penalty total
     */
    public void setRepaidPenaltyTotal(String repaidPenaltyTotal) {
		this.repaidPenaltyTotal = repaidPenaltyTotal;
	}

    /**
     * Gets repaid principal total.
     *
     * @return the repaid principal total
     */
    public String getRepaidPrincipalTotal() {
		return this.repaidPrincipalTotal;
	}

    /**
     * Sets repaid principal total.
     *
     * @param repaidPrincipalTotal the repaid principal total
     */
    public void setRepaidPrincipalTotal(String repaidPrincipalTotal) {
		this.repaidPrincipalTotal = repaidPrincipalTotal;
	}

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets term.
     *
     * @return the term
     */
    public Long getTerm() {
		return this.term;
	}

    /**
     * Sets term.
     *
     * @param term the term
     */
    public void setTerm(Long term) {
		this.term = term;
	}

    /**
     * Gets unpaid interest total.
     *
     * @return the unpaid interest total
     */
    public String getUnpaidInterestTotal() {
		return this.unpaidInterestTotal;
	}

    /**
     * Sets unpaid interest total.
     *
     * @param unpaidInterestTotal the unpaid interest total
     */
    public void setUnpaidInterestTotal(String unpaidInterestTotal) {
		this.unpaidInterestTotal = unpaidInterestTotal;
	}

    /**
     * Gets unpaid penalty total.
     *
     * @return the unpaid penalty total
     */
    public String getUnpaidPenaltyTotal() {
		return this.unpaidPenaltyTotal;
	}

    /**
     * Sets unpaid penalty total.
     *
     * @param unpaidPenaltyTotal the unpaid penalty total
     */
    public void setUnpaidPenaltyTotal(String unpaidPenaltyTotal) {
		this.unpaidPenaltyTotal = unpaidPenaltyTotal;
	}

    /**
     * Gets unpaid principal total.
     *
     * @return the unpaid principal total
     */
    public String getUnpaidPrincipalTotal() {
		return this.unpaidPrincipalTotal;
	}

    /**
     * Sets unpaid principal total.
     *
     * @param unpaidPrincipalTotal the unpaid principal total
     */
    public void setUnpaidPrincipalTotal(String unpaidPrincipalTotal) {
		this.unpaidPrincipalTotal = unpaidPrincipalTotal;
	}

}
