package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号信息
 *
 * @author auto create
 * @since 1.0, 2017-05-19 11:45:40
 */
public class MyBkAccountVO extends AlipayObject {

	private static final long serialVersionUID = 4381319493299666525L;

	/**
	 * 账号外标，如支付宝登录号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

	/**
	 * 金融机构支行联行号
	 */
	@ApiField("account_fip_branch_code")
	private String accountFipBranchCode;

	/**
	 * 金融机构码
	 */
	@ApiField("account_fip_code")
	private String accountFipCode;

	/**
	 * 金融机构名称
	 */
	@ApiField("account_fip_name")
	private String accountFipName;

	/**
	 * 资金账号,支付宝2088开头或银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账号分类，ALIPAY("ALIPAY", "Alipay", "支付宝账号", "支付宝账号"),MY_BANK("MY_BANK", "MayiBank", "网商银行账号", "网商银行账号"),OUT_BANK("OUT_BANK", "OutBank", "外部银行账号", "外部银行账号")
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 是否可用，Y-可用；N-不可用
	 */
	@ApiField("available")
	private String available;

	/**
	 * 账户对公对私类型,P-对私，B-对公
	 */
	@ApiField("bank_card_category")
	private String bankCardCategory;

	/**
	 * 持卡人姓名
	 */
	@ApiField("card_holder_name")
	private String cardHolderName;

	/**
	 * 放款来源
	 */
	@ApiField("grant_channel")
	private String grantChannel;

	/**
	 * 账户不可用原因
	 */
	@ApiField("refuse_code")
	private String refuseCode;

    /**
     * Gets account ext no.
     *
     * @return the account ext no
     */
    public String getAccountExtNo() {
		return this.accountExtNo;
	}

    /**
     * Sets account ext no.
     *
     * @param accountExtNo the account ext no
     */
    public void setAccountExtNo(String accountExtNo) {
		this.accountExtNo = accountExtNo;
	}

    /**
     * Gets account fip branch code.
     *
     * @return the account fip branch code
     */
    public String getAccountFipBranchCode() {
		return this.accountFipBranchCode;
	}

    /**
     * Sets account fip branch code.
     *
     * @param accountFipBranchCode the account fip branch code
     */
    public void setAccountFipBranchCode(String accountFipBranchCode) {
		this.accountFipBranchCode = accountFipBranchCode;
	}

    /**
     * Gets account fip code.
     *
     * @return the account fip code
     */
    public String getAccountFipCode() {
		return this.accountFipCode;
	}

    /**
     * Sets account fip code.
     *
     * @param accountFipCode the account fip code
     */
    public void setAccountFipCode(String accountFipCode) {
		this.accountFipCode = accountFipCode;
	}

    /**
     * Gets account fip name.
     *
     * @return the account fip name
     */
    public String getAccountFipName() {
		return this.accountFipName;
	}

    /**
     * Sets account fip name.
     *
     * @param accountFipName the account fip name
     */
    public void setAccountFipName(String accountFipName) {
		this.accountFipName = accountFipName;
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
     * Gets available.
     *
     * @return the available
     */
    public String getAvailable() {
		return this.available;
	}

    /**
     * Sets available.
     *
     * @param available the available
     */
    public void setAvailable(String available) {
		this.available = available;
	}

    /**
     * Gets bank card category.
     *
     * @return the bank card category
     */
    public String getBankCardCategory() {
		return this.bankCardCategory;
	}

    /**
     * Sets bank card category.
     *
     * @param bankCardCategory the bank card category
     */
    public void setBankCardCategory(String bankCardCategory) {
		this.bankCardCategory = bankCardCategory;
	}

    /**
     * Gets card holder name.
     *
     * @return the card holder name
     */
    public String getCardHolderName() {
		return this.cardHolderName;
	}

    /**
     * Sets card holder name.
     *
     * @param cardHolderName the card holder name
     */
    public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

    /**
     * Gets grant channel.
     *
     * @return the grant channel
     */
    public String getGrantChannel() {
		return this.grantChannel;
	}

    /**
     * Sets grant channel.
     *
     * @param grantChannel the grant channel
     */
    public void setGrantChannel(String grantChannel) {
		this.grantChannel = grantChannel;
	}

    /**
     * Gets refuse code.
     *
     * @return the refuse code
     */
    public String getRefuseCode() {
		return this.refuseCode;
	}

    /**
     * Sets refuse code.
     *
     * @param refuseCode the refuse code
     */
    public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

}
