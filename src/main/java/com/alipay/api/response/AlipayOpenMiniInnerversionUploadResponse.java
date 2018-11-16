package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-07-23 20:37:32
 */
public class AlipayOpenMiniInnerversionUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1745755445314149419L;

	/** 
	 * 构建信息
	 */
	@ApiField("build_info")
	private String buildInfo;

	/** 
	 * 包地址
	 */
	@ApiField("build_package_url")
	private String buildPackageUrl;

	/** 
	 * 构建状态
	 */
	@ApiField("build_status")
	private String buildStatus;

	/** 
	 * 构建版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/** 
	 * 是否需要轮询
	 */
	@ApiField("need_rotation")
	private String needRotation;

	/** 
	 * 包管理包ID
	 */
	@ApiField("package_id")
	private String packageId;

	/** 
	 * 版本创建结果
	 */
	@ApiField("version_created")
	private String versionCreated;

    /**
     * Sets build info.
     *
     * @param buildInfo the build info
     */
    public void setBuildInfo(String buildInfo) {
		this.buildInfo = buildInfo;
	}

    /**
     * Gets build info.
     *
     * @return the build info
     */
    public String getBuildInfo( ) {
		return this.buildInfo;
	}

    /**
     * Sets build package url.
     *
     * @param buildPackageUrl the build package url
     */
    public void setBuildPackageUrl(String buildPackageUrl) {
		this.buildPackageUrl = buildPackageUrl;
	}

    /**
     * Gets build package url.
     *
     * @return the build package url
     */
    public String getBuildPackageUrl( ) {
		return this.buildPackageUrl;
	}

    /**
     * Sets build status.
     *
     * @param buildStatus the build status
     */
    public void setBuildStatus(String buildStatus) {
		this.buildStatus = buildStatus;
	}

    /**
     * Gets build status.
     *
     * @return the build status
     */
    public String getBuildStatus( ) {
		return this.buildStatus;
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
     * Gets build version.
     *
     * @return the build version
     */
    public String getBuildVersion( ) {
		return this.buildVersion;
	}

    /**
     * Sets need rotation.
     *
     * @param needRotation the need rotation
     */
    public void setNeedRotation(String needRotation) {
		this.needRotation = needRotation;
	}

    /**
     * Gets need rotation.
     *
     * @return the need rotation
     */
    public String getNeedRotation( ) {
		return this.needRotation;
	}

    /**
     * Sets package id.
     *
     * @param packageId the package id
     */
    public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

    /**
     * Gets package id.
     *
     * @return the package id
     */
    public String getPackageId( ) {
		return this.packageId;
	}

    /**
     * Sets version created.
     *
     * @param versionCreated the version created
     */
    public void setVersionCreated(String versionCreated) {
		this.versionCreated = versionCreated;
	}

    /**
     * Gets version created.
     *
     * @return the version created
     */
    public String getVersionCreated( ) {
		return this.versionCreated;
	}

}
