package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.bankcard.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-22 18:05:00
 */
public class AlipayIserviceCognitiveOcrBankcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6511777193156137976L;

	/** 
	 * 银行卡号
	 */
	@ApiField("card_num")
	private String cardNum;

	/** 
	 * 服务器内部请求id
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
     * Sets card num.
     *
     * @param cardNum the card num
     */
    public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

    /**
     * Gets card num.
     *
     * @return the card num
     */
    public String getCardNum( ) {
		return this.cardNum;
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

}
