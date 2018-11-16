package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投保受理
 *
 * @author auto create
 * @since 1.0, 2018-01-24 14:21:01
 */
public class AlipayInsSceneApplicationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1672829188123838362L;

	/**
	 * 用户参与的活动ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 支付账单流水的标题
	 */
	@ApiField("bill_title")
	private String billTitle;

	/**
	 * 投保参数 ,每个产品特有的投保参数,如航空险的航班信息;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/**
	 * 标的信息， 保险标的物，产品责任信息
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
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 实际保费，询价接口获取的保费通过投保接口传递进来。投保接口会对传入的保费进行验证。传入的保费和核价的值不一样投保失败
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 产品编码;由蚂蚁保险平台分配,商户通过该产品编码投保特定的保险产品（如饿了么外卖延误险）
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 渠道来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 保额值,保额类型为枚举的时候是一个枚举值,当为金额类型时单位为分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId() {
		return this.activityId;
	}

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
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
     * Gets effect start time.
     *
     * @return the effect start time
     */
    public Date getEffectStartTime() {
		return this.effectStartTime;
	}

    /**
     * Sets effect start time.
     *
     * @param effectStartTime the effect start time
     */
    public void setEffectStartTime(Date effectStartTime) {
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
     * Gets period.
     *
     * @return the period
     */
    public String getPeriod() {
		return this.period;
	}

    /**
     * Sets period.
     *
     * @param period the period
     */
    public void setPeriod(String period) {
		this.period = period;
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
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
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

}
