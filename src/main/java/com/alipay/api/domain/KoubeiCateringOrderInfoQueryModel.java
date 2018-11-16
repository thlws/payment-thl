package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos订单查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-18 16:34:28
 */
public class KoubeiCateringOrderInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4336594568178717376L;

	/**
	 * 订单ID
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
