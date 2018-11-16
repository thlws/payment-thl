package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.count.sync response.
 *
 * @author auto create
 * @since 1.0, 2017-12-04 11:12:08
 */
public class AlipayOverseasTravelContentCountSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7352648531547958454L;

	/** 
	 * 详细错误码。可选，当code=40004，sub_code=BUSINESS_ERROR，不为为空
	 */
	@ApiField("results")
	private String results;

    /**
     * Sets results.
     *
     * @param results the results
     */
    public void setResults(String results) {
		this.results = results;
	}

    /**
     * Gets results.
     *
     * @return the results
     */
    public String getResults( ) {
		return this.results;
	}

}
