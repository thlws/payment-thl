package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预发上测试
 *
 * @author auto create
 * @since 1.0, 2017-12-21 18:50:44
 */
public class AlipayOpenPublicXwbtestabcdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3123453237852532849L;

	/**
	 * 1111112141414
	 */
	@ApiField("s")
	private String s;

    /**
     * Gets s.
     *
     * @return the s
     */
    public String getS() {
		return this.s;
	}

    /**
     * Sets s.
     *
     * @param s the s
     */
    public void setS(String s) {
		this.s = s;
	}

}
