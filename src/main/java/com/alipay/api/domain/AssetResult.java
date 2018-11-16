package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料生产/配送订单处理结果
 *
 * @author auto create
 * @since 1.0, 2018-08-14 13:52:26
 */
public class AssetResult extends AlipayObject {

	private static final long serialVersionUID = 8171176747742864487L;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 批次号，分批反馈时用
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 是否处理成功
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Gets assign item id.
     *
     * @return the assign item id
     */
    public String getAssignItemId() {
		return this.assignItemId;
	}

    /**
     * Sets assign item id.
     *
     * @param assignItemId the assign item id
     */
    public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

    /**
     * Gets batch no.
     *
     * @return the batch no
     */
    public String getBatchNo() {
		return this.batchNo;
	}

    /**
     * Sets batch no.
     *
     * @param batchNo the batch no
     */
    public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
		return this.errorCode;
	}

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

    /**
     * Gets error desc.
     *
     * @return the error desc
     */
    public String getErrorDesc() {
		return this.errorDesc;
	}

    /**
     * Sets error desc.
     *
     * @param errorDesc the error desc
     */
    public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
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
