package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.data.put response.
 *
 * @author auto create
 * @since 1.0, 2015-04-02 16:45:23
 */
public class AlipayEcapiprodDataPutResponse extends AlipayResponse {

	private static final long serialVersionUID = 4522768452825928886L;

	/** 
	 * 数据版本
	 */
	@ApiField("data_version")
	private String dataVersion;

    /**
     * Sets data version.
     *
     * @param dataVersion the data version
     */
    public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

    /**
     * Gets data version.
     *
     * @return the data version
     */
    public String getDataVersion( ) {
		return this.dataVersion;
	}

}
