package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号用户关注情况高级查询接口
 *
 * @author auto create
 * @since 1.0, 2017-11-07 14:06:28
 */
public class AlipayOpenPublicMatchuserFollowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5114633655558132127L;

	/**
	 * 身份证号码
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 手机号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝用户id，2088开头的16位长度字符串
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
