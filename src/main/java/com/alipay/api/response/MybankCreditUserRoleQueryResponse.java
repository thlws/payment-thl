package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.role.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:25:00
 */
public class MybankCreditUserRoleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5117416287567346484L;

	/** 
	 * 证件名称
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 证件类型，100：身份证；201：全国法人营业执照；2011：全国法人营业执照(多证合一)
	 */
	@ApiField("cert_type")
	private String certType;

	/** 
	 * 客户IP_ID
	 */
	@ApiField("ip_id")
	private String ipId;

	/** 
	 * 客户的IP_ROLE_ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 参与者类型；1：自然人，2：企业，3：金融机构，4：其它组织
	 */
	@ApiField("ip_type")
	private String ipType;

	/** 
	 * 站点会员
	 */
	@ApiField("site")
	private String site;

	/** 
	 * 站点登录ID
	 */
	@ApiField("site_login_id")
	private String siteLoginId;

	/** 
	 * 站点的会员ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

    /**
     * Sets cert name.
     *
     * @param certName the cert name
     */
    public void setCertName(String certName) {
		this.certName = certName;
	}

    /**
     * Gets cert name.
     *
     * @return the cert name
     */
    public String getCertName( ) {
		return this.certName;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo( ) {
		return this.certNo;
	}

    /**
     * Sets cert type.
     *
     * @param certType the cert type
     */
    public void setCertType(String certType) {
		this.certType = certType;
	}

    /**
     * Gets cert type.
     *
     * @return the cert type
     */
    public String getCertType( ) {
		return this.certType;
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
     * Gets ip id.
     *
     * @return the ip id
     */
    public String getIpId( ) {
		return this.ipId;
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
     * Gets ip role id.
     *
     * @return the ip role id
     */
    public String getIpRoleId( ) {
		return this.ipRoleId;
	}

    /**
     * Sets ip type.
     *
     * @param ipType the ip type
     */
    public void setIpType(String ipType) {
		this.ipType = ipType;
	}

    /**
     * Gets ip type.
     *
     * @return the ip type
     */
    public String getIpType( ) {
		return this.ipType;
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
     * Gets site.
     *
     * @return the site
     */
    public String getSite( ) {
		return this.site;
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
     * Gets site login id.
     *
     * @return the site login id
     */
    public String getSiteLoginId( ) {
		return this.siteLoginId;
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
     * Gets site user id.
     *
     * @return the site user id
     */
    public String getSiteUserId( ) {
		return this.siteUserId;
	}

}
