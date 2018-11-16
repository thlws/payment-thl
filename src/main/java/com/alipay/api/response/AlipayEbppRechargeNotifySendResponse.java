package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.notify.send response.
 *
 * @author auto create
 * @since 1.0, 2018-01-09 18:03:25
 */
public class AlipayEbppRechargeNotifySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2674636887919889174L;

	/** 
	 * 操作状态
	 */
	@ApiField("status")
	private String status;

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus( ) {
		return this.status;
	}

}
