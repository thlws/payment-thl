package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动详情查询
 *
 * @author auto create
 * @since 1.0, 2017-11-03 14:54:15
 */
public class KoubeiMarketingCampaignActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6876731237914326815L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 操作人id，必须和operator_type配对出现，不填时默认是商户
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
	 */
	@ApiField("operator_type")
	private String operatorType;

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId() {
		return this.campId;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

    /**
     * Gets operator id.
     *
     * @return the operator id
     */
    public String getOperatorId() {
		return this.operatorId;
	}

    /**
     * Sets operator id.
     *
     * @param operatorId the operator id
     */
    public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

    /**
     * Gets operator type.
     *
     * @return the operator type
     */
    public String getOperatorType() {
		return this.operatorType;
	}

    /**
     * Sets operator type.
     *
     * @param operatorType the operator type
     */
    public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

}
