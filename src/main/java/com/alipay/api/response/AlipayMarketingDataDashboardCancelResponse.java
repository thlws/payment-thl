package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.cancel response.
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:19
 */
public class AlipayMarketingDataDashboardCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6777316964335756594L;

	/** 
	 * 取消授权失败仪表盘列表
	 */
	@ApiListField("dashboard_fail_list")
	@ApiField("string")
	private List<String> dashboardFailList;

	/** 
	 * 取消仪表盘授权结果
	 */
	@ApiField("status")
	private Boolean status;

    /**
     * Sets dashboard fail list.
     *
     * @param dashboardFailList the dashboard fail list
     */
    public void setDashboardFailList(List<String> dashboardFailList) {
		this.dashboardFailList = dashboardFailList;
	}

    /**
     * Gets dashboard fail list.
     *
     * @return the dashboard fail list
     */
    public List<String> getDashboardFailList( ) {
		return this.dashboardFailList;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Boolean status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public Boolean getStatus( ) {
		return this.status;
	}

}
