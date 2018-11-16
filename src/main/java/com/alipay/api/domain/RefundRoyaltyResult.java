package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退分润结果
 *
 * @author auto create
 * @since 1.0, 2016-11-21 12:06:39
 */
public class RefundRoyaltyResult extends AlipayObject {

	private static final long serialVersionUID = 4142476646327327248L;

	/**
	 * 退分润金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退分润结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 转入人支付宝账号对应用户ID
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 转入人支付宝账号
	 */
	@ApiField("trans_in_email")
	private String transInEmail;

	/**
	 * 转出人支付宝账号对应用户ID
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 转出人支付宝账号
	 */
	@ApiField("trans_out_email")
	private String transOutEmail;

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
     * Gets trans in.
     *
     * @return the trans in
     */
    public String getTransIn() {
		return this.transIn;
	}

    /**
     * Sets trans in.
     *
     * @param transIn the trans in
     */
    public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

    /**
     * Gets trans in email.
     *
     * @return the trans in email
     */
    public String getTransInEmail() {
		return this.transInEmail;
	}

    /**
     * Sets trans in email.
     *
     * @param transInEmail the trans in email
     */
    public void setTransInEmail(String transInEmail) {
		this.transInEmail = transInEmail;
	}

    /**
     * Gets trans out.
     *
     * @return the trans out
     */
    public String getTransOut() {
		return this.transOut;
	}

    /**
     * Sets trans out.
     *
     * @param transOut the trans out
     */
    public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

    /**
     * Gets trans out email.
     *
     * @return the trans out email
     */
    public String getTransOutEmail() {
		return this.transOutEmail;
	}

    /**
     * Sets trans out email.
     *
     * @param transOutEmail the trans out email
     */
    public void setTransOutEmail(String transOutEmail) {
		this.transOutEmail = transOutEmail;
	}

}
