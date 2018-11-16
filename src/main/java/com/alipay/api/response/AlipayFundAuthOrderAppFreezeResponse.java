package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.order.app.freeze response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 10:05:00
 */
public class AlipayFundAuthOrderAppFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8113872859787762961L;

	/** 
	 * 本次操作冻结的金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝的资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 本次冻结操作中信用冻结金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/** 
	 * 本次冻结操作中自有资金冻结金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("fund_amount")
	private String fundAmount;

	/** 
	 * 资金授权成功时间
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝的资金操作流水号
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
	 * 付款方支付宝用户号
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/** 
	 * 预授权类型，目前支持 CREDIT_AUTH(信用预授权);
商户可根据该标识来判断该笔预授权的类型，当返回值为"CREDIT_AUTH"表明该笔预授权为信用预授权，没有真实冻结资金；当返回值为空或者不为"CREDIT_AUTH"则表明该笔预授权为普通资金预授权，会冻结用户资金。
	 */
	@ApiField("pre_auth_type")
	private String preAuthType;

	/** 
	 * 资金预授权明细的状态
目前支持：  
INIT：初始
SUCCESS: 成功
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
     * Sets payer user id.
     *
     * @param payerUserId the payer user id
     */
    public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

    /**
     * Gets payer user id.
     *
     * @return the payer user id
     */
    public String getPayerUserId( ) {
		return this.payerUserId;
	}

    /**
     * Sets pre auth type.
     *
     * @param preAuthType the pre auth type
     */
    public void setPreAuthType(String preAuthType) {
		this.preAuthType = preAuthType;
	}

    /**
     * Gets pre auth type.
     *
     * @return the pre auth type
     */
    public String getPreAuthType( ) {
		return this.preAuthType;
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
