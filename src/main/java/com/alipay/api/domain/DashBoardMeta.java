package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仪表盘详细信息
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:32
 */
public class DashBoardMeta extends AlipayObject {

	private static final long serialVersionUID = 3489468645656156658L;

	/**
	 * 授权状态，值为true或者false
	 */
	@ApiField("auth_status")
	private Boolean authStatus;

	/**
	 * 仪表盘创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 仪表盘ID
	 */
	@ApiField("dashboard_id")
	private String dashboardId;

	/**
	 * 仪表盘名称
	 */
	@ApiField("dashboard_name")
	private String dashboardName;

    /**
     * Gets auth status.
     *
     * @return the auth status
     */
    public Boolean getAuthStatus() {
		return this.authStatus;
	}

    /**
     * Sets auth status.
     *
     * @param authStatus the auth status
     */
    public void setAuthStatus(Boolean authStatus) {
		this.authStatus = authStatus;
	}

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public String getCreateTime() {
		return this.createTime;
	}

    /**
     * Sets create time.
     *
     * @param createTime the create time
     */
    public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

    /**
     * Gets dashboard id.
     *
     * @return the dashboard id
     */
    public String getDashboardId() {
		return this.dashboardId;
	}

    /**
     * Sets dashboard id.
     *
     * @param dashboardId the dashboard id
     */
    public void setDashboardId(String dashboardId) {
		this.dashboardId = dashboardId;
	}

    /**
     * Gets dashboard name.
     *
     * @return the dashboard name
     */
    public String getDashboardName() {
		return this.dashboardName;
	}

    /**
     * Sets dashboard name.
     *
     * @param dashboardName the dashboard name
     */
    public void setDashboardName(String dashboardName) {
		this.dashboardName = dashboardName;
	}

}
