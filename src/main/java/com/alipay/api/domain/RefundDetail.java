package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款明细信息
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:26
 */
public class RefundDetail extends AlipayObject {

	private static final long serialVersionUID = 8749871476972346276L;

	/**
	 * 交易退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款备注
	 */
	@ApiField("refund_memo")
	private String refundMemo;

	/**
	 * 退分润列表
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_info")
	private List<RefundRoyaltyInfo> refundRoyaltys;

	/**
	 * 退补差金额
	 */
	@ApiField("refund_suppl_amount")
	private String refundSupplAmount;

	/**
	 * 退补差备注
	 */
	@ApiField("refund_suppl_memo")
	private String refundSupplMemo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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
     * Gets refund memo.
     *
     * @return the refund memo
     */
    public String getRefundMemo() {
		return this.refundMemo;
	}

    /**
     * Sets refund memo.
     *
     * @param refundMemo the refund memo
     */
    public void setRefundMemo(String refundMemo) {
		this.refundMemo = refundMemo;
	}

    /**
     * Gets refund royaltys.
     *
     * @return the refund royaltys
     */
    public List<RefundRoyaltyInfo> getRefundRoyaltys() {
		return this.refundRoyaltys;
	}

    /**
     * Sets refund royaltys.
     *
     * @param refundRoyaltys the refund royaltys
     */
    public void setRefundRoyaltys(List<RefundRoyaltyInfo> refundRoyaltys) {
		this.refundRoyaltys = refundRoyaltys;
	}

    /**
     * Gets refund suppl amount.
     *
     * @return the refund suppl amount
     */
    public String getRefundSupplAmount() {
		return this.refundSupplAmount;
	}

    /**
     * Sets refund suppl amount.
     *
     * @param refundSupplAmount the refund suppl amount
     */
    public void setRefundSupplAmount(String refundSupplAmount) {
		this.refundSupplAmount = refundSupplAmount;
	}

    /**
     * Gets refund suppl memo.
     *
     * @return the refund suppl memo
     */
    public String getRefundSupplMemo() {
		return this.refundSupplMemo;
	}

    /**
     * Sets refund suppl memo.
     *
     * @param refundSupplMemo the refund suppl memo
     */
    public void setRefundSupplMemo(String refundSupplMemo) {
		this.refundSupplMemo = refundSupplMemo;
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
