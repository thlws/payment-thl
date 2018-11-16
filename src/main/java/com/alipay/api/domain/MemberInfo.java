package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 群成员信息
 *
 * @author auto create
 * @since 1.0, 2017-08-18 16:18:09
 */
public class MemberInfo extends AlipayObject {

	private static final long serialVersionUID = 8411743266534845315L;

	/**
	 * 群成员性别，m表示男，f表示女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 群内昵称
	 */
	@ApiField("group_nick_name")
	private String groupNickName;

	/**
	 * 邀请人id
	 */
	@ApiField("inviter_uid")
	private String inviterUid;

	/**
	 * 群成员头像url
	 */
	@ApiField("member_img")
	private String memberImg;

	/**
	 * 用户昵称
	 */
	@ApiField("nick_name")
	private String nickName;

	/**
	 * 群成员用户id
	 */
	@ApiField("uid")
	private String uid;

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
		return this.gender;
	}

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
		this.gender = gender;
	}

    /**
     * Gets group nick name.
     *
     * @return the group nick name
     */
    public String getGroupNickName() {
		return this.groupNickName;
	}

    /**
     * Sets group nick name.
     *
     * @param groupNickName the group nick name
     */
    public void setGroupNickName(String groupNickName) {
		this.groupNickName = groupNickName;
	}

    /**
     * Gets inviter uid.
     *
     * @return the inviter uid
     */
    public String getInviterUid() {
		return this.inviterUid;
	}

    /**
     * Sets inviter uid.
     *
     * @param inviterUid the inviter uid
     */
    public void setInviterUid(String inviterUid) {
		this.inviterUid = inviterUid;
	}

    /**
     * Gets member img.
     *
     * @return the member img
     */
    public String getMemberImg() {
		return this.memberImg;
	}

    /**
     * Sets member img.
     *
     * @param memberImg the member img
     */
    public void setMemberImg(String memberImg) {
		this.memberImg = memberImg;
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
     * Gets uid.
     *
     * @return the uid
     */
    public String getUid() {
		return this.uid;
	}

    /**
     * Sets uid.
     *
     * @param uid the uid
     */
    public void setUid(String uid) {
		this.uid = uid;
	}

}
