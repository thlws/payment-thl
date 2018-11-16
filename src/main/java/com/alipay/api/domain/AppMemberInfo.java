package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序成员模型
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:25:09
 */
public class AppMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 3285679317597962642L;

	/**
	 * 邀请时间
	 */
	@ApiField("gmt_invite")
	private String gmtInvite;

	/**
	 * 加入时间
	 */
	@ApiField("gmt_join")
	private String gmtJoin;

	/**
	 * 支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 头像地址
	 */
	@ApiField("portrait")
	private String portrait;

	/**
	 * 角色类型
	 */
	@ApiField("role")
	private String role;

	/**
	 * 成员的状态，VALID-有效，UNCONFIRMED-未确认，TIMEOUT-已经失效，REFUSED-用户拒绝
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets gmt invite.
     *
     * @return the gmt invite
     */
    public String getGmtInvite() {
		return this.gmtInvite;
	}

    /**
     * Sets gmt invite.
     *
     * @param gmtInvite the gmt invite
     */
    public void setGmtInvite(String gmtInvite) {
		this.gmtInvite = gmtInvite;
	}

    /**
     * Gets gmt join.
     *
     * @return the gmt join
     */
    public String getGmtJoin() {
		return this.gmtJoin;
	}

    /**
     * Sets gmt join.
     *
     * @param gmtJoin the gmt join
     */
    public void setGmtJoin(String gmtJoin) {
		this.gmtJoin = gmtJoin;
	}

    /**
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId() {
		return this.logonId;
	}

    /**
     * Sets logon id.
     *
     * @param logonId the logon id
     */
    public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

    /**
     * Gets nick name.
     *
     * @return the nick name
     */
    public String getNickName() {
		return this.nickName;
	}

    /**
     * Sets nick name.
     *
     * @param nickName the nick name
     */
    public void setNickName(String nickName) {
		this.nickName = nickName;
	}

    /**
     * Gets portrait.
     *
     * @return the portrait
     */
    public String getPortrait() {
		return this.portrait;
	}

    /**
     * Sets portrait.
     *
     * @param portrait the portrait
     */
    public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
		return this.role;
	}

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
		this.role = role;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
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
