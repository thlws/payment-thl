package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundwork.create response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:40:00
 */
public class KoubeiRetailWmsInboundworkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3371322623874449397L;

	/** 
	 * 入库作业id
	 */
	@ApiField("inbound_work_id")
	private String inboundWorkId;

    /**
     * Sets inbound work id.
     *
     * @param inboundWorkId the inbound work id
     */
    public void setInboundWorkId(String inboundWorkId) {
		this.inboundWorkId = inboundWorkId;
	}

    /**
     * Gets inbound work id.
     *
     * @return the inbound work id
     */
    public String getInboundWorkId( ) {
		return this.inboundWorkId;
	}

}
