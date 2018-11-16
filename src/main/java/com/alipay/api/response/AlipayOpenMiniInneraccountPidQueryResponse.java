package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inneraccount.pid.query response.
 *
 * @author auto create
 * @since 1.0, 2018-02-26 15:54:10
 */
public class AlipayOpenMiniInneraccountPidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2563111447688345149L;

	/** 
	 * 虚拟PID
	 */
	@ApiField("pid")
	private String pid;

    /**
     * Sets pid.
     *
     * @param pid the pid
     */
    public void setPid(String pid) {
		this.pid = pid;
	}

    /**
     * Gets pid.
     *
     * @return the pid
     */
    public String getPid( ) {
		return this.pid;
	}

}
