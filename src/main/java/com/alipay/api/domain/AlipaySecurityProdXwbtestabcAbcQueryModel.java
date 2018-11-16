package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xuwebio测试用
 *
 * @author auto create
 * @since 1.0, 2017-11-17 10:59:46
 */
public class AlipaySecurityProdXwbtestabcAbcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2657741887123141774L;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

    /**
     * Gets xwb.
     *
     * @return the xwb
     */
    public String getXwb() {
		return this.xwb;
	}

    /**
     * Sets xwb.
     *
     * @param xwb the xwb
     */
    public void setXwb(String xwb) {
		this.xwb = xwb;
	}

}
