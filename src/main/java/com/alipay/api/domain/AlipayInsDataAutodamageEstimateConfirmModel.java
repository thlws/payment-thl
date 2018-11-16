package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步定损/核损结果到蚂蚁
 *
 * @author auto create
 * @since 1.0, 2017-07-28 15:30:22
 */
public class AlipayInsDataAutodamageEstimateConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5636357862458778969L;

	/**
	 * 业务类型，2表示机构核损，3表示机构定损
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 车险商业险保单号
	 */
	@ApiField("commercial_policy_no")
	private String commercialPolicyNo;

	/**
	 * 交强险保单号
	 */
	@ApiField("compulsory_policy_no")
	private String compulsoryPolicyNo;

	/**
	 * 汽车发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 核损详情对象列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_autodamage_estimate_confirm_model")
	private List<InsDataAutodamageEstimateConfirmModel> estimateDetailList;

	/**
	 * 保险公司定损单号，唯一标识一个定损单的id
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/**
	 * 车架号
	 */
	@ApiField("frame_no")
	private String frameNo;

	/**
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 车型厂牌
	 */
	@ApiField("model_brand")
	private String modelBrand;

	/**
	 * 维修企业名称
	 */
	@ApiField("repair_corp_name")
	private String repairCorpName;

	/**
	 * 维修企业类型
	 */
	@ApiField("repair_corp_type")
	private String repairCorpType;

	/**
	 * 车险报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

	/**
	 * 车损总金额，单位：元
	 */
	@ApiField("total_damage_amount")
	private String totalDamageAmount;

	/**
	 * 残值扣除总金额，单位：元
	 */
	@ApiField("total_remain_value")
	private String totalRemainValue;

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets commercial policy no.
     *
     * @return the commercial policy no
     */
    public String getCommercialPolicyNo() {
		return this.commercialPolicyNo;
	}

    /**
     * Sets commercial policy no.
     *
     * @param commercialPolicyNo the commercial policy no
     */
    public void setCommercialPolicyNo(String commercialPolicyNo) {
		this.commercialPolicyNo = commercialPolicyNo;
	}

    /**
     * Gets compulsory policy no.
     *
     * @return the compulsory policy no
     */
    public String getCompulsoryPolicyNo() {
		return this.compulsoryPolicyNo;
	}

    /**
     * Sets compulsory policy no.
     *
     * @param compulsoryPolicyNo the compulsory policy no
     */
    public void setCompulsoryPolicyNo(String compulsoryPolicyNo) {
		this.compulsoryPolicyNo = compulsoryPolicyNo;
	}

    /**
     * Gets engine no.
     *
     * @return the engine no
     */
    public String getEngineNo() {
		return this.engineNo;
	}

    /**
     * Sets engine no.
     *
     * @param engineNo the engine no
     */
    public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

    /**
     * Gets estimate detail list.
     *
     * @return the estimate detail list
     */
    public List<InsDataAutodamageEstimateConfirmModel> getEstimateDetailList() {
		return this.estimateDetailList;
	}

    /**
     * Sets estimate detail list.
     *
     * @param estimateDetailList the estimate detail list
     */
    public void setEstimateDetailList(List<InsDataAutodamageEstimateConfirmModel> estimateDetailList) {
		this.estimateDetailList = estimateDetailList;
	}

    /**
     * Gets estimate no.
     *
     * @return the estimate no
     */
    public String getEstimateNo() {
		return this.estimateNo;
	}

    /**
     * Sets estimate no.
     *
     * @param estimateNo the estimate no
     */
    public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

    /**
     * Gets frame no.
     *
     * @return the frame no
     */
    public String getFrameNo() {
		return this.frameNo;
	}

    /**
     * Sets frame no.
     *
     * @param frameNo the frame no
     */
    public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

    /**
     * Gets license no.
     *
     * @return the license no
     */
    public String getLicenseNo() {
		return this.licenseNo;
	}

    /**
     * Sets license no.
     *
     * @param licenseNo the license no
     */
    public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

    /**
     * Gets entity brand.
     *
     * @return the entity brand
     */
    public String getModelBrand() {
		return this.modelBrand;
	}

    /**
     * Sets entity brand.
     *
     * @param modelBrand the entity brand
     */
    public void setModelBrand(String modelBrand) {
		this.modelBrand = modelBrand;
	}

    /**
     * Gets repair corp name.
     *
     * @return the repair corp name
     */
    public String getRepairCorpName() {
		return this.repairCorpName;
	}

    /**
     * Sets repair corp name.
     *
     * @param repairCorpName the repair corp name
     */
    public void setRepairCorpName(String repairCorpName) {
		this.repairCorpName = repairCorpName;
	}

    /**
     * Gets repair corp type.
     *
     * @return the repair corp type
     */
    public String getRepairCorpType() {
		return this.repairCorpType;
	}

    /**
     * Sets repair corp type.
     *
     * @param repairCorpType the repair corp type
     */
    public void setRepairCorpType(String repairCorpType) {
		this.repairCorpType = repairCorpType;
	}

    /**
     * Gets report no.
     *
     * @return the report no
     */
    public String getReportNo() {
		return this.reportNo;
	}

    /**
     * Sets report no.
     *
     * @param reportNo the report no
     */
    public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

    /**
     * Gets survey no.
     *
     * @return the survey no
     */
    public String getSurveyNo() {
		return this.surveyNo;
	}

    /**
     * Sets survey no.
     *
     * @param surveyNo the survey no
     */
    public void setSurveyNo(String surveyNo) {
		this.surveyNo = surveyNo;
	}

    /**
     * Gets total damage amount.
     *
     * @return the total damage amount
     */
    public String getTotalDamageAmount() {
		return this.totalDamageAmount;
	}

    /**
     * Sets total damage amount.
     *
     * @param totalDamageAmount the total damage amount
     */
    public void setTotalDamageAmount(String totalDamageAmount) {
		this.totalDamageAmount = totalDamageAmount;
	}

    /**
     * Gets total remain value.
     *
     * @return the total remain value
     */
    public String getTotalRemainValue() {
		return this.totalRemainValue;
	}

    /**
     * Sets total remain value.
     *
     * @param totalRemainValue the total remain value
     */
    public void setTotalRemainValue(String totalRemainValue) {
		this.totalRemainValue = totalRemainValue;
	}

}
