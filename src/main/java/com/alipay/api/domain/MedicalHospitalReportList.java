package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院报告明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class MedicalHospitalReportList extends AlipayObject {

	private static final long serialVersionUID = 7151262895284567941L;

	/**
	 * 报告产出日期 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("report_date")
	private Date reportDate;

	/**
	 * 报告说明
	 */
	@ApiField("report_desc")
	private String reportDesc;

	/**
	 * 报告详情连接
	 */
	@ApiField("report_link")
	private String reportLink;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告类型:
CHECK_REPORT 检查报告
EXAM_REPORT检验报告
	 */
	@ApiField("report_type")
	private String reportType;

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
     * Gets report desc.
     *
     * @return the report desc
     */
    public String getReportDesc() {
		return this.reportDesc;
	}

    /**
     * Sets report desc.
     *
     * @param reportDesc the report desc
     */
    public void setReportDesc(String reportDesc) {
		this.reportDesc = reportDesc;
	}

    /**
     * Gets report link.
     *
     * @return the report link
     */
    public String getReportLink() {
		return this.reportLink;
	}

    /**
     * Sets report link.
     *
     * @param reportLink the report link
     */
    public void setReportLink(String reportLink) {
		this.reportLink = reportLink;
	}

    /**
     * Gets report name.
     *
     * @return the report name
     */
    public String getReportName() {
		return this.reportName;
	}

    /**
     * Sets report name.
     *
     * @param reportName the report name
     */
    public void setReportName(String reportName) {
		this.reportName = reportName;
	}

    /**
     * Gets report type.
     *
     * @return the report type
     */
    public String getReportType() {
		return this.reportType;
	}

    /**
     * Sets report type.
     *
     * @param reportType the report type
     */
    public void setReportType(String reportType) {
		this.reportType = reportType;
	}

}
