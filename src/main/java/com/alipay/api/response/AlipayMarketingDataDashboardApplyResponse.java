package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:26
 */
public class AlipayMarketingDataDashboardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3415581395387953462L;

	/** 
	 * 授权失败列表
	 */
	@ApiListField("dashboard_fail_list")
	@ApiField("string")
	private List<String> dashboardFailList;

	/** 
	 * 授权状态
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
