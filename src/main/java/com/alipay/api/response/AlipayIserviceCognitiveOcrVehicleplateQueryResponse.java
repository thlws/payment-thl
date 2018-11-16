package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.vehicleplate.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-09 12:20:07
 */
public class AlipayIserviceCognitiveOcrVehicleplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7847435438788839713L;

	/** 
	 * 服务识别失败后对应的详细错误原因
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 识别正确概率
	 */
	@ApiField("prob")
	private String prob;

	/** 
	 * 服务器id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * true: 识别成功
false: 识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 车牌号码
	 */
	@ApiField("txt")
	private String txt;

    /**
     * Sets error content.
     *
     * @param errorContent the error content
     */
    public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}

    /**
     * Gets error content.
     *
     * @return the error content
     */
    public String getErrorContent( ) {
		return this.errorContent;
	}

    /**
     * Sets prob.
     *
     * @param prob the prob
     */
    public void setProb(String prob) {
		this.prob = prob;
	}

    /**
     * Gets prob.
     *
     * @return the prob
     */
    public String getProb( ) {
		return this.prob;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId( ) {
		return this.requestId;
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

    /**
     * Sets trace id.
     *
     * @param traceId the trace id
     */
    public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

    /**
     * Gets trace id.
     *
     * @return the trace id
     */
    public String getTraceId( ) {
		return this.traceId;
	}

    /**
     * Sets txt.
     *
     * @param txt the txt
     */
    public void setTxt(String txt) {
		this.txt = txt;
	}

    /**
     * Gets txt.
     *
     * @return the txt
     */
    public String getTxt( ) {
		return this.txt;
	}

}
