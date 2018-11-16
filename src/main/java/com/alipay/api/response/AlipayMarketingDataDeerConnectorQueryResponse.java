package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.deer.connector.query response.
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:18:13
 */
public class AlipayMarketingDataDeerConnectorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1245814481694948932L;

	/** 
	 * 返回活动的流量数据
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 请求业务处理是否成功
	 */
	@ApiField("success")
	private Boolean success;

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

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

    /**
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess( ) {
		return this.success;
	}

}
