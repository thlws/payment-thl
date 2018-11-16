package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子发票抬头添加
 *
 * @author auto create
 * @since 1.0, 2018-04-23 13:17:45
 */
public class AlipayEbppInvoiceTitleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7462333937434435992L;

	/**
	 * 开户银行账号
	 */
	@ApiField("open_bank_account")
	private String openBankAccount;

	/**
	 * 开户银行
	 */
	@ApiField("open_bank_name")
	private String openBankName;

	/**
	 * 税号
	 */
	@ApiField("tax_register_no")
	private String taxRegisterNo;

	/**
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * 地址
	 */
	@ApiField("user_address")
	private String userAddress;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 电话
	 */
	@ApiField("user_mobile")
	private String userMobile;

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
