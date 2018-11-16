package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请流水撤销
 *
 * @author auto create
 * @since 1.0, 2018-03-27 17:07:06
 */
public class AlipayOfflineMarketShopApplyorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2699123725969818274L;

	/**
	 * 撤销申请流水的原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人ID，开店请求时候的操作人ID
	 */
	@ApiField("op_id")
	private String opId;

	/**
	 * 要撤销的订单ID，当店铺创建、修改接口迁移至2.0时，同步返回的apply_id可以用作此接口的入参。
	 */
	@ApiField("order_id")
	private String orderId;

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets op id.
     *
     * @return the op id
     */
    public String getOpId() {
		return this.opId;
	}

    /**
     * Sets op id.
     *
     * @param opId the op id
     */
    public void setOpId(String opId) {
		this.opId = opId;
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

}
