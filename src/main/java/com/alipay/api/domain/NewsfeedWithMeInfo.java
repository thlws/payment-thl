package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 和谁在一起
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class NewsfeedWithMeInfo extends AlipayObject {

	private static final long serialVersionUID = 1522324169838649778L;

	/**
	 * 登录ID
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets login id.
     *
     * @return the login id
     */
    public String getLoginId() {
		return this.loginId;
	}

    /**
     * Sets login id.
     *
     * @param loginId the login id
     */
    public void setLoginId(String loginId) {
		this.loginId = loginId;
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
