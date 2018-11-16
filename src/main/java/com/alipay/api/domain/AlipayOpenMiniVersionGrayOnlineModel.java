package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序灰度上架
 *
 * @author auto create
 * @since 1.0, 2017-12-22 10:06:19
 */
public class AlipayOpenMiniVersionGrayOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 2847157694898424141L;

	/**
	 * 小程序版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 小程序灰度策略值，支持p10，p30，p50，其中p10代表10%的用户，p30代表30%的用户，p50代表50%的用户
	 */
	@ApiField("gray_strategy")
	private String grayStrategy;

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
     * Gets gray strategy.
     *
     * @return the gray strategy
     */
    public String getGrayStrategy() {
		return this.grayStrategy;
	}

    /**
     * Sets gray strategy.
     *
     * @param grayStrategy the gray strategy
     */
    public void setGrayStrategy(String grayStrategy) {
		this.grayStrategy = grayStrategy;
	}

}
