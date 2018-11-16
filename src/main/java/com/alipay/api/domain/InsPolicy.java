package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保单
 *
 * @author auto create
 * @since 1.0, 2018-06-27 11:36:09
 */
public class InsPolicy extends AlipayObject {

	private static final long serialVersionUID = 7354484713694864196L;

	/**
	 * 保单邮寄地址
	 */
	@ApiField("addressee")
	private InsAddressee addressee;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保参数;标准json 格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 赔案
	 */
	@ApiListField("claims")
	@ApiField("ins_claim")
	private List<InsClaim> claims;

	/**
	 * 险种列表
	 */
	@ApiListField("coverages")
	@ApiField("ins_coverage")
	private List<InsCoverage> coverages;

	/**
	 * 保单失效时间
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * 保单生效时间
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * 标的列表
	 */
	@ApiListField("ins_objects")
	@ApiField("ins_object")
	private List<InsObject> insObjects;

	/**
	 * 被保险人
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 机构名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 外部保单号
	 */
	@ApiField("out_policy_no")
	private String outPolicyNo;

	/**
	 * 终缴时间，用于健康险、寿险等场景，用户需要按期缴费使用
	 */
	@ApiField("pay_end_time")
	private Date payEndTime;

	/**
	 * 缴至时间，用于健康险、寿险等场景，用户需要按期缴费使用
	 */
	@ApiField("pay_to_time")
	private Date payToTime;

	/**
	 * 保单凭证号;蚂蚁保险平台生成的保单凭证号,用户可以通过此单号去保险公司查询保单信息.
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保单状态.INEFFECTIVE:未生效、GUARANTEE:保障中、EXPIRED:已失效、SURRENDER:已退保
	 */
	@ApiField("policy_status")
	private String policyStatus;

	/**
	 * 保费 ;单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 保额 ;单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	/**
	 * 退保金额
	 */
	@ApiField("surrender_fee")
	private Long surrenderFee;

	/**
	 * 退保时间
	 */
	@ApiField("surrender_time")
	private Date surrenderTime;

    /**
     * Gets addressee.
     *
     * @return the addressee
     */
    public InsAddressee getAddressee() {
		return this.addressee;
	}

    /**
     * Sets addressee.
     *
     * @param addressee the addressee
     */
    public void setAddressee(InsAddressee addressee) {
		this.addressee = addressee;
	}

    /**
     * Gets applicant.
     *
     * @return the applicant
     */
    public InsPerson getApplicant() {
		return this.applicant;
	}

    /**
     * Sets applicant.
     *
     * @param applicant the applicant
     */
    public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
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
     * Gets claims.
     *
     * @return the claims
     */
    public List<InsClaim> getClaims() {
		return this.claims;
	}

    /**
     * Sets claims.
     *
     * @param claims the claims
     */
    public void setClaims(List<InsClaim> claims) {
		this.claims = claims;
	}

    /**
     * Gets coverages.
     *
     * @return the coverages
     */
    public List<InsCoverage> getCoverages() {
		return this.coverages;
	}

    /**
     * Sets coverages.
     *
     * @param coverages the coverages
     */
    public void setCoverages(List<InsCoverage> coverages) {
		this.coverages = coverages;
	}

    /**
     * Gets effect end time.
     *
     * @return the effect end time
     */
    public String getEffectEndTime() {
		return this.effectEndTime;
	}

    /**
     * Sets effect end time.
     *
     * @param effectEndTime the effect end time
     */
    public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

    /**
     * Gets effect start time.
     *
     * @return the effect start time
     */
    public String getEffectStartTime() {
		return this.effectStartTime;
	}

    /**
     * Sets effect start time.
     *
     * @param effectStartTime the effect start time
     */
    public void setEffectStartTime(String effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

    /**
     * Gets ins objects.
     *
     * @return the ins objects
     */
    public List<InsObject> getInsObjects() {
		return this.insObjects;
	}

    /**
     * Sets ins objects.
     *
     * @param insObjects the ins objects
     */
    public void setInsObjects(List<InsObject> insObjects) {
		this.insObjects = insObjects;
	}

    /**
     * Gets insureds.
     *
     * @return the insureds
     */
    public List<InsPerson> getInsureds() {
		return this.insureds;
	}

    /**
     * Sets insureds.
     *
     * @param insureds the insureds
     */
    public void setInsureds(List<InsPerson> insureds) {
		this.insureds = insureds;
	}

    /**
     * Gets merchant name.
     *
     * @return the merchant name
     */
    public String getMerchantName() {
		return this.merchantName;
	}

    /**
     * Sets merchant name.
     *
     * @param merchantName the merchant name
     */
    public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

    /**
     * Gets out policy no.
     *
     * @return the out policy no
     */
    public String getOutPolicyNo() {
		return this.outPolicyNo;
	}

    /**
     * Sets out policy no.
     *
     * @param outPolicyNo the out policy no
     */
    public void setOutPolicyNo(String outPolicyNo) {
		this.outPolicyNo = outPolicyNo;
	}

    /**
     * Gets pay end time.
     *
     * @return the pay end time
     */
    public Date getPayEndTime() {
		return this.payEndTime;
	}

    /**
     * Sets pay end time.
     *
     * @param payEndTime the pay end time
     */
    public void setPayEndTime(Date payEndTime) {
		this.payEndTime = payEndTime;
	}

    /**
     * Gets pay to time.
     *
     * @return the pay to time
     */
    public Date getPayToTime() {
		return this.payToTime;
	}

    /**
     * Sets pay to time.
     *
     * @param payToTime the pay to time
     */
    public void setPayToTime(Date payToTime) {
		this.payToTime = payToTime;
	}

    /**
     * Gets policy no.
     *
     * @return the policy no
     */
    public String getPolicyNo() {
		return this.policyNo;
	}

    /**
     * Sets policy no.
     *
     * @param policyNo the policy no
     */
    public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

    /**
     * Gets policy status.
     *
     * @return the policy status
     */
    public String getPolicyStatus() {
		return this.policyStatus;
	}

    /**
     * Sets policy status.
     *
     * @param policyStatus the policy status
     */
    public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

    /**
     * Gets premium.
     *
     * @return the premium
     */
    public Long getPremium() {
		return this.premium;
	}

    /**
     * Sets premium.
     *
     * @param premium the premium
     */
    public void setPremium(Long premium) {
		this.premium = premium;
	}

    /**
     * Gets prod name.
     *
     * @return the prod name
     */
    public String getProdName() {
		return this.prodName;
	}

    /**
     * Sets prod name.
     *
     * @param prodName the prod name
     */
    public void setProdName(String prodName) {
		this.prodName = prodName;
	}

    /**
     * Gets sum insured.
     *
     * @return the sum insured
     */
    public Long getSumInsured() {
		return this.sumInsured;
	}

    /**
     * Sets sum insured.
     *
     * @param sumInsured the sum insured
     */
    public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

    /**
     * Gets surrender fee.
     *
     * @return the surrender fee
     */
    public Long getSurrenderFee() {
		return this.surrenderFee;
	}

    /**
     * Sets surrender fee.
     *
     * @param surrenderFee the surrender fee
     */
    public void setSurrenderFee(Long surrenderFee) {
		this.surrenderFee = surrenderFee;
	}

    /**
     * Gets surrender time.
     *
     * @return the surrender time
     */
    public Date getSurrenderTime() {
		return this.surrenderTime;
	}

    /**
     * Sets surrender time.
     *
     * @param surrenderTime the surrender time
     */
    public void setSurrenderTime(Date surrenderTime) {
		this.surrenderTime = surrenderTime;
	}

}
