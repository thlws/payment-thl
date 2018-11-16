package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 计划单元详情
 *
 * @author auto create
 * @since 1.0, 2018-09-18 21:52:42
 */
public class AdPlan extends AlipayObject {

	private static final long serialVersionUID = 7296772686255153662L;

	/**
	 * 注册用户返回的用户ID
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 广告投放预算，单位：分
	 */
	@ApiField("budget")
	private Long budget;

	/**
	 * 投放计划结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 计划中所属单元列表
	 */
	@ApiField("group_list")
	private AdGroup groupList;

	/**
	 * 广告计划ID
	 */
	@ApiField("plan_id")
	private Long planId;

	/**
	 * 广告计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/**
	 * 计划保量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 投放计划开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

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
     * Gets budget.
     *
     * @return the budget
     */
    public Long getBudget() {
		return this.budget;
	}

    /**
     * Sets budget.
     *
     * @param budget the budget
     */
    public void setBudget(Long budget) {
		this.budget = budget;
	}

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public Date getEndDate() {
		return this.endDate;
	}

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

    /**
     * Gets group list.
     *
     * @return the group list
     */
    public AdGroup getGroupList() {
		return this.groupList;
	}

    /**
     * Sets group list.
     *
     * @param groupList the group list
     */
    public void setGroupList(AdGroup groupList) {
		this.groupList = groupList;
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
     * Gets plan name.
     *
     * @return the plan name
     */
    public String getPlanName() {
		return this.planName;
	}

    /**
     * Sets plan name.
     *
     * @param planName the plan name
     */
    public void setPlanName(String planName) {
		this.planName = planName;
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

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Date getStartDate() {
		return this.startDate;
	}

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
