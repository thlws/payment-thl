package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户会员站点以及身份信息
 *
 * @author auto create
 * @since 1.0, 2017-12-06 21:34:01
 */
public class Member extends AlipayObject {

	private static final long serialVersionUID = 8752552634626297279L;

	/**
	 * 网商银行参与者会员ID
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商银行参与者会员角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 会员站点：ALIPAY:支付宝，MYBANK:网商银行，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点会员登录ID
	 */
	@ApiField("site_login_id")
	private String siteLoginId;

	/**
	 * 会员站点ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 身份使用类型；SITE:站点类型，MYBK:网商银行客户角色类型，MYBK_SITE:站点网商类型；如果是SITE，那么site为必填字段，site_user_id和site_login_id不能全部为空；如果是MYBK，那么ip_id和ip_role_id不能全部为空；如果是MYBK_SITE，那么ip_id，ip_role_id，site为必填，site_login_id和site_user_id至少填一项
	 */
	@ApiField("use_type")
	private String useType;

    /**
     * Gets ip id.
     *
     * @return the ip id
     */
    public String getIpId() {
		return this.ipId;
	}

    /**
     * Sets ip id.
     *
     * @param ipId the ip id
     */
    public void setIpId(String ipId) {
		this.ipId = ipId;
	}

    /**
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId() {
		return this.ipRoleId;
	}

    /**
     * Sets ip role id.
     *
     * @param ipRoleId the ip role id
     */
    public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

    /**
     * Gets site.
     *
     * @return the site
     */
    public String getSite() {
		return this.site;
	}

    /**
     * Sets site.
     *
     * @param site the site
     */
    public void setSite(String site) {
		this.site = site;
	}

    /**
     * Gets site login id.
     *
     * @return the site login id
     */
    public String getSiteLoginId() {
		return this.siteLoginId;
	}

    /**
     * Sets site login id.
     *
     * @param siteLoginId the site login id
     */
    public void setSiteLoginId(String siteLoginId) {
		this.siteLoginId = siteLoginId;
	}

    /**
     * Gets site user id.
     *
     * @return the site user id
     */
    public String getSiteUserId() {
		return this.siteUserId;
	}

    /**
     * Sets site user id.
     *
     * @param siteUserId the site user id
     */
    public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

    /**
     * Gets use type.
     *
     * @return the use type
     */
    public String getUseType() {
		return this.useType;
	}

    /**
     * Sets use type.
     *
     * @param useType the use type
     */
    public void setUseType(String useType) {
		this.useType = useType;
	}

}
