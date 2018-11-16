package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PosDiscountDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.pay.query response.
 *
 * @author auto create
 * @since 1.0, 2018-04-20 19:10:00
 */
public class KoubeiCateringOrderPayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4116999897192269376L;

	/** 
	 * 优惠明细列表
	 */
	@ApiListField("discount_details")
	@ApiField("pos_discount_detail")
	private List<PosDiscountDetail> discountDetails;

	/** 
	 * 外部支付订单号,唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/** 
	 * 买家实付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 口碑内部支付订单号,和外部支付订单号一一映射
	 */
	@ApiField("pay_no")
	private String payNo;

	/** 
	 * 买家交易支付成功时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 商家实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 支付结果，INIT-待支付，PROCESS-支付中，PAY-已支付，REFUND-已退款，CLOSE-已关闭
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 订单付款金额,以元为单位,精确到分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 买家支付宝账号
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Sets discount details.
     *
     * @param discountDetails the discount details
     */
    public void setDiscountDetails(List<PosDiscountDetail> discountDetails) {
		this.discountDetails = discountDetails;
	}

    /**
     * Gets discount details.
     *
     * @return the discount details
     */
    public List<PosDiscountDetail> getDiscountDetails( ) {
		return this.discountDetails;
	}

    /**
     * Sets out pay no.
     *
     * @param outPayNo the out pay no
     */
    public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}

    /**
     * Gets out pay no.
     *
     * @return the out pay no
     */
    public String getOutPayNo( ) {
		return this.outPayNo;
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
     * Sets pay no.
     *
     * @param payNo the pay no
     */
    public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

    /**
     * Gets pay no.
     *
     * @return the pay no
     */
    public String getPayNo( ) {
		return this.payNo;
	}

    /**
     * Sets pay time.
     *
     * @param payTime the pay time
     */
    public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

    /**
     * Gets pay time.
     *
     * @return the pay time
     */
    public Date getPayTime( ) {
		return this.payTime;
	}

    /**
     * Sets receipt amount.
     *
     * @param receiptAmount the receipt amount
     */
    public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

    /**
     * Gets receipt amount.
     *
     * @return the receipt amount
     */
    public String getReceiptAmount( ) {
		return this.receiptAmount;
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
