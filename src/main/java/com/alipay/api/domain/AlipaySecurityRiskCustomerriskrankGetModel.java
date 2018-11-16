package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝账户风险风险
 *
 * @author auto create
 * @since 1.0, 2018-07-20 18:40:55
 */
public class AlipaySecurityRiskCustomerriskrankGetModel extends AlipayObject {

	private static final long serialVersionUID = 8382426968774285888L;

	/**
	 * 证件号码，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 证件类型，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 手机号，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 支付宝账户id ，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets card no.
     *
     * @return the card no
     */
    public String getCardNo() {
		return this.cardNo;
	}

    /**
     * Sets card no.
     *
     * @param cardNo the card no
     */
    public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    /**
     * Gets card type.
     *
     * @return the card type
     */
    public String getCardType() {
		return this.cardType;
	}

    /**
     * Sets card type.
     *
     * @param cardType the card type
     */
    public void setCardType(String cardType) {
		this.cardType = cardType;
	}

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
