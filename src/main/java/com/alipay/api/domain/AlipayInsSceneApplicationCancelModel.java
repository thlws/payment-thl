package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保订单出单撤销
 *
 * @author auto create
 * @since 1.0, 2018-03-08 18:09:21
 */
public class AlipayInsSceneApplicationCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1891169253691356426L;

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
