package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭成员信息
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:50:54
 */
public class UserDetails extends AlipayObject {

	private static final long serialVersionUID = 4329549453212152962L;

	/**
	 * 用户变更手机号，替换旧的手机号
	 */
	@ApiField("user_change_mobile")
	private String userChangeMobile;

	/**
	 * 孩子家长的手机号
	 */
	@ApiField("user_mobile")
	private String userMobile;

	/**
	 * 张三
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 孩子与家长的关系： 1、爸爸  2、妈妈  3、爷爷  4、奶奶  5、外公  6、外婆  7、家长
	 */
	@ApiField("user_relation")
	private String userRelation;

    /**
     * Gets user change mobile.
     *
     * @return the user change mobile
     */
    public String getUserChangeMobile() {
		return this.userChangeMobile;
	}

    /**
     * Sets user change mobile.
     *
     * @param userChangeMobile the user change mobile
     */
    public void setUserChangeMobile(String userChangeMobile) {
		this.userChangeMobile = userChangeMobile;
	}

    /**
     * Gets user mobile.
     *
     * @return the user mobile
     */
    public String getUserMobile() {
		return this.userMobile;
	}

    /**
     * Sets user mobile.
     *
     * @param userMobile the user mobile
     */
    public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return this.userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets user relation.
     *
     * @return the user relation
     */
    public String getUserRelation() {
		return this.userRelation;
	}

    /**
     * Sets user relation.
     *
     * @param userRelation the user relation
     */
    public void setUserRelation(String userRelation) {
		this.userRelation = userRelation;
	}

}
