package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 教育缴费账单状态同步接口
 *
 * @author auto create
 * @since 1.0, 2017-11-06 11:48:51
 */
public class AlipayEcoEduKtBillingModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4623425724269251769L;

	/**
	 * 退款时，支付宝返回的用户的登录id
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/**
	 * 支付宝返回的买家支付宝用户id
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 本次退款是否发生了资金变化
	 */
	@ApiField("fund_change")
	private String fundChange;

	/**
	 * 支付宝返回的退款时间，而不是商户退款申请的时间
	 */
	@ApiField("gmt_refund")
	private String gmtRefund;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * isv系统的订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 支付宝返回的退款资金渠道，json格式字符串
	 */
	@ApiField("refund_detail_item_list")
	private String refundDetailItemList;

	/**
	 * 退款原因，商家根据客户实际退款原因填写
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 状态：1:缴费成功，2:关闭账单，3、退费
如果为退款状态，需要填写以下字段,字段都是支付宝退款返回的必填参数
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝返回的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets buyer logon id.
     *
     * @return the buyer logon id
     */
    public String getBuyerLogonId() {
		return this.buyerLogonId;
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
     * Gets buyer user id.
     *
     * @return the buyer user id
     */
    public String getBuyerUserId() {
		return this.buyerUserId;
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
     * Gets fund change.
     *
     * @return the fund change
     */
    public String getFundChange() {
		return this.fundChange;
	}

    /**
     * Sets fund change.
     *
     * @param fundChange the fund change
     */
    public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
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
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo() {
		return this.outRequestNo;
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
     * Gets out trade no.
     *
     * @return the out trade no
     */
    public String getOutTradeNo() {
		return this.outTradeNo;
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
     * Gets refund detail item list.
     *
     * @return the refund detail item list
     */
    public String getRefundDetailItemList() {
		return this.refundDetailItemList;
	}

    /**
     * Sets refund detail item list.
     *
     * @param refundDetailItemList the refund detail item list
     */
    public void setRefundDetailItemList(String refundDetailItemList) {
		this.refundDetailItemList = refundDetailItemList;
	}

    /**
     * Gets refund reason.
     *
     * @return the refund reason
     */
    public String getRefundReason() {
		return this.refundReason;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
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

}
