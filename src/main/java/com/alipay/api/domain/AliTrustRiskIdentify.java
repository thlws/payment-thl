package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻信用风险名单识别结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AliTrustRiskIdentify extends AlipayObject {

	private static final long serialVersionUID = 2216112819112482858L;

	/**
	 * 芝麻信用风险名单详情列表
	 */
	@ApiListField("details")
	@ApiField("zhima_risk_detail")
	private List<ZhimaRiskDetail> details;

	/**
	 * 当有风险时,为"T";无风险识别是为"F"
	 */
	@ApiField("is_risk")
	private String isRisk;

	/**
	 * 已废弃
	 */
	@ApiField("risk_tag")
	private String riskTag;

    /**
     * Gets details.
     *
     * @return the details
     */
    public List<ZhimaRiskDetail> getDetails() {
		return this.details;
	}

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(List<ZhimaRiskDetail> details) {
		this.details = details;
	}

    /**
     * Gets is risk.
     *
     * @return the is risk
     */
    public String getIsRisk() {
		return this.isRisk;
	}

    /**
     * Sets is risk.
     *
     * @param isRisk the is risk
     */
    public void setIsRisk(String isRisk) {
		this.isRisk = isRisk;
	}

    /**
     * Gets risk tag.
     *
     * @return the risk tag
     */
    public String getRiskTag() {
		return this.riskTag;
	}

    /**
     * Sets risk tag.
     *
     * @param riskTag the risk tag
     */
    public void setRiskTag(String riskTag) {
		this.riskTag = riskTag;
	}

}
