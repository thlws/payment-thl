package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务窗联系人关注者模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ContactFollower extends AlipayObject {

	private static final long serialVersionUID = 7739149185756886485L;

	/**
	 * 支付宝头像
	 */
	@ApiField("avatar")
	private String avatar;

	/**
	 * 默认头像
	 */
	@ApiField("default_avatar")
	private String defaultAvatar;

	/**
	 * false
	 */
	@ApiField("each_record_flag")
	private String eachRecordFlag;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets avatar.
     *
     * @return the avatar
     */
    public String getAvatar() {
		return this.avatar;
	}

    /**
     * Sets avatar.
     *
     * @param avatar the avatar
     */
    public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

    /**
     * Gets default avatar.
     *
     * @return the default avatar
     */
    public String getDefaultAvatar() {
		return this.defaultAvatar;
	}

    /**
     * Sets default avatar.
     *
     * @param defaultAvatar the default avatar
     */
    public void setDefaultAvatar(String defaultAvatar) {
		this.defaultAvatar = defaultAvatar;
	}

    /**
     * Gets each record flag.
     *
     * @return the each record flag
     */
    public String getEachRecordFlag() {
		return this.eachRecordFlag;
	}

    /**
     * Sets each record flag.
     *
     * @param eachRecordFlag the each record flag
     */
    public void setEachRecordFlag(String eachRecordFlag) {
		this.eachRecordFlag = eachRecordFlag;
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
