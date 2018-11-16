package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批次资金模型。
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:31:15
 */
public class BatchFundItemAOPModel extends AlipayObject {

	private static final long serialVersionUID = 2377211878778188964L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private Long batchNo;

	/**
	 * 退款到银行卡处理中的总金额
	 */
	@ApiField("dback_refundtobank_processing_batch_amount")
	private String dbackRefundtobankProcessingBatchAmount;

	/**
	 * 退款到银行卡成功的总金额
	 */
	@ApiField("dback_refundtobank_success_batch_amount")
	private String dbackRefundtobankSuccessBatchAmount;

	/**
	 * 资金明细列表
	 */
	@ApiListField("fund_item_list")
	@ApiField("fund_item_a_o_p_model")
	private List<FundItemAOPModel> fundItemList;

	/**
	 * 批次创建时间
	 */
	@ApiField("gmt_biz_create_date")
	private Date gmtBizCreateDate;

	/**
	 * 资金单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 包含服务费的总金额
	 */
	@ApiField("total_amount_with_service_fee")
	private String totalAmountWithServiceFee;

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public Long getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(Long batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets dback refundtobank processing batch amount.
     *
     * @return the dback refundtobank processing batch amount
     */
    public String getDbackRefundtobankProcessingBatchAmount() {
		return this.dbackRefundtobankProcessingBatchAmount;
	}

    /**
     * Sets dback refundtobank processing batch amount.
     *
     * @param dbackRefundtobankProcessingBatchAmount the dback refundtobank processing batch amount
     */
    public void setDbackRefundtobankProcessingBatchAmount(String dbackRefundtobankProcessingBatchAmount) {
		this.dbackRefundtobankProcessingBatchAmount = dbackRefundtobankProcessingBatchAmount;
	}

    /**
     * Gets dback refundtobank success batch amount.
     *
     * @return the dback refundtobank success batch amount
     */
    public String getDbackRefundtobankSuccessBatchAmount() {
		return this.dbackRefundtobankSuccessBatchAmount;
	}

    /**
     * Sets dback refundtobank success batch amount.
     *
     * @param dbackRefundtobankSuccessBatchAmount the dback refundtobank success batch amount
     */
    public void setDbackRefundtobankSuccessBatchAmount(String dbackRefundtobankSuccessBatchAmount) {
		this.dbackRefundtobankSuccessBatchAmount = dbackRefundtobankSuccessBatchAmount;
	}

    /**
     * Gets fund item list.
     *
     * @return the fund item list
     */
    public List<FundItemAOPModel> getFundItemList() {
		return this.fundItemList;
	}

    /**
     * Sets fund item list.
     *
     * @param fundItemList the fund item list
     */
    public void setFundItemList(List<FundItemAOPModel> fundItemList) {
		this.fundItemList = fundItemList;
	}

    /**
     * Gets gmt biz create date.
     *
     * @return the gmt biz create date
     */
    public Date getGmtBizCreateDate() {
		return this.gmtBizCreateDate;
	}

    /**
     * Sets gmt biz create date.
     *
     * @param gmtBizCreateDate the gmt biz create date
     */
    public void setGmtBizCreateDate(Date gmtBizCreateDate) {
		this.gmtBizCreateDate = gmtBizCreateDate;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public String getTotalAmount() {
		return this.totalAmount;
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
     * Gets total amount with service fee.
     *
     * @return the total amount with service fee
     */
    public String getTotalAmountWithServiceFee() {
		return this.totalAmountWithServiceFee;
	}

    /**
     * Sets total amount with service fee.
     *
     * @param totalAmountWithServiceFee the total amount with service fee
     */
    public void setTotalAmountWithServiceFee(String totalAmountWithServiceFee) {
		this.totalAmountWithServiceFee = totalAmountWithServiceFee;
	}

}
