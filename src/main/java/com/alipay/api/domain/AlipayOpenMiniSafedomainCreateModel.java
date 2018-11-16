package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序添加域白名单
 *
 * @author auto create
 * @since 1.0, 2017-12-20 11:12:34
 */
public class AlipayOpenMiniSafedomainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8494125573827841251L;

	/**
	 * httpRequest域白名单
	 */
	@ApiField("safe_domain")
	private String safeDomain;

    /**
     * Gets safe domain.
     *
     * @return the safe domain
     */
    public String getSafeDomain() {
		return this.safeDomain;
	}

    /**
     * Sets safe domain.
     *
     * @param safeDomain the safe domain
     */
    public void setSafeDomain(String safeDomain) {
		this.safeDomain = safeDomain;
	}

}
