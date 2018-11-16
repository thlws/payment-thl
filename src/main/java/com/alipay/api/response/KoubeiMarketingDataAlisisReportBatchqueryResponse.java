package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlisisReport;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.alisis.report.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-05-03 09:40:58
 */
public class KoubeiMarketingDataAlisisReportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3398678747299298977L;

	/** 
	 * 报表列表信息
	 */
	@ApiListField("report_list")
	@ApiField("alisis_report")
	private List<AlisisReport> reportList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

    /**
     * Sets report list.
     *
     * @param reportList the report list
     */
    public void setReportList(List<AlisisReport> reportList) {
		this.reportList = reportList;
	}

    /**
     * Gets report list.
     *
     * @return the report list
     */
    public List<AlisisReport> getReportList( ) {
		return this.reportList;
	}

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public String getTotalCount( ) {
		return this.totalCount;
	}

}
