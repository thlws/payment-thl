package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:43:32
 */
public class KoubeiMerchantOperatorCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2612619658883877354L;

	/** 
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId( ) {
		return this.operatorId;
	}

}
