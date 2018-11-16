package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * zoloz应用查询到的支付宝用户号和手机号信息
 *
 * @author auto create
 * @since 1.0, 2018-07-20 00:30:44
 */
public class ZhubUidTelPair extends AlipayObject {

	private static final long serialVersionUID = 1412832568318959898L;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
		return this.phone;
	}

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
		this.phone = phone;
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
