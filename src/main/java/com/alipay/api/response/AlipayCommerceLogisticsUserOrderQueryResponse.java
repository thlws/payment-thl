package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.user.order.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-28 17:30:49
 */
public class AlipayCommerceLogisticsUserOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5665352312556669812L;

	/** 
	 * 格式 : json , 目前 json 的 key 有 biz_unique_no
	 */
	@ApiField("order_info")
	private String orderInfo;

    /**
     * Sets order info.
     *
     * @param orderInfo the order info
     */
    public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

    /**
     * Gets order info.
     *
     * @return the order info
     */
    public String getOrderInfo( ) {
		return this.orderInfo;
	}

}
