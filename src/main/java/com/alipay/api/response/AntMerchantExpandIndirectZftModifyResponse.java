package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-09-07 20:05:00
 */
public class AntMerchantExpandIndirectZftModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4496636717748954684L;

	/** 
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId( ) {
		return this.orderId;
	}

}
