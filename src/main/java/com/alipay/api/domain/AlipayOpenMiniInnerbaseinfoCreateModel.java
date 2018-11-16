package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序创建接口
 *
 * @author auto create
 * @since 1.0, 2018-02-26 16:15:01
 */
public class AlipayOpenMiniInnerbaseinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4225345211471799155L;

	/**
	 * 小程序应用名称
	 */
	@ApiField("app_alias_name")
	private String appAliasName;

	/**
	 * 小程序应用描述，20-200个字
	 */
	@ApiField("app_desc")
	private String appDesc;

	/**
	 * 小程序logo图标，建议上传像素为180*180
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 小程序应用简介，一句话描述小程序功能
	 */
	@ApiField("app_slogan")
	private String appSlogan;

	/**
	 * 多端类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 小程序管理员虚拟 ID
	 */
	@ApiField("pid")
	private String pid;

    /**
     * Gets app alias name.
     *
     * @return the app alias name
     */
    public String getAppAliasName() {
		return this.appAliasName;
	}

    /**
     * Sets app alias name.
     *
     * @param appAliasName the app alias name
     */
    public void setAppAliasName(String appAliasName) {
		this.appAliasName = appAliasName;
	}

    /**
     * Gets app desc.
     *
     * @return the app desc
     */
    public String getAppDesc() {
		return this.appDesc;
	}

    /**
     * Sets app desc.
     *
     * @param appDesc the app desc
     */
    public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

    /**
     * Gets app logo.
     *
     * @return the app logo
     */
    public String getAppLogo() {
		return this.appLogo;
	}

    /**
     * Sets app logo.
     *
     * @param appLogo the app logo
     */
    public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

    /**
     * Gets app slogan.
     *
     * @return the app slogan
     */
    public String getAppSlogan() {
		return this.appSlogan;
	}

    /**
     * Sets app slogan.
     *
     * @param appSlogan the app slogan
     */
    public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}

    /**
     * Gets client type.
     *
     * @return the client type
     */
    public String getClientType() {
		return this.clientType;
	}

    /**
     * Sets client type.
     *
     * @param clientType the client type
     */
    public void setClientType(String clientType) {
		this.clientType = clientType;
	}

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

}
