package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.codetesttest response.
 *
 * @author auto create
 * @since 1.0, 2017-04-12 20:55:36
 */
public class AlipayOpenAppCodetesttestResponse extends AlipayResponse {

	private static final long serialVersionUID = 1274377297136187868L;

	/** 
	 * 测试测试测试
	 */
	@ApiField("testtesttest")
	private String testtesttest;

    /**
     * Sets testtesttest.
     *
     * @param testtesttest the testtesttest
     */
    public void setTesttesttest(String testtesttest) {
		this.testtesttest = testtesttest;
	}

    /**
     * Gets testtesttest.
     *
     * @return the testtesttest
     */
    public String getTesttesttest( ) {
		return this.testtesttest;
	}

}
