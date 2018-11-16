package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝账号入驻开放平台有效性检查
 *
 * @author auto create
 * @since 1.0, 2017-07-14 11:07:28
 */
public class AlipayOpenAppDeveloperCheckdevelopervalidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6473151977435992221L;

	/**
	 * 支付宝账号
	 */
	@ApiField("logon_id")
	private String logonId;

    /**
     * Gets logon id.
     *
     * @return the logon id
     */
    public String getLogonId() {
		return this.logonId;
	}

    /**
     * Sets logon id.
     *
     * @param logonId the logon id
     */
    public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
