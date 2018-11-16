package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蓝牙设备模板信息
 *
 * @author auto create
 * @since 1.0, 2015-02-03 19:55:34
 */
public class BeaconTemplate extends AlipayObject {

	private static final long serialVersionUID = 4349137252481347122L;

	/**
	 * 模板参数信息
	 */
	@ApiField("context")
	private String context;

	/**
	 * 模板ID
	 */
	@ApiField("templateid")
	private String templateid;

    /**
     * Gets context.
     *
     * @return the context
     */
    public String getContext() {
		return this.context;
	}

    /**
     * Sets context.
     *
     * @param context the context
     */
    public void setContext(String context) {
		this.context = context;
	}

    /**
     * Gets templateid.
     *
     * @return the templateid
     */
    public String getTemplateid() {
		return this.templateid;
	}

    /**
     * Sets templateid.
     *
     * @param templateid the templateid
     */
    public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}

}
