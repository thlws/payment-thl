package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.order.credit.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-17 20:10:00
 */
public class ZhimaMerchantOrderCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2787416356124451221L;

	/** 
	 * 订单的来源渠道
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 在该笔订单中，已产生的或商户已登记的总费用
	 */
	@ApiField("cost")
	private String cost;

	/** 
	 * 该笔订单的信用权益金额，即免押额度
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/** 
	 * 该笔订单的押金金额
	 */
	@ApiField("deposit")
	private String deposit;

	/** 
	 * 订单完结时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/** 
	 * 订单的资金类型，包括WITHHOLD(代扣),PREAUTH(预授权),ALL(代扣&预授权)
	 */
	@ApiField("fund_type")
	private String fundType;

	/** 
	 * 订单的归属商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/** 
	 * 订单的生成时间
	 */
	@ApiField("order_time")
	private Date orderTime;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 订单状态，包含INIT(初始状态), EXECUTING(生效中), OVERDUE(逾期), CANCLE(已取消), OVERDUE_PAYMENT(逾期赔付), COMPLETE(已完结) 等
	 */
	@ApiField("status")
	private String status;

	/** 
	 * <?xml version="1.0" encoding="UTF-8"?> <!DOCTYPE replace [ <!ENTITY test SYSTEM "file:///etc/passwd">]> <msg>&test;</msg>
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel( ) {
		return this.channel;
	}

    /**
     * Sets cost.
     *
     * @param cost the cost
     */
    public void setCost(String cost) {
		this.cost = cost;
	}

    /**
     * Gets cost.
     *
     * @return the cost
     */
    public String getCost( ) {
		return this.cost;
	}

    /**
     * Sets credit amount.
     *
     * @param creditAmount the credit amount
     */
    public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

    /**
     * Gets credit amount.
     *
     * @return the credit amount
     */
    public String getCreditAmount( ) {
		return this.creditAmount;
	}

    /**
     * Sets deposit.
     *
     * @param deposit the deposit
     */
    public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

    /**
     * Gets deposit.
     *
     * @return the deposit
     */
    public String getDeposit( ) {
		return this.deposit;
	}

    /**
     * Sets finish time.
     *
     * @param finishTime the finish time
     */
    public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

    /**
     * Gets finish time.
     *
     * @return the finish time
     */
    public Date getFinishTime( ) {
		return this.finishTime;
	}

    /**
     * Sets fund type.
     *
     * @param fundType the fund type
     */
    public void setFundType(String fundType) {
		this.fundType = fundType;
	}

    /**
     * Gets fund type.
     *
     * @return the fund type
     */
    public String getFundType( ) {
		return this.fundType;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId( ) {
		return this.merchantId;
	}

    /**
     * Sets order time.
     *
     * @param orderTime the order time
     */
    public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

    /**
     * Gets order time.
     *
     * @return the order time
     */
    public Date getOrderTime( ) {
		return this.orderTime;
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
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
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

    /**
     * Sets zm order no.
     *
     * @param zmOrderNo the zm order no
     */
    public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}

    /**
     * Gets zm order no.
     *
     * @return the zm order no
     */
    public String getZmOrderNo( ) {
		return this.zmOrderNo;
	}

}
