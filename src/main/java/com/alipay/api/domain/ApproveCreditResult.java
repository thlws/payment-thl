package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审批通过后返回的授信信息
 *
 * @author auto create
 * @since 1.0, 2017-05-31 13:44:00
 */
public class ApproveCreditResult extends AlipayObject {

	private static final long serialVersionUID = 5885588957945712199L;

	/**
	 * 费用列表，每个费用对象代码一个收费项； 若费用列表为空或空集合，表示不存在费用定价
	 */
	@ApiListField("charge_info_list")
	@ApiField("loan_charge_info")
	private List<LoanChargeInfo> chargeInfoList;

	/**
	 * 授信金额
	 */
	@ApiField("credit_amt")
	private String creditAmt;

	/**
	 * 授信编号
	 */
	@ApiField("credit_no")
	private String creditNo;

	/**
	 * 授信期限长度，包含单位(年、月、日)
	 */
	@ApiField("credit_term")
	private String creditTerm;

	/**
	 * 授信有效截止日期(日期精度为天,包含截止日)
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 利率
	 */
	@ApiListField("instal_int_rate")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> instalIntRate;

	/**
	 * 贷款期限长度，包含单位(年、月、日)
	 */
	@ApiField("loan_term")
	private String loanTerm;

	/**
	 * 还款方式。若为分段还款，则存储的为分段还款方式的分段值。否则，该list仅含一个元素，为当前的还款方式
	 */
	@ApiListField("repay_modes")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> repayModes;

	/**
	 * 授信有效起始日期(日期精度为天,包含起始日)
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 授信状态
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets charge info list.
     *
     * @return the charge info list
     */
    public List<LoanChargeInfo> getChargeInfoList() {
		return this.chargeInfoList;
	}

    /**
     * Sets charge info list.
     *
     * @param chargeInfoList the charge info list
     */
    public void setChargeInfoList(List<LoanChargeInfo> chargeInfoList) {
		this.chargeInfoList = chargeInfoList;
	}

    /**
     * Gets credit amt.
     *
     * @return the credit amt
     */
    public String getCreditAmt() {
		return this.creditAmt;
	}

    /**
     * Sets credit amt.
     *
     * @param creditAmt the credit amt
     */
    public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
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
    public String getCreditTerm() {
		return this.creditTerm;
	}

    /**
     * Sets credit term.
     *
     * @param creditTerm the credit term
     */
    public void setCreditTerm(String creditTerm) {
		this.creditTerm = creditTerm;
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
     * Gets instal int rate.
     *
     * @return the instal int rate
     */
    public List<InstallmentMetaInfo> getInstalIntRate() {
		return this.instalIntRate;
	}

    /**
     * Sets instal int rate.
     *
     * @param instalIntRate the instal int rate
     */
    public void setInstalIntRate(List<InstallmentMetaInfo> instalIntRate) {
		this.instalIntRate = instalIntRate;
	}

    /**
     * Gets loan term.
     *
     * @return the loan term
     */
    public String getLoanTerm() {
		return this.loanTerm;
	}

    /**
     * Sets loan term.
     *
     * @param loanTerm the loan term
     */
    public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

    /**
     * Gets repay modes.
     *
     * @return the repay modes
     */
    public List<InstallmentMetaInfo> getRepayModes() {
		return this.repayModes;
	}

    /**
     * Sets repay modes.
     *
     * @param repayModes the repay modes
     */
    public void setRepayModes(List<InstallmentMetaInfo> repayModes) {
		this.repayModes = repayModes;
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
