package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.issue.confirm response.
 *
 * @author auto create
 * @since 1.0, 2018-04-03 11:29:12
 */
public class AlipayInsSceneApplicationIssueConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2532899981219132768L;

	/** 
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

    /**
     * Sets application no.
     *
     * @param applicationNo the application no
     */
    public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

    /**
     * Gets application no.
     *
     * @return the application no
     */
    public String getApplicationNo( ) {
		return this.applicationNo;
	}

}
