package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 入库通知单批量查询
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:55
 */
public class KoubeiRetailWmsInboundorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6427415959838128768L;

	/**
	 * 入库通知单id列表（外部业务单号列表二选一，不能同时传两个列表）
	 */
	@ApiListField("inbound_order_id_list")
	@ApiField("string")
	private List<String> inboundOrderIdList;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 外部业务单号列表（入库通知单id列表二选一，不能同时传两个列表）
	 */
	@ApiListField("out_biz_no_list")
	@ApiField("string")
	private List<String> outBizNoList;

    /**
     * Gets inbound order id list.
     *
     * @return the inbound order id list
     */
    public List<String> getInboundOrderIdList() {
		return this.inboundOrderIdList;
	}

    /**
     * Sets inbound order id list.
     *
     * @param inboundOrderIdList the inbound order id list
     */
    public void setInboundOrderIdList(List<String> inboundOrderIdList) {
		this.inboundOrderIdList = inboundOrderIdList;
	}

    /**
     * Gets operate context.
     *
     * @return the operate context
     */
    public OperateContext getOperateContext() {
		return this.operateContext;
	}

    /**
     * Sets operate context.
     *
     * @param operateContext the operate context
     */
    public void setOperateContext(OperateContext operateContext) {
		this.operateContext = operateContext;
	}

    /**
     * Gets out biz no list.
     *
     * @return the out biz no list
     */
    public List<String> getOutBizNoList() {
		return this.outBizNoList;
	}

    /**
     * Sets out biz no list.
     *
     * @param outBizNoList the out biz no list
     */
    public void setOutBizNoList(List<String> outBizNoList) {
		this.outBizNoList = outBizNoList;
	}

}
