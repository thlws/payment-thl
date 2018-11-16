package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据查询详细参数
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:39:06
 */
public class SceneProdDataQueryParam extends AlipayObject {

	private static final long serialVersionUID = 5154359187145954792L;

	/**
	 * 网商银行的申请单号，通过mybank.credit.sceneprod.loan.apply接口返回的applyno获取
	 */
	@ApiField("app_seqno")
	private String appSeqno;

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
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，比如支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

    /**
     * Gets app seqno.
     *
     * @return the app seqno
     */
    public String getAppSeqno() {
		return this.appSeqno;
	}

    /**
     * Sets app seqno.
     *
     * @param appSeqno the app seqno
     */
    public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}

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
