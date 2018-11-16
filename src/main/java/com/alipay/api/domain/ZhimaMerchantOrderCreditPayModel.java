package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用支付
 *
 * @author auto create
 * @since 1.0, 2018-07-27 09:31:06
 */
public class ZhimaMerchantOrderCreditPayModel extends AlipayObject {

	private static final long serialVersionUID = 7114649385625692324L;

	/**
	 * 优惠券金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]，无支付行为时为空，例如订单取消或者支付金额为0
	 */
	@ApiField("coupon_amount")
	private String couponAmount;

	/**
	 * CANCEL，FINISH, INSTALLMENT  订单完结类型，目前包括取消(CANCEL)、完结(FINISH) 分期扣款(INSTALLMENT)
	 */
	@ApiField("order_operate_type")
	private String orderOperateType;

	/**
	 * 外部订单号,包含字母、数字、下划线，调用方需要保证订单号唯一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部资金订单号，可包含字母、数字、下划线
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/**
	 * 支付总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]，无支付行为时为空，例如订单取消或者支付金额为0
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单操作说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 是否使用优惠券，默认为false，可选值：true或false，字符串形式，目前仅针对回收行业生效
	 */
	@ApiField("use_coupon")
	private String useCoupon;

	/**
	 * 芝麻订单号
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

    /**
     * Gets coupon amount.
     *
     * @return the coupon amount
     */
    public String getCouponAmount() {
		return this.couponAmount;
	}

    /**
     * Sets coupon amount.
     *
     * @param couponAmount the coupon amount
     */
    public void setCouponAmount(String couponAmount) {
		this.couponAmount = couponAmount;
	}

    /**
     * Gets order operate type.
     *
     * @return the order operate type
     */
    public String getOrderOperateType() {
		return this.orderOperateType;
	}

    /**
     * Sets order operate type.
     *
     * @param orderOperateType the order operate type
     */
    public void setOrderOperateType(String orderOperateType) {
		this.orderOperateType = orderOperateType;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo() {
		return this.outOrderNo;
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
     * Gets out trans no.
     *
     * @return the out trans no
     */
    public String getOutTransNo() {
		return this.outTransNo;
	}

    /**
     * Sets out trans no.
     *
     * @param outTransNo the out trans no
     */
    public void setOutTransNo(String outTransNo) {
		this.outTransNo = outTransNo;
	}

    /**
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
	}

    /**
     * Sets pay amount.
     *
     * @param payAmount the pay amount
     */
    public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets use coupon.
     *
     * @return the use coupon
     */
    public String getUseCoupon() {
		return this.useCoupon;
	}

    /**
     * Sets use coupon.
     *
     * @param useCoupon the use coupon
     */
    public void setUseCoupon(String useCoupon) {
		this.useCoupon = useCoupon;
	}

    /**
     * Gets zm order no.
     *
     * @return the zm order no
     */
    public String getZmOrderNo() {
		return this.zmOrderNo;
	}

    /**
     * Sets zm order no.
     *
     * @param zmOrderNo the zm order no
     */
    public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}

}
