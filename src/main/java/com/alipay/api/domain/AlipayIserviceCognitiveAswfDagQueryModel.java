package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝AI工作流服务
 *
 * @author auto create
 * @since 1.0, 2018-08-30 11:32:49
 */
public class AlipayIserviceCognitiveAswfDagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1312386988657442277L;

	/**
	 * 业务唯一标识，不可空
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务的任务描述
	 */
	@ApiField("ctxs")
	private String ctxs;

	/**
	 * DAG模板ID，不可空
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 业务请求唯一id
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Gets biz id.
     *
     * @return the biz id
     */
    public String getBizId() {
		return this.bizId;
	}

    /**
     * Sets biz id.
     *
     * @param bizId the biz id
     */
    public void setBizId(String bizId) {
		this.bizId = bizId;
	}

    /**
     * Gets ctxs.
     *
     * @return the ctxs
     */
    public String getCtxs() {
		return this.ctxs;
	}

    /**
     * Sets ctxs.
     *
     * @param ctxs the ctxs
     */
    public void setCtxs(String ctxs) {
		this.ctxs = ctxs;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets trace id.
     *
     * @return the trace id
     */
    public String getTraceId() {
		return this.traceId;
	}

    /**
     * Sets trace id.
     *
     * @param traceId the trace id
     */
    public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
