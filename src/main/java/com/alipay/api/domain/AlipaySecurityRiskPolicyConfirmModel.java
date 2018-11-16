package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全策略确认服务输出
 *
 * @author auto create
 * @since 1.0, 2018-09-18 10:50:30
 */
public class AlipaySecurityRiskPolicyConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8797917367282132623L;

	/**
	 * 二次确认参数，防止篡改
	 */
	@ApiField("confirm_params")
	private String confirmParams;

	/**
	 * 安全请求生成的唯一ID
	 */
	@ApiField("security_id")
	private String securityId;

    /**
     * Gets confirm params.
     *
     * @return the confirm params
     */
    public String getConfirmParams() {
		return this.confirmParams;
	}

    /**
     * Sets confirm params.
     *
     * @param confirmParams the confirm params
     */
    public void setConfirmParams(String confirmParams) {
		this.confirmParams = confirmParams;
	}

    /**
     * Gets security id.
     *
     * @return the security id
     */
    public String getSecurityId() {
		return this.securityId;
	}

    /**
     * Sets security id.
     *
     * @param securityId the security id
     */
    public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

}
