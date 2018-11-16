package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DashBoardMeta;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:32
 */
public class AlipayMarketingDataDashboardBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7822442299123447325L;

	/** 
	 * 仪表盘列表信息
	 */
	@ApiListField("dashboard_list")
	@ApiField("dash_board_meta")
	private List<DashBoardMeta> dashboardList;

	/** 
	 * 报表总页数
	 */
	@ApiField("total_page_count")
	private String totalPageCount;

    /**
     * Sets dashboard list.
     *
     * @param dashboardList the dashboard list
     */
    public void setDashboardList(List<DashBoardMeta> dashboardList) {
		this.dashboardList = dashboardList;
	}

    /**
     * Gets dashboard list.
     *
     * @return the dashboard list
     */
    public List<DashBoardMeta> getDashboardList( ) {
		return this.dashboardList;
	}

    /**
     * Sets total page count.
     *
     * @param totalPageCount the total page count
     */
    public void setTotalPageCount(String totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

    /**
     * Gets total page count.
     *
     * @return the total page count
     */
    public String getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
