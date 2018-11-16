package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产负债报表数据
 *
 * @author auto create
 * @since 1.0, 2018-08-24 10:54:36
 */
public class AlmReportData extends AlipayObject {

	private static final long serialVersionUID = 6411838761995798283L;

	/**
	 * 数据大类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 期限类别
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 数据日期
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 报表名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报表数据，只支持整数（可为负），详细见下面描述。
金额单位：分，1万即传 1000000
百分比：乘以1万后的值。例如：50%，则提供 0.5*10000即：5000
偏离度bp：bp*1万提供。例如：30.5bp，提供值：305000
	 */
	@ApiField("report_value")
	private Long reportValue;

	/**
	 * 报表小类
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

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
     * Gets date type.
     *
     * @return the date type
     */
    public String getDateType() {
		return this.dateType;
	}

    /**
     * Sets date type.
     *
     * @param dateType the date type
     */
    public void setDateType(String dateType) {
		this.dateType = dateType;
	}

    /**
     * Gets report date.
     *
     * @return the report date
     */
    public String getReportDate() {
		return this.reportDate;
	}

    /**
     * Sets report date.
     *
     * @param reportDate the report date
     */
    public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
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
     * Gets report value.
     *
     * @return the report value
     */
    public Long getReportValue() {
		return this.reportValue;
	}

    /**
     * Sets report value.
     *
     * @param reportValue the report value
     */
    public void setReportValue(Long reportValue) {
		this.reportValue = reportValue;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType() {
		return this.subBizType;
	}

    /**
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
