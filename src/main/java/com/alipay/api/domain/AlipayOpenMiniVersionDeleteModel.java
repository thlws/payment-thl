package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序删除版本
 *
 * @author auto create
 * @since 1.0, 2018-07-23 19:30:42
 */
public class AlipayOpenMiniVersionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7285745538636931828L;

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
