package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.policy.cancel response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayInsAutoAutoinsprodPolicyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1291719696671472375L;

	/** 
	 * 操作结果 true/false
	 */
	@ApiField("cancel_result")
	private String cancelResult;

    /**
     * Sets cancel result.
     *
     * @param cancelResult the cancel result
     */
    public void setCancelResult(String cancelResult) {
		this.cancelResult = cancelResult;
	}

    /**
     * Gets cancel result.
     *
     * @return the cancel result
     */
    public String getCancelResult( ) {
		return this.cancelResult;
	}

}
