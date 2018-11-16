package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集卡信息
 *
 * @author auto create
 * @since 1.0, 2016-11-24 22:26:22
 */
public class CardInfo extends AlipayObject {

	private static final long serialVersionUID = 4823347173883251468L;

	/**
	 * 领取时间
	 */
	@ApiField("taken_time")
	private String takenTime;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

    /**
     * Gets taken time.
     *
     * @return the taken time
     */
    public String getTakenTime() {
		return this.takenTime;
	}

    /**
     * Sets taken time.
     *
     * @param takenTime the taken time
     */
    public void setTakenTime(String takenTime) {
		this.takenTime = takenTime;
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

}
