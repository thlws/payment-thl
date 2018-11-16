package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.userid.get response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayPlatformUseridGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7457647452958943199L;

	/** 
	 * id字典，key为openId，value为userId
	 */
	@ApiField("dict")
	private String dict;

    /**
     * Sets dict.
     *
     * @param dict the dict
     */
    public void setDict(String dict) {
		this.dict = dict;
	}

    /**
     * Gets dict.
     *
     * @return the dict
     */
    public String getDict( ) {
		return this.dict;
	}

}
