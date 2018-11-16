package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾内容产品风险识别结果
 *
 * @author auto create
 * @since 1.0, 2017-10-12 13:59:44
 */
public class RiskResult extends AlipayObject {

	private static final long serialVersionUID = 3869777568662742422L;

	/**
	 * 风险类型，比如0表示广告
	 */
	@ApiField("risk_type")
	private String riskType;

	/**
	 * 风险识别分数，0-100，分值越大风险越高
	 */
	@ApiField("score")
	private String score;

    /**
     * Gets risk type.
     *
     * @return the risk type
     */
    public String getRiskType() {
		return this.riskType;
	}

    /**
     * Sets risk type.
     *
     * @param riskType the risk type
     */
    public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

    /**
     * Gets score.
     *
     * @return the score
     */
    public String getScore() {
		return this.score;
	}

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(String score) {
		this.score = score;
	}

}
