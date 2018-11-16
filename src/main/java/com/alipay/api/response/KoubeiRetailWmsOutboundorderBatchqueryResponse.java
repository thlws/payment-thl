package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OutboundOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundorder.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:35
 */
public class KoubeiRetailWmsOutboundorderBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1418499422177726787L;

	/** 
	 * 出库通知单列表
	 */
	@ApiListField("outbound_order_vo_list")
	@ApiField("outbound_order_v_o")
	private List<OutboundOrderVO> outboundOrderVoList;

    /**
     * Sets outbound order vo list.
     *
     * @param outboundOrderVoList the outbound order vo list
     */
    public void setOutboundOrderVoList(List<OutboundOrderVO> outboundOrderVoList) {
		this.outboundOrderVoList = outboundOrderVoList;
	}

    /**
     * Gets outbound order vo list.
     *
     * @return the outbound order vo list
     */
    public List<OutboundOrderVO> getOutboundOrderVoList( ) {
		return this.outboundOrderVoList;
	}

}
