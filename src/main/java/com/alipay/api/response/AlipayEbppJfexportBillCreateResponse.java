package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.bill.create response.
 *
 * @author auto create
 * @since 1.0, 2018-05-02 14:57:46
 */
public class AlipayEbppJfexportBillCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2861925492751474122L;

	/** 
	 * 支付金额,单位为：RMB 元。
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 支付宝的业务订单号，具有唯一性和幂等性
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 业务类型英文名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 出账机构英文名称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 拓展字段，json格式的key-value串
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 外部商户的业务流水号，需要保证唯一性和幂等性
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 账单拥有者的姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 子业务类型英文名称
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount( ) {
		return this.amount;
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
     * Sets bill no.
     *
     * @param billNo the bill no
     */
    public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

    /**
     * Gets bill no.
     *
     * @return the bill no
     */
    public String getBillNo( ) {
		return this.billNo;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
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
     * Sets sub biz type.
     *
     * @param subBizType the sub biz type
     */
    public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

    /**
     * Gets sub biz type.
     *
     * @return the sub biz type
     */
    public String getSubBizType( ) {
		return this.subBizType;
	}

}
