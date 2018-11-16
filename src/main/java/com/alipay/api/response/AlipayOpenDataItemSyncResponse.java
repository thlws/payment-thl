package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.data.item.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:42:34
 */
public class AlipayOpenDataItemSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5263143941143316914L;

	/** 
	 * 返回更新成功的外部id
	 */
	@ApiField("external_id")
	private String externalId;

    /**
     * Sets external id.
     *
     * @param externalId the external id
     */
    public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

    /**
     * Gets external id.
     *
     * @return the external id
     */
    public String getExternalId( ) {
		return this.externalId;
	}

}
