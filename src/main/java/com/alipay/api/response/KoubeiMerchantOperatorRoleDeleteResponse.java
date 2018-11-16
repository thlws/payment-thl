package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.role.delete response.
 *
 * @author auto create
 * @since 1.0, 2018-05-30 15:45:00
 */
public class KoubeiMerchantOperatorRoleDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4374632628478779188L;

	/** 
	 * 删除处理结果
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
