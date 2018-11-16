package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.userinfo.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-13 17:15:00
 */
public class AlipayOverseasTaxUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5439951579914191486L;

	/** 
	 * 支付宝登录账号
	 */
	@ApiField("logon_id")
	private String logonId;

	/** 
	 * 用户Id:蚂蚁统一会员ID,唯一
	 */
	@ApiField("user_id")
	private String userId;

	/** 
	 * 用户姓名:用户真实名称
	 */
	@ApiField("user_name")
	private String userName;

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

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName( ) {
		return this.userName;
	}

}
