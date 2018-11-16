package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序结束灰度
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:13:32
 */
public class AlipayOpenMiniVersionGrayCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6811968542816261593L;

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
