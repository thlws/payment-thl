package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抬头信息
 *
 * @author auto create
 * @since 1.0, 2018-07-16 09:27:40
 */
public class InvoiceTitleModel extends AlipayObject {

	private static final long serialVersionUID = 4849576486294263543L;

	/**
	 * 是否为用户设置默认抬头
字段值包括两种情况：
false（非默认）
true（默认抬头）
	 */
	@ApiField("is_default")
	private Boolean isDefault;

	/**
	 * 支付宝用户登录名
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 银行账号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户银行
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 用户私人手机号
	 */
	@ApiField("tele_phone_no")
	private String telePhoneNo;

	/**
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * 抬头类型
字段值有两种情况抬:
PERSONAL（个人） 
CORPORATION（单位）
	 */
	@ApiField("title_type")
	private String titleType;

	/**
	 * 地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 邮箱
	 */
	@ApiField("user_email")
	private String userEmail;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 电话号码
	 */
	@ApiField("user_mobile")
	private String userMobile;

    /**
     * Gets is default.
     *
     * @return the is default
     */
    public Boolean getIsDefault() {
		return this.isDefault;
	}

    /**
     * Sets is default.
     *
     * @param isDefault the is default
     */
    public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
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
     * Gets open bank account.
     *
     * @return the open bank account
     */
    public String getOpenBankAccount() {
		return this.openBankAccount;
	}

    /**
     * Sets open bank account.
     *
     * @param openBankAccount the open bank account
     */
    public void setOpenBankAccount(String openBankAccount) {
		this.openBankAccount = openBankAccount;
	}

    /**
     * Gets open bank name.
     *
     * @return the open bank name
     */
    public String getOpenBankName() {
		return this.openBankName;
	}

    /**
     * Sets open bank name.
     *
     * @param openBankName the open bank name
     */
    public void setOpenBankName(String openBankName) {
		this.openBankName = openBankName;
	}

    /**
     * Gets tax register no.
     *
     * @return the tax register no
     */
    public String getTaxRegisterNo() {
		return this.taxRegisterNo;
	}

    /**
     * Sets tax register no.
     *
     * @param taxRegisterNo the tax register no
     */
    public void setTaxRegisterNo(String taxRegisterNo) {
		this.taxRegisterNo = taxRegisterNo;
	}

    /**
     * Gets tele phone no.
     *
     * @return the tele phone no
     */
    public String getTelePhoneNo() {
		return this.telePhoneNo;
	}

    /**
     * Sets tele phone no.
     *
     * @param telePhoneNo the tele phone no
     */
    public void setTelePhoneNo(String telePhoneNo) {
		this.telePhoneNo = telePhoneNo;
	}

    /**
     * Gets title name.
     *
     * @return the title name
     */
    public String getTitleName() {
		return this.titleName;
	}

    /**
     * Sets title name.
     *
     * @param titleName the title name
     */
    public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

    /**
     * Gets title type.
     *
     * @return the title type
     */
    public String getTitleType() {
		return this.titleType;
	}

    /**
     * Sets title type.
     *
     * @param titleType the title type
     */
    public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

    /**
     * Gets user address.
     *
     * @return the user address
     */
    public String getUserAddress() {
		return this.userAddress;
	}

    /**
     * Sets user address.
     *
     * @param userAddress the user address
     */
    public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

    /**
     * Gets user email.
     *
     * @return the user email
     */
    public String getUserEmail() {
		return this.userEmail;
	}

    /**
     * Sets user email.
     *
     * @param userEmail the user email
     */
    public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
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
     * Gets user mobile.
     *
     * @return the user mobile
     */
    public String getUserMobile() {
		return this.userMobile;
	}

    /**
     * Sets user mobile.
     *
     * @param userMobile the user mobile
     */
    public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

}
