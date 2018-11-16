package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商接单操作
 *
 * @author auto create
 * @since 1.0, 2016-08-25 11:11:41
 */
public class AlipayOpenServicemarketOrderAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 3169275668843576936L;

	/**
	 * 服务商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

    /**
     * Gets commodity order id.
     *
     * @return the commodity order id
     */
    public String getCommodityOrderId() {
		return this.commodityOrderId;
	}

    /**
     * Sets commodity order id.
     *
     * @param commodityOrderId the commodity order id
     */
    public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

}
