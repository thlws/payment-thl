package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.carvin.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-07 18:50:00
 */
public class AlipayIserviceCognitiveOcrCarvinQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3126597537919344422L;

	/** 
	 * 服务id，唯一标示服务请求
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 开放平台trace_id，用于定位问题
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 车辆vin码
	 */
	@ApiField("vin")
	private String vin;

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
     * Sets vin.
     *
     * @param vin the vin
     */
    public void setVin(String vin) {
		this.vin = vin;
	}

    /**
     * Gets vin.
     *
     * @return the vin
     */
    public String getVin( ) {
		return this.vin;
	}

}
