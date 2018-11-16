package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 提交车险图像定损请求
 *
 * @author auto create
 * @since 1.0, 2017-07-28 15:30:17
 */
public class AlipayInsDataAutodamageEstimateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8292978614214798731L;

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
	 * 车损图片信息列表
	 */
	@ApiListField("image_list")
	@ApiField("alipay_ins_data_autodamage_request_image_info")
	private List<AlipayInsDataAutodamageRequestImageInfo> imageList;

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
	 * 车险报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求发生时的时间戳
	 */
	@ApiField("request_timestamp")
	private Long requestTimestamp;

	/**
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

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
     * Gets image list.
     *
     * @return the image list
     */
    public List<AlipayInsDataAutodamageRequestImageInfo> getImageList() {
		return this.imageList;
	}

    /**
     * Sets image list.
     *
     * @param imageList the image list
     */
    public void setImageList(List<AlipayInsDataAutodamageRequestImageInfo> imageList) {
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
    public Long getRequestTimestamp() {
		return this.requestTimestamp;
	}

    /**
     * Sets request timestamp.
     *
     * @param requestTimestamp the request timestamp
     */
    public void setRequestTimestamp(Long requestTimestamp) {
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
