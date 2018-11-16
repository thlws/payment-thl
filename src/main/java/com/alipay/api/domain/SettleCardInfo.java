package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算卡信息
 *
 * @author auto create
 * @since 1.0, 2018-06-05 19:28:13
 */
public class SettleCardInfo extends AlipayObject {

	private static final long serialVersionUID = 1545869456383456675L;

	/**
	 * 开户支行名
	 */
	@ApiField("account_branch_name")
	private String accountBranchName;

	/**
	 * 卡户名
	 */
	@ApiField("account_holder_name")
	private String accountHolderName;

	/**
	 * 开户行所在地-市
	 */
	@ApiField("account_inst_city")
	private String accountInstCity;

	/**
	 * 开户行简称缩写
	 */
	@ApiField("account_inst_id")
	private String accountInstId;

	/**
	 * 银行名称
	 */
	@ApiField("account_inst_name")
	private String accountInstName;

	/**
	 * 开户行所在地-省
	 */
	@ApiField("account_inst_province")
	private String accountInstProvince;

	/**
	 * 银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 卡类型
借记卡-DC
信用卡-CC
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 账号使用类型
对公-01
对私-02
	 */
	@ApiField("usage_type")
	private String usageType;

    /**
     * Gets account branch name.
     *
     * @return the account branch name
     */
    public String getAccountBranchName() {
		return this.accountBranchName;
	}

    /**
     * Sets account branch name.
     *
     * @param accountBranchName the account branch name
     */
    public void setAccountBranchName(String accountBranchName) {
		this.accountBranchName = accountBranchName;
	}

    /**
     * Gets account holder name.
     *
     * @return the account holder name
     */
    public String getAccountHolderName() {
		return this.accountHolderName;
	}

    /**
     * Sets account holder name.
     *
     * @param accountHolderName the account holder name
     */
    public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

    /**
     * Gets account inst city.
     *
     * @return the account inst city
     */
    public String getAccountInstCity() {
		return this.accountInstCity;
	}

    /**
     * Sets account inst city.
     *
     * @param accountInstCity the account inst city
     */
    public void setAccountInstCity(String accountInstCity) {
		this.accountInstCity = accountInstCity;
	}

    /**
     * Gets account inst id.
     *
     * @return the account inst id
     */
    public String getAccountInstId() {
		return this.accountInstId;
	}

    /**
     * Sets account inst id.
     *
     * @param accountInstId the account inst id
     */
    public void setAccountInstId(String accountInstId) {
		this.accountInstId = accountInstId;
	}

    /**
     * Gets account inst name.
     *
     * @return the account inst name
     */
    public String getAccountInstName() {
		return this.accountInstName;
	}

    /**
     * Sets account inst name.
     *
     * @param accountInstName the account inst name
     */
    public void setAccountInstName(String accountInstName) {
		this.accountInstName = accountInstName;
	}

    /**
     * Gets account inst province.
     *
     * @return the account inst province
     */
    public String getAccountInstProvince() {
		return this.accountInstProvince;
	}

    /**
     * Sets account inst province.
     *
     * @param accountInstProvince the account inst province
     */
    public void setAccountInstProvince(String accountInstProvince) {
		this.accountInstProvince = accountInstProvince;
	}

    /**
     * Gets account no.
     *
     * @return the account no
     */
    public String getAccountNo() {
		return this.accountNo;
	}

    /**
     * Sets account no.
     *
     * @param accountNo the account no
     */
    public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
     * Gets bank code.
     *
     * @return the bank code
     */
    public String getBankCode() {
		return this.bankCode;
	}

    /**
     * Sets bank code.
     *
     * @param bankCode the bank code
     */
    public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

    /**
     * Gets usage type.
     *
     * @return the usage type
     */
    public String getUsageType() {
		return this.usageType;
	}

    /**
     * Sets usage type.
     *
     * @param usageType the usage type
     */
    public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

}
