package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataSecCheckResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.check.get response.
 *
 * @author auto create
 * @since 1.0, 2018-06-22 11:30:00
 */
public class KoubeiMarketingDataMallCheckGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1715338812428662355L;

	/** 
	 * 返回数据字段
	 */
	@ApiListField("data_results")
	@ApiField("data_sec_check_result")
	private List<DataSecCheckResult> dataResults;

    /**
     * Sets data results.
     *
     * @param dataResults the data results
     */
    public void setDataResults(List<DataSecCheckResult> dataResults) {
		this.dataResults = dataResults;
	}

    /**
     * Gets data results.
     *
     * @return the data results
     */
    public List<DataSecCheckResult> getDataResults( ) {
		return this.dataResults;
	}

}
