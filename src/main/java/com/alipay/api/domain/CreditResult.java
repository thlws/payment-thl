package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授信结果,每一笔授信编号对应的一笔授信结果；主要提供ISV查看
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class CreditResult extends AlipayObject {

	private static final long serialVersionUID = 8534192632257239265L;

	/**
	 * 授信金额
	 */
	@ApiField("credit_line")
	private String creditLine;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 一笔授信规定的从开始到结束的周期，例如12个月，30天等。
	 */
	@ApiField("credit_term")
	private Long creditTerm;

	/**
	 * 年、月、日
	 */
	@ApiField("credit_term_unit")
	private String creditTermUnit;

	/**
	 * 当贷款机构给客户一个可使用的授信时，只有在某一个日期之后客户才能使用，这个日期就是授信使用生效日期。
	 */
	@ApiField("effective_date")
	private Date effectiveDate;

	/**
	 * 当贷款机构给客户一个可使用的授信时，客户必须要在某一个日期之前必须支用，否则此笔授信就会失效。
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 技术服务费
	 */
	@ApiField("fee_rate")
	private String feeRate;

	/**
	 * 贷款利率
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/**
	 * 一笔授信支用规定的从开始到结束的周期，例如12个月，30天等。
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 年、月、日
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 还款方式，例如等额本息
	 */
	@ApiField("repayment_mode")
	private String repaymentMode;

    /**
     * Gets credit line.
     *
     * @return the credit line
     */
    public String getCreditLine() {
		return this.creditLine;
	}

    /**
     * Sets credit line.
     *
     * @param creditLine the credit line
     */
    public void setCreditLine(String creditLine) {
		this.creditLine = creditLine;
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
     * Gets credit term.
     *
     * @return the credit term
     */
    public Long getCreditTerm() {
		return this.creditTerm;
	}

    /**
     * Sets credit term.
     *
     * @param creditTerm the credit term
     */
    public void setCreditTerm(Long creditTerm) {
		this.creditTerm = creditTerm;
	}

    /**
     * Gets credit term unit.
     *
     * @return the credit term unit
     */
    public String getCreditTermUnit() {
		return this.creditTermUnit;
	}

    /**
     * Sets credit term unit.
     *
     * @param creditTermUnit the credit term unit
     */
    public void setCreditTermUnit(String creditTermUnit) {
		this.creditTermUnit = creditTermUnit;
	}

    /**
     * Gets effective date.
     *
     * @return the effective date
     */
    public Date getEffectiveDate() {
		return this.effectiveDate;
	}

    /**
     * Sets effective date.
     *
     * @param effectiveDate the effective date
     */
    public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

    /**
     * Gets expire date.
     *
     * @return the expire date
     */
    public Date getExpireDate() {
		return this.expireDate;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

    /**
     * Gets fee rate.
     *
     * @return the fee rate
     */
    public String getFeeRate() {
		return this.feeRate;
	}

    /**
     * Sets fee rate.
     *
     * @param feeRate the fee rate
     */
    public void setFeeRate(String feeRate) {
		this.feeRate = feeRate;
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
     * Gets repayment mode.
     *
     * @return the repayment mode
     */
    public String getRepaymentMode() {
		return this.repaymentMode;
	}

    /**
     * Sets repayment mode.
     *
     * @param repaymentMode the repayment mode
     */
    public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}

}
