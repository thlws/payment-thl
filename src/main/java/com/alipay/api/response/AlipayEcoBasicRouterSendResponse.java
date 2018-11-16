package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.basic.router.send response.
 *
 * @author auto create
 * @since 1.0, 2018-01-26 13:50:04
 */
public class AlipayEcoBasicRouterSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6823986258418359375L;

	/** 
	 * 路由返回的数据
	 */
	@ApiField("res")
	private String res;

    /**
     * Sets res.
     *
     * @param res the res
     */
    public void setRes(String res) {
		this.res = res;
	}

    /**
     * Gets res.
     *
     * @return the res
     */
    public String getRes( ) {
		return this.res;
	}

}
