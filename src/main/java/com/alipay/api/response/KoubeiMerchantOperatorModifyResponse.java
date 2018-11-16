package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.modify response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:43:06
 */
public class KoubeiMerchantOperatorModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7554615636915748756L;

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
