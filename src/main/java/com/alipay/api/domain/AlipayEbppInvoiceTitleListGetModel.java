package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁电子发票平台用户发票抬头列表获取
 *
 * @author auto create
 * @since 1.0, 2018-07-02 10:28:56
 */
public class AlipayEbppInvoiceTitleListGetModel extends AlipayObject {

	private static final long serialVersionUID = 6526171717191953296L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

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
