package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序体验版轮询接口
 *
 * @author auto create
 * @since 1.0, 2018-01-25 00:05:36
 */
public class AlipayOpenMiniExperienceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3274663636879826163L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

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

}
