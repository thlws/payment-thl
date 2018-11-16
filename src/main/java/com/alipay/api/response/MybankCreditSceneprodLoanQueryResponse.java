package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:57:20
 */
public class MybankCreditSceneprodLoanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2192957215958281674L;

	/** 
	 * 对于订单信息需要说明的内容
	 */
	@ApiField("desc_msg")
	private String descMsg;

	/** 
	 * 返回当前订单的信息
	 */
	@ApiField("info")
	private String info;

	/** 
	 * 是否重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets desc msg.
     *
     * @param descMsg the desc msg
     */
    public void setDescMsg(String descMsg) {
		this.descMsg = descMsg;
	}

    /**
     * Gets desc msg.
     *
     * @return the desc msg
     */
    public String getDescMsg( ) {
		return this.descMsg;
	}

    /**
     * Sets info.
     *
     * @param info the info
     */
    public void setInfo(String info) {
		this.info = info;
	}

    /**
     * Gets info.
     *
     * @return the info
     */
    public String getInfo( ) {
		return this.info;
	}

    /**
     * Sets retry.
     *
     * @param retry the retry
     */
    public void setRetry(String retry) {
		this.retry = retry;
	}

    /**
     * Gets retry.
     *
     * @return the retry
     */
    public String getRetry( ) {
		return this.retry;
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
