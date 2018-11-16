package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kbcode.create response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 18:50:00
 */
public class KoubeiCateringKbcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8288821976242378299L;

	/** 
	 * 口碑码创建的批次号，可以根据该批次号查询创建的具体码信息
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
