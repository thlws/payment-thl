package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV回传的会员身份
 *
 * @author auto create
 * @since 1.0, 2017-12-22 16:04:33
 */
public class MemberShip extends AlipayObject {

	private static final long serialVersionUID = 8511753246742236533L;

	/**
	 * 银行卡号
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 会员二代身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 邮箱号码
	 */
	@ApiField("email")
	private String email;

	/**
	 * MAC地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 11位手机号码
	 */
	@ApiField("mobile_phone_no")
	private String mobilePhoneNo;

    /**
     * Gets bank card no.
     *
     * @return the bank card no
     */
    public String getBankCardNo() {
		return this.bankCardNo;
	}

    /**
     * Sets bank card no.
     *
     * @param bankCardNo the bank card no
     */
    public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

    /**
     * Gets cert no.
     *
     * @return the cert no
     */
    public String getCertNo() {
		return this.certNo;
	}

    /**
     * Sets cert no.
     *
     * @param certNo the cert no
     */
    public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
		return this.email;
	}

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
		this.email = email;
	}

    /**
     * Gets mac.
     *
     * @return the mac
     */
    public String getMac() {
		return this.mac;
	}

    /**
     * Sets mac.
     *
     * @param mac the mac
     */
    public void setMac(String mac) {
		this.mac = mac;
	}

    /**
     * Gets mobile phone no.
     *
     * @return the mobile phone no
     */
    public String getMobilePhoneNo() {
		return this.mobilePhoneNo;
	}

    /**
     * Sets mobile phone no.
     *
     * @param mobilePhoneNo the mobile phone no
     */
    public void setMobilePhoneNo(String mobilePhoneNo) {
		this.mobilePhoneNo = mobilePhoneNo;
	}

}
