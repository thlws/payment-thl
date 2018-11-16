package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TradeAssocBillDetails;
import com.alipay.api.domain.FundBillListEco;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.pay.result.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayEcoCplifePayResultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4183642579566671637L;

	/** 
	 * 本次交易关联的账单详情
	 */
	@ApiField("assoc_bill_details")
	private TradeAssocBillDetails assocBillDetails;

	/** 
	 * 该笔缴费归属的支付宝房号，支付宝小区编号，和物业房间户号
	 */
	@ApiField("biz_entity_id")
	private String bizEntityId;

	/** 
	 * 缴费类型：
00--上传账单类缴费
CJ--欠费直查类缴费
YC--预存类缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 脱敏后的买家支付宝登录账号
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 交易支付使用的资金渠道
	 */
	@ApiField("fund_bill_list")
	private FundBillListEco fundBillList;

	/** 
	 * 交易完成付款时间
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 卖家（即物业缴费收款方）支付宝用户号
	 */
	@ApiField("seller_id")
	private String sellerId;

	/** 
	 * 本次交易支付的订单金额，单位为人民币（元）
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 用户完成物业缴费对应的支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

    /**
     * Sets assoc bill details.
     *
     * @param assocBillDetails the assoc bill details
     */
    public void setAssocBillDetails(TradeAssocBillDetails assocBillDetails) {
		this.assocBillDetails = assocBillDetails;
	}

    /**
     * Gets assoc bill details.
     *
     * @return the assoc bill details
     */
    public TradeAssocBillDetails getAssocBillDetails( ) {
		return this.assocBillDetails;
	}

    /**
     * Sets biz entity id.
     *
     * @param bizEntityId the biz entity id
     */
    public void setBizEntityId(String bizEntityId) {
		this.bizEntityId = bizEntityId;
	}

    /**
     * Gets biz entity id.
     *
     * @return the biz entity id
     */
    public String getBizEntityId( ) {
		return this.bizEntityId;
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
     * Sets buyer logon id.
     *
     * @param buyerLogonId the buyer logon id
     */
    public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

    /**
     * Gets buyer logon id.
     *
     * @return the buyer logon id
     */
    public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

    /**
     * Sets buyer user id.
     *
     * @param buyerUserId the buyer user id
     */
    public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

    /**
     * Gets buyer user id.
     *
     * @return the buyer user id
     */
    public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

    /**
     * Sets fund bill list.
     *
     * @param fundBillList the fund bill list
     */
    public void setFundBillList(FundBillListEco fundBillList) {
		this.fundBillList = fundBillList;
	}

    /**
     * Gets fund bill list.
     *
     * @return the fund bill list
     */
    public FundBillListEco getFundBillList( ) {
		return this.fundBillList;
	}

    /**
     * Sets gmt payment.
     *
     * @param gmtPayment the gmt payment
     */
    public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}

    /**
     * Gets gmt payment.
     *
     * @return the gmt payment
     */
    public Date getGmtPayment( ) {
		return this.gmtPayment;
	}

    /**
     * Sets seller id.
     *
     * @param sellerId the seller id
     */
    public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

    /**
     * Gets seller id.
     *
     * @return the seller id
     */
    public String getSellerId( ) {
		return this.sellerId;
	}

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount( ) {
		return this.totalAmount;
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
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

    /**
     * Sets trade status.
     *
     * @param tradeStatus the trade status
     */
    public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

    /**
     * Gets trade status.
     *
     * @return the trade status
     */
    public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
