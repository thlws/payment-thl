package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReportDataItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:03:45
 */
public class KoubeiMarketingDataCustomreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3749118394219315377L;

	/** 
	 * 数据量
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 满足自定义报表规则的报表数据
	 */
	@ApiListField("report_data")
	@ApiField("report_data_item")
	private List<ReportDataItem> reportData;

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(String count) {
		this.count = count;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public String getCount( ) {
		return this.count;
	}

    /**
     * Sets report data.
     *
     * @param reportData the report data
     */
    public void setReportData(List<ReportDataItem> reportData) {
		this.reportData = reportData;
	}

    /**
     * Gets report data.
     *
     * @return the report data
     */
    public List<ReportDataItem> getReportData( ) {
		return this.reportData;
	}

}
