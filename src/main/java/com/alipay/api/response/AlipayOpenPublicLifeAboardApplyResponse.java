package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.aboard.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-10-10 11:15:32
 */
public class AlipayOpenPublicLifeAboardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3743512517864255839L;

	/** 
	 * 上架成功后返回的提示
	 */
	@ApiField("result")
	private String result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(String result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public String getResult( ) {
		return this.result;
	}

}
