package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认出库通知单
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:53
 */
public class KoubeiRetailWmsOutboundorderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3257482849196677279L;

	/**
	 * 操作人信息
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 出库通知单id
	 */
	@ApiField("outbound_order_id")
	private String outboundOrderId;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 出库单最终状态：FINISHED（完成），CANCELLED（取消）
	 */
	@ApiField("status")
	private String status;

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
     * Gets outbound order id.
     *
     * @return the outbound order id
     */
    public String getOutboundOrderId() {
		return this.outboundOrderId;
	}

    /**
     * Sets outbound order id.
     *
     * @param outboundOrderId the outbound order id
     */
    public void setOutboundOrderId(String outboundOrderId) {
		this.outboundOrderId = outboundOrderId;
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
