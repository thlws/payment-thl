package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pai.partner.result.get response.
 *
 * @author auto create
 * @since 1.0, 2017-02-28 11:12:09
 */
public class AlipayPaiPartnerResultGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8775127743842764739L;

	/** 
	 * 路由协议内容,根据不同的协议数据不一样
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 为新浪用户申请的 authToken 访问商品码wap页面时需要使用
	 */
	@ApiField("oauth_token")
	private String oauthToken;

	/** 
	 * 码协议：MSPAY（快捷支付） WEBVIEW(内置浏览器打开wap) NATIVE(本地打开app) WEB(外置浏览器打开)
	 */
	@ApiField("route_method")
	private String routeMethod;

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
		this.data = data;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData( ) {
		return this.data;
	}

    /**
     * Sets oauth token.
     *
     * @param oauthToken the oauth token
     */
    public void setOauthToken(String oauthToken) {
		this.oauthToken = oauthToken;
	}

    /**
     * Gets oauth token.
     *
     * @return the oauth token
     */
    public String getOauthToken( ) {
		return this.oauthToken;
	}

    /**
     * Sets route method.
     *
     * @param routeMethod the route method
     */
    public void setRouteMethod(String routeMethod) {
		this.routeMethod = routeMethod;
	}

    /**
     * Gets route method.
     *
     * @return the route method
     */
    public String getRouteMethod( ) {
		return this.routeMethod;
	}

}
