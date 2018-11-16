package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.add response.
 *
 * @author auto create
 * @since 1.0, 2018-08-01 17:06:55
 */
public class AlipayEbppBillAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5486158183531366969L;

	/** 
	 * 支付宝的业务订单号，具有唯一性。
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 外部订单号，由于对账时回传给外部商户
	 */
	@ApiField("bank_bill_no")
	private String bankBillNo;

	/** 
	 * 账单的账期，例如201203表示2012年3月的账单。
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 出账机构中文名称。
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/** 
	 * 扩展属性，该属性值现在用于确保只有一个人可以支付成功
用法：多个人对同一笔外部欠费单创建多个账单时，确保该值不变
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 输出机构的业务流水号，需要保证唯一性。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 拥有该账单的用户姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 缴费金额。用户支付的总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 账单的服务费
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/** 
	 * 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

    /**
     * Sets alipay order no.
     *
     * @param alipayOrderNo the alipay order no
     */
    public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

    /**
     * Gets alipay order no.
     *
     * @return the alipay order no
     */
    public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

    /**
     * Sets bank bill no.
     *
     * @param bankBillNo the bank bill no
     */
    public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}

    /**
     * Gets bank bill no.
     *
     * @return the bank bill no
     */
    public String getBankBillNo( ) {
		return this.bankBillNo;
	}

    /**
     * Sets bill date.
     *
     * @param billDate the bill date
     */
    public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

    /**
     * Gets bill date.
     *
     * @return the bill date
     */
    public String getBillDate( ) {
		return this.billDate;
	}

    /**
     * Sets bill key.
     *
     * @param billKey the bill key
     */
    public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

    /**
     * Gets bill key.
     *
     * @return the bill key
     */
    public String getBillKey( ) {
		return this.billKey;
	}

    /**
     * Sets charge inst.
     *
     * @param chargeInst the charge inst
     */
    public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

    /**
     * Gets charge inst.
     *
     * @return the charge inst
     */
    public String getChargeInst( ) {
		return this.chargeInst;
	}

    /**
     * Sets charge inst name.
     *
     * @param chargeInstName the charge inst name
     */
    public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}

    /**
     * Gets charge inst name.
     *
     * @return the charge inst name
     */
    public String getChargeInstName( ) {
		return this.chargeInstName;
	}

    /**
     * Sets extend field.
     *
     * @param extendField the extend field
     */
    public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

    /**
     * Gets extend field.
     *
     * @return the extend field
     */
    public String getExtendField( ) {
		return this.extendField;
	}

    /**
     * Sets merchant order no.
     *
     * @param merchantOrderNo the merchant order no
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

    /**
     * Gets merchant order no.
     *
     * @return the merchant order no
     */
    public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

    /**
     * Sets order type.
     *
     * @param orderType the order type
     */
    public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

    /**
     * Gets order type.
     *
     * @return the order type
     */
    public String getOrderType( ) {
		return this.orderType;
	}

    /**
     * Sets owner name.
     *
     * @param ownerName the owner name
     */
    public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

    /**
     * Gets owner name.
     *
     * @return the owner name
     */
    public String getOwnerName( ) {
		return this.ownerName;
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
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount( ) {
		return this.payAmount;
	}

    /**
     * Sets service amount.
     *
     * @param serviceAmount the service amount
     */
    public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

    /**
     * Gets service amount.
     *
     * @return the service amount
     */
    public String getServiceAmount( ) {
		return this.serviceAmount;
	}

    /**
     * Sets sub order type.
     *
     * @param subOrderType the sub order type
     */
    public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}

    /**
     * Gets sub order type.
     *
     * @return the sub order type
     */
    public String getSubOrderType( ) {
		return this.subOrderType;
	}

}
