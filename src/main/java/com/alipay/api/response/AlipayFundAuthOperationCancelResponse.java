package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.auth.operation.cancel response.
 *
 * @author auto create
 * @since 1.0, 2018-06-07 14:45:00
 */
public class AlipayFundAuthOperationCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6377788953244342435L;

	/** 
	 * 本次撤销触发的资金动作
close：关闭冻结明细，无资金解冻
unfreeze：产生了资金解冻
	 */
	@ApiField("action")
	private String action;

	/** 
	 * 支付宝资金授权订单号。
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 支付宝的冻结操作流水号。
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户的授权资金订单号。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 商户的冻结操作流水号 。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

    /**
     * Sets action.
     *
     * @param action the action
     */
    public void setAction(String action) {
		this.action = action;
	}

    /**
     * Gets action.
     *
     * @return the action
     */
    public String getAction( ) {
		return this.action;
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

}
