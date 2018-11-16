package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业对公账户信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class BusinessBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 1793524247546952778L;

	/**
	 * 企业对公账户名称
	 */
	@ApiField("business_bank_account_name")
	private String businessBankAccountName;

	/**
	 * 企业对公银行账户号
	 */
	@ApiField("business_bank_card_no")
	private String businessBankCardNo;

	/**
	 * 企业对公账户开户行名称
	 */
	@ApiField("business_bank_name")
	private String businessBankName;

	/**
	 * 企业对公账户开户行支行全称
	 */
	@ApiField("business_bank_sub")
	private String businessBankSub;

    /**
     * Gets business bank account name.
     *
     * @return the business bank account name
     */
    public String getBusinessBankAccountName() {
		return this.businessBankAccountName;
	}

    /**
     * Sets business bank account name.
     *
     * @param businessBankAccountName the business bank account name
     */
    public void setBusinessBankAccountName(String businessBankAccountName) {
		this.businessBankAccountName = businessBankAccountName;
	}

    /**
     * Gets business bank card no.
     *
     * @return the business bank card no
     */
    public String getBusinessBankCardNo() {
		return this.businessBankCardNo;
	}

    /**
     * Sets business bank card no.
     *
     * @param businessBankCardNo the business bank card no
     */
    public void setBusinessBankCardNo(String businessBankCardNo) {
		this.businessBankCardNo = businessBankCardNo;
	}

    /**
     * Gets business bank name.
     *
     * @return the business bank name
     */
    public String getBusinessBankName() {
		return this.businessBankName;
	}

    /**
     * Sets business bank name.
     *
     * @param businessBankName the business bank name
     */
    public void setBusinessBankName(String businessBankName) {
		this.businessBankName = businessBankName;
	}

    /**
     * Gets business bank sub.
     *
     * @return the business bank sub
     */
    public String getBusinessBankSub() {
		return this.businessBankSub;
	}

    /**
     * Sets business bank sub.
     *
     * @param businessBankSub the business bank sub
     */
    public void setBusinessBankSub(String businessBankSub) {
		this.businessBankSub = businessBankSub;
	}

}
