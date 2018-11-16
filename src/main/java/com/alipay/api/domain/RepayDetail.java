package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 助学贷款还款明细
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:51:13
 */
public class RepayDetail extends AlipayObject {

	private static final long serialVersionUID = 6323645731856217353L;

	/**
	 * 应还本金
	 */
	@ApiField("capital_amount")
	private String capitalAmount;

	/**
	 * 贷款合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 应还利息
	 */
	@ApiField("interest_amount")
	private String interestAmount;

	/**
	 * 贷款年份
	 */
	@ApiField("loan_year")
	private String loanYear;

	/**
	 * 总还款金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

    /**
     * Gets capital amount.
     *
     * @return the capital amount
     */
    public String getCapitalAmount() {
		return this.capitalAmount;
	}

    /**
     * Sets capital amount.
     *
     * @param capitalAmount the capital amount
     */
    public void setCapitalAmount(String capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

    /**
     * Gets contract no.
     *
     * @return the contract no
     */
    public String getContractNo() {
		return this.contractNo;
	}

    /**
     * Sets contract no.
     *
     * @param contractNo the contract no
     */
    public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

    /**
     * Gets interest amount.
     *
     * @return the interest amount
     */
    public String getInterestAmount() {
		return this.interestAmount;
	}

    /**
     * Sets interest amount.
     *
     * @param interestAmount the interest amount
     */
    public void setInterestAmount(String interestAmount) {
		this.interestAmount = interestAmount;
	}

    /**
     * Gets loan year.
     *
     * @return the loan year
     */
    public String getLoanYear() {
		return this.loanYear;
	}

    /**
     * Sets loan year.
     *
     * @param loanYear the loan year
     */
    public void setLoanYear(String loanYear) {
		this.loanYear = loanYear;
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
