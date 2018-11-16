package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易支付
 *
 * @author auto create
 * @since 1.0, 2018-06-06 13:53:01
 */
public class MybankCreditSupplychainTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 6477867269286766357L;

	/**
	 * 买家信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道，TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 业务扩展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付金额（单位：元），只支持两位小数点的正数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 幂等编号，用于幂等控制，格式 instIpRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付
	 */
	@ApiField("trade_type")
	private String tradeType;

    /**
     * Gets buyer.
     *
     * @return the buyer
     */
    public Member getBuyer() {
		return this.buyer;
	}

    /**
     * Sets buyer.
     *
     * @param buyer the buyer
     */
    public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets ext data.
     *
     * @return the ext data
     */
    public String getExtData() {
		return this.extData;
	}

    /**
     * Sets ext data.
     *
     * @param extData the ext data
     */
    public void setExtData(String extData) {
		this.extData = extData;
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
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets sale pd code.
     *
     * @return the sale pd code
     */
    public String getSalePdCode() {
		return this.salePdCode;
	}

    /**
     * Sets sale pd code.
     *
     * @param salePdCode the sale pd code
     */
    public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

    /**
     * Gets trade type.
     *
     * @return the trade type
     */
    public String getTradeType() {
		return this.tradeType;
	}

    /**
     * Sets trade type.
     *
     * @param tradeType the trade type
     */
    public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
