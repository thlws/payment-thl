package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批次明细数据
 *
 * @author auto create
 * @since 1.0, 2018-07-20 12:10:02
 */
public class BatchDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3446836264181693949L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 明细批次号
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 调用方扩充参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 失败原因：在status为fail时此字段不为空
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 最后修改时间，指失败时间、成功时间、创建时间等，明细最后一次变更状态的时间
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * 付款人留言
	 */
	@ApiField("message")
	private String message;

	/**
	 * 付款金额，单位为元，有两位小数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付成功时间
	 */
	@ApiField("pay_success_date")
	private Date paySuccessDate;

	/**
	 * 批次明细状态
AVAILABLE：可付款
SUCCESS：付款成功
	 */
	@ApiField("status")
	private String status;

	/**
	 * 付款订单号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	/**
	 * 付款人UID
	 */
	@ApiField("user_id")
	private String userId;

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
     * Gets detail no.
     *
     * @return the detail no
     */
    public String getDetailNo() {
		return this.detailNo;
	}

    /**
     * Sets detail no.
     *
     * @param detailNo the detail no
     */
    public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

    /**
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam() {
		return this.extParam;
	}

    /**
     * Sets ext param.
     *
     * @param extParam the ext param
     */
    public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

    /**
     * Gets fail message.
     *
     * @return the fail message
     */
    public String getFailMessage() {
		return this.failMessage;
	}

    /**
     * Sets fail message.
     *
     * @param failMessage the fail message
     */
    public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}

    /**
     * Gets last modified.
     *
     * @return the last modified
     */
    public Date getLastModified() {
		return this.lastModified;
	}

    /**
     * Sets last modified.
     *
     * @param lastModified the last modified
     */
    public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
		return this.message;
	}

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
		this.message = message;
	}

    /**
     * Gets pay amount.
     *
     * @return the pay amount
     */
    public String getPayAmount() {
		return this.payAmount;
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
     * Gets pay success date.
     *
     * @return the pay success date
     */
    public Date getPaySuccessDate() {
		return this.paySuccessDate;
	}

    /**
     * Sets pay success date.
     *
     * @param paySuccessDate the pay success date
     */
    public void setPaySuccessDate(Date paySuccessDate) {
		this.paySuccessDate = paySuccessDate;
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
     * Gets transfer no.
     *
     * @return the transfer no
     */
    public String getTransferNo() {
		return this.transferNo;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
