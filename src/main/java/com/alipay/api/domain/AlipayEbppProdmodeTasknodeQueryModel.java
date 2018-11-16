package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批任务节点状态API
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:55:32
 */
public class AlipayEbppProdmodeTasknodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5535875912869385371L;

	/**
	 * 任务编号
	 */
	@ApiField("task_id")
	private String taskId;

    /**
     * Gets task id.
     *
     * @return the task id
     */
    public String getTaskId() {
		return this.taskId;
	}

    /**
     * Sets task id.
     *
     * @param taskId the task id
     */
    public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
