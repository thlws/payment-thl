package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.instance.create response.
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:33
 */
public class AlipayBossBaseProcessInstanceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6748333329923591448L;

	/** 
	 * 创建的实例
	 */
	@ApiField("instance")
	private BPOpenApiInstance instance;

    /**
     * Sets instance.
     *
     * @param instance the instance
     */
    public void setInstance(BPOpenApiInstance instance) {
		this.instance = instance;
	}

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public BPOpenApiInstance getInstance( ) {
		return this.instance;
	}

}
