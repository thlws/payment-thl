package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝AI通用图片信息抽取服务
 *
 * @author auto create
 * @since 1.0, 2018-08-30 11:33:04
 */
public class AlipayIserviceCognitiveImageRouteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3731944352826145992L;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务请求详细内容
	 */
	@ApiListField("ctx")
	@ApiField("string")
	private List<String> ctx;

	/**
	 * 业务pv唯一id
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
     * Gets ctx.
     *
     * @return the ctx
     */
    public List<String> getCtx() {
		return this.ctx;
	}

    /**
     * Sets ctx.
     *
     * @param ctx the ctx
     */
    public void setCtx(List<String> ctx) {
		this.ctx = ctx;
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
