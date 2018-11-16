package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OutboundOrderLine;
import com.alipay.api.domain.OutboundOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.outboundorder.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:19:55
 */
public class KoubeiRetailWmsOutboundorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3386892826364781735L;

	/** 
	 * 出库通知单明细列表
	 */
	@ApiListField("outbound_order_line_list")
	@ApiField("outbound_order_line")
	private List<OutboundOrderLine> outboundOrderLineList;

	/** 
	 * 出库通知单
	 */
	@ApiField("outbound_order_vo")
	private OutboundOrderVO outboundOrderVo;

    /**
     * Sets outbound order line list.
     *
     * @param outboundOrderLineList the outbound order line list
     */
    public void setOutboundOrderLineList(List<OutboundOrderLine> outboundOrderLineList) {
		this.outboundOrderLineList = outboundOrderLineList;
	}

    /**
     * Gets outbound order line list.
     *
     * @return the outbound order line list
     */
    public List<OutboundOrderLine> getOutboundOrderLineList( ) {
		return this.outboundOrderLineList;
	}

    /**
     * Sets outbound order vo.
     *
     * @param outboundOrderVo the outbound order vo
     */
    public void setOutboundOrderVo(OutboundOrderVO outboundOrderVo) {
		this.outboundOrderVo = outboundOrderVo;
	}

    /**
     * Gets outbound order vo.
     *
     * @return the outbound order vo
     */
    public OutboundOrderVO getOutboundOrderVo( ) {
		return this.outboundOrderVo;
	}

}
