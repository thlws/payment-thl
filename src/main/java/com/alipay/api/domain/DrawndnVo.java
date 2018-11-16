package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支用数据
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class DrawndnVo extends AlipayObject {

	private static final long serialVersionUID = 7589633235836679834L;

	/**
	 * 实收利息，单位为元，小数点保留2位
	 */
	@ApiField("actual_collected_interest")
	private String actualCollectedInterest;

	/**
	 * 贷款余额(本金余额)
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 已收本息，单位为元，小数点保留2位
	 */
	@ApiField("collected_principal_and_interest")
	private String collectedPrincipalAndInterest;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 支用日,这里代表的是客户这笔支用放款成功日期，如果支用还在放款中或者支用放款失败等，则该值为空
	 */
	@ApiField("drawndn_date")
	private Date drawndnDate;

	/**
	 * 支用编号，代表一笔支用的唯一编号
	 */
	@ApiField("drawndn_no")
	private String drawndnNo;

	/**
	 * 到期日
	 */
	@ApiField("due_date")
	private Date dueDate;

	/**
	 * 五级分类，值类型：NORMAL（正常）、ATTENTION（关注）、SUBPRIME（次级）、DOUBTFUL（可疑）、LOSSES（损失）
	 */
	@ApiField("five_tier_classification")
	private String fiveTierClassification;

	/**
	 * 正常利息，单位为元，小数点保留2位
	 */
	@ApiField("interest")
	private String interest;

	/**
	 * 年利率，小数点保留2位
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/**
	 * 贷款发放额，单位为元，小数点保留2位
	 */
	@ApiField("lending_amount")
	private String lendingAmount;

	/**
	 * 当前逾期期次
	 */
	@ApiField("overduce_terms")
	private Long overduceTerms;

	/**
	 * 当前逾期天数
	 */
	@ApiField("overdue_days")
	private Long overdueDays;

	/**
	 * 逾期利息，单位为元，小数点保留2位
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
	 * 支用状态 ,值类型：INIT(初始),LENDING(发放中),NORMAL(正常),OVD(逾期), CLEAR(结清),OFF(核销), LENDFAIL(发放失败)
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets actual collected interest.
     *
     * @return the actual collected interest
     */
    public String getActualCollectedInterest() {
		return this.actualCollectedInterest;
	}

    /**
     * Sets actual collected interest.
     *
     * @param actualCollectedInterest the actual collected interest
     */
    public void setActualCollectedInterest(String actualCollectedInterest) {
		this.actualCollectedInterest = actualCollectedInterest;
	}

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public String getBalance() {
		return this.balance;
	}

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(String balance) {
		this.balance = balance;
	}

    /**
     * Gets collected principal and interest.
     *
     * @return the collected principal and interest
     */
    public String getCollectedPrincipalAndInterest() {
		return this.collectedPrincipalAndInterest;
	}

    /**
     * Sets collected principal and interest.
     *
     * @param collectedPrincipalAndInterest the collected principal and interest
     */
    public void setCollectedPrincipalAndInterest(String collectedPrincipalAndInterest) {
		this.collectedPrincipalAndInterest = collectedPrincipalAndInterest;
	}

    /**
     * Gets credit no.
     *
     * @return the credit no
     */
    public String getCreditNo() {
		return this.creditNo;
	}

    /**
     * Sets credit no.
     *
     * @param creditNo the credit no
     */
    public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}

    /**
     * Gets drawndn date.
     *
     * @return the drawndn date
     */
    public Date getDrawndnDate() {
		return this.drawndnDate;
	}

    /**
     * Sets drawndn date.
     *
     * @param drawndnDate the drawndn date
     */
    public void setDrawndnDate(Date drawndnDate) {
		this.drawndnDate = drawndnDate;
	}

    /**
     * Gets drawndn no.
     *
     * @return the drawndn no
     */
    public String getDrawndnNo() {
		return this.drawndnNo;
	}

    /**
     * Sets drawndn no.
     *
     * @param drawndnNo the drawndn no
     */
    public void setDrawndnNo(String drawndnNo) {
		this.drawndnNo = drawndnNo;
	}

    /**
     * Gets due date.
     *
     * @return the due date
     */
    public Date getDueDate() {
		return this.dueDate;
	}

    /**
     * Sets due date.
     *
     * @param dueDate the due date
     */
    public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

    /**
     * Gets five tier classification.
     *
     * @return the five tier classification
     */
    public String getFiveTierClassification() {
		return this.fiveTierClassification;
	}

    /**
     * Sets five tier classification.
     *
     * @param fiveTierClassification the five tier classification
     */
    public void setFiveTierClassification(String fiveTierClassification) {
		this.fiveTierClassification = fiveTierClassification;
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
     * Gets interest rate.
     *
     * @return the interest rate
     */
    public String getInterestRate() {
		return this.interestRate;
	}

    /**
     * Sets interest rate.
     *
     * @param interestRate the interest rate
     */
    public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

    /**
     * Gets lending amount.
     *
     * @return the lending amount
     */
    public String getLendingAmount() {
		return this.lendingAmount;
	}

    /**
     * Sets lending amount.
     *
     * @param lendingAmount the lending amount
     */
    public void setLendingAmount(String lendingAmount) {
		this.lendingAmount = lendingAmount;
	}

    /**
     * Gets overduce terms.
     *
     * @return the overduce terms
     */
    public Long getOverduceTerms() {
		return this.overduceTerms;
	}

    /**
     * Sets overduce terms.
     *
     * @param overduceTerms the overduce terms
     */
    public void setOverduceTerms(Long overduceTerms) {
		this.overduceTerms = overduceTerms;
	}

    /**
     * Gets overdue days.
     *
     * @return the overdue days
     */
    public Long getOverdueDays() {
		return this.overdueDays;
	}

    /**
     * Sets overdue days.
     *
     * @param overdueDays the overdue days
     */
    public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
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

}
