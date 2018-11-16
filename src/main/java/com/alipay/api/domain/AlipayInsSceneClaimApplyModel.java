package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔受理
 *
 * @author auto create
 * @since 1.0, 2017-11-02 12:01:15
 */
public class AlipayInsSceneClaimApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6728138976556289964L;

	/**
	 * 出险地点
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 出险描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 出险时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 受益人
	 */
	@ApiField("beneficiary")
	private InsPerson beneficiary;

	/**
	 * 支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 理赔因子;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 索赔金额（如果需要外部指定则必填），单位分
	 */
	@ApiField("claim_fee")
	private Long claimFee;

	/**
	 * 报案时相关的保单信息
	 */
	@ApiListField("claim_policy_list")
	@ApiField("ins_claim_policy")
	private List<InsClaimPolicy> claimPolicyList;

	/**
	 * 商户生成的外部投保业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户生成的理赔请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 产品编码；由蚂蚁保险平台分配，商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险）
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 报案人
	 */
	@ApiField("reporter")
	private InsPerson reporter;

    /**
     * Gets accident address.
     *
     * @return the accident address
     */
    public String getAccidentAddress() {
		return this.accidentAddress;
	}

    /**
     * Sets accident address.
     *
     * @param accidentAddress the accident address
     */
    public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

    /**
     * Gets accident desc.
     *
     * @return the accident desc
     */
    public String getAccidentDesc() {
		return this.accidentDesc;
	}

    /**
     * Sets accident desc.
     *
     * @param accidentDesc the accident desc
     */
    public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

    /**
     * Gets accident time.
     *
     * @return the accident time
     */
    public Date getAccidentTime() {
		return this.accidentTime;
	}

    /**
     * Sets accident time.
     *
     * @param accidentTime the accident time
     */
    public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

    /**
     * Gets beneficiary.
     *
     * @return the beneficiary
     */
    public InsPerson getBeneficiary() {
		return this.beneficiary;
	}

    /**
     * Sets beneficiary.
     *
     * @param beneficiary the beneficiary
     */
    public void setBeneficiary(InsPerson beneficiary) {
		this.beneficiary = beneficiary;
	}

    /**
     * Gets bill title.
     *
     * @return the bill title
     */
    public String getBillTitle() {
		return this.billTitle;
	}

    /**
     * Sets bill title.
     *
     * @param billTitle the bill title
     */
    public void setBillTitle(String billTitle) {
		this.billTitle = billTitle;
	}

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets claim fee.
     *
     * @return the claim fee
     */
    public Long getClaimFee() {
		return this.claimFee;
	}

    /**
     * Sets claim fee.
     *
     * @param claimFee the claim fee
     */
    public void setClaimFee(Long claimFee) {
		this.claimFee = claimFee;
	}

    /**
     * Gets claim policy list.
     *
     * @return the claim policy list
     */
    public List<InsClaimPolicy> getClaimPolicyList() {
		return this.claimPolicyList;
	}

    /**
     * Sets claim policy list.
     *
     * @param claimPolicyList the claim policy list
     */
    public void setClaimPolicyList(List<InsClaimPolicy> claimPolicyList) {
		this.claimPolicyList = claimPolicyList;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets prod code.
     *
     * @return the prod code
     */
    public String getProdCode() {
		return this.prodCode;
	}

    /**
     * Sets prod code.
     *
     * @param prodCode the prod code
     */
    public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

    /**
     * Gets reporter.
     *
     * @return the reporter
     */
    public InsPerson getReporter() {
		return this.reporter;
	}

    /**
     * Sets reporter.
     *
     * @param reporter the reporter
     */
    public void setReporter(InsPerson reporter) {
		this.reporter = reporter;
	}

}
