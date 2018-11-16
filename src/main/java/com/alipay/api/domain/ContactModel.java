package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方平台代理签约接口中的联系人对象
 *
 * @author auto create
 * @since 1.0, 2018-07-02 13:24:13
 */
public class ContactModel extends AlipayObject {

	private static final long serialVersionUID = 1354365875469558753L;

	/**
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机号码
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

    /**
     * Gets contact email.
     *
     * @return the contact email
     */
    public String getContactEmail() {
		return this.contactEmail;
	}

    /**
     * Sets contact email.
     *
     * @param contactEmail the contact email
     */
    public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

    /**
     * Gets contact mobile.
     *
     * @return the contact mobile
     */
    public String getContactMobile() {
		return this.contactMobile;
	}

    /**
     * Sets contact mobile.
     *
     * @param contactMobile the contact mobile
     */
    public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

    /**
     * Gets contact name.
     *
     * @return the contact name
     */
    public String getContactName() {
		return this.contactName;
	}

    /**
     * Sets contact name.
     *
     * @param contactName the contact name
     */
    public void setContactName(String contactName) {
		this.contactName = contactName;
	}

}
