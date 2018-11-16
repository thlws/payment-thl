package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认入库作业
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:40:09
 */
public class KoubeiRetailWmsInboundworkConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4499861729938135455L;

	/**
	 * 入库作业id
	 */
	@ApiField("inbound_work_id")
	private String inboundWorkId;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

    /**
     * Gets inbound work id.
     *
     * @return the inbound work id
     */
    public String getInboundWorkId() {
		return this.inboundWorkId;
	}

    /**
     * Sets inbound work id.
     *
     * @param inboundWorkId the inbound work id
     */
    public void setInboundWorkId(String inboundWorkId) {
		this.inboundWorkId = inboundWorkId;
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

}
