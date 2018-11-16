package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量退款明细结果
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:39
 */
public class BatchRefundDetailResult extends AlipayObject {

	private static final long serialVersionUID = 6413256218862261196L;

	/**
	 * 商户请求批量退款时传递的批次号。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 充退状态：S成功，F失败，P处理中。
	 */
	@ApiField("dback_status")
	private String dbackStatus;

	/**
	 * 预估银行响应时间
	 */
	@ApiField("est_bank_ack_time")
	private String estBankAckTime;

	/**
	 * 预估银行入账时间
	 */
	@ApiField("est_bank_receipt_time")
	private String estBankReceiptTime;

	/**
	 * 是否有充退
	 */
	@ApiField("has_deposit_back")
	private Boolean hasDepositBack;

	/**
	 * 退款金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退分润信息列表
	 */
	@ApiListField("refund_royaltys")
	@ApiField("refund_royalty_result")
	private List<RefundRoyaltyResult> refundRoyaltys;

	/**
	 * 退补差金额
	 */
	@ApiField("refund_suppl_amount")
	private String refundSupplAmount;

	/**
	 * 退补差结果码
	 */
	@ApiField("refund_suppl_result_code")
	private String refundSupplResultCode;

	/**
	 * 剩余补差金额
	 */
	@ApiField("rest_suppl_amount")
	private String restSupplAmount;

	/**
	 * 交易退款结果码。如果成功为SUCCESS，如果处理中为PROCESSING，其它情况为错误码。
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 退款解冻信息
	 */
	@ApiField("unfreeze_details")
	private RefundUnfreezeResult unfreezeDetails;

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets dback status.
     *
     * @return the dback status
     */
    public String getDbackStatus() {
		return this.dbackStatus;
	}

    /**
     * Sets dback status.
     *
     * @param dbackStatus the dback status
     */
    public void setDbackStatus(String dbackStatus) {
		this.dbackStatus = dbackStatus;
	}

    /**
     * Gets est bank ack time.
     *
     * @return the est bank ack time
     */
    public String getEstBankAckTime() {
		return this.estBankAckTime;
	}

    /**
     * Sets est bank ack time.
     *
     * @param estBankAckTime the est bank ack time
     */
    public void setEstBankAckTime(String estBankAckTime) {
		this.estBankAckTime = estBankAckTime;
	}

    /**
     * Gets est bank receipt time.
     *
     * @return the est bank receipt time
     */
    public String getEstBankReceiptTime() {
		return this.estBankReceiptTime;
	}

    /**
     * Sets est bank receipt time.
     *
     * @param estBankReceiptTime the est bank receipt time
     */
    public void setEstBankReceiptTime(String estBankReceiptTime) {
		this.estBankReceiptTime = estBankReceiptTime;
	}

    /**
     * Gets has deposit back.
     *
     * @return the has deposit back
     */
    public Boolean getHasDepositBack() {
		return this.hasDepositBack;
	}

    /**
     * Sets has deposit back.
     *
     * @param hasDepositBack the has deposit back
     */
    public void setHasDepositBack(Boolean hasDepositBack) {
		this.hasDepositBack = hasDepositBack;
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
     * Gets refund royaltys.
     *
     * @return the refund royaltys
     */
    public List<RefundRoyaltyResult> getRefundRoyaltys() {
		return this.refundRoyaltys;
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
     * Gets refund suppl result code.
     *
     * @return the refund suppl result code
     */
    public String getRefundSupplResultCode() {
		return this.refundSupplResultCode;
	}

    /**
     * Sets refund suppl result code.
     *
     * @param refundSupplResultCode the refund suppl result code
     */
    public void setRefundSupplResultCode(String refundSupplResultCode) {
		this.refundSupplResultCode = refundSupplResultCode;
	}

    /**
     * Gets rest suppl amount.
     *
     * @return the rest suppl amount
     */
    public String getRestSupplAmount() {
		return this.restSupplAmount;
	}

    /**
     * Sets rest suppl amount.
     *
     * @param restSupplAmount the rest suppl amount
     */
    public void setRestSupplAmount(String restSupplAmount) {
		this.restSupplAmount = restSupplAmount;
	}

    /**
     * Gets result code.
     *
     * @return the result code
     */
    public String getResultCode() {
		return this.resultCode;
	}

    /**
     * Sets result code.
     *
     * @param resultCode the result code
     */
    public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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

    /**
     * Gets unfreeze details.
     *
     * @return the unfreeze details
     */
    public RefundUnfreezeResult getUnfreezeDetails() {
		return this.unfreezeDetails;
	}

    /**
     * Sets unfreeze details.
     *
     * @param unfreezeDetails the unfreeze details
     */
    public void setUnfreezeDetails(RefundUnfreezeResult unfreezeDetails) {
		this.unfreezeDetails = unfreezeDetails;
	}

}
