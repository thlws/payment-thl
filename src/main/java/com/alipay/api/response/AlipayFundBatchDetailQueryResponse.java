package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.batch.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-24 11:35:00
 */
public class AlipayFundBatchDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6817861265165978953L;

	/** 
	 * 1）当biz_code为BATCH_TRANS_ACC时，该字段不为空，返回明细信息。biz_code为其他值时忽略该参数。
2）当批次状态为INIT状态时，明细信息还未落地，返回明细信息为空
3）如果以上都没有问题，返回明细为空，请检查是否以下情况导致：
1. 校验商户只能查询自己上传的批次信息，批次号不存在或者不是该商户上传的批次。
2. 查询条件没有查询到结果，包括总共5页，商户要求查询第6页的内容。
3. 查询的状态不存在。
	 */
	@ApiListField("acc_detail_list")
	@ApiField("acc_detail_model")
	private List<AccDetailModel> accDetailList;

	/** 
	 * 商户请求的批次流水号，同请求中的"batch_no"。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 批次状态。
INIT	批次已接收
WAIT_APPLY 批次资金准备中
DEALING 批次处理中
FINISH 批次处理完成
FAIL 全部处理失败
UNKNOWN 未知状态
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 支付宝系统内部批次请求id。
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

	/** 
	 * 批量代发业务标识。

批量代发到支付宝账户：BATCH_TRANS_ACC
批量代发到银行账户：BATCH_TRANS_BC
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 批量代发业务场景。

GLOBAL：全球代发，多币种代发（包括除人民币以外的同币种代发），需要支付宝做货币兑换。
LOCAL：纯人民币代发，不需要支付宝做货币兑换。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 批次失败错误码. 
大部分情况是没有的. 只有余额不足超时关闭或者付款方账户状态不正常
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 批次失败错误原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前记录数（默认500，达不到500按实际记录返回）。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 付款方需要支付的金额，受理成功（status为APPLIED）之后才会有值，受理成功之前是0。
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/** 
	 * 支付币种, 与代发请求的payment_currency相同.
	 */
	@ApiField("payment_currency")
	private String paymentCurrency;

	/** 
	 * 签约了批量代发产品的支付宝账号。
	 */
	@ApiField("sign_principal")
	private String signPrincipal;

	/** 
	 * 总记录数
	 */
	@ApiField("total_item_count")
	private Long totalItemCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

    /**
     * Sets acc detail list.
     *
     * @param accDetailList the acc detail list
     */
    public void setAccDetailList(List<AccDetailModel> accDetailList) {
		this.accDetailList = accDetailList;
	}

    /**
     * Gets acc detail list.
     *
     * @return the acc detail list
     */
    public List<AccDetailModel> getAccDetailList( ) {
		return this.accDetailList;
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
     * Sets batch trans id.
     *
     * @param batchTransId the batch trans id
     */
    public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}

    /**
     * Gets batch trans id.
     *
     * @return the batch trans id
     */
    public String getBatchTransId( ) {
		return this.batchTransId;
	}

    /**
     * Sets biz code.
     *
     * @param bizCode the biz code
     */
    public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

    /**
     * Gets biz code.
     *
     * @return the biz code
     */
    public String getBizCode( ) {
		return this.bizCode;
	}

    /**
     * Sets biz scene.
     *
     * @param bizScene the biz scene
     */
    public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

    /**
     * Gets biz scene.
     *
     * @return the biz scene
     */
    public String getBizScene( ) {
		return this.bizScene;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets fail reason.
     *
     * @param failReason the fail reason
     */
    public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

    /**
     * Gets fail reason.
     *
     * @return the fail reason
     */
    public String getFailReason( ) {
		return this.failReason;
	}

    /**
     * Sets page num.
     *
     * @param pageNum the page num
     */
    public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

    /**
     * Gets page num.
     *
     * @return the page num
     */
    public Long getPageNum( ) {
		return this.pageNum;
	}

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public Long getPageSize( ) {
		return this.pageSize;
	}

    /**
     * Sets payment amount.
     *
     * @param paymentAmount the payment amount
     */
    public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

    /**
     * Gets payment amount.
     *
     * @return the payment amount
     */
    public String getPaymentAmount( ) {
		return this.paymentAmount;
	}

    /**
     * Sets payment currency.
     *
     * @param paymentCurrency the payment currency
     */
    public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

    /**
     * Gets payment currency.
     *
     * @return the payment currency
     */
    public String getPaymentCurrency( ) {
		return this.paymentCurrency;
	}

    /**
     * Sets sign principal.
     *
     * @param signPrincipal the sign principal
     */
    public void setSignPrincipal(String signPrincipal) {
		this.signPrincipal = signPrincipal;
	}

    /**
     * Gets sign principal.
     *
     * @return the sign principal
     */
    public String getSignPrincipal( ) {
		return this.signPrincipal;
	}

    /**
     * Sets total item count.
     *
     * @param totalItemCount the total item count
     */
    public void setTotalItemCount(Long totalItemCount) {
		this.totalItemCount = totalItemCount;
	}

    /**
     * Gets total item count.
     *
     * @return the total item count
     */
    public Long getTotalItemCount( ) {
		return this.totalItemCount;
	}

    /**
     * Sets total page count.
     *
     * @param totalPageCount the total page count
     */
    public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

    /**
     * Gets total page count.
     *
     * @return the total page count
     */
    public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
