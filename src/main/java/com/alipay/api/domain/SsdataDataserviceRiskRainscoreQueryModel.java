package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾风险评分服务新版
 *
 * @author auto create
 * @since 1.0, 2018-08-28 16:10:23
 */
public class SsdataDataserviceRiskRainscoreQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3726497352675132427L;

	/**
	 * 帐号内容，目前为中国大陆手机号（11位阿拉伯数字，不包含特殊符号或空格）
	 */
	@ApiField("account")
	private String account;

	/**
	 * 账号类型，目前仅支持手机号（MOBILE_NO）
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 调用服务的商户id ，如果是第三方服务商，需要将其实际的商户id透传过来，如果是普通商户传入自己的appid即可
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * “蚁盾”风险评分服务版本号，当前版本为2.0
	 */
	@ApiField("version")
	private String version;

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
     * Gets account type.
     *
     * @return the account type
     */
    public String getAccountType() {
		return this.accountType;
	}

    /**
     * Sets account type.
     *
     * @param accountType the account type
     */
    public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

    /**
     * Gets version.
     *
     * @return the version
     */
    public String getVersion() {
		return this.version;
	}

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(String version) {
		this.version = version;
	}

}
