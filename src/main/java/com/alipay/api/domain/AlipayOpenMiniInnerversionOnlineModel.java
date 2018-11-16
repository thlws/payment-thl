package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端小程序上架
 *
 * @author auto create
 * @since 1.0, 2018-02-26 16:13:58
 */
public class AlipayOpenMiniInnerversionOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 2255438379893841311L;

	/**
	 * 下架版本
	 */
	@ApiField("app_offline_version")
	private String appOfflineVersion;

	/**
	 * 上架版本
	 */
	@ApiField("app_online_version")
	private String appOnlineVersion;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

    /**
     * Gets app offline version.
     *
     * @return the app offline version
     */
    public String getAppOfflineVersion() {
		return this.appOfflineVersion;
	}

    /**
     * Sets app offline version.
     *
     * @param appOfflineVersion the app offline version
     */
    public void setAppOfflineVersion(String appOfflineVersion) {
		this.appOfflineVersion = appOfflineVersion;
	}

    /**
     * Gets app online version.
     *
     * @return the app online version
     */
    public String getAppOnlineVersion() {
		return this.appOnlineVersion;
	}

    /**
     * Sets app online version.
     *
     * @param appOnlineVersion the app online version
     */
    public void setAppOnlineVersion(String appOnlineVersion) {
		this.appOnlineVersion = appOnlineVersion;
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
