package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票抬头查询模型
 *
 * @author auto create
 * @since 1.0, 2017-05-09 19:40:04
 */
public class InvoiceTitleQueryOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2229559644358523662L;

	/**
	 * 购买方地址
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 开户行账户
	 */
	@ApiField("payer_bank_account")
	private String payerBankAccount;

	/**
	 * 购买方开户银行
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/**
	 * 购买方纳税人识别号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 购买方电话
	 */
	@ApiField("payer_tel")
	private String payerTel;

	/**
	 * 发票抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	/**
	 * 支付宝用户id，支付宝用户的唯一标识。
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets payer address.
     *
     * @return the payer address
     */
    public String getPayerAddress() {
		return this.payerAddress;
	}

    /**
     * Sets payer address.
     *
     * @param payerAddress the payer address
     */
    public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

    /**
     * Gets payer bank account.
     *
     * @return the payer bank account
     */
    public String getPayerBankAccount() {
		return this.payerBankAccount;
	}

    /**
     * Sets payer bank account.
     *
     * @param payerBankAccount the payer bank account
     */
    public void setPayerBankAccount(String payerBankAccount) {
		this.payerBankAccount = payerBankAccount;
	}

    /**
     * Gets payer bank name.
     *
     * @return the payer bank name
     */
    public String getPayerBankName() {
		return this.payerBankName;
	}

    /**
     * Sets payer bank name.
     *
     * @param payerBankName the payer bank name
     */
    public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}

    /**
     * Gets payer register no.
     *
     * @return the payer register no
     */
    public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}

    /**
     * Sets payer register no.
     *
     * @param payerRegisterNo the payer register no
     */
    public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

    /**
     * Gets payer tel.
     *
     * @return the payer tel
     */
    public String getPayerTel() {
		return this.payerTel;
	}

    /**
     * Sets payer tel.
     *
     * @param payerTel the payer tel
     */
    public void setPayerTel(String payerTel) {
		this.payerTel = payerTel;
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

}
