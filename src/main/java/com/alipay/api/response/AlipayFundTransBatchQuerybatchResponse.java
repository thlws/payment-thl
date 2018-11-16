package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QueryDetailAopResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.batch.querybatch response.
 *
 * @author auto create
 * @since 1.0, 2017-02-22 15:54:17
 */
public class AlipayFundTransBatchQuerybatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 4184851271755769575L;

	/** 
	 * 收款理由：创建时传入的收款说明
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/** 
	 * 批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * INAVAILABLE:系统异常，
AVAILABLE：可付款，
FINISH：已完成，
SUCCESS：所有的单据创建成功并且都付款成功，
TIMEOUT：已过期
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * aa：AA收款，
general：活动收款，
support：群江湖救急
	 */
	@ApiField("batch_type")
	private String batchType;

	/** 
	 * 批次最后修改时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/** 
	 * 批次创建者id
	 */
	@ApiField("create_user_id")
	private String createUserId;

	/** 
	 * 批次详情
	 */
	@ApiField("detail_list")
	private QueryDetailAopResult detailList;

	/** 
	 * 扩展数据，创建批次时传入的扩展数据；注：长度限制100
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 单笔金额，单位为元。注： AA收款为平均后的金额；活动收款为单笔金额； 江湖救急没有值；即创建批次时传入的相关数据
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/** 
	 * 总金额，单位为元。注：AA为收款总金额；活动收款为份数和单笔金额的积；江湖救急为目标金额；即为创建批次时传入的相关数据
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/** 
	 * 实际要创建的笔数。注：AA包括自己这里为show_items_total-1；活动收款为填写的份数;江湖救急没有值；即创建批次时传入的相关值
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/** 
	 * 显示的总笔数。注：AA收款为选择的人数；活动收款为填写的份数；江湖救急没有值；即创建批次时传入的相关值
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

	/** 
	 * 已付总金额，单位为元
	 */
	@ApiField("success_amount_total")
	private String successAmountTotal;

	/** 
	 * 已付总笔数
	 */
	@ApiField("success_items_total")
	private String successItemsTotal;

	/** 
	 * 过期时间，单位为小时
	 */
	@ApiField("time_out_value")
	private String timeOutValue;

	/** 
	 * token：创建批次时下发的token
	 */
	@ApiField("token")
	private String token;

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
     * Sets batch type.
     *
     * @param batchType the batch type
     */
    public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

    /**
     * Gets batch type.
     *
     * @return the batch type
     */
    public String getBatchType( ) {
		return this.batchType;
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
     * Sets create user id.
     *
     * @param createUserId the create user id
     */
    public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

    /**
     * Gets create user id.
     *
     * @return the create user id
     */
    public String getCreateUserId( ) {
		return this.createUserId;
	}

    /**
     * Sets detail list.
     *
     * @param detailList the detail list
     */
    public void setDetailList(QueryDetailAopResult detailList) {
		this.detailList = detailList;
	}

    /**
     * Gets detail list.
     *
     * @return the detail list
     */
    public QueryDetailAopResult getDetailList( ) {
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
     * Sets success items total.
     *
     * @param successItemsTotal the success items total
     */
    public void setSuccessItemsTotal(String successItemsTotal) {
		this.successItemsTotal = successItemsTotal;
	}

    /**
     * Gets success items total.
     *
     * @return the success items total
     */
    public String getSuccessItemsTotal( ) {
		return this.successItemsTotal;
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
     * Sets token.
     *
     * @param token the token
     */
    public void setToken(String token) {
		this.token = token;
	}

    /**
     * Gets token.
     *
     * @return the token
     */
    public String getToken( ) {
		return this.token;
	}

}
