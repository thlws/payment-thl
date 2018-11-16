package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票资料信息
 *
 * @author auto create
 * @since 1.0, 2018-05-18 16:44:01
 */
public class MerchantInvoiceInfo extends AlipayObject {

	private static final long serialVersionUID = 5544438728122735572L;

	/**
	 * 是否接受电子发票 true/false
	 */
	@ApiField("accept_electronic")
	private Boolean acceptElectronic;

	/**
	 * 开票地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 是否自动开票，值为true/false
	 */
	@ApiField("auto_invoice")
	private Boolean autoInvoice;

	/**
	 * 银行账号
	 */
	@ApiField("bank_account")
	private String bankAccount;

	/**
	 * 开户行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 收件人地址
	 */
	@ApiField("mail_address")
	private AddressInfo mailAddress;

	/**
	 * 收件人名称
	 */
	@ApiField("mail_name")
	private String mailName;

	/**
	 * 057162288888
	 */
	@ApiField("mail_telephone")
	private String mailTelephone;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 纳税人资格种类:01一般纳税人，02小规模纳税人。一般纳税人开的是专票
	 */
	@ApiField("tax_payer_qualification")
	private String taxPayerQualification;

	/**
	 * 纳税人资格开始时间,yyyyMMdd格式
	 */
	@ApiField("tax_payer_valid")
	private String taxPayerValid;

	/**
	 * 开票电话
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 发票抬头
	 */
	@ApiField("title")
	private String title;

    /**
     * Gets accept electronic.
     *
     * @return the accept electronic
     */
    public Boolean getAcceptElectronic() {
		return this.acceptElectronic;
	}

    /**
     * Sets accept electronic.
     *
     * @param acceptElectronic the accept electronic
     */
    public void setAcceptElectronic(Boolean acceptElectronic) {
		this.acceptElectronic = acceptElectronic;
	}

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
		return this.address;
	}

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets auto invoice.
     *
     * @return the auto invoice
     */
    public Boolean getAutoInvoice() {
		return this.autoInvoice;
	}

    /**
     * Sets auto invoice.
     *
     * @param autoInvoice the auto invoice
     */
    public void setAutoInvoice(Boolean autoInvoice) {
		this.autoInvoice = autoInvoice;
	}

    /**
     * Gets bank account.
     *
     * @return the bank account
     */
    public String getBankAccount() {
		return this.bankAccount;
	}

    /**
     * Sets bank account.
     *
     * @param bankAccount the bank account
     */
    public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

    /**
     * Gets bank name.
     *
     * @return the bank name
     */
    public String getBankName() {
		return this.bankName;
	}

    /**
     * Sets bank name.
     *
     * @param bankName the bank name
     */
    public void setBankName(String bankName) {
		this.bankName = bankName;
	}

    /**
     * Gets mail address.
     *
     * @return the mail address
     */
    public AddressInfo getMailAddress() {
		return this.mailAddress;
	}

    /**
     * Sets mail address.
     *
     * @param mailAddress the mail address
     */
    public void setMailAddress(AddressInfo mailAddress) {
		this.mailAddress = mailAddress;
	}

    /**
     * Gets mail name.
     *
     * @return the mail name
     */
    public String getMailName() {
		return this.mailName;
	}

    /**
     * Sets mail name.
     *
     * @param mailName the mail name
     */
    public void setMailName(String mailName) {
		this.mailName = mailName;
	}

    /**
     * Gets mail telephone.
     *
     * @return the mail telephone
     */
    public String getMailTelephone() {
		return this.mailTelephone;
	}

    /**
     * Sets mail telephone.
     *
     * @param mailTelephone the mail telephone
     */
    public void setMailTelephone(String mailTelephone) {
		this.mailTelephone = mailTelephone;
	}

    /**
     * Gets tax no.
     *
     * @return the tax no
     */
    public String getTaxNo() {
		return this.taxNo;
	}

    /**
     * Sets tax no.
     *
     * @param taxNo the tax no
     */
    public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

    /**
     * Gets tax payer qualification.
     *
     * @return the tax payer qualification
     */
    public String getTaxPayerQualification() {
		return this.taxPayerQualification;
	}

    /**
     * Sets tax payer qualification.
     *
     * @param taxPayerQualification the tax payer qualification
     */
    public void setTaxPayerQualification(String taxPayerQualification) {
		this.taxPayerQualification = taxPayerQualification;
	}

    /**
     * Gets tax payer valid.
     *
     * @return the tax payer valid
     */
    public String getTaxPayerValid() {
		return this.taxPayerValid;
	}

    /**
     * Sets tax payer valid.
     *
     * @param taxPayerValid the tax payer valid
     */
    public void setTaxPayerValid(String taxPayerValid) {
		this.taxPayerValid = taxPayerValid;
	}

    /**
     * Gets telephone.
     *
     * @return the telephone
     */
    public String getTelephone() {
		return this.telephone;
	}

    /**
     * Sets telephone.
     *
     * @param telephone the telephone
     */
    public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
		return this.title;
	}

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
		this.title = title;
	}

}
