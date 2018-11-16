package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-01-24 14:21:01
 */
public class AlipayInsSceneApplicationApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2278594846318683176L;

	/** 
	 * 投保单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	/** 
	 * 交易操作流水号;收银台付款需要
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户生成的外部投保业务号,必须保证唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保单号,同步创建保单的会有，异步创建保单的不返回
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 支付交易订单号,收银台付款需要
	 */
	@ApiField("trade_no")
	private String tradeNo;

    /**
     * Sets application no.
     *
     * @param applicationNo the application no
     */
    public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

    /**
     * Gets application no.
     *
     * @return the application no
     */
    public String getApplicationNo( ) {
		return this.applicationNo;
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
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo( ) {
		return this.outBizNo;
	}

    /**
     * Sets policy no.
     *
     * @param policyNo the policy no
     */
    public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

    /**
     * Gets policy no.
     *
     * @return the policy no
     */
    public String getPolicyNo( ) {
		return this.policyNo;
	}

    /**
     * Sets trade no.
     *
     * @param tradeNo the trade no
     */
    public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

    /**
     * Gets trade no.
     *
     * @return the trade no
     */
    public String getTradeNo( ) {
		return this.tradeNo;
	}

}
