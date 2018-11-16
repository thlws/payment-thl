package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表创建及更新接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:03:21
 */
public class KoubeiMarketingDataCustomreportSaveModel extends AlipayObject {

	private static final long serialVersionUID = 7119579915586731387L;

	/**
	 * 自定义报表规则条件信息
	 */
	@ApiField("report_condition_info")
	private CustomReportCondition reportConditionInfo;

    /**
     * Gets report condition info.
     *
     * @return the report condition info
     */
    public CustomReportCondition getReportConditionInfo() {
		return this.reportConditionInfo;
	}

    /**
     * Sets report condition info.
     *
     * @param reportConditionInfo the report condition info
     */
    public void setReportConditionInfo(CustomReportCondition reportConditionInfo) {
		this.reportConditionInfo = reportConditionInfo;
	}

}
