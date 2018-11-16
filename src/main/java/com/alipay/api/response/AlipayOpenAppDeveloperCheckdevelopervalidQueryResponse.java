package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.developer.checkdevelopervalid.query response.
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:07:28
 */
public class AlipayOpenAppDeveloperCheckdevelopervalidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5127657484531147924L;

	/** 
	 * 支付宝账号入驻开放平台有效性检查，true表示有效，false无效
	 */
	@ApiField("dev_valid")
	private Boolean devValid;

    /**
     * Sets dev valid.
     *
     * @param devValid the dev valid
     */
    public void setDevValid(Boolean devValid) {
		this.devValid = devValid;
	}

    /**
     * Gets dev valid.
     *
     * @return the dev valid
     */
    public Boolean getDevValid( ) {
		return this.devValid;
	}

}
