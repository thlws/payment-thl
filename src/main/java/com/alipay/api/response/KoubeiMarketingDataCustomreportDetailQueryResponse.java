package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CustomReportCondition;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:13
 */
public class KoubeiMarketingDataCustomreportDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7317562271828212622L;

	/** 
	 * 自定义报表规则条件的详细信息
	 */
	@ApiField("report_condition_info")
	private CustomReportCondition reportConditionInfo;

    /**
     * Sets report condition info.
     *
     * @param reportConditionInfo the report condition info
     */
    public void setReportConditionInfo(CustomReportCondition reportConditionInfo) {
		this.reportConditionInfo = reportConditionInfo;
	}

    /**
     * Gets report condition info.
     *
     * @return the report condition info
     */
    public CustomReportCondition getReportConditionInfo( ) {
		return this.reportConditionInfo;
	}

}
