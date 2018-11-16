package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayHighValueCustomerResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.userlevel.zrank.get response.
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:27:27
 */
public class AlipayDataDataserviceUserlevelZrankGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1332898326576458279L;

	/** 
	 * 活跃高价值用户返回
	 */
	@ApiField("result")
	private AlipayHighValueCustomerResult result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(AlipayHighValueCustomerResult result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public AlipayHighValueCustomerResult getResult( ) {
		return this.result;
	}

}
