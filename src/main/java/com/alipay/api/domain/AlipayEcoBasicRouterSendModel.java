package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开发生态基础平台域内路由接口
 *
 * @author auto create
 * @since 1.0, 2018-01-26 13:50:04
 */
public class AlipayEcoBasicRouterSendModel extends AlipayObject {

	private static final long serialVersionUID = 4152236376869412689L;

	/**
	 * 路由数据
	 */
	@ApiField("input")
	private String input;

	/**
	 * 路由任务名
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * 本次调用唯一id
	 */
	@ApiField("trace_id")
	private String traceId;

    /**
     * Gets input.
     *
     * @return the input
     */
    public String getInput() {
		return this.input;
	}

    /**
     * Sets input.
     *
     * @param input the input
     */
    public void setInput(String input) {
		this.input = input;
	}

    /**
     * Gets interface name.
     *
     * @return the interface name
     */
    public String getInterfaceName() {
		return this.interfaceName;
	}

    /**
     * Sets interface name.
     *
     * @param interfaceName the interface name
     */
    public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
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
