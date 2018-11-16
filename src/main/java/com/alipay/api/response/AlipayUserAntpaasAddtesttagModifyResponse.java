package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.addtesttag.modify response.
 *
 * @author auto create
 * @since 1.0, 2017-06-30 11:13:29
 */
public class AlipayUserAntpaasAddtesttagModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7382622178297728691L;

	/** 
	 * 返回是否有标记或者是否达标成功，success，msg
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
