package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.antifraudlist.query response.
 *
 * @author auto create
 * @since 1.0, 2017-09-27 11:41:38
 */
public class SsdataDataserviceRiskAntifraudlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3264256162265551292L;

	/** 
	 * 蚁盾对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 欺诈关注清单是否命中，yes标识命中，no标识未命中
	 */
	@ApiField("hit")
	private String hit;

	/** 
	 * 欺诈关注清单的RiskCode列表，对应的描述见产品文档
	 */
	@ApiField("risk_code")
	private String riskCode;

	/** 
	 * 用户唯一请求id
	 */
	@ApiField("unique_id")
	private String uniqueId;

    /**
     * Sets biz no.
     *
     * @param bizNo the biz no
     */
    public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

    /**
     * Gets biz no.
     *
     * @return the biz no
     */
    public String getBizNo( ) {
		return this.bizNo;
	}

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
    public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

    /**
     * Gets risk code.
     *
     * @return the risk code
     */
    public String getRiskCode( ) {
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

}
