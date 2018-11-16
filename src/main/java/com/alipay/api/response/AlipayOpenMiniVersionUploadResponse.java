package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.version.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-07-23 14:11:03
 */
public class AlipayOpenMiniVersionUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6538731164878285794L;

	/** 
	 * 构建的状态，0-构建排队中；1-正在构建；2-构建成功；3-构建失败；5-构建超时
	 */
	@ApiField("build_status")
	private String buildStatus;

	/** 
	 * 创建版本的状态，0-构建排队中；1-正在构建；2-构建成功；3-构建失败；5-构建超时；6-版本创建成功
	 */
	@ApiField("create_status")
	private String createStatus;

	/** 
	 * 是否需要轮询
	 */
	@ApiField("need_rotation")
	private String needRotation;

	/** 
	 * 是否创建了版本
	 */
	@ApiField("version_created")
	private String versionCreated;

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
     * Sets create status.
     *
     * @param createStatus the create status
     */
    public void setCreateStatus(String createStatus) {
		this.createStatus = createStatus;
	}

    /**
     * Gets create status.
     *
     * @return the create status
     */
    public String getCreateStatus( ) {
		return this.createStatus;
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
