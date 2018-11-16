package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 站点信息
 *
 * @author auto create
 * @since 1.0, 2018-03-14 16:11:53
 */
public class SiteInfo extends AlipayObject {

	private static final long serialVersionUID = 7732364554433357268L;

	/**
	 * 测试账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 测试密码
	 */
	@ApiField("password")
	private String password;

	/**
	 * 站点名称
	 */
	@ApiField("site_name")
	private String siteName;

	/**
	 * 网站：01
APP  : 02
服务窗:03
公众号:04
其他:05
支付宝小程序:06
	 */
	@ApiField("site_type")
	private String siteType;

	/**
	 * 站点地址
	 */
	@ApiField("site_url")
	private String siteUrl;

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
		return this.account;
	}

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
		this.account = account;
	}

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
		return this.password;
	}

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
		this.password = password;
	}

    /**
     * Gets site name.
     *
     * @return the site name
     */
    public String getSiteName() {
		return this.siteName;
	}

    /**
     * Sets site name.
     *
     * @param siteName the site name
     */
    public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

    /**
     * Gets site type.
     *
     * @return the site type
     */
    public String getSiteType() {
		return this.siteType;
	}

    /**
     * Sets site type.
     *
     * @param siteType the site type
     */
    public void setSiteType(String siteType) {
		this.siteType = siteType;
	}

    /**
     * Gets site url.
     *
     * @return the site url
     */
    public String getSiteUrl() {
		return this.siteUrl;
	}

    /**
     * Sets site url.
     *
     * @param siteUrl the site url
     */
    public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

}
