package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlisisReportRow;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.alisis.report.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-03 09:41:08
 */
public class KoubeiMarketingDataAlisisReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5775339322984318861L;

	/** 
	 * 报表数据
	 */
	@ApiListField("report_data")
	@ApiField("alisis_report_row")
	private List<AlisisReportRow> reportData;

    /**
     * Sets report data.
     *
     * @param reportData the report data
     */
    public void setReportData(List<AlisisReportRow> reportData) {
		this.reportData = reportData;
	}

    /**
     * Gets report data.
     *
     * @return the report data
     */
    public List<AlisisReportRow> getReportData( ) {
		return this.reportData;
	}

}
