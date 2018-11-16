package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.code.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:31:56
 */
public class AlipayOfflineMarketingVoucherCodeUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1794527473488171549L;

	/** 
	 * 码库id
	 */
	@ApiField("code_inventory_id")
	private String codeInventoryId;

    /**
     * Sets code inventory id.
     *
     * @param codeInventoryId the code inventory id
     */
    public void setCodeInventoryId(String codeInventoryId) {
		this.codeInventoryId = codeInventoryId;
	}

    /**
     * Gets code inventory id.
     *
     * @return the code inventory id
     */
    public String getCodeInventoryId( ) {
		return this.codeInventoryId;
	}

}
