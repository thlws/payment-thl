package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行融资平台协议查询接口
 *
 * @author auto create
 * @since 1.0, 2017-09-25 21:10:21
 */
public class MybankCreditLoanapplyArrangementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3338712698431126425L;

	/**
	 * 产品代码，标识网商银行具体的产品，由网商银行预先分配好，接入方按网商银行的要求送。
	 */
	@ApiField("ar_pd_code")
	private String arPdCode;

	/**
	 * 客户id，网商银行唯一标识一个客户的id。此客户id是通过客户创建接口返回的。即调用此接口前必须先调用客户创建接口。
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 客户角色id，网商银行唯一标识一个客户角色的id。此id是通过客户创建接口返回的。即调用此接口前必须先调用客户创建接口。客户角色id+产品代码唯一确定一笔签约。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 站点类型，当前只支持ALIPAY。后续扩展可以支持TAOBAO等。目前这个字段必须传递ALIPAY。
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点数字id，例如支付宝id、淘宝id。接入方通过客户的支付宝或淘宝账号获取对应的userId。当site为ALIPAY时，site_user_id必须是支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

    /**
     * Gets ar pd code.
     *
     * @return the ar pd code
     */
    public String getArPdCode() {
		return this.arPdCode;
	}

    /**
     * Sets ar pd code.
     *
     * @param arPdCode the ar pd code
     */
    public void setArPdCode(String arPdCode) {
		this.arPdCode = arPdCode;
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
