package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发验证一一一五
 *
 * @author auto create
 * @since 1.0, 2017-11-15 13:09:27
 */
public class AlipayOpenAppYiyiyiwuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2119288776514596742L;

	/**
	 * 12
	 */
	@ApiField("rucan")
	private String rucan;

    /**
     * Gets rucan.
     *
     * @return the rucan
     */
    public String getRucan() {
		return this.rucan;
	}

    /**
     * Sets rucan.
     *
     * @param rucan the rucan
     */
    public void setRucan(String rucan) {
		this.rucan = rucan;
	}

}
