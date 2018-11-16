package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RefundRoyaltyResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.fastpay.refund.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-14 12:05:01
 */
public class AlipayTradeFastpayRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3588849414639848191L;

	/** 
	 * 退款失败错误码。只在使用异步退款接口情况下才会返回该字段
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 行业特殊信息（例如在医保卡支付退款中，医保局向商户返回医疗信息）。
	 */
	@ApiField("industry_sepc_detail")
	private String industrySepcDetail;

	/** 
	 * 本笔退款对应的退款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 创建交易传入的商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 本次退款金额中买家退款金额
	 */
	@ApiField("present_refund_buyer_amount")
	private String presentRefundBuyerAmount;

	/** 
	 * 本次退款金额中平台优惠退款金额
	 */
	@ApiField("present_refund_discount_amount")
	private String presentRefundDiscountAmount;

	/** 
	 * 本次退款金额中商家优惠退款金额
	 */
	@ApiField("present_refund_mdiscount_amount")
	private String presentRefundMdiscountAmount;

	/** 
	 * 本次退款请求，对应的退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/** 
	 * 发起退款时，传入的退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/** 
	 * 退分账明细信息
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_result")
	private List<RefundRoyaltyResult> refundRoyaltys;

	/** 
	 * 只在使用异步退款接口情况下才返回该字段。REFUND_PROCESSING 退款处理中；REFUND_SUCCESS 退款处理成功；REFUND_FAIL 退款失败;
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 该笔退款所对应的交易的订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets industry sepc detail.
     *
     * @param industrySepcDetail the industry sepc detail
     */
    public void setIndustrySepcDetail(String industrySepcDetail) {
		this.industrySepcDetail = industrySepcDetail;
	}

    /**
     * Gets industry sepc detail.
     *
     * @return the industry sepc detail
     */
    public String getIndustrySepcDetail( ) {
		return this.industrySepcDetail;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

    /**
     * Sets out trade no.
     *
     * @param outTradeNo the out trade no
     */
    public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

    /**
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

    /**
     * Sets present refund buyer amount.
     *
     * @param presentRefundBuyerAmount the present refund buyer amount
     */
    public void setPresentRefundBuyerAmount(String presentRefundBuyerAmount) {
		this.presentRefundBuyerAmount = presentRefundBuyerAmount;
	}

    /**
     * Gets present refund buyer amount.
     *
     * @return the present refund buyer amount
     */
    public String getPresentRefundBuyerAmount( ) {
		return this.presentRefundBuyerAmount;
	}

    /**
     * Sets present refund discount amount.
     *
     * @param presentRefundDiscountAmount the present refund discount amount
     */
    public void setPresentRefundDiscountAmount(String presentRefundDiscountAmount) {
		this.presentRefundDiscountAmount = presentRefundDiscountAmount;
	}

    /**
     * Gets present refund discount amount.
     *
     * @return the present refund discount amount
     */
    public String getPresentRefundDiscountAmount( ) {
		return this.presentRefundDiscountAmount;
	}

    /**
     * Sets present refund mdiscount amount.
     *
     * @param presentRefundMdiscountAmount the present refund mdiscount amount
     */
    public void setPresentRefundMdiscountAmount(String presentRefundMdiscountAmount) {
		this.presentRefundMdiscountAmount = presentRefundMdiscountAmount;
	}

    /**
     * Gets present refund mdiscount amount.
     *
     * @return the present refund mdiscount amount
     */
    public String getPresentRefundMdiscountAmount( ) {
		return this.presentRefundMdiscountAmount;
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
     * Gets refund amount.
     *
     * @return the refund amount
     */
    public String getRefundAmount( ) {
		return this.refundAmount;
	}

    /**
     * Sets refund reason.
     *
     * @param refundReason the refund reason
     */
    public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

    /**
     * Gets refund reason.
     *
     * @return the refund reason
     */
    public String getRefundReason( ) {
		return this.refundReason;
	}

    /**
     * Sets refund royaltys.
     *
     * @param refundRoyaltys the refund royaltys
     */
    public void setRefundRoyaltys(List<RefundRoyaltyResult> refundRoyaltys) {
		this.refundRoyaltys = refundRoyaltys;
	}

    /**
     * Gets refund royaltys.
     *
     * @return the refund royaltys
     */
    public List<RefundRoyaltyResult> getRefundRoyaltys( ) {
		return this.refundRoyaltys;
	}

    /**
     * Sets refund status.
     *
     * @param refundStatus the refund status
     */
    public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

    /**
     * Gets refund status.
     *
     * @return the refund status
     */
    public String getRefundStatus( ) {
		return this.refundStatus;
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

}
