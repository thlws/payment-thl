package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.order.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-12 18:45:00
 */
public class AlipayOpenAgentOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4179816468389655121L;

	/** 
	 * 代理创建的应用ID，如果有代理商户创建应用，商户确认成功后，才返回应用ID，否则不返回。
	 */
	@ApiField("agent_app_id")
	private String agentAppId;

	/** 
	 * 只有申请单状态在MERCHANT_CONFIRM状态下，才会返回商户确认签约链接
	 */
	@ApiField("confirm_url")
	private String confirmUrl;

	/** 
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 支付宝商户入驻申请单状态，申请单状态包括：
MERCHANT_INFO_HOLD=暂存，提交事务出现业务校验异常时，会暂存申请单信息，可以调用业务接口修正参数，并重新提交
MERCHANT_AUDITING=审核中，申请信息正在人工审核中
MERCHANT_CONFIRM=待商户确认，申请信息审核通过，等待联系人确认签约或授权
MERCHANT_CONFIRM_SUCCESS=商户确认成功，商户同意签约或授权
MERCHANT_CONFIRM_TIME_OUT=商户超时未确认，如果商户受到确认信息15天内未确认，则需要重新提交申请信息
MERCHANT_APPLY_ORDER_CANCELED=审核失败或商户拒绝，申请信息审核被驳回，或者商户选择拒绝签约或授权
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 审核失败的拒绝原因，只有审核失败才会返回该值
	 */
	@ApiField("reject_reason")
	private String rejectReason;

    /**
     * Sets agent app id.
     *
     * @param agentAppId the agent app id
     */
    public void setAgentAppId(String agentAppId) {
		this.agentAppId = agentAppId;
	}

    /**
     * Gets agent app id.
     *
     * @return the agent app id
     */
    public String getAgentAppId( ) {
		return this.agentAppId;
	}

    /**
     * Sets confirm url.
     *
     * @param confirmUrl the confirm url
     */
    public void setConfirmUrl(String confirmUrl) {
		this.confirmUrl = confirmUrl;
	}

    /**
     * Gets confirm url.
     *
     * @return the confirm url
     */
    public String getConfirmUrl( ) {
		return this.confirmUrl;
	}

    /**
     * Sets merchant pid.
     *
     * @param merchantPid the merchant pid
     */
    public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

    /**
     * Gets merchant pid.
     *
     * @return the merchant pid
     */
    public String getMerchantPid( ) {
		return this.merchantPid;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus( ) {
		return this.orderStatus;
	}

    /**
     * Sets reject reason.
     *
     * @param rejectReason the reject reason
     */
    public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

    /**
     * Gets reject reason.
     *
     * @return the reject reason
     */
    public String getRejectReason( ) {
		return this.rejectReason;
	}

}
