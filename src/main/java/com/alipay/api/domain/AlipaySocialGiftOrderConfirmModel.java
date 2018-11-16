package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户订单激活确认接口
 *
 * @author auto create
 * @since 1.0, 2018-09-04 16:32:53
 */
public class AlipaySocialGiftOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5548566946235496574L;

	/**
	 * 卡生效截止时间，可用于卡包中卡展示
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 商户再送礼平台的唯一ID，用于标识具体的调用业务方，需要先在送礼平台进行业务类型的分配之后才看使用。
	 */
	@ApiField("mid")
	private String mid;

	/**
	 * 送礼平台方的主订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 卡码的有效起始时间，可用于卡包展示
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 卡的金额字段，可用于在支付宝进行显示（比如卡包中卡金额）
	 */
	@ApiField("total_price")
	private String totalPrice;

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public Date getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets mid.
     *
     * @return the mid
     */
    public String getMid() {
		return this.mid;
	}

    /**
     * Sets mid.
     *
     * @param mid the mid
     */
    public void setMid(String mid) {
		this.mid = mid;
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
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

    /**
     * Gets total price.
     *
     * @return the total price
     */
    public String getTotalPrice() {
		return this.totalPrice;
	}

    /**
     * Sets total price.
     *
     * @param totalPrice the total price
     */
    public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

}
