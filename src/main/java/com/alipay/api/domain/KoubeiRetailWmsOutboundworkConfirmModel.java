package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认出库作业
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:05
 */
public class KoubeiRetailWmsOutboundworkConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4295391395346725137L;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 出库作业id
	 */
	@ApiField("outbound_work_id")
	private String outboundWorkId;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

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
     * Gets outbound work id.
     *
     * @return the outbound work id
     */
    public String getOutboundWorkId() {
		return this.outboundWorkId;
	}

    /**
     * Sets outbound work id.
     *
     * @param outboundWorkId the outbound work id
     */
    public void setOutboundWorkId(String outboundWorkId) {
		this.outboundWorkId = outboundWorkId;
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

}
