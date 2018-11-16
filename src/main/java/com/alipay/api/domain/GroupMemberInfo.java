package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群成员基本信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class GroupMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 3591893696443248157L;

	/**
	 * 用户在这个群里的昵称
	 */
	@ApiField("group_nickname")
	private String groupNickname;

	/**
	 * 个人昵称
	 */
	@ApiField("nickname")
	private String nickname;

	/**
	 * 用户的uid
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets group nickname.
     *
     * @return the group nickname
     */
    public String getGroupNickname() {
		return this.groupNickname;
	}

    /**
     * Sets group nickname.
     *
     * @param groupNickname the group nickname
     */
    public void setGroupNickname(String groupNickname) {
		this.groupNickname = groupNickname;
	}

    /**
     * Gets nickname.
     *
     * @return the nickname
     */
    public String getNickname() {
		return this.nickname;
	}

    /**
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
		this.nickname = nickname;
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
