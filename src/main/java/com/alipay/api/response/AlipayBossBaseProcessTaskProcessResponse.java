package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BPOpenApiInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.base.process.task.process response.
 *
 * @author auto create
 * @since 1.0, 2017-09-19 20:53:21
 */
public class AlipayBossBaseProcessTaskProcessResponse extends AlipayResponse {

	private static final long serialVersionUID = 3487547511226663192L;

	/** 
	 * 流程实例数据
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
