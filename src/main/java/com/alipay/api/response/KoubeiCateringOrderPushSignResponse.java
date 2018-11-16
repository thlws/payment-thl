package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.push.sign response.
 *
 * @author auto create
 * @since 1.0, 2018-09-10 18:35:00
 */
public class KoubeiCateringOrderPushSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 3285693153751536227L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/** 
	 * 口碑主订单号
	 */
	@ApiField("order_id")
	private String orderId;

    /**
     * Sets ext infos.
     *
     * @param extInfos the ext infos
     */
    public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

    /**
     * Gets ext infos.
     *
     * @return the ext infos
     */
    public String getExtInfos( ) {
		return this.extInfos;
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

}
