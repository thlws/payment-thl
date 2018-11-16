package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SignTaskFileResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.query response.
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:43
 */
public class AlipaySecurityProdSignatureTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6387226826323729822L;

	/** 
	 * 订单业务流水号，与alipay.security.prod.signature.task.apply接口入参biz_id对应。
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单状态，取值枚举如下：
a. INIT : 初始化态，用户还未进入签约。
b. FAIL ：签约失败。
c. SUCCESS ：签约成功
d. PROCESS ：签约进行中
e. EXPIRED ：当前签约任务已过期，用户无法继续操作。
f. CANCEL ：签约任务被撤销
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 签约任务查询结果
	 */
	@ApiListField("task_list")
	@ApiField("sign_task_file_result")
	private List<SignTaskFileResult> taskList;

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId( ) {
		return this.bizId;
	}

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
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

    /**
     * Sets task list.
     *
     * @param taskList the task list
     */
    public void setTaskList(List<SignTaskFileResult> taskList) {
		this.taskList = taskList;
	}

    /**
     * Gets task list.
     *
     * @return the task list
     */
    public List<SignTaskFileResult> getTaskList( ) {
		return this.taskList;
	}

}
