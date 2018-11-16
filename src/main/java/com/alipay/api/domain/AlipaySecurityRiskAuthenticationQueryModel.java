package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份认证业务查询接口
 *
 * @author auto create
 * @since 1.0, 2017-11-27 13:53:25
 */
public class AlipaySecurityRiskAuthenticationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4887437726614921794L;

	/**
	 * 身份安全业务场景信息
	 */
	@ApiField("authentication_scene")
	private AuthenticationScene authenticationScene;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 身份安全业务初始化后生成的token
	 */
	@ApiField("token_id")
	private String tokenId;

    /**
     * Gets authentication scene.
     *
     * @return the authentication scene
     */
    public AuthenticationScene getAuthenticationScene() {
		return this.authenticationScene;
	}

    /**
     * Sets authentication scene.
     *
     * @param authenticationScene the authentication scene
     */
    public void setAuthenticationScene(AuthenticationScene authenticationScene) {
		this.authenticationScene = authenticationScene;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
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
     * Gets token id.
     *
     * @return the token id
     */
    public String getTokenId() {
		return this.tokenId;
	}

    /**
     * Sets token id.
     *
     * @param tokenId the token id
     */
    public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

}
