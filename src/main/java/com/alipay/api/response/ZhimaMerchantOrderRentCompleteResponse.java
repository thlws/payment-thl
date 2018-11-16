package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.rent.complete response.
 *
 * @author auto create
 * @since 1.0, 2018-07-06 15:50:00
 */
public class ZhimaMerchantOrderRentCompleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6151325162221355149L;

	/** 
	 * 资金流水号，用于商户与支付宝进行对账
	 */
	@ApiField("alipay_fund_order_no")
	private String alipayFundOrderNo;

	/** 
	 * 信用借还的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 借用人支付宝userId.
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets alipay fund order no.
     *
     * @param alipayFundOrderNo the alipay fund order no
     */
    public void setAlipayFundOrderNo(String alipayFundOrderNo) {
		this.alipayFundOrderNo = alipayFundOrderNo;
	}

    /**
     * Gets alipay fund order no.
     *
     * @return the alipay fund order no
     */
    public String getAlipayFundOrderNo( ) {
		return this.alipayFundOrderNo;
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
