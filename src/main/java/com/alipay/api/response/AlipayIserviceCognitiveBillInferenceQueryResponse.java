package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BillInferenceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.bill.inference.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-21 18:03:51
 */
public class AlipayIserviceCognitiveBillInferenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8254342264945122882L;

	/** 
	 * 发票识别内容详细信息
	 */
	@ApiField("result")
	private BillInferenceResult result;

	/** 
	 * 信息抽取是否抽取成功
	 */
	@ApiField("ret")
	private Long ret;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(BillInferenceResult result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public BillInferenceResult getResult( ) {
		return this.result;
	}

    /**
     * Sets ret.
     *
     * @param ret the ret
     */
    public void setRet(Long ret) {
		this.ret = ret;
	}

    /**
     * Gets ret.
     *
     * @return the ret
     */
    public Long getRet( ) {
		return this.ret;
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
