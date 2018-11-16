package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.order.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-16 22:30:00
 */
public class AlipayOpenServicemarketOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5471582837191644251L;

	/** 
	 * 订单号
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/** 
	 * 支付宝分配给开发者的应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

    /**
     * Sets commodity order id.
     *
     * @param commodityOrderId the commodity order id
     */
    public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

    /**
     * Gets commodity order id.
     *
     * @return the commodity order id
     */
    public String getCommodityOrderId( ) {
		return this.commodityOrderId;
	}

    /**
     * Sets mini app id.
     *
     * @param miniAppId the mini app id
     */
    public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

    /**
     * Gets mini app id.
     *
     * @return the mini app id
     */
    public String getMiniAppId( ) {
		return this.miniAppId;
	}

}
