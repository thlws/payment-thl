package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.rent.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-02 11:47:49
 */
public class ZhimaMerchantOrderRentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1293335628592444219L;

	/** 
	 * 是否准入：
Y-准入
N-不准入
	 */
	@ApiField("admit_state")
	private String admitState;

	/** 
	 * 商户发起借用服务时，需要在借用结束后返回给商户的参数
	 */
	@ApiField("invoke_state")
	private String invokeState;

	/** 
	 * 芝麻信用借还订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+4位随机数
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 借用者的userId
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets admit state.
     *
     * @param admitState the admit state
     */
    public void setAdmitState(String admitState) {
		this.admitState = admitState;
	}

    /**
     * Gets admit state.
     *
     * @return the admit state
     */
    public String getAdmitState( ) {
		return this.admitState;
	}

    /**
     * Sets invoke state.
     *
     * @param invokeState the invoke state
     */
    public void setInvokeState(String invokeState) {
		this.invokeState = invokeState;
	}

    /**
     * Gets invoke state.
     *
     * @return the invoke state
     */
    public String getInvokeState( ) {
		return this.invokeState;
	}

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
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId( ) {
		return this.userId;
	}

}
