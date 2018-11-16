package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xuweibo测试用
 *
 * @author auto create
 * @since 1.0, 2017-12-01 10:47:07
 */
public class AlipayOpenAppXwbtestabcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6636554332285292597L;

	/**
	 * 1
	 */
	@ApiField("testabc")
	private String testabc;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private String xwb;

    /**
     * Gets testabc.
     *
     * @return the testabc
     */
    public String getTestabc() {
		return this.testabc;
	}

    /**
     * Sets testabc.
     *
     * @param testabc the testabc
     */
    public void setTestabc(String testabc) {
		this.testabc = testabc;
	}

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
