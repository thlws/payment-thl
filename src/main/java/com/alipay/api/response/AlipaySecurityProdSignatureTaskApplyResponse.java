package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignTaskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class AlipaySecurityProdSignatureTaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7332951346378685162L;

	/** 
	 * 签约订单id，关联了若干个签约任务id。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 签约认证任务列表
	 */
	@ApiListField("task_list")
	@ApiField("sign_task_result")
	private List<SignTaskResult> taskList;

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId( ) {
		return this.orderId;
	}

    /**
     * Sets task list.
     *
     * @param taskList the task list
     */
    public void setTaskList(List<SignTaskResult> taskList) {
		this.taskList = taskList;
	}

    /**
     * Gets task list.
     *
     * @return the task list
     */
    public List<SignTaskResult> getTaskList( ) {
		return this.taskList;
	}

}
