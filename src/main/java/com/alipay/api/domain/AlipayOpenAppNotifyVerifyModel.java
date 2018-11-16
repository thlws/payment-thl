package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 验证通知
 *
 * @author auto create
 * @since 1.0, 2017-11-21 22:27:49
 */
public class AlipayOpenAppNotifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7553571615437388891L;

	/**
	 * 通知id
	 */
	@ApiField("notify_id")
	private String notifyId;

    /**
     * Gets notify id.
     *
     * @return the notify id
     */
    public String getNotifyId() {
		return this.notifyId;
	}

    /**
     * Sets notify id.
     *
     * @param notifyId the notify id
     */
    public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
	}

}
