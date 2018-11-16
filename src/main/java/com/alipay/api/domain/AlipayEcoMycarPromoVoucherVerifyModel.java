package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:31
 */
public class AlipayEcoMycarPromoVoucherVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 8772487633782911693L;

	/**
	 * 订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单状态 1. 待支付 4. 交易关闭 6. 待发货 53. 已评价 55. 已核销 56. 交易完成
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 核销码
	 */
	@ApiField("sms_code")
	private String smsCode;

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
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
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus() {
		return this.orderStatus;
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
     * Gets sms code.
     *
     * @return the sms code
     */
    public String getSmsCode() {
		return this.smsCode;
	}

    /**
     * Sets sms code.
     *
     * @param smsCode the sms code
     */
    public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

}
