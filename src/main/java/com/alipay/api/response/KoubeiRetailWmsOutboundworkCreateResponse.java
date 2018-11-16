package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundwork.create response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:37:34
 */
public class KoubeiRetailWmsOutboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8711219847928872277L;

	/** 
	 * 出库作业id
	 */
	@ApiField("outbound_work_id")
	private String outboundWorkId;

    /**
     * Sets outbound work id.
     *
     * @param outboundWorkId the outbound work id
     */
    public void setOutboundWorkId(String outboundWorkId) {
		this.outboundWorkId = outboundWorkId;
	}

    /**
     * Gets outbound work id.
     *
     * @return the outbound work id
     */
    public String getOutboundWorkId( ) {
		return this.outboundWorkId;
	}

}
