package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶空间成员
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:16:09
 */
public class AlipayMarketingToolFengdieMemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6598293759468724656L;

	/**
	 * 用户的昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 空间管理员，可由 vip 账户代替，值为vip账号或该空间管理员的 origin_user_id
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲创建的空间成员所关联的第三方用户ID，由调用方保持其唯一性
	 */
	@ApiField("origin_user_id")
	private String originUserId;

	/**
	 * 欲创建成员的空间ID
	 */
	@ApiField("space_id")
	private String spaceId;

    /**
     * Gets nick.
     *
     * @return the nick
     */
    public String getNick() {
		return this.nick;
	}

    /**
     * Sets nick.
     *
     * @param nick the nick
     */
    public void setNick(String nick) {
		this.nick = nick;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets origin user id.
     *
     * @return the origin user id
     */
    public String getOriginUserId() {
		return this.originUserId;
	}

    /**
     * Sets origin user id.
     *
     * @param originUserId the origin user id
     */
    public void setOriginUserId(String originUserId) {
		this.originUserId = originUserId;
	}

    /**
     * Gets space id.
     *
     * @return the space id
     */
    public String getSpaceId() {
		return this.spaceId;
	}

    /**
     * Sets space id.
     *
     * @param spaceId the space id
     */
    public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
