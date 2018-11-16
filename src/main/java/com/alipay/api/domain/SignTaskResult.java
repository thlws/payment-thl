package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约任务申请结果
 *
 * @author auto create
 * @since 1.0, 2017-08-04 11:14:29
 */
public class SignTaskResult extends AlipayObject {

	private static final long serialVersionUID = 6782171974617225697L;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 支付宝签约入口地址
	 */
	@ApiField("sign_enter_url")
	private String signEnterUrl;

	/**
	 * 签名任务流水号
	 */
	@ApiField("task_id")
	private String taskId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets sign enter url.
     *
     * @return the sign enter url
     */
    public String getSignEnterUrl() {
		return this.signEnterUrl;
	}

    /**
     * Sets sign enter url.
     *
     * @param signEnterUrl the sign enter url
     */
    public void setSignEnterUrl(String signEnterUrl) {
		this.signEnterUrl = signEnterUrl;
	}

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
