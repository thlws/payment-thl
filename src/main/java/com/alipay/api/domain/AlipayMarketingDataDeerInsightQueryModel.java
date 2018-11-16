package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取 H5 活动洞察信息
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:18:21
 */
public class AlipayMarketingDataDeerInsightQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6348398144474775689L;

	/**
	 * 洞察名称，只能是数字、英文字母、横线或下划线
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 应用唯一标识
	 */
	@ApiField("app")
	private String app;

	/**
	 * 权限类型
	 */
	@ApiField("auth")
	private String auth;

	/**
	 * 如果未查询到洞察，是否强制新建一个返回
	 */
	@ApiField("force")
	private Boolean force;

	/**
	 * 是否强制更新该洞察为最新版洞察
	 */
	@ApiField("force_update")
	private Boolean forceUpdate;

	/**
	 * 业务空间唯一标识
	 */
	@ApiField("group_domain")
	private String groupDomain;

	/**
	 * 洞察唯一标识
	 */
	@ApiField("insight_domain")
	private String insightDomain;

	/**
	 * 业务指定的额外参数
	 */
	@ApiField("params")
	private String params;

	/**
	 * 调用服务的业务系统
	 */
	@ApiField("system")
	private String system;

    /**
     * Gets alias.
     *
     * @return the alias
     */
    public String getAlias() {
		return this.alias;
	}

    /**
     * Sets alias.
     *
     * @param alias the alias
     */
    public void setAlias(String alias) {
		this.alias = alias;
	}

    /**
     * Gets app.
     *
     * @return the app
     */
    public String getApp() {
		return this.app;
	}

    /**
     * Sets app.
     *
     * @param app the app
     */
    public void setApp(String app) {
		this.app = app;
	}

    /**
     * Gets auth.
     *
     * @return the auth
     */
    public String getAuth() {
		return this.auth;
	}

    /**
     * Sets auth.
     *
     * @param auth the auth
     */
    public void setAuth(String auth) {
		this.auth = auth;
	}

    /**
     * Gets force.
     *
     * @return the force
     */
    public Boolean getForce() {
		return this.force;
	}

    /**
     * Sets force.
     *
     * @param force the force
     */
    public void setForce(Boolean force) {
		this.force = force;
	}

    /**
     * Gets force update.
     *
     * @return the force update
     */
    public Boolean getForceUpdate() {
		return this.forceUpdate;
	}

    /**
     * Sets force update.
     *
     * @param forceUpdate the force update
     */
    public void setForceUpdate(Boolean forceUpdate) {
		this.forceUpdate = forceUpdate;
	}

    /**
     * Gets group domain.
     *
     * @return the group domain
     */
    public String getGroupDomain() {
		return this.groupDomain;
	}

    /**
     * Sets group domain.
     *
     * @param groupDomain the group domain
     */
    public void setGroupDomain(String groupDomain) {
		this.groupDomain = groupDomain;
	}

    /**
     * Gets insight domain.
     *
     * @return the insight domain
     */
    public String getInsightDomain() {
		return this.insightDomain;
	}

    /**
     * Sets insight domain.
     *
     * @param insightDomain the insight domain
     */
    public void setInsightDomain(String insightDomain) {
		this.insightDomain = insightDomain;
	}

    /**
     * Gets params.
     *
     * @return the params
     */
    public String getParams() {
		return this.params;
	}

    /**
     * Sets params.
     *
     * @param params the params
     */
    public void setParams(String params) {
		this.params = params;
	}

    /**
     * Gets system.
     *
     * @return the system
     */
    public String getSystem() {
		return this.system;
	}

    /**
     * Sets system.
     *
     * @param system the system
     */
    public void setSystem(String system) {
		this.system = system;
	}

}
