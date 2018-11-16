package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票抬头开放模型
 *
 * @author auto create
 * @since 1.0, 2018-09-18 19:58:01
 */
public class InvoiceTitleOpenModel extends AlipayObject {

	private static final long serialVersionUID = 4238263258941179351L;

	/**
	 * 票面上的购买方地址、电话
	 */
	@ApiField("payer_address_tel")
	private String payerAddressTel;

	/**
	 * 票面上的购买方开户行及账户
	 */
	@ApiField("payer_bank_name_account")
	private String payerBankNameAccount;

	/**
	 * 票面上的购买方纳税人识别号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 票面上的购买方名称
	 */
	@ApiField("title_name")
	private String titleName;

    /**
     * Gets payer address tel.
     *
     * @return the payer address tel
     */
    public String getPayerAddressTel() {
		return this.payerAddressTel;
	}

    /**
     * Sets payer address tel.
     *
     * @param payerAddressTel the payer address tel
     */
    public void setPayerAddressTel(String payerAddressTel) {
		this.payerAddressTel = payerAddressTel;
	}

    /**
     * Gets payer bank name account.
     *
     * @return the payer bank name account
     */
    public String getPayerBankNameAccount() {
		return this.payerBankNameAccount;
	}

    /**
     * Sets payer bank name account.
     *
     * @param payerBankNameAccount the payer bank name account
     */
    public void setPayerBankNameAccount(String payerBankNameAccount) {
		this.payerBankNameAccount = payerBankNameAccount;
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

}
