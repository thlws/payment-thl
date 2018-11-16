package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能营销信息
 *
 * @author auto create
 * @since 1.0, 2017-03-29 16:53:54
 */
public class KbadvertSmartPromoResponse extends AlipayObject {

	private static final long serialVersionUID = 1583274158939994826L;

	/**
	 * 智能营销分组ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 智能营销方案ID
	 */
	@ApiField("plan_id")
	private String planId;

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public String getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

    /**
     * Gets plan id.
     *
     * @return the plan id
     */
    public String getPlanId() {
		return this.planId;
	}

    /**
     * Sets plan id.
     *
     * @param planId the plan id
     */
    public void setPlanId(String planId) {
		this.planId = planId;
	}

}
