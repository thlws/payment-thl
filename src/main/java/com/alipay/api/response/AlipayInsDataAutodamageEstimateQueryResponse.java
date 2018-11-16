package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsDataAutodamageEstimateResultDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.autodamage.estimate.query response.
 *
 * @author auto create
 * @since 1.0, 2017-11-10 14:37:02
 */
public class AlipayInsDataAutodamageEstimateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5723833894113389544L;

	/** 
	 * 商业险保单号
	 */
	@ApiField("commercial_policy_no")
	private String commercialPolicyNo;

	/** 
	 * 交强险
	 */
	@ApiField("compulsory_policy_no")
	private String compulsoryPolicyNo;

	/** 
	 * 发动机号
	 */
	@ApiField("engine_no")
	private String engineNo;

	/** 
	 * 定损结果详情列表
	 */
	@ApiListField("estimate_detail_list")
	@ApiField("ins_data_autodamage_estimate_result_detail_model")
	private List<InsDataAutodamageEstimateResultDetailModel> estimateDetailList;

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
	 * 车型厂牌
	 */
	@ApiField("model_brand")
	private String modelBrand;

	/** 
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/** 
	 * 查勘号
	 */
	@ApiField("survey_no")
	private String surveyNo;

    /**
     * Sets commercial policy no.
     *
     * @param commercialPolicyNo the commercial policy no
     */
    public void setCommercialPolicyNo(String commercialPolicyNo) {
		this.commercialPolicyNo = commercialPolicyNo;
	}

    /**
     * Gets commercial policy no.
     *
     * @return the commercial policy no
     */
    public String getCommercialPolicyNo( ) {
		return this.commercialPolicyNo;
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
     * Gets compulsory policy no.
     *
     * @return the compulsory policy no
     */
    public String getCompulsoryPolicyNo( ) {
		return this.compulsoryPolicyNo;
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
     * Gets engine no.
     *
     * @return the engine no
     */
    public String getEngineNo( ) {
		return this.engineNo;
	}

    /**
     * Sets estimate detail list.
     *
     * @param estimateDetailList the estimate detail list
     */
    public void setEstimateDetailList(List<InsDataAutodamageEstimateResultDetailModel> estimateDetailList) {
		this.estimateDetailList = estimateDetailList;
	}

    /**
     * Gets estimate detail list.
     *
     * @return the estimate detail list
     */
    public List<InsDataAutodamageEstimateResultDetailModel> getEstimateDetailList( ) {
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
     * Sets entity brand.
     *
     * @param modelBrand the entity brand
     */
    public void setModelBrand(String modelBrand) {
		this.modelBrand = modelBrand;
	}

    /**
     * Gets entity brand.
     *
     * @return the entity brand
     */
    public String getModelBrand( ) {
		return this.modelBrand;
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
     * Gets report no.
     *
     * @return the report no
     */
    public String getReportNo( ) {
		return this.reportNo;
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
     * Gets survey no.
     *
     * @return the survey no
     */
    public String getSurveyNo( ) {
		return this.surveyNo;
	}

}
