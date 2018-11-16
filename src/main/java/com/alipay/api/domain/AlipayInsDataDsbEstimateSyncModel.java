package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步机构定损/核损结果
 *
 * @author auto create
 * @since 1.0, 2017-10-11 17:32:58
 */
public class AlipayInsDataDsbEstimateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3198868265286372264L;

	/**
	 * 业务类型：assessment（定损），evaluation（核损）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 定损/核损详情对象列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_dsb_estimate_result_detail")
	private List<InsDataDsbEstimateResultDetail> estimateDetailList;

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
     * Gets estimate detail list.
     *
     * @return the estimate detail list
     */
    public List<InsDataDsbEstimateResultDetail> getEstimateDetailList() {
		return this.estimateDetailList;
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
     * Gets repair corp properties.
     *
     * @return the repair corp properties
     */
    public String getRepairCorpProperties() {
		return this.repairCorpProperties;
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
