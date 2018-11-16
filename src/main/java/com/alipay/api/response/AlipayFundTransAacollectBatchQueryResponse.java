package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BatchDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.batch.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-20 12:30:00
 */
public class AlipayFundTransAacollectBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8515692524593613616L;

	/** 
	 * 批次说明
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 批次状态
     * INAVAILABLE：系统异常
     * AVAILABLE：可付款
     * SUCCESS：所有的单据创建成功并且都付款成功
     * TIMEOUT：已过期（时间过期且未成功的批次均返回TIMEOUT）
     * STOP：停止收款（用户主动停止收款，且批次未过期时返回STOP）
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 业务类型,客户端透传给收银台。默认值：biz_account_transfer
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 批次创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/** 
	 * 发起方（收款人）uid
	 */
	@ApiField("creater_user_id")
	private String createrUserId;

	/** 
	 * 付款明细list
	 */
	@ApiListField("detail_list")
	@ApiField("batch_detail_info")
	private List<BatchDetailInfo> detailList;

	/** 
	 * 调用方扩充参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 已付款明细list
	 */
	@ApiListField("paid_detail_list")
	@ApiField("batch_detail_info")
	private List<BatchDetailInfo> paidDetailList;

	/** 
	 * 单笔金额，单位为元，有两位小数
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/** 
	 * 收款总金额，单位为元，有两位小数
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/** 
	 * 收款方看到总金额（不包括自己）例如：100元3个人AA，收款人看到的是33.34*2=66.68
	 */
	@ApiField("pay_amount_total_for_receiver")
	private String payAmountTotalForReceiver;

	/** 
	 * 实际要创建的笔数：AA如果包括自己这里为show_items_total-1，如果不包括自己这里为show_items_total
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/** 
	 * 显示总笔数
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

	/** 
	 * 已付总笔数
	 */
	@ApiField("success_amount_total")
	private String successAmountTotal;

	/** 
	 * 过期时间值，单位小时
	 */
	@ApiField("time_out_value")
	private String timeOutValue;

	/** 
	 * 未付款明细list
	 */
	@ApiListField("unpaid_detail_list")
	@ApiField("batch_detail_info")
	private List<BatchDetailInfo> unpaidDetailList;

    /**
     * Sets batch memo.
     *
     * @param batchMemo the batch memo
     */
    public void setBatchMemo(String batchMemo) {
		this.batchMemo = batchMemo;
	}

    /**
     * Gets batch memo.
     *
     * @return the batch memo
     */
    public String getBatchMemo( ) {
		return this.batchMemo;
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
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo( ) {
		return this.batchNo;
	}

    /**
     * Sets batch status.
     *
     * @param batchStatus the batch status
     */
    public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}

    /**
     * Gets batch status.
     *
     * @return the batch status
     */
    public String getBatchStatus( ) {
		return this.batchStatus;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType( ) {
		return this.bizType;
	}

    /**
     * Sets create date.
     *
     * @param createDate the create date
     */
    public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

    /**
     * Gets create date.
     *
     * @return the create date
     */
    public Date getCreateDate( ) {
		return this.createDate;
	}

    /**
     * Sets creater user id.
     *
     * @param createrUserId the creater user id
     */
    public void setCreaterUserId(String createrUserId) {
		this.createrUserId = createrUserId;
	}

    /**
     * Gets creater user id.
     *
     * @return the creater user id
     */
    public String getCreaterUserId( ) {
		return this.createrUserId;
	}

    /**
     * Sets detail list.
     *
     * @param detailList the detail list
     */
    public void setDetailList(List<BatchDetailInfo> detailList) {
		this.detailList = detailList;
	}

    /**
     * Gets detail list.
     *
     * @return the detail list
     */
    public List<BatchDetailInfo> getDetailList( ) {
		return this.detailList;
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
     * Gets ext param.
     *
     * @return the ext param
     */
    public String getExtParam( ) {
		return this.extParam;
	}

    /**
     * Sets paid detail list.
     *
     * @param paidDetailList the paid detail list
     */
    public void setPaidDetailList(List<BatchDetailInfo> paidDetailList) {
		this.paidDetailList = paidDetailList;
	}

    /**
     * Gets paid detail list.
     *
     * @return the paid detail list
     */
    public List<BatchDetailInfo> getPaidDetailList( ) {
		return this.paidDetailList;
	}

    /**
     * Sets pay amount single.
     *
     * @param payAmountSingle the pay amount single
     */
    public void setPayAmountSingle(String payAmountSingle) {
		this.payAmountSingle = payAmountSingle;
	}

    /**
     * Gets pay amount single.
     *
     * @return the pay amount single
     */
    public String getPayAmountSingle( ) {
		return this.payAmountSingle;
	}

    /**
     * Sets pay amount total.
     *
     * @param payAmountTotal the pay amount total
     */
    public void setPayAmountTotal(String payAmountTotal) {
		this.payAmountTotal = payAmountTotal;
	}

    /**
     * Gets pay amount total.
     *
     * @return the pay amount total
     */
    public String getPayAmountTotal( ) {
		return this.payAmountTotal;
	}

    /**
     * Sets pay amount total for receiver.
     *
     * @param payAmountTotalForReceiver the pay amount total for receiver
     */
    public void setPayAmountTotalForReceiver(String payAmountTotalForReceiver) {
		this.payAmountTotalForReceiver = payAmountTotalForReceiver;
	}

    /**
     * Gets pay amount total for receiver.
     *
     * @return the pay amount total for receiver
     */
    public String getPayAmountTotalForReceiver( ) {
		return this.payAmountTotalForReceiver;
	}

    /**
     * Sets real items total.
     *
     * @param realItemsTotal the real items total
     */
    public void setRealItemsTotal(String realItemsTotal) {
		this.realItemsTotal = realItemsTotal;
	}

    /**
     * Gets real items total.
     *
     * @return the real items total
     */
    public String getRealItemsTotal( ) {
		return this.realItemsTotal;
	}

    /**
     * Sets show items total.
     *
     * @param showItemsTotal the show items total
     */
    public void setShowItemsTotal(String showItemsTotal) {
		this.showItemsTotal = showItemsTotal;
	}

    /**
     * Gets show items total.
     *
     * @return the show items total
     */
    public String getShowItemsTotal( ) {
		return this.showItemsTotal;
	}

    /**
     * Sets success amount total.
     *
     * @param successAmountTotal the success amount total
     */
    public void setSuccessAmountTotal(String successAmountTotal) {
		this.successAmountTotal = successAmountTotal;
	}

    /**
     * Gets success amount total.
     *
     * @return the success amount total
     */
    public String getSuccessAmountTotal( ) {
		return this.successAmountTotal;
	}

    /**
     * Sets time out value.
     *
     * @param timeOutValue the time out value
     */
    public void setTimeOutValue(String timeOutValue) {
		this.timeOutValue = timeOutValue;
	}

    /**
     * Gets time out value.
     *
     * @return the time out value
     */
    public String getTimeOutValue( ) {
		return this.timeOutValue;
	}

    /**
     * Sets unpaid detail list.
     *
     * @param unpaidDetailList the unpaid detail list
     */
    public void setUnpaidDetailList(List<BatchDetailInfo> unpaidDetailList) {
		this.unpaidDetailList = unpaidDetailList;
	}

    /**
     * Gets unpaid detail list.
     *
     * @return the unpaid detail list
     */
    public List<BatchDetailInfo> getUnpaidDetailList( ) {
		return this.unpaidDetailList;
	}

}
