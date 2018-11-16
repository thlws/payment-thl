package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询构建状态
 *
 * @author auto create
 * @since 1.0, 2018-07-23 20:38:16
 */
public class AlipayOpenMiniInnerversionUploadstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6682955233366138138L;

	/**
	 * 包管理ID，用于查询打包状态
	 */
	@ApiField("build_package_id")
	private String buildPackageId;

	/**
	 * 小程序版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

    /**
     * Gets build package id.
     *
     * @return the build package id
     */
    public String getBuildPackageId() {
		return this.buildPackageId;
	}

    /**
     * Sets build package id.
     *
     * @param buildPackageId the build package id
     */
    public void setBuildPackageId(String buildPackageId) {
		this.buildPackageId = buildPackageId;
	}

    /**
     * Gets build version.
     *
     * @return the build version
     */
    public String getBuildVersion() {
		return this.buildVersion;
	}

    /**
     * Sets build version.
     *
     * @param buildVersion the build version
     */
    public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

    /**
     * Gets mini app id.
     *
     * @return the mini app id
     */
    public String getMiniAppId() {
		return this.miniAppId;
	}

    /**
     * Sets mini app id.
     *
     * @param miniAppId the mini app id
     */
    public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
