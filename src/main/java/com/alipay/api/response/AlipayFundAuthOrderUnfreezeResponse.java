package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.order.unfreeze response.
 *
 * @author auto create
 * @since 1.0, 2018-07-23 11:40:00
 */
public class AlipayFundAuthOrderUnfreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4791274641647172319L;

	/** 
	 * 本次操作解冻的金额，单位为：元（人民币），精确到小数点后两位，取值范围：[0.01,100000000.00]
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 本次解冻操作中信用解冻金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/** 
	 * 本次解冻操作中自有资金解冻金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("fund_amount")
	private String fundAmount;

	/** 
	 * 授权资金解冻成功时间，格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝资金操作流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户本次资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 资金操作流水的状态
目前支持：  INIT：初始
SUCCESS：成功
CLOSED：关闭
	 */
	@ApiField("status")
	private String status;

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
     * Sets auth no.
     *
     * @param authNo the auth no
     */
    public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

    /**
     * Gets auth no.
     *
     * @return the auth no
     */
    public String getAuthNo( ) {
		return this.authNo;
	}

    /**
     * Sets credit amount.
     *
     * @param creditAmount the credit amount
     */
    public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

    /**
     * Gets credit amount.
     *
     * @return the credit amount
     */
    public String getCreditAmount( ) {
		return this.creditAmount;
	}

    /**
     * Sets fund amount.
     *
     * @param fundAmount the fund amount
     */
    public void setFundAmount(String fundAmount) {
		this.fundAmount = fundAmount;
	}

    /**
     * Gets fund amount.
     *
     * @return the fund amount
     */
    public String getFundAmount( ) {
		return this.fundAmount;
	}

    /**
     * Sets gmt trans.
     *
     * @param gmtTrans the gmt trans
     */
    public void setGmtTrans(Date gmtTrans) {
		this.gmtTrans = gmtTrans;
	}

    /**
     * Gets gmt trans.
     *
     * @return the gmt trans
     */
    public Date getGmtTrans( ) {
		return this.gmtTrans;
	}

    /**
     * Sets operation id.
     *
     * @param operationId the operation id
     */
    public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

    /**
     * Gets operation id.
     *
     * @return the operation id
     */
    public String getOperationId( ) {
		return this.operationId;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

    /**
     * Sets out request no.
     *
     * @param outRequestNo the out request no
     */
    public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

    /**
     * Gets out request no.
     *
     * @return the out request no
     */
    public String getOutRequestNo( ) {
		return this.outRequestNo;
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

}
