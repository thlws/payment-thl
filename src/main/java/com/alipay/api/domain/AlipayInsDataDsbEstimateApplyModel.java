package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 定损宝提交车险图像定损请求
 *
 * @author auto create
 * @since 1.0, 2018-09-05 22:21:56
 */
public class AlipayInsDataDsbEstimateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5525878266372754185L;

	/**
	 * 事发地区编码，取值参考提供的统一编码标准文档
	 */
	@ApiField("accident_area_id")
	private String accidentAreaId;

	/**
	 * 车辆属性，json格式
	 */
	@ApiField("car_properties")
	private String carProperties;

	/**
	 * 案件属性，json字符串格式，目前key值有is_night_case(是否夜间案件）、is_human_hurt（是否有人伤）、is_only_outlook_damage（是否纯外观损伤）等
	 */
	@ApiField("case_properties")
	private String caseProperties;

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
	 * 发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/**
	 * 保险公司定损单号，唯一标识一个定损单的id
	 */
	@ApiField("estimate_no")
	private String estimateNo;

	/**
	 * 定损请求uuid，唯一标识一次定损请求，用于做幂等控制
	 */
	@ApiField("estimate_request_uuid")
	private String estimateRequestUuid;

	/**
	 * 车架号
	 */
	@ApiField("frame_no")
	private String frameNo;

	/**
	 * 修理厂类型，枚举如下

4S－4S店
GENERAL－综合修理厂
	 */
	@ApiField("garage_type")
	private String garageType;

	/**
	 * 车损图片信息列表
	 */
	@ApiListField("image_list")
	@ApiField("alipay_ins_data_dsb_request_image_info")
	private List<AlipayInsDataDsbRequestImageInfo> imageList;

	/**
	 * 车牌号
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 车型厂牌，理赔车型
	 */
	@ApiField("model_brand")
	private String modelBrand;

	/**
	 * 新车购置价，单位为元。
	 */
	@ApiField("new_car_price")
	private String newCarPrice;

	/**
	 * 维修企业属性，json字符串格式，目前key值有：type(企业类型/等级）、name（企业名称）、address（地址）、code（维修企业编码）等
	 */
	@ApiField("repair_corp_properties")
	private String repairCorpProperties;

	/**
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求发生时的时间戳
	 */
	@ApiField("request_timestamp")
	private String requestTimestamp;

	/**
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

    /**
     * Gets accident area id.
     *
     * @return the accident area id
     */
    public String getAccidentAreaId() {
		return this.accidentAreaId;
	}

    /**
     * Sets accident area id.
     *
     * @param accidentAreaId the accident area id
     */
    public void setAccidentAreaId(String accidentAreaId) {
		this.accidentAreaId = accidentAreaId;
	}

    /**
     * Gets car properties.
     *
     * @return the car properties
     */
    public String getCarProperties() {
		return this.carProperties;
	}

    /**
     * Sets car properties.
     *
     * @param carProperties the car properties
     */
    public void setCarProperties(String carProperties) {
		this.carProperties = carProperties;
	}

    /**
     * Gets case properties.
     *
     * @return the case properties
     */
    public String getCaseProperties() {
		return this.caseProperties;
	}

    /**
     * Sets case properties.
     *
     * @param caseProperties the case properties
     */
    public void setCaseProperties(String caseProperties) {
		this.caseProperties = caseProperties;
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
     * Gets estimate request uuid.
     *
     * @return the estimate request uuid
     */
    public String getEstimateRequestUuid() {
		return this.estimateRequestUuid;
	}

    /**
     * Sets estimate request uuid.
     *
     * @param estimateRequestUuid the estimate request uuid
     */
    public void setEstimateRequestUuid(String estimateRequestUuid) {
		this.estimateRequestUuid = estimateRequestUuid;
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
     * Gets garage type.
     *
     * @return the garage type
     */
    public String getGarageType() {
		return this.garageType;
	}

    /**
     * Sets garage type.
     *
     * @param garageType the garage type
     */
    public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

    /**
     * Gets image list.
     *
     * @return the image list
     */
    public List<AlipayInsDataDsbRequestImageInfo> getImageList() {
		return this.imageList;
	}

    /**
     * Sets image list.
     *
     * @param imageList the image list
     */
    public void setImageList(List<AlipayInsDataDsbRequestImageInfo> imageList) {
		this.imageList = imageList;
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
     * Gets new car price.
     *
     * @return the new car price
     */
    public String getNewCarPrice() {
		return this.newCarPrice;
	}

    /**
     * Sets new car price.
     *
     * @param newCarPrice the new car price
     */
    public void setNewCarPrice(String newCarPrice) {
		this.newCarPrice = newCarPrice;
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
     * Gets request timestamp.
     *
     * @return the request timestamp
     */
    public String getRequestTimestamp() {
		return this.requestTimestamp;
	}

    /**
     * Sets request timestamp.
     *
     * @param requestTimestamp the request timestamp
     */
    public void setRequestTimestamp(String requestTimestamp) {
		this.requestTimestamp = requestTimestamp;
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

}
