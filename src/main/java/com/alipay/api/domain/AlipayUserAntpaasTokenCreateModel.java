package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁通行证注册
 *
 * @author auto create
 * @since 1.0, 2016-12-06 11:57:17
 */
public class AlipayUserAntpaasTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4467874387961247748L;

	/**
	 * 账户绑定手机号
	 */
	@ApiField("bind_mobile")
	private String bindMobile;

	/**
	 * 当前用户国家/地区，两位国家代码 国家代码以ISO 3166-1 标准为准
	 */
	@ApiField("country")
	private String country;

	/**
	 * 蚂蚁通行证登录密码，原始密码使用RSA加密后传输,示例：a11111:JuZeA/DR9NJU8aJPONdq9ZMbXI2zNHyoq3MwOxmjjY17ItpsbyuaPrfKsOzVBX9IFKyfr1Whrhlbl4WbYu9q2Xai6mWCNTKbYwvCDuY+pjel6dkka+/kK5ZwWjsN2W6eWAf5TNdy2pqheI08ZMvv1gD6t5zIQBbLGh/rv19NTd2gMwSTO++5Onek9saJi8iG+W32AOPPBWcaMv6yNJJCyA0QloBY5qFQdTOoW8DAg3dyfmFEDWNrdUxBZdL5+ZUS7HdK4i+k+vATH7tX0isEA8F40wSNzrrgTX8Dq+NcGzrAlGpSAqxgUDcxog2hrhDXBl4puYfLHskHBNKhwv0BIw==
	 */
	@ApiField("login_password")
	private String loginPassword;

	/**
	 * 蚂蚁通行证注册登录号，用于账户登录，邮箱、手机号等
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户是否需要补全安全密码，true：需要补全，false：不需要补全。
默认为false，不需要补全。
	 */
	@ApiField("need_supply")
	private Boolean needSupply;

	/**
	 * 蚂蚁通行证安全密码，通过RSA加密传输,示例：b111111:Dsz+toTsBnIwyG7IWuzshgwXxkHImAACx8yUb9PhP4+zyEV/xAPM/N9AdAFh0Di9xLG6syACSTn4KYMYs5GoSyaI2TJ0e2TcC8Gm5VJK0uinJVRhgWPnfsyiSl9amhObbPXtQgVO7szmYI8duChphFz0I2MKMOQVvWWF7Z9sSXZCfUGLPtL6ZS+xb3W9scczasR49IO8V49ll5NGzwFTvvc9yGPTxj3AIPbUPBG4byktfPWKoiRpTstGQORmAGPZT+gumEJxxpcATMcsnJMnHYfdrhEW8/VFleC5m5aaoCl2mdmEgh4X6NSt8MpgnUxhXwW090+dx3UQwU5pqGRvkw==
	 */
	@ApiField("security_password")
	private String securityPassword;

	/**
	 * 注册来源场景，shangshu_register--上树对接蚂蚁通行证，该场景登录号、登录密码、用户类型为必传参数
	 */
	@ApiField("source")
	private String source;

	/**
	 * 用户类型，1 -- 企业用户， 2 -- 个人用户
	 */
	@ApiField("user_type")
	private String userType;

    /**
     * Gets bind mobile.
     *
     * @return the bind mobile
     */
    public String getBindMobile() {
		return this.bindMobile;
	}

    /**
     * Sets bind mobile.
     *
     * @param bindMobile the bind mobile
     */
    public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
		return this.country;
	}

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
		this.country = country;
	}

    /**
     * Gets login password.
     *
     * @return the login password
     */
    public String getLoginPassword() {
		return this.loginPassword;
	}

    /**
     * Sets login password.
     *
     * @param loginPassword the login password
     */
    public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

    /**
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId() {
		return this.logonId;
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
     * Gets need supply.
     *
     * @return the need supply
     */
    public Boolean getNeedSupply() {
		return this.needSupply;
	}

    /**
     * Sets need supply.
     *
     * @param needSupply the need supply
     */
    public void setNeedSupply(Boolean needSupply) {
		this.needSupply = needSupply;
	}

    /**
     * Gets security password.
     *
     * @return the security password
     */
    public String getSecurityPassword() {
		return this.securityPassword;
	}

    /**
     * Sets security password.
     *
     * @param securityPassword the security password
     */
    public void setSecurityPassword(String securityPassword) {
		this.securityPassword = securityPassword;
	}

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
		return this.source;
	}

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
		this.source = source;
	}

    /**
     * Gets user type.
     *
     * @return the user type
     */
    public String getUserType() {
		return this.userType;
	}

    /**
     * Sets user type.
     *
     * @param userType the user type
     */
    public void setUserType(String userType) {
		this.userType = userType;
	}

}
