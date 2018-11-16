package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.sync.singledata.send response.
 *
 * @author auto create
 * @since 1.0, 2018-07-02 16:45:00
 */
public class AlipayMsaasSyncSingledataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5836127566475818936L;

	/** 
	 * SYNC内部业务数据ID
	 */
	@ApiField("oplog_id")
	private String oplogId;

	/** 
	 * 返回结果代码
	 */
	@ApiField("return_code")
	private String returnCode;

	/** 
	 * 返回结果含义
	 */
	@ApiField("return_reason")
	private String returnReason;

	/** 
	 * 接口调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Sets oplog id.
     *
     * @param oplogId the oplog id
     */
    public void setOplogId(String oplogId) {
		this.oplogId = oplogId;
	}

    /**
     * Gets oplog id.
     *
     * @return the oplog id
     */
    public String getOplogId( ) {
		return this.oplogId;
	}

    /**
     * Sets return code.
     *
     * @param returnCode the return code
     */
    public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

    /**
     * Gets return code.
     *
     * @return the return code
     */
    public String getReturnCode( ) {
		return this.returnCode;
	}

    /**
     * Sets return reason.
     *
     * @param returnReason the return reason
     */
    public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

    /**
     * Gets return reason.
     *
     * @return the return reason
     */
    public String getReturnReason( ) {
		return this.returnReason;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

}
