package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报表详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-05-03 09:41:08
 */
public class KoubeiMarketingDataAlisisReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4577895789229238884L;

	/**
	 * 报表查询过滤条件
	 */
	@ApiListField("conditions")
	@ApiField("report_query_condition")
	private List<ReportQueryCondition> conditions;

	/**
	 * 报表唯一标识
	 */
	@ApiField("report_uk")
	private String reportUk;

    /**
     * Gets conditions.
     *
     * @return the conditions
     */
    public List<ReportQueryCondition> getConditions() {
		return this.conditions;
	}

    /**
     * Sets conditions.
     *
     * @param conditions the conditions
     */
    public void setConditions(List<ReportQueryCondition> conditions) {
		this.conditions = conditions;
	}

    /**
     * Gets report uk.
     *
     * @return the report uk
     */
    public String getReportUk() {
		return this.reportUk;
	}

    /**
     * Sets report uk.
     *
     * @param reportUk the report uk
     */
    public void setReportUk(String reportUk) {
		this.reportUk = reportUk;
	}

}
