package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 养老险订单模型
 *
 * @author auto create
 * @since 1.0, 2017-07-27 16:58:09
 */
public class EndowmentOrder extends AlipayObject {

	private static final long serialVersionUID = 8766147687466488322L;

	/**
	 * apply_amount：申购金额，以分为单位
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 订单id，订单的唯一标识，可以用来做幂等
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * pay_time：支付时间，格式：YYYYMMDDHHMISS
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * ta_requestId:TA的唯一业务流水号
	 */
	@ApiField("ta_request_id")
	private String taRequestId;

    /**
     * Gets apply amount.
     *
     * @return the apply amount
     */
    public String getApplyAmount() {
		return this.applyAmount;
	}

    /**
     * Sets apply amount.
     *
     * @param applyAmount the apply amount
     */
    public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

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

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public String getPayTime() {
		return this.payTime;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets ta request id.
     *
     * @return the ta request id
     */
    public String getTaRequestId() {
		return this.taRequestId;
	}

    /**
     * Sets ta request id.
     *
     * @param taRequestId the ta request id
     */
    public void setTaRequestId(String taRequestId) {
		this.taRequestId = taRequestId;
	}

}
