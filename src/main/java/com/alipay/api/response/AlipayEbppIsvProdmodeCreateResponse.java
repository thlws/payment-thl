package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.isv.prodmode.create response.
 *
 * @author auto create
 * @since 1.0, 2018-06-14 11:54:13
 */
public class AlipayEbppIsvProdmodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2439195188116274363L;

	/** 
	 * 流程实例ID
	 */
	@ApiField("process_id")
	private String processId;

	/** 
	 * 创建产品模型成功后返回任务ID
	 */
	@ApiField("task_id")
	private String taskId;

    /**
     * Sets process id.
     *
     * @param processId the process id
     */
    public void setProcessId(String processId) {
		this.processId = processId;
	}

    /**
     * Gets process id.
     *
     * @return the process id
     */
    public String getProcessId( ) {
		return this.processId;
	}

    /**
     * Sets task id.
     *
     * @param taskId the task id
     */
    public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

    /**
     * Gets task id.
     *
     * @return the task id
     */
    public String getTaskId( ) {
		return this.taskId;
	}

}
