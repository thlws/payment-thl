package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LoanMoneyTypeAmt;
import com.alipay.api.domain.LoanRepayPlanTerm;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.repayplan.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-18 10:46:20
 */
public class AlipayPcreditLoanRepayplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2866619616677135189L;

	/** 
	 * 贷款合约编号，每笔用户贷款申请时，放款签约时生成的唯一合约编号，作为用户贷款账单的唯一标识
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 当前期次，与term_unit期次单位配合使用，表示当前所在期次；如果合约最后一期计划都已经逾期,就不存在当期计划
	 */
	@ApiField("current_term")
	private Long currentTerm;

	/** 
	 * 贷款到期日，格式：yyyy-MM-dd
	 */
	@ApiField("due_date")
	private String dueDate;

	/** 
	 * 贷款申请单号，借呗客户申请贷款时系统生成的全局唯一业务流水号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/** 
	 * 贷款生效时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("loan_date")
	private String loanDate;

	/** 
	 * 逾期发生时间，格式：yyyy-MM-dd
	 */
	@ApiField("ovd_date")
	private String ovdDate;

	/** 
	 * 剩余还款金额
	 */
	@ApiField("remain_repay_amt")
	private LoanMoneyTypeAmt remainRepayAmt;

	/** 
	 * 还款方式，由借呗约定，目前支持的还款方式有：
1-等额本息
2-等额本金
3-先息后本
6-到期一次还本付息
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/** 
	 * 还款计划分期信息
	 */
	@ApiListField("repay_plan_term_list")
	@ApiField("loan_repay_plan_term")
	private List<LoanRepayPlanTerm> repayPlanTermList;

	/** 
	 * 该还款计划所在的会计日期，格式：yyyy-MM-dd
	 */
	@ApiField("settle_date")
	private String settleDate;

	/** 
	 * 合约状态，状态枚举如下：
NORMAL-正常
OVD-逾期
CLEAR-结清
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 期限单位，和term配合使用，目前支持的期限单位有：
D-天
M-月
Y-年
	 */
	@ApiField("term_unit")
	private String termUnit;

	/** 
	 * 贷款期限，配合term_unit期限单位，或表示贷款天数或期数
	 */
	@ApiField("terms")
	private Long terms;

    /**
     * Sets ar no.
     *
     * @param arNo the ar no
     */
    public void setArNo(String arNo) {
		this.arNo = arNo;
	}

    /**
     * Gets ar no.
     *
     * @return the ar no
     */
    public String getArNo( ) {
		return this.arNo;
	}

    /**
     * Sets current term.
     *
     * @param currentTerm the current term
     */
    public void setCurrentTerm(Long currentTerm) {
		this.currentTerm = currentTerm;
	}

    /**
     * Gets current term.
     *
     * @return the current term
     */
    public Long getCurrentTerm( ) {
		return this.currentTerm;
	}

    /**
     * Sets due date.
     *
     * @param dueDate the due date
     */
    public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

    /**
     * Gets due date.
     *
     * @return the due date
     */
    public String getDueDate( ) {
		return this.dueDate;
	}

    /**
     * Sets loan apply no.
     *
     * @param loanApplyNo the loan apply no
     */
    public void setLoanApplyNo(String loanApplyNo) {
		this.loanApplyNo = loanApplyNo;
	}

    /**
     * Gets loan apply no.
     *
     * @return the loan apply no
     */
    public String getLoanApplyNo( ) {
		return this.loanApplyNo;
	}

    /**
     * Sets loan date.
     *
     * @param loanDate the loan date
     */
    public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

    /**
     * Gets loan date.
     *
     * @return the loan date
     */
    public String getLoanDate( ) {
		return this.loanDate;
	}

    /**
     * Sets ovd date.
     *
     * @param ovdDate the ovd date
     */
    public void setOvdDate(String ovdDate) {
		this.ovdDate = ovdDate;
	}

    /**
     * Gets ovd date.
     *
     * @return the ovd date
     */
    public String getOvdDate( ) {
		return this.ovdDate;
	}

    /**
     * Sets remain repay amt.
     *
     * @param remainRepayAmt the remain repay amt
     */
    public void setRemainRepayAmt(LoanMoneyTypeAmt remainRepayAmt) {
		this.remainRepayAmt = remainRepayAmt;
	}

    /**
     * Gets remain repay amt.
     *
     * @return the remain repay amt
     */
    public LoanMoneyTypeAmt getRemainRepayAmt( ) {
		return this.remainRepayAmt;
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
     * Gets repay mode.
     *
     * @return the repay mode
     */
    public String getRepayMode( ) {
		return this.repayMode;
	}

    /**
     * Sets repay plan term list.
     *
     * @param repayPlanTermList the repay plan term list
     */
    public void setRepayPlanTermList(List<LoanRepayPlanTerm> repayPlanTermList) {
		this.repayPlanTermList = repayPlanTermList;
	}

    /**
     * Gets repay plan term list.
     *
     * @return the repay plan term list
     */
    public List<LoanRepayPlanTerm> getRepayPlanTermList( ) {
		return this.repayPlanTermList;
	}

    /**
     * Sets settle date.
     *
     * @param settleDate the settle date
     */
    public void setSettleDate(String settleDate) {
		this.settleDate = settleDate;
	}

    /**
     * Gets settle date.
     *
     * @return the settle date
     */
    public String getSettleDate( ) {
		return this.settleDate;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets term unit.
     *
     * @param termUnit the term unit
     */
    public void setTermUnit(String termUnit) {
		this.termUnit = termUnit;
	}

    /**
     * Gets term unit.
     *
     * @return the term unit
     */
    public String getTermUnit( ) {
		return this.termUnit;
	}

    /**
     * Sets terms.
     *
     * @param terms the terms
     */
    public void setTerms(Long terms) {
		this.terms = terms;
	}

    /**
     * Gets terms.
     *
     * @return the terms
     */
    public Long getTerms( ) {
		return this.terms;
	}

}
