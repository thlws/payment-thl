package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.identical.authbase.query response.
 *
 * @author auto create
 * @since 1.0, 2018-06-13 17:55:00
 */
public class AlipayUserIdenticalAuthbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6573435535784447699L;

	/** 
	 * 是否是同人账号
	 */
	@ApiField("identical")
	private Boolean identical;

    /**
     * Sets identical.
     *
     * @param identical the identical
     */
    public void setIdentical(Boolean identical) {
		this.identical = identical;
	}

    /**
     * Gets identical.
     *
     * @return the identical
     */
    public Boolean getIdentical( ) {
		return this.identical;
	}

}
