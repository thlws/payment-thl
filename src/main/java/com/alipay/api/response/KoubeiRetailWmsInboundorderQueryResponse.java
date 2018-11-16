package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InboundOrderLine;
import com.alipay.api.domain.InboundOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inboundorder.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:24
 */
public class KoubeiRetailWmsInboundorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5391774358167458844L;

	/** 
	 * 入库通知单明细列表
	 */
	@ApiListField("inbound_order_line_list")
	@ApiField("inbound_order_line")
	private List<InboundOrderLine> inboundOrderLineList;

	/** 
	 * 入库通知单信息
	 */
	@ApiField("inbound_order_vo")
	private InboundOrderVO inboundOrderVo;

    /**
     * Sets inbound order line list.
     *
     * @param inboundOrderLineList the inbound order line list
     */
    public void setInboundOrderLineList(List<InboundOrderLine> inboundOrderLineList) {
		this.inboundOrderLineList = inboundOrderLineList;
	}

    /**
     * Gets inbound order line list.
     *
     * @return the inbound order line list
     */
    public List<InboundOrderLine> getInboundOrderLineList( ) {
		return this.inboundOrderLineList;
	}

    /**
     * Sets inbound order vo.
     *
     * @param inboundOrderVo the inbound order vo
     */
    public void setInboundOrderVo(InboundOrderVO inboundOrderVo) {
		this.inboundOrderVo = inboundOrderVo;
	}

    /**
     * Gets inbound order vo.
     *
     * @return the inbound order vo
     */
    public InboundOrderVO getInboundOrderVo( ) {
		return this.inboundOrderVo;
	}

}
