package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车超人退款节接口
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:25
 */
public class AlipayEcoMycarTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4563148884859965242L;

	/**
	 * 渠道平台
	 */
	@ApiField("isv")
	private String isv;

	/**
	 * 退款金额(分)
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 退款交易编号
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Gets isv.
     *
     * @return the isv
     */
    public String getIsv() {
		return this.isv;
	}

    /**
     * Sets isv.
     *
     * @param isv the isv
     */
    public void setIsv(String isv) {
		this.isv = isv;
	}

    /**
     * Gets refund fee.
     *
     * @return the refund fee
     */
    public String getRefundFee() {
		return this.refundFee;
	}

    /**
     * Sets refund fee.
     *
     * @param refundFee the refund fee
     */
    public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
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
