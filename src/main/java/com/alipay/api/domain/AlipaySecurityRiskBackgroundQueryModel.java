package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人员风险背景调查
 *
 * @author auto create
 * @since 1.0, 2017-05-31 19:27:57
 */
public class AlipaySecurityRiskBackgroundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3713215629328638494L;

	/**
	 * params+用于背调查询的输入信息+用户传入
	 */
	@ApiField("params")
	private String params;

	/**
	 * partner_name+唯一+作为标识调用者身份的字段+用户填入
	 */
	@ApiField("partner_name")
	private String partnerName;

    /**
     * Gets params.
     *
     * @return the params
     */
    public String getParams() {
		return this.params;
	}

    /**
     * Sets params.
     *
     * @param params the params
     */
    public void setParams(String params) {
		this.params = params;
	}

    /**
     * Gets partner name.
     *
     * @return the partner name
     */
    public String getPartnerName() {
		return this.partnerName;
	}

    /**
     * Sets partner name.
     *
     * @param partnerName the partner name
     */
    public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
