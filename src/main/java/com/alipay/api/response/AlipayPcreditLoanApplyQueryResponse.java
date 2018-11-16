package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.loan.apply.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-18 10:45:56
 */
public class AlipayPcreditLoanApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4236562811997732518L;

	/** 
	 * 贷款申请金额，目前只支持全额放款，所以申请金额和放款金额相同，以元为单位，精确到小数点后两位
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/** 
	 * 用户贷款申请时间，格式：yyyy-MM-dd HH:mm:ss，为提交申请单据受理的时间
	 */
	@ApiField("apply_date")
	private String applyDate;

	/** 
	 * 贷款合约编号，每笔用户贷款申请时，放款签约时生成的唯一合约编号，作为用户贷款账单的唯一标识。
	 */
	@ApiField("ar_no")
	private String arNo;

	/** 
	 * 用户证件号，一般为用户身份证号，脱敏返回
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型，和证件号cert_no配合使用，由平台定义，目前支持的证件类型有：
IDENTITY_CARD-身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 授信编号，贷前申请额度的申请单号，在某些场景需要将支用申请和授信申请关联
	 */
	@ApiField("credit_no")
	private String creditNo;

	/** 
	 * 贷款日利率，最多精确到小数点后八位
	 */
	@ApiField("daily_int_rate")
	private String dailyIntRate;

	/** 
	 * 贷款到期日，格式：yyyy-MM-dd HH:mm:ss，根据实际资金到账日期(注意非申请日期)结合贷款期限计算出的到期日期
	 */
	@ApiField("due_date")
	private String dueDate;

	/** 
	 * 放款机构标识，由平台和商户共同约定
	 */
	@ApiField("encash_org")
	private String encashOrg;

	/** 
	 * 贷款申请单号，借呗客户申请贷款时系统生成的全局唯一业务流水号
	 */
	@ApiField("loan_apply_no")
	private String loanApplyNo;

	/** 
	 * 提前还款是否需要手续费，true-需要，false-不需要。具体费率见贷款合同说明
	 */
	@ApiField("need_prepayment_fee")
	private Boolean needPrepaymentFee;

	/** 
	 * 放款到账时间，格式：yyyy-MM-dd HH:mm:ss，表示资金到账时间，也为合约生效日期
	 */
	@ApiField("payment_dt")
	private String paymentDt;

	/** 
	 * 还款方式，目前支持的还款方式有：
1-等额本息
2-等额本金
3-先息后本
6-到期一次还本付息
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/** 
	 * 用户申请贷款的状态，目前有以下状态：
USING-使用中
OVD-逾期
CLEAR-结清
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 贷款期限，配合term_unit期限单位，或表示贷款天数或期数
	 */
	@ApiField("term")
	private Long term;

	/** 
	 * 期限单位，和term配合使用，目前支持的期限单位有：
D-天
M-月
Y-年
	 */
	@ApiField("term_unit")
	private String termUnit;

	/** 
	 * 用户姓名，脱敏展示
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Sets apply amt.
     *
     * @param applyAmt the apply amt
     */
    public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

    /**
     * Gets apply amt.
     *
     * @return the apply amt
     */
    public String getApplyAmt( ) {
		return this.applyAmt;
	}

    /**
     * Sets apply date.
     *
     * @param applyDate the apply date
     */
    public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

    /**
     * Gets apply date.
     *
     * @return the apply date
     */
    public String getApplyDate( ) {
		return this.applyDate;
	}

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
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo( ) {
		return this.certNo;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType( ) {
		return this.certType;
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
     * Gets credit no.
     *
     * @return the credit no
     */
    public String getCreditNo( ) {
		return this.creditNo;
	}

    /**
     * Sets daily int rate.
     *
     * @param dailyIntRate the daily int rate
     */
    public void setDailyIntRate(String dailyIntRate) {
		this.dailyIntRate = dailyIntRate;
	}

    /**
     * Gets daily int rate.
     *
     * @return the daily int rate
     */
    public String getDailyIntRate( ) {
		return this.dailyIntRate;
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
     * Sets encash org.
     *
     * @param encashOrg the encash org
     */
    public void setEncashOrg(String encashOrg) {
		this.encashOrg = encashOrg;
	}

    /**
     * Gets encash org.
     *
     * @return the encash org
     */
    public String getEncashOrg( ) {
		return this.encashOrg;
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
     * Sets need prepayment fee.
     *
     * @param needPrepaymentFee the need prepayment fee
     */
    public void setNeedPrepaymentFee(Boolean needPrepaymentFee) {
		this.needPrepaymentFee = needPrepaymentFee;
	}

    /**
     * Gets need prepayment fee.
     *
     * @return the need prepayment fee
     */
    public Boolean getNeedPrepaymentFee( ) {
		return this.needPrepaymentFee;
	}

    /**
     * Sets payment dt.
     *
     * @param paymentDt the payment dt
     */
    public void setPaymentDt(String paymentDt) {
		this.paymentDt = paymentDt;
	}

    /**
     * Gets payment dt.
     *
     * @return the payment dt
     */
    public String getPaymentDt( ) {
		return this.paymentDt;
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
     * Sets term.
     *
     * @param term the term
     */
    public void setTerm(Long term) {
		this.term = term;
	}

    /**
     * Gets term.
     *
     * @return the term
     */
    public Long getTerm( ) {
		return this.term;
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
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName( ) {
		return this.userName;
	}

}
