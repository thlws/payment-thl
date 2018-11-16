package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.operation.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 17:20:00
 */
public class AlipayFundAuthOperationDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8557397361126967156L;

	/** 
	 * 该笔资金操作流水opertion_id对应的操作金额，单位为：元（人民币）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 支付宝资金授权订单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 该笔资金操作流水opertion_id对应的操作信用金额
	 */
	@ApiField("credit_amount")
	private String creditAmount;

	/** 
	 * 商户请求创建预授权订单时传入的扩展参数，仅返回商户自定义的扩展信息（merchantExt）
	 */
	@ApiField("extra_param")
	private String extraParam;

	/** 
	 * 该笔资金操作流水opertion_id对应的操作自有资金金额
	 */
	@ApiField("fund_amount")
	private String fundAmount;

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
	 * 支付宝资金操作类型，
目前支持： 
FREEZE：冻结
UNFREEZE：解冻
PAY：支付
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
	 * 付款方支付宝账号（Email或手机号），仅作展示使用，默认会加“*”号处理
	 */
	@ApiField("payer_logon_id")
	private String payerLogonId;

	/** 
	 * 付款方支付宝账号对应的支付宝唯一用户号，以2088开头的16位纯数字组成
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
	 * 商户对本次操作的附言描述，长度不超过100个字母或50个汉字
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 订单总共剩余的冻结金额，单位为：元（人民币）
	 */
	@ApiField("rest_amount")
	private String restAmount;

	/** 
	 * 剩余冻结信用金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("rest_credit_amount")
	private String restCreditAmount;

	/** 
	 * 剩余冻结自有资金金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("rest_fund_amount")
	private String restFundAmount;

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
	 * 订单累计的冻结金额，单位为：元（人民币）
	 */
	@ApiField("total_freeze_amount")
	private String totalFreezeAmount;

	/** 
	 * 累计冻结信用金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("total_freeze_credit_amount")
	private String totalFreezeCreditAmount;

	/** 
	 * 累计冻结自有资金金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("total_freeze_fund_amount")
	private String totalFreezeFundAmount;

	/** 
	 * 订单累计用于支付的金额，单位为：元（人民币）
	 */
	@ApiField("total_pay_amount")
	private String totalPayAmount;

	/** 
	 * 累计支付信用金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("total_pay_credit_amount")
	private String totalPayCreditAmount;

	/** 
	 * 累计支付自有资金金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("total_pay_fund_amount")
	private String totalPayFundAmount;

	/** 
	 * 标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
	 */
	@ApiField("trans_currency")
	private String transCurrency;

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
     * Sets rest amount.
     *
     * @param restAmount the rest amount
     */
    public void setRestAmount(String restAmount) {
		this.restAmount = restAmount;
	}

    /**
     * Gets rest amount.
     *
     * @return the rest amount
     */
    public String getRestAmount( ) {
		return this.restAmount;
	}

    /**
     * Sets rest credit amount.
     *
     * @param restCreditAmount the rest credit amount
     */
    public void setRestCreditAmount(String restCreditAmount) {
		this.restCreditAmount = restCreditAmount;
	}

    /**
     * Gets rest credit amount.
     *
     * @return the rest credit amount
     */
    public String getRestCreditAmount( ) {
		return this.restCreditAmount;
	}

    /**
     * Sets rest fund amount.
     *
     * @param restFundAmount the rest fund amount
     */
    public void setRestFundAmount(String restFundAmount) {
		this.restFundAmount = restFundAmount;
	}

    /**
     * Gets rest fund amount.
     *
     * @return the rest fund amount
     */
    public String getRestFundAmount( ) {
		return this.restFundAmount;
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
     * Sets total freeze amount.
     *
     * @param totalFreezeAmount the total freeze amount
     */
    public void setTotalFreezeAmount(String totalFreezeAmount) {
		this.totalFreezeAmount = totalFreezeAmount;
	}

    /**
     * Gets total freeze amount.
     *
     * @return the total freeze amount
     */
    public String getTotalFreezeAmount( ) {
		return this.totalFreezeAmount;
	}

    /**
     * Sets total freeze credit amount.
     *
     * @param totalFreezeCreditAmount the total freeze credit amount
     */
    public void setTotalFreezeCreditAmount(String totalFreezeCreditAmount) {
		this.totalFreezeCreditAmount = totalFreezeCreditAmount;
	}

    /**
     * Gets total freeze credit amount.
     *
     * @return the total freeze credit amount
     */
    public String getTotalFreezeCreditAmount( ) {
		return this.totalFreezeCreditAmount;
	}

    /**
     * Sets total freeze fund amount.
     *
     * @param totalFreezeFundAmount the total freeze fund amount
     */
    public void setTotalFreezeFundAmount(String totalFreezeFundAmount) {
		this.totalFreezeFundAmount = totalFreezeFundAmount;
	}

    /**
     * Gets total freeze fund amount.
     *
     * @return the total freeze fund amount
     */
    public String getTotalFreezeFundAmount( ) {
		return this.totalFreezeFundAmount;
	}

    /**
     * Sets total pay amount.
     *
     * @param totalPayAmount the total pay amount
     */
    public void setTotalPayAmount(String totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}

    /**
     * Gets total pay amount.
     *
     * @return the total pay amount
     */
    public String getTotalPayAmount( ) {
		return this.totalPayAmount;
	}

    /**
     * Sets total pay credit amount.
     *
     * @param totalPayCreditAmount the total pay credit amount
     */
    public void setTotalPayCreditAmount(String totalPayCreditAmount) {
		this.totalPayCreditAmount = totalPayCreditAmount;
	}

    /**
     * Gets total pay credit amount.
     *
     * @return the total pay credit amount
     */
    public String getTotalPayCreditAmount( ) {
		return this.totalPayCreditAmount;
	}

    /**
     * Sets total pay fund amount.
     *
     * @param totalPayFundAmount the total pay fund amount
     */
    public void setTotalPayFundAmount(String totalPayFundAmount) {
		this.totalPayFundAmount = totalPayFundAmount;
	}

    /**
     * Gets total pay fund amount.
     *
     * @return the total pay fund amount
     */
    public String getTotalPayFundAmount( ) {
		return this.totalPayFundAmount;
	}

    /**
     * Sets trans currency.
     *
     * @param transCurrency the trans currency
     */
    public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

    /**
     * Gets trans currency.
     *
     * @return the trans currency
     */
    public String getTransCurrency( ) {
		return this.transCurrency;
	}

}
