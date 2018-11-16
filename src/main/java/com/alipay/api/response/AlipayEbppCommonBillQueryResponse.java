package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.common.bill.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-30 22:10:42
 */
public class AlipayEbppCommonBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7386725332312593293L;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 支付宝账单流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 出账机构英文缩写
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 销账机构英文缩写
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/** 
	 * 订单创建时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 订单支付时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_pay")
	private String gmtPay;

	/** 
	 * S-成功 P-已支付 I-待支付 C-已关闭 T-退款中 F-已退款
	 */
	@ApiField("status")
	private String status;

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
     * Sets chargeoff inst.
     *
     * @param chargeoffInst the chargeoff inst
     */
    public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

    /**
     * Gets chargeoff inst.
     *
     * @return the chargeoff inst
     */
    public String getChargeoffInst( ) {
		return this.chargeoffInst;
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
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public String getGmtCreate( ) {
		return this.gmtCreate;
	}

    /**
     * Sets gmt pay.
     *
     * @param gmtPay the gmt pay
     */
    public void setGmtPay(String gmtPay) {
		this.gmtPay = gmtPay;
	}

    /**
     * Gets gmt pay.
     *
     * @return the gmt pay
     */
    public String getGmtPay( ) {
		return this.gmtPay;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
