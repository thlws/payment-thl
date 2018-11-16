package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份认证业务初始化接口
 *
 * @author auto create
 * @since 1.0, 2017-11-28 15:46:58
 */
public class AlipaySecurityRiskAuthenticationInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6783988341978817537L;

	/**
	 * 用于身份安全业务初始化的公共入参
	 */
	@ApiField("authentication_info")
	private AuthenticationInfo authenticationInfo;

	/**
	 * 用于身份安全业务初始化的业务入参
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 环境信息，包含设备信息、APP版本等
	 */
	@ApiField("env_info")
	private String envInfo;

    /**
     * Gets authentication info.
     *
     * @return the authentication info
     */
    public AuthenticationInfo getAuthenticationInfo() {
		return this.authenticationInfo;
	}

    /**
     * Sets authentication info.
     *
     * @param authenticationInfo the authentication info
     */
    public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
		this.authenticationInfo = authenticationInfo;
	}

    /**
     * Gets biz info.
     *
     * @return the biz info
     */
    public String getBizInfo() {
		return this.bizInfo;
	}

    /**
     * Sets biz info.
     *
     * @param bizInfo the biz info
     */
    public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

    /**
     * Gets env info.
     *
     * @return the env info
     */
    public String getEnvInfo() {
		return this.envInfo;
	}

    /**
     * Sets env info.
     *
     * @param envInfo the env info
     */
    public void setEnvInfo(String envInfo) {
		this.envInfo = envInfo;
	}

}
