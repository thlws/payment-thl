package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询某个ISV下的指定app_auth_token的授权信息：授权者、授权接口列表、状态、过期时间等
 *
 * @author auto create
 * @since 1.0, 2016-07-18 13:35:47
 */
public class AlipayOpenAuthTokenAppQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3327522462327521724L;

	/**
	 * 应用授权令牌
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

    /**
     * Gets app auth token.
     *
     * @return the app auth token
     */
    public String getAppAuthToken() {
		return this.appAuthToken;
	}

    /**
     * Sets app auth token.
     *
     * @param appAuthToken the app auth token
     */
    public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}

}
