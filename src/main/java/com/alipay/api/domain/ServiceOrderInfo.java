package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 到位服务订单信息
 *
 * @author auto create
 * @since 1.0, 2017-03-14 16:37:23
 */
public class ServiceOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 2139286344295137948L;

	/**
	 * 服务总金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 商品服务所在类目的id
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 订单创建时间，格式为
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 订单修改时间，格式为
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 订单最后支付时间，格式：
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/**
	 * 订单最后退款时间，格式：
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/**
	 * 消费者标注订单备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 第三方服务id
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 商品的商家端端SKU ID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 第三方服务者id列表，例子：
[“2323”,…]，如果没有服务者，则为[]
	 */
	@ApiListField("out_sp_id")
	@ApiField("string")
	private List<String> outSpId;

	/**
	 * 服务已付金额，单位为元
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 单价，单位为元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 份数
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 服务实际金额，单位为元
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 订单退款金额，单位为元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 到位的服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务订单号
	 */
	@ApiField("service_order_no")
	private String serviceOrderNo;

	/**
	 * 商品的内部SKU ID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 商品价格单位
	 */
	@ApiField("unit")
	private String unit;

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets category code.
     *
     * @return the category code
     */
    public String getCategoryCode() {
		return this.categoryCode;
	}

    /**
     * Sets category code.
     *
     * @param categoryCode the category code
     */
    public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate() {
		return this.gmtCreate;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt modified.
     *
     * @return the gmt modified
     */
    public String getGmtModified() {
		return this.gmtModified;
	}

    /**
     * Sets gmt modified.
     *
     * @param gmtModified the gmt modified
     */
    public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Gets gmt payment.
     *
     * @return the gmt payment
     */
    public String getGmtPayment() {
		return this.gmtPayment;
	}

    /**
     * Sets gmt payment.
     *
     * @param gmtPayment the gmt payment
     */
    public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

    /**
     * Gets gmt refund.
     *
     * @return the gmt refund
     */
    public String getGmtRefund() {
		return this.gmtRefund;
	}

    /**
     * Sets gmt refund.
     *
     * @param gmtRefund the gmt refund
     */
    public void setGmtRefund(String gmtRefund) {
		this.gmtRefund = gmtRefund;
	}

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
     * Gets out service id.
     *
     * @return the out service id
     */
    public String getOutServiceId() {
		return this.outServiceId;
	}

    /**
     * Sets out service id.
     *
     * @param outServiceId the out service id
     */
    public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

    /**
     * Gets out sku id.
     *
     * @return the out sku id
     */
    public String getOutSkuId() {
		return this.outSkuId;
	}

    /**
     * Sets out sku id.
     *
     * @param outSkuId the out sku id
     */
    public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

    /**
     * Gets out sp id.
     *
     * @return the out sp id
     */
    public List<String> getOutSpId() {
		return this.outSpId;
	}

    /**
     * Sets out sp id.
     *
     * @param outSpId the out sp id
     */
    public void setOutSpId(List<String> outSpId) {
		this.outSpId = outSpId;
	}

    /**
     * Gets payment amount.
     *
     * @return the payment amount
     */
    public String getPaymentAmount() {
		return this.paymentAmount;
	}

    /**
     * Sets payment amount.
     *
     * @param paymentAmount the payment amount
     */
    public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
		return this.price;
	}

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
		this.price = price;
	}

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public Long getQuantity() {
		return this.quantity;
	}

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

    /**
     * Gets real amount.
     *
     * @return the real amount
     */
    public String getRealAmount() {
		return this.realAmount;
	}

    /**
     * Sets real amount.
     *
     * @param realAmount the real amount
     */
    public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

    /**
     * Gets refund amount.
     *
     * @return the refund amount
     */
    public String getRefundAmount() {
		return this.refundAmount;
	}

    /**
     * Sets refund amount.
     *
     * @param refundAmount the refund amount
     */
    public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

    /**
     * Gets service id.
     *
     * @return the service id
     */
    public String getServiceId() {
		return this.serviceId;
	}

    /**
     * Sets service id.
     *
     * @param serviceId the service id
     */
    public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

    /**
     * Gets service order no.
     *
     * @return the service order no
     */
    public String getServiceOrderNo() {
		return this.serviceOrderNo;
	}

    /**
     * Sets service order no.
     *
     * @param serviceOrderNo the service order no
     */
    public void setServiceOrderNo(String serviceOrderNo) {
		this.serviceOrderNo = serviceOrderNo;
	}

    /**
     * Gets sku id.
     *
     * @return the sku id
     */
    public String getSkuId() {
		return this.skuId;
	}

    /**
     * Sets sku id.
     *
     * @param skuId the sku id
     */
    public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo() {
		return this.tradeNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets unit.
     *
     * @return the unit
     */
    public String getUnit() {
		return this.unit;
	}

    /**
     * Sets unit.
     *
     * @param unit the unit
     */
    public void setUnit(String unit) {
		this.unit = unit;
	}

}
