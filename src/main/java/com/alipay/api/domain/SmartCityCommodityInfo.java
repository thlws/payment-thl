package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新型智慧城市服务扩展信息
 *
 * @author auto create
 * @since 1.0, 2018-04-09 18:17:19
 */
public class SmartCityCommodityInfo extends AlipayObject {

	private static final long serialVersionUID = 7386451846254879792L;

	/**
	 * 服务归属
	 */
	@ApiField("affiliation")
	private String affiliation;

	/**
	 * 授权文件
	 */
	@ApiField("auth_file")
	private String authFile;

	/**
	 * 测试验收说明
	 */
	@ApiField("test_detail")
	private String testDetail;

	/**
	 * 测试报表
	 */
	@ApiField("test_report")
	private String testReport;

	/**
	 * 用户指南
	 */
	@ApiField("user_guide")
	private String userGuide;

    /**
     * Gets affiliation.
     *
     * @return the affiliation
     */
    public String getAffiliation() {
		return this.affiliation;
	}

    /**
     * Sets affiliation.
     *
     * @param affiliation the affiliation
     */
    public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

    /**
     * Gets auth file.
     *
     * @return the auth file
     */
    public String getAuthFile() {
		return this.authFile;
	}

    /**
     * Sets auth file.
     *
     * @param authFile the auth file
     */
    public void setAuthFile(String authFile) {
		this.authFile = authFile;
	}

    /**
     * Gets test detail.
     *
     * @return the test detail
     */
    public String getTestDetail() {
		return this.testDetail;
	}

    /**
     * Sets test detail.
     *
     * @param testDetail the test detail
     */
    public void setTestDetail(String testDetail) {
		this.testDetail = testDetail;
	}

    /**
     * Gets test report.
     *
     * @return the test report
     */
    public String getTestReport() {
		return this.testReport;
	}

    /**
     * Sets test report.
     *
     * @param testReport the test report
     */
    public void setTestReport(String testReport) {
		this.testReport = testReport;
	}

    /**
     * Gets user guide.
     *
     * @return the user guide
     */
    public String getUserGuide() {
		return this.userGuide;
	}

    /**
     * Sets user guide.
     *
     * @param userGuide the user guide
     */
    public void setUserGuide(String userGuide) {
		this.userGuide = userGuide;
	}

}
