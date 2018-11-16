package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.member.report.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-16 15:33:45
 */
public class KoubeiMarketingDataMemberReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8498966628172467859L;

	/** 
	 * 查询成功时返回json格式数据
	 */
	@ApiField("report_data")
	private String reportData;

    /**
     * Sets report data.
     *
     * @param reportData the report data
     */
    public void setReportData(String reportData) {
		this.reportData = reportData;
	}

    /**
     * Gets report data.
     *
     * @return the report data
     */
    public String getReportData( ) {
		return this.reportData;
	}

}
