package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.operation.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-13 12:40:46
 */
public class AlipayFundCouponOperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7245333197912239438L;

	/** 
	 * 该支付宝操作流水操作金额，单位为：元（人民币）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 商户请求创建预授权订单时传入的扩展参数（merchantExt, orderExpiredTime）
	 */
	@ApiField("extra_param")
	private String extraParam;

	/** 
	 * 资金授权单据操作流水创建时间，
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 支付宝账务处理成功时间，
格式：YYYY-MM-DD HH:MM:SS
	 */
	@ApiField("gmt_trans")
	private Date gmtTrans;

	/** 
	 * 支付宝资金操作流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 支付宝资金操作类型。
目前支持： 
PAY：支付
REFUND：退款
	 */
	@ApiField("operation_type")
	private String operationType;

	/** 
	 * 业务订单的简单描述，如商品名称等
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 商户的授权资金订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户资金操作的请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 收款方支付宝账号（Email或手机号）。仅作展示使用，默认会加“*”号处理
	 */
	@ApiField("payee_logon_id")
	private String payeeLogonId;

	/** 
	 * 收款方支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/** 
	 * 付款方支付宝账号（Email或手机号）。仅作展示使用，默认会加“*”号处理
	 */
	@ApiField("payer_logon_id")
	private String payerLogonId;

	/** 
	 * 付款方支付宝账号对应的支付宝唯一用户号。
以2088开头的16位纯数字组成。
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/** 
	 * 商户对本次操作的附言描述，长度不超过100个字母或50个汉字
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 资金操作流水的状态，
目前支持： 
INIT：初始
SUCCESS：成功
CLOSED：关闭
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 红包总退回金额，单位为：元（人民币）
	 */
	@ApiField("total_pay_refund_amount")
	private String totalPayRefundAmount;

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
     * Sets extra param.
     *
     * @param extraParam the extra param
     */
    public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

    /**
     * Gets extra param.
     *
     * @return the extra param
     */
    public String getExtraParam( ) {
		return this.extraParam;
	}

    /**
     * Sets gmt create.
     *
     * @param gmtCreate the gmt create
     */
    public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Gets gmt create.
     *
     * @return the gmt create
     */
    public Date getGmtCreate( ) {
		return this.gmtCreate;
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
     * Sets operation type.
     *
     * @param operationType the operation type
     */
    public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

    /**
     * Gets operation type.
     *
     * @return the operation type
     */
    public String getOperationType( ) {
		return this.operationType;
	}

    /**
     * Sets order title.
     *
     * @param orderTitle the order title
     */
    public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

    /**
     * Gets order title.
     *
     * @return the order title
     */
    public String getOrderTitle( ) {
		return this.orderTitle;
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
     * Sets payee logon id.
     *
     * @param payeeLogonId the payee logon id
     */
    public void setPayeeLogonId(String payeeLogonId) {
		this.payeeLogonId = payeeLogonId;
	}

    /**
     * Gets payee logon id.
     *
     * @return the payee logon id
     */
    public String getPayeeLogonId( ) {
		return this.payeeLogonId;
	}

    /**
     * Sets payee user id.
     *
     * @param payeeUserId the payee user id
     */
    public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

    /**
     * Gets payee user id.
     *
     * @return the payee user id
     */
    public String getPayeeUserId( ) {
		return this.payeeUserId;
	}

    /**
     * Sets payer logon id.
     *
     * @param payerLogonId the payer logon id
     */
    public void setPayerLogonId(String payerLogonId) {
		this.payerLogonId = payerLogonId;
	}

    /**
     * Gets payer logon id.
     *
     * @return the payer logon id
     */
    public String getPayerLogonId( ) {
		return this.payerLogonId;
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
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark( ) {
		return this.remark;
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
     * Sets total pay refund amount.
     *
     * @param totalPayRefundAmount the total pay refund amount
     */
    public void setTotalPayRefundAmount(String totalPayRefundAmount) {
		this.totalPayRefundAmount = totalPayRefundAmount;
	}

    /**
     * Gets total pay refund amount.
     *
     * @return the total pay refund amount
     */
    public String getTotalPayRefundAmount( ) {
		return this.totalPayRefundAmount;
	}

}
