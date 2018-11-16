package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.closeloop.data.upload response.
 *
 * @author auto create
 * @since 1.0, 2018-01-11 15:47:27
 */
public class ZhimaMerchantCloseloopDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7569844133892774461L;

	/** 
	 * 公用回传参数（非必填），这个字段由商户传入，系统透传给商户。
	 */
	@ApiField("biz_ext_params")
	private String bizExtParams;

	/** 
	 * 每次上传都会生成一个任务号
	 */
	@ApiField("task_id")
	private String taskId;

    /**
     * Sets biz ext params.
     *
     * @param bizExtParams the biz ext params
     */
    public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}

    /**
     * Gets biz ext params.
     *
     * @return the biz ext params
     */
    public String getBizExtParams( ) {
		return this.bizExtParams;
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
