package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公服行业通用业务信息查询
 *
 * @author auto create
 * @since 1.0, 2018-07-17 15:13:08
 */
public class AlipayEbppIndustryBizinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6148718849227495387L;

	/**
	 * 业务机构简称
	 */
	@ApiField("biz_inst")
	private String bizInst;

	/**
	 * 业务类型，公服业务：IND
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务数据码，标识业务场景
	 */
	@ApiField("data_code")
	private String dataCode;

	/**
	 * 请求上下文，json格式
	 */
	@ApiField("request_context")
	private String requestContext;

    /**
     * Gets biz inst.
     *
     * @return the biz inst
     */
    public String getBizInst() {
		return this.bizInst;
	}

    /**
     * Sets biz inst.
     *
     * @param bizInst the biz inst
     */
    public void setBizInst(String bizInst) {
		this.bizInst = bizInst;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets data code.
     *
     * @return the data code
     */
    public String getDataCode() {
		return this.dataCode;
	}

    /**
     * Sets data code.
     *
     * @param dataCode the data code
     */
    public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

    /**
     * Gets request context.
     *
     * @return the request context
     */
    public String getRequestContext() {
		return this.requestContext;
	}

    /**
     * Sets request context.
     *
     * @param requestContext the request context
     */
    public void setRequestContext(String requestContext) {
		this.requestContext = requestContext;
	}

}
