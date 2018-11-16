package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cms.cdata.upload response.
 *
 * @author auto create
 * @since 1.0, 2016-09-21 11:31:27
 */
public class AlipayEcoCmsCdataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8379284827145592782L;

	/** 
	 * 投放消息ID
	 */
	@ApiField("id")
	private Long id;

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId( ) {
		return this.id;
	}

}
