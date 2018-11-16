package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.bill.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:54:27
 */
public class MybankCreditSceneprodBillSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8115759891748653834L;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

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
