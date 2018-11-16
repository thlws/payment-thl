package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷款方案
 *
 * @author auto create
 * @since 1.0, 2017-03-10 17:07:31
 */
public class LoanScheme extends AlipayObject {

	private static final long serialVersionUID = 1354492272562377621L;

	/**
	 * 授信有效截止日期(日期精度为天,包含截止日)
	 */
	@ApiField("credit_expire_date")
	private Date creditExpireDate;

	/**
	 * 授信额度，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("credit_lmt_amt")
	private String creditLmtAmt;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 授信方式
	 */
	@ApiField("credit_source")
	private String creditSource;

	/**
	 * 授信有效起始日期(日期精度为天,包含起始日)
	 */
	@ApiField("credit_start_date")
	private Date creditStartDate;

	/**
	 * 利率. 年利率小数
	 */
	@ApiField("int_rate")
	private String intRate;

	/**
	 * BC政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 贷款期限
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 可贷额度，默认人民币，精确到小数点两位，单位元
	 */
	@ApiField("loanable_amt")
	private String loanableAmt;

	/**
	 * 统一还款日，若无统一还款日，则为空
	 */
	@ApiField("repay_day")
	private Long repayDay;

	/**
	 * 还款方式
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 销售产品版本
	 */
	@ApiField("sale_pd_version")
	private String salePdVersion;

    /**
     * Gets credit expire date.
     *
     * @return the credit expire date
     */
    public Date getCreditExpireDate() {
		return this.creditExpireDate;
	}

    /**
     * Sets credit expire date.
     *
     * @param creditExpireDate the credit expire date
     */
    public void setCreditExpireDate(Date creditExpireDate) {
		this.creditExpireDate = creditExpireDate;
	}

    /**
     * Gets credit lmt amt.
     *
     * @return the credit lmt amt
     */
    public String getCreditLmtAmt() {
		return this.creditLmtAmt;
	}

    /**
     * Sets credit lmt amt.
     *
     * @param creditLmtAmt the credit lmt amt
     */
    public void setCreditLmtAmt(String creditLmtAmt) {
		this.creditLmtAmt = creditLmtAmt;
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
     * Gets credit source.
     *
     * @return the credit source
     */
    public String getCreditSource() {
		return this.creditSource;
	}

    /**
     * Sets credit source.
     *
     * @param creditSource the credit source
     */
    public void setCreditSource(String creditSource) {
		this.creditSource = creditSource;
	}

    /**
     * Gets credit start date.
     *
     * @return the credit start date
     */
    public Date getCreditStartDate() {
		return this.creditStartDate;
	}

    /**
     * Sets credit start date.
     *
     * @param creditStartDate the credit start date
     */
    public void setCreditStartDate(Date creditStartDate) {
		this.creditStartDate = creditStartDate;
	}

    /**
     * Gets int rate.
     *
     * @return the int rate
     */
    public String getIntRate() {
		return this.intRate;
	}

    /**
     * Sets int rate.
     *
     * @param intRate the int rate
     */
    public void setIntRate(String intRate) {
		this.intRate = intRate;
	}

    /**
     * Gets loan policy code.
     *
     * @return the loan policy code
     */
    public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}

    /**
     * Sets loan policy code.
     *
     * @param loanPolicyCode the loan policy code
     */
    public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
	}

    /**
     * Gets loan term.
     *
     * @return the loan term
     */
    public Long getLoanTerm() {
		return this.loanTerm;
	}

    /**
     * Sets loan term.
     *
     * @param loanTerm the loan term
     */
    public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

    /**
     * Gets loan term unit.
     *
     * @return the loan term unit
     */
    public String getLoanTermUnit() {
		return this.loanTermUnit;
	}

    /**
     * Sets loan term unit.
     *
     * @param loanTermUnit the loan term unit
     */
    public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

    /**
     * Gets loanable amt.
     *
     * @return the loanable amt
     */
    public String getLoanableAmt() {
		return this.loanableAmt;
	}

    /**
     * Sets loanable amt.
     *
     * @param loanableAmt the loanable amt
     */
    public void setLoanableAmt(String loanableAmt) {
		this.loanableAmt = loanableAmt;
	}

    /**
     * Gets repay day.
     *
     * @return the repay day
     */
    public Long getRepayDay() {
		return this.repayDay;
	}

    /**
     * Sets repay day.
     *
     * @param repayDay the repay day
     */
    public void setRepayDay(Long repayDay) {
		this.repayDay = repayDay;
	}

    /**
     * Gets repay mode.
     *
     * @return the repay mode
     */
    public String getRepayMode() {
		return this.repayMode;
	}

    /**
     * Sets repay mode.
     *
     * @param repayMode the repay mode
     */
    public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

    /**
     * Gets sale pd code.
     *
     * @return the sale pd code
     */
    public String getSalePdCode() {
		return this.salePdCode;
	}

    /**
     * Sets sale pd code.
     *
     * @param salePdCode the sale pd code
     */
    public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

    /**
     * Gets sale pd version.
     *
     * @return the sale pd version
     */
    public String getSalePdVersion() {
		return this.salePdVersion;
	}

    /**
     * Sets sale pd version.
     *
     * @param salePdVersion the sale pd version
     */
    public void setSalePdVersion(String salePdVersion) {
		this.salePdVersion = salePdVersion;
	}

}
