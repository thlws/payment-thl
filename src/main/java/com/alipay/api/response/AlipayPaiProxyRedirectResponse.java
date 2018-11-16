package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pai.proxy.redirect response.
 *
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:12
 */
public class AlipayPaiProxyRedirectResponse extends AlipayResponse {

	private static final long serialVersionUID = 1761343277991351335L;

	/** 
	 * 测试返回数据，页面级接口此项没用
	 */
	@ApiField("test_res")
	private String testRes;

    /**
     * Sets test res.
     *
     * @param testRes the test res
     */
    public void setTestRes(String testRes) {
		this.testRes = testRes;
	}

    /**
     * Gets test res.
     *
     * @return the test res
     */
    public String getTestRes( ) {
		return this.testRes;
	}

}
