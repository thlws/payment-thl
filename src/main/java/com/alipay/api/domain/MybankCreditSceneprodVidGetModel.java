package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融支付宝VID查询接口
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:51:00
 */
public class MybankCreditSceneprodVidGetModel extends AlipayObject {

	private static final long serialVersionUID = 6175321859692958192L;

	/**
	 * 支付宝版本号
	 */
	@ApiField("alipay_version")
	private String alipayVersion;

	/**
	 * 机构编码
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

    /**
     * Gets alipay version.
     *
     * @return the alipay version
     */
    public String getAlipayVersion() {
		return this.alipayVersion;
	}

    /**
     * Sets alipay version.
     *
     * @param alipayVersion the alipay version
     */
    public void setAlipayVersion(String alipayVersion) {
		this.alipayVersion = alipayVersion;
	}

    /**
     * Gets org code.
     *
     * @return the org code
     */
    public String getOrgCode() {
		return this.orgCode;
	}

    /**
     * Sets org code.
     *
     * @param orgCode the org code
     */
    public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
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

}
