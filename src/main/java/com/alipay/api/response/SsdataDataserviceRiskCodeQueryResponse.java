package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.code.query response.
 *
 * @author auto create
 * @since 1.0, 2017-07-26 14:38:36
 */
public class SsdataDataserviceRiskCodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7647968254997961156L;

	/** 
	 * 是否命中yes/no
	 */
	@ApiField("hit")
	private String hit;

	/** 
	 * 风险码,具体见接口文档
	 */
	@ApiListField("risk_code")
	@ApiField("string")
	private List<String> riskCode;

	/** 
	 * 调用订单号
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/** 
	 * 验证码, 具体见接口文档
	 */
	@ApiListField("verify_code")
	@ApiField("string")
	private List<String> verifyCode;

    /**
     * Sets hit.
     *
     * @param hit the hit
     */
    public void setHit(String hit) {
		this.hit = hit;
	}

    /**
     * Gets hit.
     *
     * @return the hit
     */
    public String getHit( ) {
		return this.hit;
	}

    /**
     * Sets risk code.
     *
     * @param riskCode the risk code
     */
    public void setRiskCode(List<String> riskCode) {
		this.riskCode = riskCode;
	}

    /**
     * Gets risk code.
     *
     * @return the risk code
     */
    public List<String> getRiskCode( ) {
		return this.riskCode;
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

    /**
     * Sets verify code.
     *
     * @param verifyCode the verify code
     */
    public void setVerifyCode(List<String> verifyCode) {
		this.verifyCode = verifyCode;
	}

    /**
     * Gets verify code.
     *
     * @return the verify code
     */
    public List<String> getVerifyCode( ) {
		return this.verifyCode;
	}

}
