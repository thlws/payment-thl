package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用受理服务解约
 *
 * @author auto create
 * @since 1.0, 2018-09-11 17:00:20
 */
public class ZhimaCreditPeUserContractUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 8522836493422252489L;

	/**
	 * 芝麻信用场景，由芝麻信用侧分配，如：天猫信用购，淘宝租赁等
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets credit scene.
     *
     * @return the credit scene
     */
    public String getCreditScene() {
		return this.creditScene;
	}

    /**
     * Sets credit scene.
     *
     * @param creditScene the credit scene
     */
    public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
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
