package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstallmentMetaInfo;
import com.alipay.api.domain.InstallmentRepayPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanar.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-11 17:51:09
 */
public class MybankCreditLoantradeLoanarQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5696753343343438615L;

	/** 
	 * 合约状态 NORMAL:正常 ,OVD:逾期, CLEAR:结清
	 */
	@ApiField("arg_status")
	private String argStatus;

	/** 
	 * 利率
	 */
	@ApiListField("instal_int_rate")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> instalIntRate;

	/** 
	 * 分期还款计划
	 */
	@ApiListField("installment_repay_plans")
	@ApiField("installment_repay_plan")
	private List<InstallmentRepayPlan> installmentRepayPlans;

	/** 
	 * 合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/** 
	 * 贷款期限,包含单位，有年、月、日
	 */
	@ApiField("loan_term")
	private String loanTerm;

	/** 
	 * 正常利息
	 */
	@ApiField("nom_int")
	private String nomInt;

	/** 
	 * 正常本金
	 */
	@ApiField("nom_prin")
	private String nomPrin;

	/** 
	 * 逾期利息
	 */
	@ApiField("ovd_int")
	private String ovdInt;

	/** 
	 * 逾期利息罚息
	 */
	@ApiField("ovd_int_pen_int")
	private String ovdIntPenInt;

	/** 
	 * 逾期本金
	 */
	@ApiField("ovd_prin")
	private String ovdPrin;

	/** 
	 * 逾期本金罚息
	 */
	@ApiField("ovd_prin_pen_int")
	private String ovdPrinPenInt;

	/** 
	 * 还款方式。若为分段还款，则存储的为分段还款方式的分段值。否则，该list仅含一个元素，为当前的还款方式
	 */
	@ApiListField("repay_modes")
	@ApiField("installment_meta_info")
	private List<InstallmentMetaInfo> repayModes;

    /**
     * Sets arg status.
     *
     * @param argStatus the arg status
     */
    public void setArgStatus(String argStatus) {
		this.argStatus = argStatus;
	}

    /**
     * Gets arg status.
     *
     * @return the arg status
     */
    public String getArgStatus( ) {
		return this.argStatus;
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
     * Gets instal int rate.
     *
     * @return the instal int rate
     */
    public List<InstallmentMetaInfo> getInstalIntRate( ) {
		return this.instalIntRate;
	}

    /**
     * Sets installment repay plans.
     *
     * @param installmentRepayPlans the installment repay plans
     */
    public void setInstallmentRepayPlans(List<InstallmentRepayPlan> installmentRepayPlans) {
		this.installmentRepayPlans = installmentRepayPlans;
	}

    /**
     * Gets installment repay plans.
     *
     * @return the installment repay plans
     */
    public List<InstallmentRepayPlan> getInstallmentRepayPlans( ) {
		return this.installmentRepayPlans;
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
     * Sets loan term.
     *
     * @param loanTerm the loan term
     */
    public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

    /**
     * Gets loan term.
     *
     * @return the loan term
     */
    public String getLoanTerm( ) {
		return this.loanTerm;
	}

    /**
     * Sets nom int.
     *
     * @param nomInt the nom int
     */
    public void setNomInt(String nomInt) {
		this.nomInt = nomInt;
	}

    /**
     * Gets nom int.
     *
     * @return the nom int
     */
    public String getNomInt( ) {
		return this.nomInt;
	}

    /**
     * Sets nom prin.
     *
     * @param nomPrin the nom prin
     */
    public void setNomPrin(String nomPrin) {
		this.nomPrin = nomPrin;
	}

    /**
     * Gets nom prin.
     *
     * @return the nom prin
     */
    public String getNomPrin( ) {
		return this.nomPrin;
	}

    /**
     * Sets ovd int.
     *
     * @param ovdInt the ovd int
     */
    public void setOvdInt(String ovdInt) {
		this.ovdInt = ovdInt;
	}

    /**
     * Gets ovd int.
     *
     * @return the ovd int
     */
    public String getOvdInt( ) {
		return this.ovdInt;
	}

    /**
     * Sets ovd int pen int.
     *
     * @param ovdIntPenInt the ovd int pen int
     */
    public void setOvdIntPenInt(String ovdIntPenInt) {
		this.ovdIntPenInt = ovdIntPenInt;
	}

    /**
     * Gets ovd int pen int.
     *
     * @return the ovd int pen int
     */
    public String getOvdIntPenInt( ) {
		return this.ovdIntPenInt;
	}

    /**
     * Sets ovd prin.
     *
     * @param ovdPrin the ovd prin
     */
    public void setOvdPrin(String ovdPrin) {
		this.ovdPrin = ovdPrin;
	}

    /**
     * Gets ovd prin.
     *
     * @return the ovd prin
     */
    public String getOvdPrin( ) {
		return this.ovdPrin;
	}

    /**
     * Sets ovd prin pen int.
     *
     * @param ovdPrinPenInt the ovd prin pen int
     */
    public void setOvdPrinPenInt(String ovdPrinPenInt) {
		this.ovdPrinPenInt = ovdPrinPenInt;
	}

    /**
     * Gets ovd prin pen int.
     *
     * @return the ovd prin pen int
     */
    public String getOvdPrinPenInt( ) {
		return this.ovdPrinPenInt;
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
     * Gets repay modes.
     *
     * @return the repay modes
     */
    public List<InstallmentMetaInfo> getRepayModes( ) {
		return this.repayModes;
	}

}
