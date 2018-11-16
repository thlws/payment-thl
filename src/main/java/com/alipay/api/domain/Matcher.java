package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号用户匹配器
 *
 * @author auto create
 * @since 1.0, 2017-06-01 11:25:22
 */
public class Matcher extends AlipayObject {

	private static final long serialVersionUID = 3899276828992881178L;

	/**
	 * 身份证号码，与user_id、mobile_no不能同时为空
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 手机号码，与user_id、identity_card不能同时为空
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝用户id，2088开头16位长度的字符串，与mobile_no、identity_card不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets identity card.
     *
     * @return the identity card
     */
    public String getIdentityCard() {
		return this.identityCard;
	}

    /**
     * Sets identity card.
     *
     * @param identityCard the identity card
     */
    public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

    /**
     * Gets mobile no.
     *
     * @return the mobile no
     */
    public String getMobileNo() {
		return this.mobileNo;
	}

    /**
     * Sets mobile no.
     *
     * @param mobileNo the mobile no
     */
    public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
