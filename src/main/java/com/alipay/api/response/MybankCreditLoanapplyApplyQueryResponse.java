package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ApproveCreditResult;
import com.alipay.api.domain.InvestigCategoryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.apply.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-12 11:30:00
 */
public class MybankCreditLoanapplyApplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7536173866998422686L;

	/** 
	 * 申请贷款额度
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/** 
	 * 申请日期
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/** 
	 * 申请单编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 申请状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/** 
	 * 审批结论，审批通过或者拒绝
	 */
	@ApiField("approve_conclu")
	private String approveConclu;

	/** 
	 * 审批通过后返回的授信信息
	 */
	@ApiField("approve_credit_result")
	private ApproveCreditResult approveCreditResult;

	/** 
	 * 审批完成时间
	 */
	@ApiField("approve_finish_date")
	private Date approveFinishDate;

	/** 
	 * 客户机构ISV ipRoleId
	 */
	@ApiField("cust_inst_appid")
	private String custInstAppid;

	/** 
	 * 客户机构ipRoleId
	 */
	@ApiField("cust_inst_code")
	private String custInstCode;

	/** 
	 * 返回的扩展字段，预留
	 */
	@ApiField("ext_json")
	private String extJson;

	/** 
	 * 数据项的采集结果
	 */
	@ApiListField("investig_category_result")
	@ApiField("investig_category_result")
	private List<InvestigCategoryResult> investigCategoryResult;

	/** 
	 * 参与者角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 申贷类型
	 */
	@ApiField("loan_type")
	private String loanType;

	/** 
	 * 运营产品CODE
	 */
	@ApiField("op_prod_code")
	private String opProdCode;

	/** 
	 * 运营产品CODE版本
	 */
	@ApiField("op_prod_code_version")
	private String opProdCodeVersion;

	/** 
	 * 审批拒绝原因CODE，多个以逗号分隔，默认为null
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 调查结果
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 任务状态
	 */
	@ApiField("state")
	private String state;

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
    public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

    /**
     * Gets apply date.
     *
     * @return the apply date
     */
    public Date getApplyDate( ) {
		return this.applyDate;
	}

    /**
     * Sets apply no.
     *
     * @param applyNo the apply no
     */
    public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

    /**
     * Gets apply no.
     *
     * @return the apply no
     */
    public String getApplyNo( ) {
		return this.applyNo;
	}

    /**
     * Sets apply status.
     *
     * @param applyStatus the apply status
     */
    public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

    /**
     * Gets apply status.
     *
     * @return the apply status
     */
    public String getApplyStatus( ) {
		return this.applyStatus;
	}

    /**
     * Sets approve conclu.
     *
     * @param approveConclu the approve conclu
     */
    public void setApproveConclu(String approveConclu) {
		this.approveConclu = approveConclu;
	}

    /**
     * Gets approve conclu.
     *
     * @return the approve conclu
     */
    public String getApproveConclu( ) {
		return this.approveConclu;
	}

    /**
     * Sets approve credit result.
     *
     * @param approveCreditResult the approve credit result
     */
    public void setApproveCreditResult(ApproveCreditResult approveCreditResult) {
		this.approveCreditResult = approveCreditResult;
	}

    /**
     * Gets approve credit result.
     *
     * @return the approve credit result
     */
    public ApproveCreditResult getApproveCreditResult( ) {
		return this.approveCreditResult;
	}

    /**
     * Sets approve finish date.
     *
     * @param approveFinishDate the approve finish date
     */
    public void setApproveFinishDate(Date approveFinishDate) {
		this.approveFinishDate = approveFinishDate;
	}

    /**
     * Gets approve finish date.
     *
     * @return the approve finish date
     */
    public Date getApproveFinishDate( ) {
		return this.approveFinishDate;
	}

    /**
     * Sets cust inst appid.
     *
     * @param custInstAppid the cust inst appid
     */
    public void setCustInstAppid(String custInstAppid) {
		this.custInstAppid = custInstAppid;
	}

    /**
     * Gets cust inst appid.
     *
     * @return the cust inst appid
     */
    public String getCustInstAppid( ) {
		return this.custInstAppid;
	}

    /**
     * Sets cust inst code.
     *
     * @param custInstCode the cust inst code
     */
    public void setCustInstCode(String custInstCode) {
		this.custInstCode = custInstCode;
	}

    /**
     * Gets cust inst code.
     *
     * @return the cust inst code
     */
    public String getCustInstCode( ) {
		return this.custInstCode;
	}

    /**
     * Sets ext json.
     *
     * @param extJson the ext json
     */
    public void setExtJson(String extJson) {
		this.extJson = extJson;
	}

    /**
     * Gets ext json.
     *
     * @return the ext json
     */
    public String getExtJson( ) {
		return this.extJson;
	}

    /**
     * Sets investig category result.
     *
     * @param investigCategoryResult the investig category result
     */
    public void setInvestigCategoryResult(List<InvestigCategoryResult> investigCategoryResult) {
		this.investigCategoryResult = investigCategoryResult;
	}

    /**
     * Gets investig category result.
     *
     * @return the investig category result
     */
    public List<InvestigCategoryResult> getInvestigCategoryResult( ) {
		return this.investigCategoryResult;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId( ) {
		return this.ipRoleId;
	}

    /**
     * Sets loan type.
     *
     * @param loanType the loan type
     */
    public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

    /**
     * Gets loan type.
     *
     * @return the loan type
     */
    public String getLoanType( ) {
		return this.loanType;
	}

    /**
     * Sets op prod code.
     *
     * @param opProdCode the op prod code
     */
    public void setOpProdCode(String opProdCode) {
		this.opProdCode = opProdCode;
	}

    /**
     * Gets op prod code.
     *
     * @return the op prod code
     */
    public String getOpProdCode( ) {
		return this.opProdCode;
	}

    /**
     * Sets op prod code version.
     *
     * @param opProdCodeVersion the op prod code version
     */
    public void setOpProdCodeVersion(String opProdCodeVersion) {
		this.opProdCodeVersion = opProdCodeVersion;
	}

    /**
     * Gets op prod code version.
     *
     * @return the op prod code version
     */
    public String getOpProdCodeVersion( ) {
		return this.opProdCodeVersion;
	}

    /**
     * Sets refuse code.
     *
     * @param refuseCode the refuse code
     */
    public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

    /**
     * Gets refuse code.
     *
     * @return the refuse code
     */
    public String getRefuseCode( ) {
		return this.refuseCode;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
		this.state = state;
	}

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState( ) {
		return this.state;
	}

}
