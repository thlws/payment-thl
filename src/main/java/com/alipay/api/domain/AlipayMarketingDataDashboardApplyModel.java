package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 仪表盘授权
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:26
 */
public class AlipayMarketingDataDashboardApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2583266926782695198L;

	/**
	 * 仪表盘ID列表
	 */
	@ApiListField("dashboard_ids")
	@ApiField("string")
	private List<String> dashboardIds;

    /**
     * Gets dashboard ids.
     *
     * @return the dashboard ids
     */
    public List<String> getDashboardIds() {
		return this.dashboardIds;
	}

    /**
     * Sets dashboard ids.
     *
     * @param dashboardIds the dashboard ids
     */
    public void setDashboardIds(List<String> dashboardIds) {
		this.dashboardIds = dashboardIds;
	}

}
