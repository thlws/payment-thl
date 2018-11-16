package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayChinareModelResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.chinaremodel.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:27:48
 */
public class AlipayDataDataserviceChinaremodelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2888852471963735769L;

	/** 
	 * 中再核保模型查询结果
	 */
	@ApiField("result")
	private AlipayChinareModelResult result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(AlipayChinareModelResult result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public AlipayChinareModelResult getResult( ) {
		return this.result;
	}

}
