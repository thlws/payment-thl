package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户风险评级客户绑定手机活跃度服务
 *
 * @author auto create
 * @since 1.0, 2016-06-15 13:55:46
 */
public class AlipaySecurityRiskMobileactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6779767856211899612L;

	/**
	 * 账户绑定手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 场景名称
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
		return this.mobile;
	}

    /**
     * Sets mobile.
     *
     * @param mobile the mobile
     */
    public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    /**
     * Gets scene id.
     *
     * @return the scene id
     */
    public String getSceneId() {
		return this.sceneId;
	}

    /**
     * Sets scene id.
     *
     * @param sceneId the scene id
     */
    public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
