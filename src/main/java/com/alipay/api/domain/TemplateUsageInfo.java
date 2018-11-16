package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板使用信息
 *
 * @author auto create
 * @since 1.0, 2018-02-08 19:33:59
 */
public class TemplateUsageInfo extends AlipayObject {

	private static final long serialVersionUID = 8376251627895177584L;

	/**
	 * 商家小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 商家小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

    /**
     * Gets app version.
     *
     * @return the app version
     */
    public String getAppVersion() {
		return this.appVersion;
	}

    /**
     * Sets app version.
     *
     * @param appVersion the app version
     */
    public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
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
