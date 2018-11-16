package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 邮寄信息
 *
 * @author auto create
 * @since 1.0, 2017-10-24 17:03:12
 */
public class DeliverInfo extends AlipayObject {

	private static final long serialVersionUID = 1367623695696736549L;

	/**
	 * 保单寄送地址的住址
	 */
	@ApiField("recipients_address")
	private String recipientsAddress;

	/**
	 * 配送地址行政区划代码
	 */
	@ApiField("recipients_address_code")
	private String recipientsAddressCode;

	/**
	 * 收件人姓名
	 */
	@ApiField("recipients_name")
	private String recipientsName;

	/**
	 * 收件人电话
	 */
	@ApiField("recipients_phone")
	private String recipientsPhone;

    /**
     * Gets recipients address.
     *
     * @return the recipients address
     */
    public String getRecipientsAddress() {
		return this.recipientsAddress;
	}

    /**
     * Sets recipients address.
     *
     * @param recipientsAddress the recipients address
     */
    public void setRecipientsAddress(String recipientsAddress) {
		this.recipientsAddress = recipientsAddress;
	}

    /**
     * Gets recipients address code.
     *
     * @return the recipients address code
     */
    public String getRecipientsAddressCode() {
		return this.recipientsAddressCode;
	}

    /**
     * Sets recipients address code.
     *
     * @param recipientsAddressCode the recipients address code
     */
    public void setRecipientsAddressCode(String recipientsAddressCode) {
		this.recipientsAddressCode = recipientsAddressCode;
	}

    /**
     * Gets recipients name.
     *
     * @return the recipients name
     */
    public String getRecipientsName() {
		return this.recipientsName;
	}

    /**
     * Sets recipients name.
     *
     * @param recipientsName the recipients name
     */
    public void setRecipientsName(String recipientsName) {
		this.recipientsName = recipientsName;
	}

    /**
     * Gets recipients phone.
     *
     * @return the recipients phone
     */
    public String getRecipientsPhone() {
		return this.recipientsPhone;
	}

    /**
     * Sets recipients phone.
     *
     * @param recipientsPhone the recipients phone
     */
    public void setRecipientsPhone(String recipientsPhone) {
		this.recipientsPhone = recipientsPhone;
	}

}
