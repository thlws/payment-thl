package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 理赔反欺诈查询服务
 *
 * @author auto create
 * @since 1.0, 2018-05-25 11:02:22
 */
public class AlipayInsDataAutoFraudQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7797487626841989791L;

	/**
	 * 出险城市，六位国标码
	 */
	@ApiField("accident_city")
	private String accidentCity;

	/**
	 * 出险时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("accident_date")
	private Date accidentDate;

	/**
	 * 出险地点
	 */
	@ApiField("accident_location")
	private String accidentLocation;

	/**
	 * 立案金额，单位：元
查勘阶段必传
	 */
	@ApiField("case_amount")
	private String caseAmount;

	/**
	 * 估损金额，单位：元
核赔阶段必传
	 */
	@ApiField("estimate_damage_amount")
	private String estimateDamageAmount;

	/**
	 * 报案人信息
	 */
	@ApiField("informant")
	private Informant informant;

	/**
	 * 人伤数量，上限15，没有人伤则填0
	 */
	@ApiField("injured_count")
	private Long injuredCount;

	/**
	 * 伤者列表，涉及人伤案件在查勘、核赔阶段必选
	 */
	@ApiListField("injured_list")
	@ApiField("injured")
	private List<Injured> injuredList;

	/**
	 * 投保城市，六位国标编码
	 */
	@ApiField("insure_city")
	private String insureCity;

	/**
	 * 被保人信息
	 */
	@ApiField("insured")
	private Insured insured;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 报案时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("report_date")
	private Date reportDate;

	/**
	 * 报案号，使用保险公司实际业务流程中的报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 请求号，每一次请求都需要变化且唯一。可使用UUID实现
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 理赔场景编码，对应实际发生反欺诈调用的场景。
枚举如下：
REPORT:报案
SURVEY:查勘
CLAIMS_ASSESS:核赔
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 标的车信息
报案阶段可选，查勘、核赔阶段必传
	 */
	@ApiField("subject_car")
	private ReportCar subjectCar;

	/**
	 * 三者车数量，上限15辆，如果没有则为0
	 */
	@ApiField("third_party_car_count")
	private Long thirdPartyCarCount;

	/**
	 * 三者车列表，涉及三者车的案件在查勘、核赔阶段必选
	 */
	@ApiListField("third_party_car_list")
	@ApiField("report_car")
	private List<ReportCar> thirdPartyCarList;

    /**
     * Gets accident city.
     *
     * @return the accident city
     */
    public String getAccidentCity() {
		return this.accidentCity;
	}

    /**
     * Sets accident city.
     *
     * @param accidentCity the accident city
     */
    public void setAccidentCity(String accidentCity) {
		this.accidentCity = accidentCity;
	}

    /**
     * Gets accident date.
     *
     * @return the accident date
     */
    public Date getAccidentDate() {
		return this.accidentDate;
	}

    /**
     * Sets accident date.
     *
     * @param accidentDate the accident date
     */
    public void setAccidentDate(Date accidentDate) {
		this.accidentDate = accidentDate;
	}

    /**
     * Gets accident location.
     *
     * @return the accident location
     */
    public String getAccidentLocation() {
		return this.accidentLocation;
	}

    /**
     * Sets accident location.
     *
     * @param accidentLocation the accident location
     */
    public void setAccidentLocation(String accidentLocation) {
		this.accidentLocation = accidentLocation;
	}

    /**
     * Gets case amount.
     *
     * @return the case amount
     */
    public String getCaseAmount() {
		return this.caseAmount;
	}

    /**
     * Sets case amount.
     *
     * @param caseAmount the case amount
     */
    public void setCaseAmount(String caseAmount) {
		this.caseAmount = caseAmount;
	}

    /**
     * Gets estimate damage amount.
     *
     * @return the estimate damage amount
     */
    public String getEstimateDamageAmount() {
		return this.estimateDamageAmount;
	}

    /**
     * Sets estimate damage amount.
     *
     * @param estimateDamageAmount the estimate damage amount
     */
    public void setEstimateDamageAmount(String estimateDamageAmount) {
		this.estimateDamageAmount = estimateDamageAmount;
	}

    /**
     * Gets informant.
     *
     * @return the informant
     */
    public Informant getInformant() {
		return this.informant;
	}

    /**
     * Sets informant.
     *
     * @param informant the informant
     */
    public void setInformant(Informant informant) {
		this.informant = informant;
	}

    /**
     * Gets injured count.
     *
     * @return the injured count
     */
    public Long getInjuredCount() {
		return this.injuredCount;
	}

    /**
     * Sets injured count.
     *
     * @param injuredCount the injured count
     */
    public void setInjuredCount(Long injuredCount) {
		this.injuredCount = injuredCount;
	}

    /**
     * Gets injured list.
     *
     * @return the injured list
     */
    public List<Injured> getInjuredList() {
		return this.injuredList;
	}

    /**
     * Sets injured list.
     *
     * @param injuredList the injured list
     */
    public void setInjuredList(List<Injured> injuredList) {
		this.injuredList = injuredList;
	}

    /**
     * Gets insure city.
     *
     * @return the insure city
     */
    public String getInsureCity() {
		return this.insureCity;
	}

    /**
     * Sets insure city.
     *
     * @param insureCity the insure city
     */
    public void setInsureCity(String insureCity) {
		this.insureCity = insureCity;
	}

    /**
     * Gets insured.
     *
     * @return the insured
     */
    public Insured getInsured() {
		return this.insured;
	}

    /**
     * Sets insured.
     *
     * @param insured the insured
     */
    public void setInsured(Insured insured) {
		this.insured = insured;
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
     * Gets report date.
     *
     * @return the report date
     */
    public Date getReportDate() {
		return this.reportDate;
	}

    /**
     * Sets report date.
     *
     * @param reportDate the report date
     */
    public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
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
     * Gets request no.
     *
     * @return the request no
     */
    public String getRequestNo() {
		return this.requestNo;
	}

    /**
     * Sets request no.
     *
     * @param requestNo the request no
     */
    public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

    /**
     * Gets scene type.
     *
     * @return the scene type
     */
    public String getSceneType() {
		return this.sceneType;
	}

    /**
     * Sets scene type.
     *
     * @param sceneType the scene type
     */
    public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

    /**
     * Gets subject car.
     *
     * @return the subject car
     */
    public ReportCar getSubjectCar() {
		return this.subjectCar;
	}

    /**
     * Sets subject car.
     *
     * @param subjectCar the subject car
     */
    public void setSubjectCar(ReportCar subjectCar) {
		this.subjectCar = subjectCar;
	}

    /**
     * Gets third party car count.
     *
     * @return the third party car count
     */
    public Long getThirdPartyCarCount() {
		return this.thirdPartyCarCount;
	}

    /**
     * Sets third party car count.
     *
     * @param thirdPartyCarCount the third party car count
     */
    public void setThirdPartyCarCount(Long thirdPartyCarCount) {
		this.thirdPartyCarCount = thirdPartyCarCount;
	}

    /**
     * Gets third party car list.
     *
     * @return the third party car list
     */
    public List<ReportCar> getThirdPartyCarList() {
		return this.thirdPartyCarList;
	}

    /**
     * Sets third party car list.
     *
     * @param thirdPartyCarList the third party car list
     */
    public void setThirdPartyCarList(List<ReportCar> thirdPartyCarList) {
		this.thirdPartyCarList = thirdPartyCarList;
	}

}
