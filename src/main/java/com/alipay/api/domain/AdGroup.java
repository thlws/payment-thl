package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告单元层级数据结构
 *
 * @author auto create
 * @since 1.0, 2018-09-18 21:52:42
 */
public class AdGroup extends AlipayObject {

	private static final long serialVersionUID = 8882792438144873569L;

	/**
	 * 广告系统ID
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 人群定向（优化）配置串
	 */
	@ApiField("crowd_condition")
	private String crowdCondition;

	/**
	 * 广告单元ID，新建时留空
	 */
	@ApiField("group_id")
	private Long groupId;

	/**
	 * 广告单元名称
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * 单元所属计划ID
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 区域定向
	 */
	@ApiListField("position_condition")
	@ApiField("position")
	private List<Position> positionCondition;

	/**
	 * 单元保量数值
	 */
	@ApiField("quantity")
	private Long quantity;

    /**
     * Gets ad user id.
     *
     * @return the ad user id
     */
    public Long getAdUserId() {
		return this.adUserId;
	}

    /**
     * Sets ad user id.
     *
     * @param adUserId the ad user id
     */
    public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

    /**
     * Gets crowd condition.
     *
     * @return the crowd condition
     */
    public String getCrowdCondition() {
		return this.crowdCondition;
	}

    /**
     * Sets crowd condition.
     *
     * @param crowdCondition the crowd condition
     */
    public void setCrowdCondition(String crowdCondition) {
		this.crowdCondition = crowdCondition;
	}

    /**
     * Gets group id.
     *
     * @return the group id
     */
    public Long getGroupId() {
		return this.groupId;
	}

    /**
     * Sets group id.
     *
     * @param groupId the group id
     */
    public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

    /**
     * Gets group name.
     *
     * @return the group name
     */
    public String getGroupName() {
		return this.groupName;
	}

    /**
     * Sets group name.
     *
     * @param groupName the group name
     */
    public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

    /**
     * Gets plan id.
     *
     * @return the plan id
     */
    public Long getPlanId() {
		return this.planId;
	}

    /**
     * Sets plan id.
     *
     * @param planId the plan id
     */
    public void setPlanId(Long planId) {
		this.planId = planId;
	}

    /**
     * Gets position condition.
     *
     * @return the position condition
     */
    public List<Position> getPositionCondition() {
		return this.positionCondition;
	}

    /**
     * Sets position condition.
     *
     * @param positionCondition the position condition
     */
    public void setPositionCondition(List<Position> positionCondition) {
		this.positionCondition = positionCondition;
	}

    /**
     * Gets quantity.
     *
     * @return the quantity
     */
    public Long getQuantity() {
		return this.quantity;
	}

    /**
     * Sets quantity.
     *
     * @param quantity the quantity
     */
    public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
