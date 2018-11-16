package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端小程序-真机预览接口
 *
 * @author auto create
 * @since 1.0, 2018-02-26 16:16:03
 */
public class AlipayOpenMiniInnerversionPreviewUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1173615741273235199L;

	/**
	 * 构建参数- JSAPI 权限文件, JSON 字符串
	 */
	@ApiField("build_js_permission")
	private String buildJsPermission;

	/**
	 * 构建参数-IDE 构建好的包地址
	 */
	@ApiField("build_pkg_url")
	private String buildPkgUrl;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

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
     * Gets build pkg url.
     *
     * @return the build pkg url
     */
    public String getBuildPkgUrl() {
		return this.buildPkgUrl;
	}

    /**
     * Sets build pkg url.
     *
     * @param buildPkgUrl the build pkg url
     */
    public void setBuildPkgUrl(String buildPkgUrl) {
		this.buildPkgUrl = buildPkgUrl;
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
