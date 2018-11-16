package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 明细的查询结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class QueryDetailAopResult extends AlipayObject {

	private static final long serialVersionUID = 7418931526362746215L;

	/**
	 * 批次编号；此单据对应的批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 明细编号
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 扩展属性；创建付款单时传入的数据
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 失败原因：在status为fail时此字段不为空
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 明细最后一次变更的时间
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * 单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 收／付款金额；单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 收款人userId
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 付款人userId
	 */
	@ApiField("payer_id")
	private String payerId;

	/**
	 * 服务费，单位为元
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/**
	 * 批次明细状态；注：AVAILABLE：可付款；SUCCESS：付款成功；FAIL：失败
	 */
	@ApiField("status")
	private String status;

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
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
     * Gets payee id.
     *
     * @return the payee id
     */
    public String getPayeeId() {
		return this.payeeId;
	}

    /**
     * Sets payee id.
     *
     * @param payeeId the payee id
     */
    public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

    /**
     * Gets payer id.
     *
     * @return the payer id
     */
    public String getPayerId() {
		return this.payerId;
	}

    /**
     * Sets payer id.
     *
     * @param payerId the payer id
     */
    public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

    /**
     * Gets service charge.
     *
     * @return the service charge
     */
    public String getServiceCharge() {
		return this.serviceCharge;
	}

    /**
     * Sets service charge.
     *
     * @param serviceCharge the service charge
     */
    public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
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

}
