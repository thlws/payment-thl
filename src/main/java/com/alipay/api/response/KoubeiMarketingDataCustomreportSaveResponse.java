package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.customreport.save response.
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:03:21
 */
public class KoubeiMarketingDataCustomreportSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2244978412899194774L;

	/** 
	 * 自定义报表的规则ID
	 */
	@ApiField("condition_key")
	private String conditionKey;

    /**
     * Sets condition key.
     *
     * @param conditionKey the condition key
     */
    public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

    /**
     * Gets condition key.
     *
     * @return the condition key
     */
    public String getConditionKey( ) {
		return this.conditionKey;
	}

}
