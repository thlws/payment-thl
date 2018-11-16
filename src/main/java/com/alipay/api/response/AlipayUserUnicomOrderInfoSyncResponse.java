package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.unicom.order.info.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-08-03 10:23:33
 */
public class AlipayUserUnicomOrderInfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5626243121946249566L;

	/** 
	 * 联通订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 业务处理结果 （成功: SUCCESS, 失败: FAIL, 重试: RETRY）
	 */
	@ApiField("order_sync_result")
	private String orderSyncResult;

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo( ) {
		return this.orderNo;
	}

    /**
     * Sets order sync result.
     *
     * @param orderSyncResult the order sync result
     */
    public void setOrderSyncResult(String orderSyncResult) {
		this.orderSyncResult = orderSyncResult;
	}

    /**
     * Gets order sync result.
     *
     * @return the order sync result
     */
    public String getOrderSyncResult( ) {
		return this.orderSyncResult;
	}

}
