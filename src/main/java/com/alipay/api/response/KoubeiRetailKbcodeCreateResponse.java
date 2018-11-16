package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.kbcode.create response.
 *
 * @author auto create
 * @since 1.0, 2017-09-27 19:33:08
 */
public class KoubeiRetailKbcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1462222626697545439L;

	/** 
	 * 口碑码生成批次id，可用于查询接口
	 */
	@ApiField("batch_id")
	private String batchId;

    /**
     * Sets batch id.
     *
     * @param batchId the batch id
     */
    public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

    /**
     * Gets batch id.
     *
     * @return the batch id
     */
    public String getBatchId( ) {
		return this.batchId;
	}

}
