package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.antijunkregister.query response.
 *
 * @author auto create
 * @since 1.0, 2017-07-26 14:35:23
 */
public class SsdataDataserviceRiskAntijunkregisterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3811125867233584422L;

	/** 
	 * 风险解释，即本次风险评分中TOP 3，信息代码、风险因子代码、风险因子名、风险描述。详情请参考
	 */
	@ApiField("infocode")
	private String infocode;

	/** 
	 * 基于传入的介质参数，计算得到的垃圾注册风险分，范围[0,100],分数越高风险程度越高
	 */
	@ApiField("score")
	private String score;

	/** 
	 * 用户唯一请求ID
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Sets infocode.
     *
     * @param infocode the infocode
     */
    public void setInfocode(String infocode) {
		this.infocode = infocode;
	}

    /**
     * Gets infocode.
     *
     * @return the infocode
     */
    public String getInfocode( ) {
		return this.infocode;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(String score) {
		this.score = score;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public String getScore( ) {
		return this.score;
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
