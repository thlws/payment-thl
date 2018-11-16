package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.policy.confirm response.
 *
 * @author auto create
 * @since 1.0, 2018-09-18 10:50:30
 */
public class AlipaySecurityRiskPolicyConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5618459467755487191L;

	/** 
	 * 确认结果
	 */
	@ApiField("confirm_success")
	private Boolean confirmSuccess;

	/** 
	 * 成功或失败，本版本废弃
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Sets confirm success.
     *
     * @param confirmSuccess the confirm success
     */
    public void setConfirmSuccess(Boolean confirmSuccess) {
		this.confirmSuccess = confirmSuccess;
	}

    /**
     * Gets confirm success.
     *
     * @return the confirm success
     */
    public Boolean getConfirmSuccess( ) {
		return this.confirmSuccess;
	}

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
