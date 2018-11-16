package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份核验服务结果确认接口
 *
 * @author auto create
 * @since 1.0, 2018-01-15 15:48:35
 */
public class AlipaySecurityRiskVerifyidentityConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1793747178286854347L;

	/**
	 * 接入业务方业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 附加业务信息，Json结构
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 身份核验场景CODE，商务谈判基础上，由支付宝来分配。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 核身校验token，是一次核身校验服务中唯一性的token
	 */
	@ApiField("verify_token")
	private String verifyToken;

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
     * Gets biz params.
     *
     * @return the biz params
     */
    public String getBizParams() {
		return this.bizParams;
	}

    /**
     * Sets biz params.
     *
     * @param bizParams the biz params
     */
    public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}

    /**
     * Gets scene code.
     *
     * @return the scene code
     */
    public String getSceneCode() {
		return this.sceneCode;
	}

    /**
     * Sets scene code.
     *
     * @param sceneCode the scene code
     */
    public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

    /**
     * Gets verify token.
     *
     * @return the verify token
     */
    public String getVerifyToken() {
		return this.verifyToken;
	}

    /**
     * Sets verify token.
     *
     * @param verifyToken the verify token
     */
    public void setVerifyToken(String verifyToken) {
		this.verifyToken = verifyToken;
	}

}
