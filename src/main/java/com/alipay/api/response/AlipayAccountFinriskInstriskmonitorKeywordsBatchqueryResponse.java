package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.account.finrisk.instriskmonitor.keywords.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-04 00:00:00
 */
public class AlipayAccountFinriskInstriskmonitorKeywordsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8643768195618684586L;

	/** 
	 * 返回机构关键词相关信息
	 */
	@ApiListField("result")
	@ApiField("string")
	private List<String> result;

    /**
     * Sets result.
     *
     * @param result the result
     */
    public void setResult(List<String> result) {
		this.result = result;
	}

    /**
     * Gets result.
     *
     * @return the result
     */
    public List<String> getResult( ) {
		return this.result;
	}

}
