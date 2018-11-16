package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.create response.
 *
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:54
 */
public class KoubeiCateringOrderInfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2664591123345551436L;

	/** 
	 * 口碑的订单号（唯一主键），和pos本地订单号一一对应
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 是否需要重试，true-需要重试，false-不需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

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
     * Sets retry.
     *
     * @param retry the retry
     */
    public void setRetry(Boolean retry) {
		this.retry = retry;
	}

    /**
     * Gets retry.
     *
     * @return the retry
     */
    public Boolean getRetry( ) {
		return this.retry;
	}

}
