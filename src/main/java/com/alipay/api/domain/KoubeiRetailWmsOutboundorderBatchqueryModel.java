package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出库通知单批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:32
 */
public class KoubeiRetailWmsOutboundorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4489341724422581312L;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 外部业务单号（出库通知单id列表列表二选一）
	 */
	@ApiListField("out_biz_no_list")
	@ApiField("string")
	private List<String> outBizNoList;

	/**
	 * 出库通知单id列表（与外部业务单号列表二选一）
	 */
	@ApiListField("outbound_order_id_list")
	@ApiField("string")
	private List<String> outboundOrderIdList;

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

    /**
     * Gets outbound order id list.
     *
     * @return the outbound order id list
     */
    public List<String> getOutboundOrderIdList() {
		return this.outboundOrderIdList;
	}

    /**
     * Sets outbound order id list.
     *
     * @param outboundOrderIdList the outbound order id list
     */
    public void setOutboundOrderIdList(List<String> outboundOrderIdList) {
		this.outboundOrderIdList = outboundOrderIdList;
	}

}
