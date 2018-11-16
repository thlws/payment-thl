package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.loan.apply response.
 *
 * @author auto create
 * @since 1.0, 2018-07-31 10:40:00
 */
public class MybankCreditSceneprodLoanApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4598211277238588998L;

	/** 
	 * 网商银行内部申请单号
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/** 
	 * 是否需要升级支付宝账户，如果为true，则需要引导客户进行支付宝账户升级，否则会影响客户的审批流程
	 */
	@ApiField("need_auth")
	private String needAuth;

	/** 
	 * 外部机构订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 是否可重试
	 */
	@ApiField("retry")
	private String retry;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Sets app seqno.
     *
     * @param appSeqno the app seqno
     */
    public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
	}

    /**
     * Gets app seqno.
     *
     * @return the app seqno
     */
    public String getAppSeqno( ) {
		return this.appSeqno;
	}

    /**
     * Sets need auth.
     *
     * @param needAuth the need auth
     */
    public void setNeedAuth(String needAuth) {
		this.needAuth = needAuth;
	}

    /**
     * Gets need auth.
     *
     * @return the need auth
     */
    public String getNeedAuth( ) {
		return this.needAuth;
	}

    /**
     * Sets out order no.
     *
     * @param outOrderNo the out order no
     */
    public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

    /**
     * Gets out order no.
     *
     * @return the out order no
     */
    public String getOutOrderNo( ) {
		return this.outOrderNo;
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
