package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 全面开放下公众平台的绑定账户
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class StdPublicBindAccount extends AlipayObject {

	private static final long serialVersionUID = 4623851461714148188L;

	/**
	 * 协议号是商户会员在支付宝公众账号中的唯一标识。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 公众账号ID
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 绑定的商户会员号
	 */
	@ApiField("bind_account_no")
	private String bindAccountNo;

	/**
	 * 公众账号期望支付宝用户在公众账号首页看到的关于该用户的显示信息，最长10个汉字。
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 绑定的商户会员对应的支付宝用户号，以2088 开头的16位数字。
	 */
	@ApiField("from_user_id")
	private String fromUserId;

	/**
	 * 绑定的商户会员的真实姓名，最长10个汉字。
	 */
	@ApiField("real_name")
	private String realName;

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId() {
		return this.agreementId;
	}

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
		return this.appId;
	}

    /**
     * Sets app id.
     *
     * @param appId the app id
     */
    public void setAppId(String appId) {
		this.appId = appId;
	}

    /**
     * Gets bind account no.
     *
     * @return the bind account no
     */
    public String getBindAccountNo() {
		return this.bindAccountNo;
	}

    /**
     * Sets bind account no.
     *
     * @param bindAccountNo the bind account no
     */
    public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
		return this.displayName;
	}

    /**
     * Sets display name.
     *
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

    /**
     * Gets from user id.
     *
     * @return the from user id
     */
    public String getFromUserId() {
		return this.fromUserId;
	}

    /**
     * Sets from user id.
     *
     * @param fromUserId the from user id
     */
    public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

    /**
     * Gets real name.
     *
     * @return the real name
     */
    public String getRealName() {
		return this.realName;
	}

    /**
     * Sets real name.
     *
     * @param realName the real name
     */
    public void setRealName(String realName) {
		this.realName = realName;
	}

}
