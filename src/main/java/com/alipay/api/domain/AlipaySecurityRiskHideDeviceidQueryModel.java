package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备指纹查询接口
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:13
 */
public class AlipaySecurityRiskHideDeviceidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1451579452157969455L;

	/**
	 * 商户的sdk客户端key
	 */
	@ApiField("app_key_client")
	private String appKeyClient;

	/**
	 * 商户使用的设备指纹服务端key
	 */
	@ApiField("app_key_server")
	private String appKeyServer;

	/**
	 * 商户应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 设备指纹deviceid对应的token
	 */
	@ApiField("deviceid_token")
	private String deviceidToken;

    /**
     * Gets app key client.
     *
     * @return the app key client
     */
    public String getAppKeyClient() {
		return this.appKeyClient;
	}

    /**
     * Sets app key client.
     *
     * @param appKeyClient the app key client
     */
    public void setAppKeyClient(String appKeyClient) {
		this.appKeyClient = appKeyClient;
	}

    /**
     * Gets app key server.
     *
     * @return the app key server
     */
    public String getAppKeyServer() {
		return this.appKeyServer;
	}

    /**
     * Sets app key server.
     *
     * @param appKeyServer the app key server
     */
    public void setAppKeyServer(String appKeyServer) {
		this.appKeyServer = appKeyServer;
	}

    /**
     * Gets app name.
     *
     * @return the app name
     */
    public String getAppName() {
		return this.appName;
	}

    /**
     * Sets app name.
     *
     * @param appName the app name
     */
    public void setAppName(String appName) {
		this.appName = appName;
	}

    /**
     * Gets deviceid token.
     *
     * @return the deviceid token
     */
    public String getDeviceidToken() {
		return this.deviceidToken;
	}

    /**
     * Sets deviceid token.
     *
     * @param deviceidToken the deviceid token
     */
    public void setDeviceidToken(String deviceidToken) {
		this.deviceidToken = deviceidToken;
	}

}
