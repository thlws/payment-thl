package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建构建任务
 *
 * @author auto create
 * @since 1.0, 2018-07-23 20:37:32
 */
public class AlipayOpenMiniInnerversionUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8211159862173593111L;

	/**
	 * IDE开发打包类型
	 */
	@ApiField("build_app_type")
	private String buildAppType;

	/**
	 * 扩展信息
	 */
	@ApiField("build_extra_info")
	private String buildExtraInfo;

	/**
	 * js api 权限文件
	 */
	@ApiField("build_js_permission")
	private String buildJsPermission;

	/**
	 * 主入口
	 */
	@ApiField("build_main_url")
	private String buildMainUrl;

	/**
	 * 源码包MD5
	 */
	@ApiField("build_package_md_5")
	private String buildPackageMd5;

	/**
	 * 包名称
	 */
	@ApiField("build_package_name")
	private String buildPackageName;

	/**
	 * 小程序源码包
	 */
	@ApiField("build_package_stream")
	private String buildPackageStream;

	/**
	 * 打包平台扩展信息
	 */
	@ApiField("build_qcloud_info")
	private String buildQcloudInfo;

	/**
	 * 源码包地址
	 */
	@ApiField("build_source_pkg_url")
	private String buildSourcePkgUrl;

	/**
	 * 子入口
	 */
	@ApiField("build_sub_url")
	private String buildSubUrl;

	/**
	 * 小程序版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/**
	 * 多端类型
	 */
	@ApiField("client_type")
	private String clientType;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

    /**
     * Gets build app type.
     *
     * @return the build app type
     */
    public String getBuildAppType() {
		return this.buildAppType;
	}

    /**
     * Sets build app type.
     *
     * @param buildAppType the build app type
     */
    public void setBuildAppType(String buildAppType) {
		this.buildAppType = buildAppType;
	}

    /**
     * Gets build extra info.
     *
     * @return the build extra info
     */
    public String getBuildExtraInfo() {
		return this.buildExtraInfo;
	}

    /**
     * Sets build extra info.
     *
     * @param buildExtraInfo the build extra info
     */
    public void setBuildExtraInfo(String buildExtraInfo) {
		this.buildExtraInfo = buildExtraInfo;
	}

    /**
     * Gets build js permission.
     *
     * @return the build js permission
     */
    public String getBuildJsPermission() {
		return this.buildJsPermission;
	}

    /**
     * Sets build js permission.
     *
     * @param buildJsPermission the build js permission
     */
    public void setBuildJsPermission(String buildJsPermission) {
		this.buildJsPermission = buildJsPermission;
	}

    /**
     * Gets build main url.
     *
     * @return the build main url
     */
    public String getBuildMainUrl() {
		return this.buildMainUrl;
	}

    /**
     * Sets build main url.
     *
     * @param buildMainUrl the build main url
     */
    public void setBuildMainUrl(String buildMainUrl) {
		this.buildMainUrl = buildMainUrl;
	}

    /**
     * Gets build package md 5.
     *
     * @return the build package md 5
     */
    public String getBuildPackageMd5() {
		return this.buildPackageMd5;
	}

    /**
     * Sets build package md 5.
     *
     * @param buildPackageMd5 the build package md 5
     */
    public void setBuildPackageMd5(String buildPackageMd5) {
		this.buildPackageMd5 = buildPackageMd5;
	}

    /**
     * Gets build package name.
     *
     * @return the build package name
     */
    public String getBuildPackageName() {
		return this.buildPackageName;
	}

    /**
     * Sets build package name.
     *
     * @param buildPackageName the build package name
     */
    public void setBuildPackageName(String buildPackageName) {
		this.buildPackageName = buildPackageName;
	}

    /**
     * Gets build package stream.
     *
     * @return the build package stream
     */
    public String getBuildPackageStream() {
		return this.buildPackageStream;
	}

    /**
     * Sets build package stream.
     *
     * @param buildPackageStream the build package stream
     */
    public void setBuildPackageStream(String buildPackageStream) {
		this.buildPackageStream = buildPackageStream;
	}

    /**
     * Gets build qcloud info.
     *
     * @return the build qcloud info
     */
    public String getBuildQcloudInfo() {
		return this.buildQcloudInfo;
	}

    /**
     * Sets build qcloud info.
     *
     * @param buildQcloudInfo the build qcloud info
     */
    public void setBuildQcloudInfo(String buildQcloudInfo) {
		this.buildQcloudInfo = buildQcloudInfo;
	}

    /**
     * Gets build source pkg url.
     *
     * @return the build source pkg url
     */
    public String getBuildSourcePkgUrl() {
		return this.buildSourcePkgUrl;
	}

    /**
     * Sets build source pkg url.
     *
     * @param buildSourcePkgUrl the build source pkg url
     */
    public void setBuildSourcePkgUrl(String buildSourcePkgUrl) {
		this.buildSourcePkgUrl = buildSourcePkgUrl;
	}

    /**
     * Gets build sub url.
     *
     * @return the build sub url
     */
    public String getBuildSubUrl() {
		return this.buildSubUrl;
	}

    /**
     * Sets build sub url.
     *
     * @param buildSubUrl the build sub url
     */
    public void setBuildSubUrl(String buildSubUrl) {
		this.buildSubUrl = buildSubUrl;
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
