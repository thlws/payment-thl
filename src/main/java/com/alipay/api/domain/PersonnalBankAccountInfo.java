package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个体工商户的银行账户信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class PersonnalBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 3267416826958133382L;

	/**
	 * 填入的银行账号对应的银行预留手机号
	 */
	@ApiField("personal_bank_account_mobile")
	private String personalBankAccountMobile;

	/**
	 * 个人或个体工商户的银行账号，在商户确认环节用来作为认证的一种材料。
	 */
	@ApiField("personal_bank_card_no")
	private String personalBankCardNo;

	/**
	 * 填入的银行账号对应的持卡人的身份证号码
	 */
	@ApiField("personal_bank_holder_certno")
	private String personalBankHolderCertno;

	/**
	 * 填入的银行账号对应的持卡人名称
	 */
	@ApiField("personal_bank_holder_name")
	private String personalBankHolderName;

    /**
     * Gets personal bank account mobile.
     *
     * @return the personal bank account mobile
     */
    public String getPersonalBankAccountMobile() {
		return this.personalBankAccountMobile;
	}

    /**
     * Sets personal bank account mobile.
     *
     * @param personalBankAccountMobile the personal bank account mobile
     */
    public void setPersonalBankAccountMobile(String personalBankAccountMobile) {
		this.personalBankAccountMobile = personalBankAccountMobile;
	}

    /**
     * Gets personal bank card no.
     *
     * @return the personal bank card no
     */
    public String getPersonalBankCardNo() {
		return this.personalBankCardNo;
	}

    /**
     * Sets personal bank card no.
     *
     * @param personalBankCardNo the personal bank card no
     */
    public void setPersonalBankCardNo(String personalBankCardNo) {
		this.personalBankCardNo = personalBankCardNo;
	}

    /**
     * Gets personal bank holder certno.
     *
     * @return the personal bank holder certno
     */
    public String getPersonalBankHolderCertno() {
		return this.personalBankHolderCertno;
	}

    /**
     * Sets personal bank holder certno.
     *
     * @param personalBankHolderCertno the personal bank holder certno
     */
    public void setPersonalBankHolderCertno(String personalBankHolderCertno) {
		this.personalBankHolderCertno = personalBankHolderCertno;
	}

    /**
     * Gets personal bank holder name.
     *
     * @return the personal bank holder name
     */
    public String getPersonalBankHolderName() {
		return this.personalBankHolderName;
	}

    /**
     * Sets personal bank holder name.
     *
     * @param personalBankHolderName the personal bank holder name
     */
    public void setPersonalBankHolderName(String personalBankHolderName) {
		this.personalBankHolderName = personalBankHolderName;
	}

}
