package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.yufalingsanyaowub.yufalingsanyaowub.query response.
 *
 * @author auto create
 * @since 1.0, 2017-03-15 22:56:43
 */
public class AlipayOpenAppYufalingsanyaowubYufalingsanyaowubQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1387451938988535253L;

	/** 
	 * yufaa
	 */
	@ApiField("yufaa")
	private String yufaa;

    /**
     * Sets yufaa.
     *
     * @param yufaa the yufaa
     */
    public void setYufaa(String yufaa) {
		this.yufaa = yufaa;
	}

    /**
     * Gets yufaa.
     *
     * @return the yufaa
     */
    public String getYufaa( ) {
		return this.yufaa;
	}

}
