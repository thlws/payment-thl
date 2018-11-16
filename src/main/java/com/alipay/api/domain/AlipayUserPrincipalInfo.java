package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户主体信息，包含用户支付宝userId、登录名等.
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:42:37
 */
public class AlipayUserPrincipalInfo extends AlipayObject {

	private static final long serialVersionUID = 1733289547577659929L;

	/**
	 * 用户电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 用户的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
		return this.email;
	}

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
		this.email = email;
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
