package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.riskscan.single.query response.
 *
 * @author auto create
 * @since 1.0, 2018-03-19 21:02:08
 */
public class AlipaySecurityRiskRiskscanSingleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4816658355614376156L;

	/** 
	 * 业务返回数据，这是一个JsonString，Json中的key根据业务不同而不同，接入时商定。
	 */
	@ApiField("scan_result_data")
	private String scanResultData;

    /**
     * Sets scan result data.
     *
     * @param scanResultData the scan result data
     */
    public void setScanResultData(String scanResultData) {
		this.scanResultData = scanResultData;
	}

    /**
     * Gets scan result data.
     *
     * @return the scan result data
     */
    public String getScanResultData( ) {
		return this.scanResultData;
	}

}
