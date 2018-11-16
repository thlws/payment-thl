package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保订单出单确认
 *
 * @author auto create
 * @since 1.0, 2018-04-03 11:29:12
 */
public class AlipayInsSceneApplicationIssueConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4712716831783156917L;

	/**
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

    /**
     * Gets application no.
     *
     * @return the application no
     */
    public String getApplicationNo() {
		return this.applicationNo;
	}

    /**
     * Sets application no.
     *
     * @param applicationNo the application no
     */
    public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

}
