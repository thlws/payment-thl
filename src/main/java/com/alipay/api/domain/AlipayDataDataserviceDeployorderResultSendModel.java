package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 部署单处理反馈参数
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:50:53
 */
public class AlipayDataDataserviceDeployorderResultSendModel extends AlipayObject {

	private static final long serialVersionUID = 7415935198726939629L;

	/**
	 * 部署单记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 处理结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Gets record id.
     *
     * @return the record id
     */
    public String getRecordId() {
		return this.recordId;
	}

    /**
     * Sets record id.
     *
     * @param recordId the record id
     */
    public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult() {
		return this.result;
	}

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess() {
		return this.success;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

}
