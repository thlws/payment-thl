package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.rolerelation.bind response.
 *
 * @author auto create
 * @since 1.0, 2018-03-23 13:53:35
 */
public class KoubeiMerchantOperatorRolerelationBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 1284143198738231258L;

	/** 
	 * 操作是否成功
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

}
