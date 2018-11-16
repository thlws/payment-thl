package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CustomReportCondition;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:05
 */
public class KoubeiMarketingDataCustomreportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2819131423842642189L;

	/** 
	 * 分页输出自定义开放数据规则列表
	 */
	@ApiListField("report_condition_list")
	@ApiField("custom_report_condition")
	private List<CustomReportCondition> reportConditionList;

    /**
     * Sets report condition list.
     *
     * @param reportConditionList the report condition list
     */
    public void setReportConditionList(List<CustomReportCondition> reportConditionList) {
		this.reportConditionList = reportConditionList;
	}

    /**
     * Gets report condition list.
     *
     * @return the report condition list
     */
    public List<CustomReportCondition> getReportConditionList( ) {
		return this.reportConditionList;
	}

}
