package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.data.external.send response.
 *
 * @author auto create
 * @since 1.0, 2018-02-09 12:02:34
 */
public class AlipayEcoMycarDataExternalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6175958755497175594L;

	/** 
	 * 20
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/** 
	 * outter_response
	 */
	@ApiField("process_result")
	private String processResult;

    /**
     * Sets external system name.
     *
     * @param externalSystemName the external system name
     */
    public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}

    /**
     * Gets external system name.
     *
     * @return the external system name
     */
    public String getExternalSystemName( ) {
		return this.externalSystemName;
	}

    /**
     * Sets process result.
     *
     * @param processResult the process result
     */
    public void setProcessResult(String processResult) {
		this.processResult = processResult;
	}

    /**
     * Gets process result.
     *
     * @return the process result
     */
    public String getProcessResult( ) {
		return this.processResult;
	}

}
