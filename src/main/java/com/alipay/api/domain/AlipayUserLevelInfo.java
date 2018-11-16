package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户等级信息，暂时包含用户等级和登陆账号
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AlipayUserLevelInfo extends AlipayObject {

	private static final long serialVersionUID = 2133817869397997971L;

	/**
	 * 支付宝用户登陆账号；邮箱优先，手机号次之
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户等级：可选5、4、3、2、1、0；等级5最高，1最低，0标示无法判断
	 */
	@ApiField("user_level")
	private String userLevel;

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

    /**
     * Gets user level.
     *
     * @return the user level
     */
    public String getUserLevel() {
		return this.userLevel;
	}

    /**
     * Sets user level.
     *
     * @param userLevel the user level
     */
    public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

}
