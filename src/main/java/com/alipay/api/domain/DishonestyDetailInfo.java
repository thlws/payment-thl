package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公安老赖详细失信信息对象
 *
 * @author auto create
 * @since 1.0, 2014-10-28 23:27:54
 */
public class DishonestyDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7491157948914553844L;

	/**
	 * 被执行人行为具体情况
	 */
	@ApiField("behavior")
	private String behavior;

	/**
	 * 案号
	 */
	@ApiField("case_code")
	private String caseCode;

	/**
	 * 执行法院
	 */
	@ApiField("enforce_court")
	private String enforceCourt;

	/**
	 * 身份证号
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 被执行人履行情况
	 */
	@ApiField("performance")
	private String performance;

	/**
	 * 发布日期
	 */
	@ApiField("publish_date")
	private String publishDate;

	/**
	 * 所在区域
	 */
	@ApiField("region")
	private String region;

    /**
     * Gets behavior.
     *
     * @return the behavior
     */
    public String getBehavior() {
		return this.behavior;
	}

    /**
     * Sets behavior.
     *
     * @param behavior the behavior
     */
    public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

    /**
     * Gets case code.
     *
     * @return the case code
     */
    public String getCaseCode() {
		return this.caseCode;
	}

    /**
     * Sets case code.
     *
     * @param caseCode the case code
     */
    public void setCaseCode(String caseCode) {
		this.caseCode = caseCode;
	}

    /**
     * Gets enforce court.
     *
     * @return the enforce court
     */
    public String getEnforceCourt() {
		return this.enforceCourt;
	}

    /**
     * Sets enforce court.
     *
     * @param enforceCourt the enforce court
     */
    public void setEnforceCourt(String enforceCourt) {
		this.enforceCourt = enforceCourt;
	}

    /**
     * Gets id number.
     *
     * @return the id number
     */
    public String getIdNumber() {
		return this.idNumber;
	}

    /**
     * Sets id number.
     *
     * @param idNumber the id number
     */
    public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets performance.
     *
     * @return the performance
     */
    public String getPerformance() {
		return this.performance;
	}

    /**
     * Sets performance.
     *
     * @param performance the performance
     */
    public void setPerformance(String performance) {
		this.performance = performance;
	}

    /**
     * Gets publish date.
     *
     * @return the publish date
     */
    public String getPublishDate() {
		return this.publishDate;
	}

    /**
     * Sets publish date.
     *
     * @param publishDate the publish date
     */
    public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

    /**
     * Gets region.
     *
     * @return the region
     */
    public String getRegion() {
		return this.region;
	}

    /**
     * Sets region.
     *
     * @param region the region
     */
    public void setRegion(String region) {
		this.region = region;
	}

}
