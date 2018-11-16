package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶空间成员返回值模型
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:01:19
 */
public class FengdieSpaceMemberCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7887495433525742911L;

	/**
	 * 用户的昵称
	 */
	@ApiField("nick")
	private String nick;

	/**
	 * 云凤蝶业务空间成员所关联的第三方用户 ID
	 */
	@ApiField("origin_user_id")
	private String originUserId;

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

}
