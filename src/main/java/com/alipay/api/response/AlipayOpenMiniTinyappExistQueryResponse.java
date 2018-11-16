package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.tinyapp.exist.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-24 16:05:00
 */
public class AlipayOpenMiniTinyappExistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7127769558361796899L;

	/** 
	 * 是否是小程序开发者
	 */
	@ApiField("exist_mini")
	private String existMini;

    /**
     * Sets exist mini.
     *
     * @param existMini the exist mini
     */
    public void setExistMini(String existMini) {
		this.existMini = existMini;
	}

    /**
     * Gets exist mini.
     *
     * @return the exist mini
     */
    public String getExistMini( ) {
		return this.existMini;
	}

}
