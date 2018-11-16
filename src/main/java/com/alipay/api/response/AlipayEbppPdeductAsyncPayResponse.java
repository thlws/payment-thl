package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.async.pay response.
 *
 * @author auto create
 * @since 1.0, 2017-08-04 11:19:56
 */
public class AlipayEbppPdeductAsyncPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 1174811873751723281L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 商户代扣业务流水
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 扣款流水状态
	 */
	@ApiField("result_status")
	private String resultStatus;

    /**
     * Sets agreement id.
     *
     * @param agreementId the agreement id
     */
    public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

    /**
     * Gets agreement id.
     *
     * @return the agreement id
     */
    public String getAgreementId( ) {
		return this.agreementId;
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
     * Sets result status.
     *
     * @param resultStatus the result status
     */
    public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

    /**
     * Gets result status.
     *
     * @return the result status
     */
    public String getResultStatus( ) {
		return this.resultStatus;
	}

}
