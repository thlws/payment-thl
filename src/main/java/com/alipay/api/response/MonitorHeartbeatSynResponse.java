package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: monitor.heartbeat.syn response.
 *
 * @author auto create
 * @since 1.0, 2018-01-24 20:12:25
 */
public class MonitorHeartbeatSynResponse extends AlipayResponse {

	private static final long serialVersionUID = 7196318137358785327L;

	/** 
	 * 商户pid
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
