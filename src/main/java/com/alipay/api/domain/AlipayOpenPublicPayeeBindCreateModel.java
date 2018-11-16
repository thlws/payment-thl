package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加收款账号接口
 *
 * @author auto create
 * @since 1.0, 2018-04-28 15:56:55
 */
public class AlipayOpenPublicPayeeBindCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3561396694642129785L;

	/**
	 * 收款账号，需要绑定的收款支付宝账号，跟pid不要同时传
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 支付宝用户id，2088开头的16位长度字符串，跟login_id不要同时传
	 */
	@ApiField("pid")
	private String pid;

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
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid() {
		return this.pid;
	}

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

}
