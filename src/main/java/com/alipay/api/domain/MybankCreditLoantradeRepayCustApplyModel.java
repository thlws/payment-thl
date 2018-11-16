package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客户主动还款申请
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:22:55
 */
public class MybankCreditLoantradeRepayCustApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7121917728942411432L;

	/**
	 * 申请还款费用（提前还款费除外）
	 */
	@ApiField("apply_repay_fee")
	private String applyRepayFee;

	/**
	 * 申请还款利息
	 */
	@ApiField("apply_repay_int")
	private String applyRepayInt;

	/**
	 * 提前还款费
	 */
	@ApiField("apply_repay_pre_fee")
	private String applyRepayPreFee;

	/**
	 * 申请还款本金
	 */
	@ApiField("apply_repay_prin")
	private String applyRepayPrin;

	/**
	 * 优惠金额，单位元
	 */
	@ApiField("discount_amt")
	private String discountAmt;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 贷款合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 营销工具ID列表，例如红包，打折卡等营销工具ID列表
	 */
	@ApiListField("prom_tools")
	@ApiField("string")
	private List<String> promTools;

	/**
	 * 还款账户
	 */
	@ApiField("repay_account")
	private MyBkAccountVO repayAccount;

	/**
	 * 还款类型，CUSTOMER_ACTIVE_REPAY：提前还款-客户主动还款；CUSTOMER_PASSIVE_REPAY：提前还款-系统触发还款
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 请求流水号，用于幂等控制.以"ipRoleId_"开头
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets apply repay fee.
     *
     * @return the apply repay fee
     */
    public String getApplyRepayFee() {
		return this.applyRepayFee;
	}

    /**
     * Sets apply repay fee.
     *
     * @param applyRepayFee the apply repay fee
     */
    public void setApplyRepayFee(String applyRepayFee) {
		this.applyRepayFee = applyRepayFee;
	}

    /**
     * Gets apply repay int.
     *
     * @return the apply repay int
     */
    public String getApplyRepayInt() {
		return this.applyRepayInt;
	}

    /**
     * Sets apply repay int.
     *
     * @param applyRepayInt the apply repay int
     */
    public void setApplyRepayInt(String applyRepayInt) {
		this.applyRepayInt = applyRepayInt;
	}

    /**
     * Gets apply repay pre fee.
     *
     * @return the apply repay pre fee
     */
    public String getApplyRepayPreFee() {
		return this.applyRepayPreFee;
	}

    /**
     * Sets apply repay pre fee.
     *
     * @param applyRepayPreFee the apply repay pre fee
     */
    public void setApplyRepayPreFee(String applyRepayPreFee) {
		this.applyRepayPreFee = applyRepayPreFee;
	}

    /**
     * Gets apply repay prin.
     *
     * @return the apply repay prin
     */
    public String getApplyRepayPrin() {
		return this.applyRepayPrin;
	}

    /**
     * Sets apply repay prin.
     *
     * @param applyRepayPrin the apply repay prin
     */
    public void setApplyRepayPrin(String applyRepayPrin) {
		this.applyRepayPrin = applyRepayPrin;
	}

    /**
     * Gets discount amt.
     *
     * @return the discount amt
     */
    public String getDiscountAmt() {
		return this.discountAmt;
	}

    /**
     * Sets discount amt.
     *
     * @param discountAmt the discount amt
     */
    public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}

    /**
     * Gets ext data.
     *
     * @return the ext data
     */
    public String getExtData() {
		return this.extData;
	}

    /**
     * Sets ext data.
     *
     * @param extData the ext data
     */
    public void setExtData(String extData) {
		this.extData = extData;
	}

    /**
     * Gets ip id.
     *
     * @return the ip id
     */
    public String getIpId() {
		return this.ipId;
	}

    /**
     * Sets ip id.
     *
     * @param ipId the ip id
     */
    public void setIpId(String ipId) {
		this.ipId = ipId;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
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
     * Gets prom tools.
     *
     * @return the prom tools
     */
    public List<String> getPromTools() {
		return this.promTools;
	}

    /**
     * Sets prom tools.
     *
     * @param promTools the prom tools
     */
    public void setPromTools(List<String> promTools) {
		this.promTools = promTools;
	}

    /**
     * Gets repay account.
     *
     * @return the repay account
     */
    public MyBkAccountVO getRepayAccount() {
		return this.repayAccount;
	}

    /**
     * Sets repay account.
     *
     * @param repayAccount the repay account
     */
    public void setRepayAccount(MyBkAccountVO repayAccount) {
		this.repayAccount = repayAccount;
	}

    /**
     * Gets repay type.
     *
     * @return the repay type
     */
    public String getRepayType() {
		return this.repayType;
	}

    /**
     * Sets repay type.
     *
     * @param repayType the repay type
     */
    public void setRepayType(String repayType) {
		this.repayType = repayType;
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

}
