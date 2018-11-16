package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsDataDsbEstimateResultDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.dsb.estimate.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-05 22:35:00
 */
public class AlipayInsDataDsbEstimateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2571618543679683237L;

	/** 
	 * 定损结果置信度，小数，取值范围为0到1
	 */
	@ApiField("confidence")
	private String confidence;

	/** 
	 * 核损详情对象列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_dsb_estimate_result_detail")
	private List<InsDataDsbEstimateResultDetail> estimateDetailList;

	/** 
	 * 定损单号
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
	 * 维修企业属性，json字符串格式，目前key值有：type(企业类型/等级）、name（企业名称）、address（地址）、code（维修企业编码）等
	 */
	@ApiField("repair_corp_properties")
	private String repairCorpProperties;

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
     * Sets confidence.
     *
     * @param confidence the confidence
     */
    public void setConfidence(String confidence) {
		this.confidence = confidence;
	}

    /**
     * Gets confidence.
     *
     * @return the confidence
     */
    public String getConfidence( ) {
		return this.confidence;
	}

    /**
     * Sets estimate detail list.
     *
     * @param estimateDetailList the estimate detail list
     */
    public void setEstimateDetailList(List<InsDataDsbEstimateResultDetail> estimateDetailList) {
		this.estimateDetailList = estimateDetailList;
	}

    /**
     * Gets estimate detail list.
     *
     * @return the estimate detail list
     */
    public List<InsDataDsbEstimateResultDetail> getEstimateDetailList( ) {
		return this.estimateDetailList;
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
     * Gets estimate no.
     *
     * @return the estimate no
     */
    public String getEstimateNo( ) {
		return this.estimateNo;
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
     * Gets frame no.
     *
     * @return the frame no
     */
    public String getFrameNo( ) {
		return this.frameNo;
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
     * Gets license no.
     *
     * @return the license no
     */
    public String getLicenseNo( ) {
		return this.licenseNo;
	}

    /**
     * Sets repair corp properties.
     *
     * @param repairCorpProperties the repair corp properties
     */
    public void setRepairCorpProperties(String repairCorpProperties) {
		this.repairCorpProperties = repairCorpProperties;
	}

    /**
     * Gets repair corp properties.
     *
     * @return the repair corp properties
     */
    public String getRepairCorpProperties( ) {
		return this.repairCorpProperties;
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
     * Gets total damage amount.
     *
     * @return the total damage amount
     */
    public String getTotalDamageAmount( ) {
		return this.totalDamageAmount;
	}

    /**
     * Sets total remain value.
     *
     * @param totalRemainValue the total remain value
     */
    public void setTotalRemainValue(String totalRemainValue) {
		this.totalRemainValue = totalRemainValue;
	}

    /**
     * Gets total remain value.
     *
     * @return the total remain value
     */
    public String getTotalRemainValue( ) {
		return this.totalRemainValue;
	}

}
