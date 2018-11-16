package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.bizadviser.myreport.query response.
 *
 * @author auto create
 * @since 1.0, 2017-10-02 18:20:49
 */
public class KoubeiMarketingDataBizadviserMyreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5198638258596528359L;

	/** 
	 * 不同uniq_key 返回不同参数，详细请看：https://doc.open.alipay.com/docs/doc.htm?spm=0.0.0.0.1Zq3by&docType=1&articleId=107061&previewCode=F30AA2D06B7CC0817AC7221A8CE288A4
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
