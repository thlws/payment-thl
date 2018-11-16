package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认入库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:40
 */
public class KoubeiRetailWmsInboundorderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6577116592138461575L;

	/**
	 * 入库通知单号
	 */
	@ApiField("inbound_order_id")
	private String inboundOrderId;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 入库单最终状态
FINISHED（完成），CANCELLED（取消）
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets inbound order id.
     *
     * @return the inbound order id
     */
    public String getInboundOrderId() {
		return this.inboundOrderId;
	}

    /**
     * Sets inbound order id.
     *
     * @param inboundOrderId the inbound order id
     */
    public void setInboundOrderId(String inboundOrderId) {
		this.inboundOrderId = inboundOrderId;
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
     * Gets remark.
     *
     * @return the remark
     */
    public String getRemark() {
		return this.remark;
	}

    /**
     * Sets remark.
     *
     * @param remark the remark
     */
    public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
