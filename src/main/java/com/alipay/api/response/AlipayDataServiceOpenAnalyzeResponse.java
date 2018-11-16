package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayDataServiceResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.service.open.analyze response.
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:50:17
 */
public class AlipayDataServiceOpenAnalyzeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6578969142886788624L;

	/** 
	 * 调用返回
	 */
	@ApiField("result")
	private AlipayDataServiceResult result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(AlipayDataServiceResult result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public AlipayDataServiceResult getResult( ) {
		return this.result;
	}

}
