package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户申请单查询
 *
 * @author auto create
 * @since 1.0, 2018-06-08 14:34:00
 */
public class AntMerchantExpandOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8323734698563786656L;

	/**
	 * 通过ant.merchant.expand.indirect.zmsub.create等接口进件时返回的order_id
	 */
	@ApiField("order_id")
	private String orderId;

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
