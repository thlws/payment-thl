package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易创建
 *
 * @author auto create
 * @since 1.0, 2018-06-06 13:51:27
 */
public class MybankCreditSupplychainTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4687462768576412531L;

	/**
	 * 买家会员信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道，枚举如下：TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理，DSCYFRZ：大搜车预付融资
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 账款到期支付日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 由具体业务决定填充内容，JSON格式
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 订单标题
	 */
	@ApiField("out_order_title")
	private String outOrderTitle;

	/**
	 * 买家付款账户信息
	 */
	@ApiField("pay_account")
	private Account payAccount;

	/**
	 * 卖家收款账户信息
	 */
	@ApiField("rcv_account")
	private Account rcvAccount;

	/**
	 * 幂等编号，用于幂等控制，格式：机构ipRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 卖家会员信息
	 */
	@ApiField("seller")
	private Member seller;

	/**
	 * 交易金额（单位：元），只支持两位小数点的正数
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

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
     * Gets expire date.
     *
     * @return the expire date
     */
    public Date getExpireDate() {
		return this.expireDate;
	}

    /**
     * Sets expire date.
     *
     * @param expireDate the expire date
     */
    public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
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
     * Gets out order title.
     *
     * @return the out order title
     */
    public String getOutOrderTitle() {
		return this.outOrderTitle;
	}

    /**
     * Sets out order title.
     *
     * @param outOrderTitle the out order title
     */
    public void setOutOrderTitle(String outOrderTitle) {
		this.outOrderTitle = outOrderTitle;
	}

    /**
     * Gets pay account.
     *
     * @return the pay account
     */
    public Account getPayAccount() {
		return this.payAccount;
	}

    /**
     * Sets pay account.
     *
     * @param payAccount the pay account
     */
    public void setPayAccount(Account payAccount) {
		this.payAccount = payAccount;
	}

    /**
     * Gets rcv account.
     *
     * @return the rcv account
     */
    public Account getRcvAccount() {
		return this.rcvAccount;
	}

    /**
     * Sets rcv account.
     *
     * @param rcvAccount the rcv account
     */
    public void setRcvAccount(Account rcvAccount) {
		this.rcvAccount = rcvAccount;
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
     * Gets seller.
     *
     * @return the seller
     */
    public Member getSeller() {
		return this.seller;
	}

    /**
     * Sets seller.
     *
     * @param seller the seller
     */
    public void setSeller(Member seller) {
		this.seller = seller;
	}

    /**
     * Gets trade amount.
     *
     * @return the trade amount
     */
    public String getTradeAmount() {
		return this.tradeAmount;
	}

    /**
     * Sets trade amount.
     *
     * @param tradeAmount the trade amount
     */
    public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
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
