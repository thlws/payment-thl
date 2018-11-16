package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.test response.
 *
 * @author auto create
 * @since 1.0, 2016-01-14 17:47:44
 */
public class AlipayUserTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 4694894219266917828L;

	/** 
	 * 返回值
	 */
	@ApiField("ret1")
	private String ret1;

    /**
     * Sets ret 1.
     *
     * @param ret1 the ret 1
     */
    public void setRet1(String ret1) {
		this.ret1 = ret1;
	}

    /**
     * Gets ret 1.
     *
     * @return the ret 1
     */
    public String getRet1( ) {
		return this.ret1;
	}

}
