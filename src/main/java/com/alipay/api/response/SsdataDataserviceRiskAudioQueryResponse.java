package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.audio.query response.
 *
 * @author auto create
 * @since 1.0, 2018-01-19 20:03:05
 */
public class SsdataDataserviceRiskAudioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3585417279625288265L;

	/** 
	 * 命中的用户自定义的关键词列表及选择的模型命中分数
	 */
	@ApiField("risk_result")
	private String riskResult;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Sets risk result.
     *
     * @param riskResult the risk result
     */
    public void setRiskResult(String riskResult) {
		this.riskResult = riskResult;
	}

    /**
     * Gets risk result.
     *
     * @return the risk result
     */
    public String getRiskResult( ) {
		return this.riskResult;
	}

    /**
     * Sets unique id.
     *
     * @param uniqueId the unique id
     */
    public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

    /**
     * Gets unique id.
     *
     * @return the unique id
     */
    public String getUniqueId( ) {
		return this.uniqueId;
	}

}
