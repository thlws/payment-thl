package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商拒绝接单
 *
 * @author auto create
 * @since 1.0, 2016-08-25 11:11:47
 */
public class AlipayOpenServicemarketOrderRejectModel extends AlipayObject {

	private static final long serialVersionUID = 3126719896749722367L;

	/**
	 * 订购服务商品订单ID
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 拒绝接单原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

    /**
     * Gets commodity order id.
     *
     * @return the commodity order id
     */
    public String getCommodityOrderId() {
		return this.commodityOrderId;
	}

    /**
     * Sets commodity order id.
     *
     * @param commodityOrderId the commodity order id
     */
    public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

    /**
     * Gets reject reason.
     *
     * @return the reject reason
     */
    public String getRejectReason() {
		return this.rejectReason;
	}

    /**
     * Sets reject reason.
     *
     * @param rejectReason the reject reason
     */
    public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
