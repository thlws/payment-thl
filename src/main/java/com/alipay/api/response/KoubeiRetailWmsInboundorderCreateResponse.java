package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundorder.create response.
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:39
 */
public class KoubeiRetailWmsInboundorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1713834961632929482L;

	/** 
	 * 入库通知单id
	 */
	@ApiField("inbound_order_id")
	private String inboundOrderId;

    /**
     * Sets inbound order id.
     *
     * @param inboundOrderId the inbound order id
     */
    public void setInboundOrderId(String inboundOrderId) {
		this.inboundOrderId = inboundOrderId;
	}

    /**
     * Gets inbound order id.
     *
     * @return the inbound order id
     */
    public String getInboundOrderId( ) {
		return this.inboundOrderId;
	}

}
