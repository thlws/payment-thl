package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作员简单模型，包含操作员id，操作员类型
 *
 * @author auto create
 * @since 1.0, 2018-03-23 11:31:59
 */
public class SimpleOperatorModel extends AlipayObject {

	private static final long serialVersionUID = 3859947433697659843L;

	/**
	 * 操作员id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作员类型，只区分收银员和非收银员
收银员为“RESTRICTED_CASHIER”，非收银员为“STANDARD_NORMAL”
	 */
	@ApiField("operator_type")
	private String operatorType;

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
