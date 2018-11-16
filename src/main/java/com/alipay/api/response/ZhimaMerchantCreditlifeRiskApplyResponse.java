package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.creditlife.risk.apply response.
 *
 * @author auto create
 * @since 1.0, 2017-11-20 13:41:00
 */
public class ZhimaMerchantCreditlifeRiskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4636845121999458159L;

	/** 
	 * 用户在商端的身份标识，如果在接口的入参中存在该参数，芝麻网关会自动转化
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 较差、中等、良好、优秀、极好5个级别
	 */
	@ApiField("zm_grade")
	private String zmGrade;

	/** 
	 * 风控结果
	 */
	@ApiField("zm_risk")
	private String zmRisk;

	/** 
	 * 芝麻分
	 */
	@ApiField("zm_score")
	private String zmScore;

    /**
     * Sets open id.
     *
     * @param openId the open id
     */
    public void setOpenId(String openId) {
		this.openId = openId;
	}

    /**
     * Gets open id.
     *
     * @return the open id
     */
    public String getOpenId( ) {
		return this.openId;
	}

    /**
     * Sets zm grade.
     *
     * @param zmGrade the zm grade
     */
    public void setZmGrade(String zmGrade) {
		this.zmGrade = zmGrade;
	}

    /**
     * Gets zm grade.
     *
     * @return the zm grade
     */
    public String getZmGrade( ) {
		return this.zmGrade;
	}

    /**
     * Sets zm risk.
     *
     * @param zmRisk the zm risk
     */
    public void setZmRisk(String zmRisk) {
		this.zmRisk = zmRisk;
	}

    /**
     * Gets zm risk.
     *
     * @return the zm risk
     */
    public String getZmRisk( ) {
		return this.zmRisk;
	}

    /**
     * Sets zm score.
     *
     * @param zmScore the zm score
     */
    public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}

    /**
     * Gets zm score.
     *
     * @return the zm score
     */
    public String getZmScore( ) {
		return this.zmScore;
	}

}
