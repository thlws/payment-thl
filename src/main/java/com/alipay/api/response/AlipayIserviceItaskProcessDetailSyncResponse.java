package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.process.detail.sync response.
 *
 * @author auto create
 * @since 1.0, 2018-09-14 20:35:00
 */
public class AlipayIserviceItaskProcessDetailSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3752925782466629286L;

	/** 
	 * 蚂蚁工单编号
	 */
	@ApiField("alipay_process_id")
	private String alipayProcessId;

    /**
     * Sets alipay process id.
     *
     * @param alipayProcessId the alipay process id
     */
    public void setAlipayProcessId(String alipayProcessId) {
		this.alipayProcessId = alipayProcessId;
	}

    /**
     * Gets alipay process id.
     *
     * @return the alipay process id
     */
    public String getAlipayProcessId( ) {
		return this.alipayProcessId;
	}

}
