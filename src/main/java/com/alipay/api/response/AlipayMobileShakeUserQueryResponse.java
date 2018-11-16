package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.shake.user.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-03 16:35:37
 */
public class AlipayMobileShakeUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3182585694424273853L;

	/** 
	 * 对应的业务信息
	 */
	@ApiField("bizdata")
	private String bizdata;

	/** 
	 * 支付宝用户登录账户，可能是email或者手机号码
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * 对应的核销数据
	 */
	@ApiField("pass_id")
	private String passId;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets bizdata.
     *
     * @param bizdata the bizdata
     */
    public void setBizdata(String bizdata) {
		this.bizdata = bizdata;
	}

    /**
     * Gets bizdata.
     *
     * @return the bizdata
     */
    public String getBizdata( ) {
		return this.bizdata;
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
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId( ) {
		return this.logonId;
	}

    /**
     * Sets pass id.
     *
     * @param passId the pass id
     */
    public void setPassId(String passId) {
		this.passId = passId;
	}

    /**
     * Gets pass id.
     *
     * @return the pass id
     */
    public String getPassId( ) {
		return this.passId;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
