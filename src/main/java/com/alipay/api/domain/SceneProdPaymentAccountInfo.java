package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融代收付交易方信息
 *
 * @author auto create
 * @since 1.0, 2018-01-23 16:41:03
 */
public class SceneProdPaymentAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 3356351139655269683L;

	/**
	 * 账号外标，如支付宝登录号,网商银行卡卡号
	 */
	@ApiField("account_ext_no")
	private String accountExtNo;

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
	 * 账号分类, ALIPAY:支付宝 , CURRENT: 网商银行
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 资金操作金额，单位分
	 */
	@ApiField("amt")
	private String amt;

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
	 * 扩展信息，map格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 开户行联行号，机构可以通过联行号查询网商查询获取。
	 */
	@ApiField("inst_out_code")
	private String instOutCode;

	/**
	 * 网商参与者id
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商银行角色id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 账单备注
	 */
	@ApiField("payment_mark")
	private String paymentMark;

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
     * Gets amt.
     *
     * @return the amt
     */
    public String getAmt() {
		return this.amt;
	}

    /**
     * Sets amt.
     *
     * @param amt the amt
     */
    public void setAmt(String amt) {
		this.amt = amt;
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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets inst out code.
     *
     * @return the inst out code
     */
    public String getInstOutCode() {
		return this.instOutCode;
	}

    /**
     * Sets inst out code.
     *
     * @param instOutCode the inst out code
     */
    public void setInstOutCode(String instOutCode) {
		this.instOutCode = instOutCode;
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
     * Gets payment mark.
     *
     * @return the payment mark
     */
    public String getPaymentMark() {
		return this.paymentMark;
	}

    /**
     * Sets payment mark.
     *
     * @param paymentMark the payment mark
     */
    public void setPaymentMark(String paymentMark) {
		this.paymentMark = paymentMark;
	}

}
