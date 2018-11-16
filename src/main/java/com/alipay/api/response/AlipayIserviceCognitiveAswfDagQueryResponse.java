package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.aswf.dag.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-30 11:35:00
 */
public class AlipayIserviceCognitiveAswfDagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5359955543335163874L;

	/** 
	 * 工作流id
	 */
	@ApiField("dag_id")
	private String dagId;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 错误描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * true: 业务处理成功
false: 业务处理失败
	 */
	@ApiField("success")
	private Boolean success;

    /**
     * Sets dag id.
     *
     * @param dagId the dag id
     */
    public void setDagId(String dagId) {
		this.dagId = dagId;
	}

    /**
     * Gets dag id.
     *
     * @return the dag id
     */
    public String getDagId( ) {
		return this.dagId;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

    /**
     * Sets error msg.
     *
     * @param errorMsg the error msg
     */
    public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    /**
     * Gets error msg.
     *
     * @return the error msg
     */
    public String getErrorMsg( ) {
		return this.errorMsg;
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
