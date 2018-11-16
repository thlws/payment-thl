package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.thirdparty.reward.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-13 19:52:55
 */
public class AlipayFundTransThirdpartyRewardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2736981254532369572L;

	/** 
	 * 打赏金额，单位：人民币分
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 打赏未成功时的错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 打赏时间，毫秒数
	 */
	@ApiField("last_modified")
	private String lastModified;

	/** 
	 * 被打赏用户支付宝UserId
	 */
	@ApiField("receiver_user_id")
	private String receiverUserId;

	/** 
	 * 打赏用户支付宝UserId
	 */
	@ApiField("sender_user_id")
	private String senderUserId;

	/** 
	 * 打赏状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 转账单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(String amount) {
		this.amount = amount;
	}

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public String getAmount( ) {
		return this.amount;
	}

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg( ) {
		return this.errorMsg;
	}

    /**
     * Sets last modified.
     *
     * @param lastModified the last modified
     */
    public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

    /**
     * Gets last modified.
     *
     * @return the last modified
     */
    public String getLastModified( ) {
		return this.lastModified;
	}

    /**
     * Sets receiver user id.
     *
     * @param receiverUserId the receiver user id
     */
    public void setReceiverUserId(String receiverUserId) {
		this.receiverUserId = receiverUserId;
	}

    /**
     * Gets receiver user id.
     *
     * @return the receiver user id
     */
    public String getReceiverUserId( ) {
		return this.receiverUserId;
	}

    /**
     * Sets sender user id.
     *
     * @param senderUserId the sender user id
     */
    public void setSenderUserId(String senderUserId) {
		this.senderUserId = senderUserId;
	}

    /**
     * Gets sender user id.
     *
     * @return the sender user id
     */
    public String getSenderUserId( ) {
		return this.senderUserId;
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
     * Sets transfer no.
     *
     * @param transferNo the transfer no
     */
    public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

    /**
     * Gets transfer no.
     *
     * @return the transfer no
     */
    public String getTransferNo( ) {
		return this.transferNo;
	}

}
