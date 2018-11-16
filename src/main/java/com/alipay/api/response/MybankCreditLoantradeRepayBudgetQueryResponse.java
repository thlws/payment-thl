package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.repay.budget.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:23:36
 */
public class MybankCreditLoantradeRepayBudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2652353896288829278L;

	/** 
	 * 申请还款本金
	 */
	@ApiField("apply_repay_prin")
	private String applyRepayPrin;

	/** 
	 * 贷款合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/** 
	 * 当前应还费用（提前还款费除外）
	 */
	@ApiField("should_repay_fee")
	private String shouldRepayFee;

	/** 
	 * 当前应还利息
	 */
	@ApiField("should_repay_int")
	private String shouldRepayInt;

	/** 
	 * 提前还款费
	 */
	@ApiField("should_repay_pre_fee")
	private String shouldRepayPreFee;

	/** 
	 * 当前应还本金
	 */
	@ApiField("should_repay_prin")
	private String shouldRepayPrin;

    /**
     * Sets apply repay prin.
     *
     * @param applyRepayPrin the apply repay prin
     */
    public void setApplyRepayPrin(String applyRepayPrin) {
		this.applyRepayPrin = applyRepayPrin;
	}

    /**
     * Gets apply repay prin.
     *
     * @return the apply repay prin
     */
    public String getApplyRepayPrin( ) {
		return this.applyRepayPrin;
	}

    /**
     * Sets loan ar no.
     *
     * @param loanArNo the loan ar no
     */
    public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

    /**
     * Gets loan ar no.
     *
     * @return the loan ar no
     */
    public String getLoanArNo( ) {
		return this.loanArNo;
	}

    /**
     * Sets should repay fee.
     *
     * @param shouldRepayFee the should repay fee
     */
    public void setShouldRepayFee(String shouldRepayFee) {
		this.shouldRepayFee = shouldRepayFee;
	}

    /**
     * Gets should repay fee.
     *
     * @return the should repay fee
     */
    public String getShouldRepayFee( ) {
		return this.shouldRepayFee;
	}

    /**
     * Sets should repay int.
     *
     * @param shouldRepayInt the should repay int
     */
    public void setShouldRepayInt(String shouldRepayInt) {
		this.shouldRepayInt = shouldRepayInt;
	}

    /**
     * Gets should repay int.
     *
     * @return the should repay int
     */
    public String getShouldRepayInt( ) {
		return this.shouldRepayInt;
	}

    /**
     * Sets should repay pre fee.
     *
     * @param shouldRepayPreFee the should repay pre fee
     */
    public void setShouldRepayPreFee(String shouldRepayPreFee) {
		this.shouldRepayPreFee = shouldRepayPreFee;
	}

    /**
     * Gets should repay pre fee.
     *
     * @return the should repay pre fee
     */
    public String getShouldRepayPreFee( ) {
		return this.shouldRepayPreFee;
	}

    /**
     * Sets should repay prin.
     *
     * @param shouldRepayPrin the should repay prin
     */
    public void setShouldRepayPrin(String shouldRepayPrin) {
		this.shouldRepayPrin = shouldRepayPrin;
	}

    /**
     * Gets should repay prin.
     *
     * @return the should repay prin
     */
    public String getShouldRepayPrin( ) {
		return this.shouldRepayPrin;
	}

}
