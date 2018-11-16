package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.external.data.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-07-11 16:21:02
 */
public class KoubeiShopExternalDataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5716599117125288735L;

	/** 
	 * 流水结果描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 申请流水Id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 流水处理成功
SUCESS(成功)
PROCESS(处理中)
	 */
	@ApiField("order_status")
	private String orderStatus;

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc( ) {
		return this.desc;
	}

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

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
