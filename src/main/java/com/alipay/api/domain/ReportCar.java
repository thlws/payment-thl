package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报案相关车辆信息
 *
 * @author auto create
 * @since 1.0, 2018-04-12 16:01:02
 */
public class ReportCar extends AlipayObject {

	private static final long serialVersionUID = 6784989278182464312L;

	/**
	 * 定损员信息，核赔阶段标的车必填
	 */
	@ApiField("assessor")
	private Person assessor;

	/**
	 * 司机信息，查勘、核赔阶段必填
	 */
	@ApiField("driver")
	private Person driver;

	/**
	 * 车架号，标的车在查勘、核赔阶段必填
	 */
	@ApiField("frame_no")
	private String frameNo;

	/**
	 * 修理厂地址
	 */
	@ApiField("garage_address")
	private String garageAddress;

	/**
	 * 修理厂名称
	 */
	@ApiField("garage_name")
	private String garageName;

	/**
	 * 修理厂手机号
	 */
	@ApiField("garage_phone_no")
	private String garagePhoneNo;

	/**
	 * 修理厂类型
4S:4S店
GENERAL:综合修理
	 */
	@ApiField("garage_type")
	private String garageType;

	/**
	 * 车牌号，标的车在查勘、核赔阶段必填
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 查勘首次提交时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("survey_first_commit_date")
	private Date surveyFirstCommitDate;

	/**
	 * 查勘末次时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("survey_last_commit_date")
	private String surveyLastCommitDate;

	/**
	 * 查勘员，查勘、核赔阶段标的车必填
	 */
	@ApiField("surveyor")
	private Person surveyor;

    /**
     * Gets assessor.
     *
     * @return the assessor
     */
    public Person getAssessor() {
		return this.assessor;
	}

    /**
     * Sets assessor.
     *
     * @param assessor the assessor
     */
    public void setAssessor(Person assessor) {
		this.assessor = assessor;
	}

    /**
     * Gets driver.
     *
     * @return the driver
     */
    public Person getDriver() {
		return this.driver;
	}

    /**
     * Sets driver.
     *
     * @param driver the driver
     */
    public void setDriver(Person driver) {
		this.driver = driver;
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
     * Gets garage address.
     *
     * @return the garage address
     */
    public String getGarageAddress() {
		return this.garageAddress;
	}

    /**
     * Sets garage address.
     *
     * @param garageAddress the garage address
     */
    public void setGarageAddress(String garageAddress) {
		this.garageAddress = garageAddress;
	}

    /**
     * Gets garage name.
     *
     * @return the garage name
     */
    public String getGarageName() {
		return this.garageName;
	}

    /**
     * Sets garage name.
     *
     * @param garageName the garage name
     */
    public void setGarageName(String garageName) {
		this.garageName = garageName;
	}

    /**
     * Gets garage phone no.
     *
     * @return the garage phone no
     */
    public String getGaragePhoneNo() {
		return this.garagePhoneNo;
	}

    /**
     * Sets garage phone no.
     *
     * @param garagePhoneNo the garage phone no
     */
    public void setGaragePhoneNo(String garagePhoneNo) {
		this.garagePhoneNo = garagePhoneNo;
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
     * Gets survey first commit date.
     *
     * @return the survey first commit date
     */
    public Date getSurveyFirstCommitDate() {
		return this.surveyFirstCommitDate;
	}

    /**
     * Sets survey first commit date.
     *
     * @param surveyFirstCommitDate the survey first commit date
     */
    public void setSurveyFirstCommitDate(Date surveyFirstCommitDate) {
		this.surveyFirstCommitDate = surveyFirstCommitDate;
	}

    /**
     * Gets survey last commit date.
     *
     * @return the survey last commit date
     */
    public String getSurveyLastCommitDate() {
		return this.surveyLastCommitDate;
	}

    /**
     * Sets survey last commit date.
     *
     * @param surveyLastCommitDate the survey last commit date
     */
    public void setSurveyLastCommitDate(String surveyLastCommitDate) {
		this.surveyLastCommitDate = surveyLastCommitDate;
	}

    /**
     * Gets surveyor.
     *
     * @return the surveyor
     */
    public Person getSurveyor() {
		return this.surveyor;
	}

    /**
     * Sets surveyor.
     *
     * @param surveyor the surveyor
     */
    public void setSurveyor(Person surveyor) {
		this.surveyor = surveyor;
	}

}
