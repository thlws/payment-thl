package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用还款流水实体
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class RepaymentRecords extends AlipayObject {

	private static final long serialVersionUID = 4831925836542361938L;

	/**
	 * 交易时间
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 正常本金利息，单位为元，小数点保留2位
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 逾期本金利息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_interest")
	private String overdueInterest;

	/**
	 * 逾期利息罚息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_interest_penalty")
	private String overdueInterestPenalty;

	/**
	 * 逾期本金，单位为元，小数点保留2位
	 */
	@ApiField("overdue_principal")
	private String overduePrincipal;

	/**
	 * 逾期本金罚息，单位为元，小数点保留2位
	 */
	@ApiField("overdue_principal_penalty")
	private String overduePrincipalPenalty;

	/**
	 * 正常本金，单位为元，小数点保留2位
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 备注
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 交易总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

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
     * Gets interest.
     *
     * @return the interest
     */
    public String getInterest() {
		return this.interest;
	}

    /**
     * Sets interest.
     *
     * @param interest the interest
     */
    public void setInterest(String interest) {
		this.interest = interest;
	}

    /**
     * Gets overdue interest.
     *
     * @return the overdue interest
     */
    public String getOverdueInterest() {
		return this.overdueInterest;
	}

    /**
     * Sets overdue interest.
     *
     * @param overdueInterest the overdue interest
     */
    public void setOverdueInterest(String overdueInterest) {
		this.overdueInterest = overdueInterest;
	}

    /**
     * Gets overdue interest penalty.
     *
     * @return the overdue interest penalty
     */
    public String getOverdueInterestPenalty() {
		return this.overdueInterestPenalty;
	}

    /**
     * Sets overdue interest penalty.
     *
     * @param overdueInterestPenalty the overdue interest penalty
     */
    public void setOverdueInterestPenalty(String overdueInterestPenalty) {
		this.overdueInterestPenalty = overdueInterestPenalty;
	}

    /**
     * Gets overdue principal.
     *
     * @return the overdue principal
     */
    public String getOverduePrincipal() {
		return this.overduePrincipal;
	}

    /**
     * Sets overdue principal.
     *
     * @param overduePrincipal the overdue principal
     */
    public void setOverduePrincipal(String overduePrincipal) {
		this.overduePrincipal = overduePrincipal;
	}

    /**
     * Gets overdue principal penalty.
     *
     * @return the overdue principal penalty
     */
    public String getOverduePrincipalPenalty() {
		return this.overduePrincipalPenalty;
	}

    /**
     * Sets overdue principal penalty.
     *
     * @param overduePrincipalPenalty the overdue principal penalty
     */
    public void setOverduePrincipalPenalty(String overduePrincipalPenalty) {
		this.overduePrincipalPenalty = overduePrincipalPenalty;
	}

    /**
     * Gets principal.
     *
     * @return the principal
     */
    public String getPrincipal() {
		return this.principal;
	}

    /**
     * Sets principal.
     *
     * @param principal the principal
     */
    public void setPrincipal(String principal) {
		this.principal = principal;
	}

    /**
     * Gets remarks.
     *
     * @return the remarks
     */
    public String getRemarks() {
		return this.remarks;
	}

    /**
     * Sets remarks.
     *
     * @param remarks the remarks
     */
    public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
