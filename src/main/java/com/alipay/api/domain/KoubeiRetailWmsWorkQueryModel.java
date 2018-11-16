package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询入库、出库作业详情
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:37
 */
public class KoubeiRetailWmsWorkQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7825625577376646121L;

	/**
	 * 操作上下文
	 */
	@ApiField("operate_context")
	private OperateContext operateContext;

	/**
	 * 作业id
	 */
	@ApiField("work_id")
	private String workId;

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
     * Gets work id.
     *
     * @return the work id
     */
    public String getWorkId() {
		return this.workId;
	}

    /**
     * Sets work id.
     *
     * @param workId the work id
     */
    public void setWorkId(String workId) {
		this.workId = workId;
	}

}
