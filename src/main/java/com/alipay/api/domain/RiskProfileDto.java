package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * riskprofile查询返回的键值对
 *
 * @author auto create
 * @since 1.0, 2018-09-11 17:17:44
 */
public class RiskProfileDto extends AlipayObject {

	private static final long serialVersionUID = 1699553939216766236L;

	/**
	 * risk profile名称和入参对应
	 */
	@ApiField("risk_profile")
	private String riskProfile;

	/**
	 * risk profile对应主体的分值
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets risk profile.
     *
     * @return the risk profile
     */
    public String getRiskProfile() {
		return this.riskProfile;
	}

    /**
     * Sets risk profile.
     *
     * @param riskProfile the risk profile
     */
    public void setRiskProfile(String riskProfile) {
		this.riskProfile = riskProfile;
	}

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
		this.value = value;
	}

}
