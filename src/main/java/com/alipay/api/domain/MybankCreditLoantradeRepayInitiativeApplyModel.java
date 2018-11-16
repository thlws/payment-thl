package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户主动申请提交
 *
 * @author auto create
 * @since 1.0, 2018-02-08 14:35:31
 */
public class MybankCreditLoantradeRepayInitiativeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3714124425318275338L;

	/**
	 * 贷款合约编号，用于指定还款对应的单合约合约编号。
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 还款账户
	 */
	@ApiField("repay_account")
	private Account repayAccount;

	/**
	 * 指定还款金额，单位人民币元，金额需要对应还款金额策略一起使用。
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/**
	 * 指定还款金额对应的金额策略，目前支持：PRIN_AMT（指定本金还款）、CLEAR（结清还款）。
	 */
	@ApiField("repay_amount_strategy")
	private String repayAmountStrategy;

	/**
	 * 指定还款客户会员，此处必须是贷款合约上对应的还款人的会员信息。
	 */
	@ApiField("repay_customer")
	private Member repayCustomer;

	/**
	 * 还款日期。
	 */
	@ApiField("repay_date")
	private Date repayDate;

	/**
	 * 接口幂等字段，相同requestId请求系统默认认为是相同的请求。此处requestId要求的格式为"{机构IpRoleId}_{机构生成的唯一请求ID}"
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 此参数可选，由于下游银行并不一定能指定备注信息，所以该字段只对部分银行或内部账户打款时能生效。
	 */
	@ApiField("trans_memo")
	private String transMemo;

    /**
     * Gets loan ar no.
     *
     * @return the loan ar no
     */
    public String getLoanArNo() {
		return this.loanArNo;
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
     * Gets repay account.
     *
     * @return the repay account
     */
    public Account getRepayAccount() {
		return this.repayAccount;
	}

    /**
     * Sets repay account.
     *
     * @param repayAccount the repay account
     */
    public void setRepayAccount(Account repayAccount) {
		this.repayAccount = repayAccount;
	}

    /**
     * Gets repay amount.
     *
     * @return the repay amount
     */
    public String getRepayAmount() {
		return this.repayAmount;
	}

    /**
     * Sets repay amount.
     *
     * @param repayAmount the repay amount
     */
    public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}

    /**
     * Gets repay amount strategy.
     *
     * @return the repay amount strategy
     */
    public String getRepayAmountStrategy() {
		return this.repayAmountStrategy;
	}

    /**
     * Sets repay amount strategy.
     *
     * @param repayAmountStrategy the repay amount strategy
     */
    public void setRepayAmountStrategy(String repayAmountStrategy) {
		this.repayAmountStrategy = repayAmountStrategy;
	}

    /**
     * Gets repay customer.
     *
     * @return the repay customer
     */
    public Member getRepayCustomer() {
		return this.repayCustomer;
	}

    /**
     * Sets repay customer.
     *
     * @param repayCustomer the repay customer
     */
    public void setRepayCustomer(Member repayCustomer) {
		this.repayCustomer = repayCustomer;
	}

    /**
     * Gets repay date.
     *
     * @return the repay date
     */
    public Date getRepayDate() {
		return this.repayDate;
	}

    /**
     * Sets repay date.
     *
     * @param repayDate the repay date
     */
    public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets trans memo.
     *
     * @return the trans memo
     */
    public String getTransMemo() {
		return this.transMemo;
	}

    /**
     * Sets trans memo.
     *
     * @param transMemo the trans memo
     */
    public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

}
