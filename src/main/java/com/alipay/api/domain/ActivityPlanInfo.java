package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动招商方案信息
 *
 * @author auto create
 * @since 1.0, 2017-09-15 15:52:22
 */
public class ActivityPlanInfo extends AlipayObject {

	private static final long serialVersionUID = 1598996823414596154L;

	/**
	 * 平台活动结束时间
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/**
	 * 平台活动开始时间
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/**
	 * 招商结束时间
	 */
	@ApiField("confirm_end_time")
	private String confirmEndTime;

	/**
	 * 平台活动邀约工单号(需要在第三方活动中回传)
	 */
	@ApiField("invite_order_id")
	private String inviteOrderId;

	/**
	 * 规则描述
	 */
	@ApiListField("plan_rule_list")
	@ApiField("plan_rule")
	private List<PlanRule> planRuleList;

	/**
	 * 是个链接地址，下载后是pdf文件
	 */
	@ApiField("plat_activity_agreement")
	private String platActivityAgreement;

	/**
	 * 平台活动id（需要在第三方方活动中回传）
	 */
	@ApiField("plat_activity_id")
	private String platActivityId;

	/**
	 * 平台活动标签类型
	 */
	@ApiField("plat_activity_label_type")
	private String platActivityLabelType;

	/**
	 * 平台活动名称
	 */
	@ApiField("plat_activity_name")
	private String platActivityName;

	/**
	 * 活动规则描述
	 */
	@ApiField("plat_activity_rule_desc")
	private String platActivityRuleDesc;

	/**
	 * 平台活动状态,GOING/FINISH,GOING表示招商中,FINISH表示招商已经结束(再报名活动也无法成功),只有GOING状态可以报名
	 */
	@ApiField("plat_activity_status")
	private String platActivityStatus;

	/**
	 * 其他说明
	 */
	@ApiField("plat_other_desc")
	private String platOtherDesc;

    /**
     * Gets activity end time.
     *
     * @return the activity end time
     */
    public String getActivityEndTime() {
		return this.activityEndTime;
	}

    /**
     * Sets activity end time.
     *
     * @param activityEndTime the activity end time
     */
    public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

    /**
     * Gets activity start time.
     *
     * @return the activity start time
     */
    public String getActivityStartTime() {
		return this.activityStartTime;
	}

    /**
     * Sets activity start time.
     *
     * @param activityStartTime the activity start time
     */
    public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

    /**
     * Gets confirm end time.
     *
     * @return the confirm end time
     */
    public String getConfirmEndTime() {
		return this.confirmEndTime;
	}

    /**
     * Sets confirm end time.
     *
     * @param confirmEndTime the confirm end time
     */
    public void setConfirmEndTime(String confirmEndTime) {
		this.confirmEndTime = confirmEndTime;
	}

    /**
     * Gets invite order id.
     *
     * @return the invite order id
     */
    public String getInviteOrderId() {
		return this.inviteOrderId;
	}

    /**
     * Sets invite order id.
     *
     * @param inviteOrderId the invite order id
     */
    public void setInviteOrderId(String inviteOrderId) {
		this.inviteOrderId = inviteOrderId;
	}

    /**
     * Gets plan rule list.
     *
     * @return the plan rule list
     */
    public List<PlanRule> getPlanRuleList() {
		return this.planRuleList;
	}

    /**
     * Sets plan rule list.
     *
     * @param planRuleList the plan rule list
     */
    public void setPlanRuleList(List<PlanRule> planRuleList) {
		this.planRuleList = planRuleList;
	}

    /**
     * Gets plat activity agreement.
     *
     * @return the plat activity agreement
     */
    public String getPlatActivityAgreement() {
		return this.platActivityAgreement;
	}

    /**
     * Sets plat activity agreement.
     *
     * @param platActivityAgreement the plat activity agreement
     */
    public void setPlatActivityAgreement(String platActivityAgreement) {
		this.platActivityAgreement = platActivityAgreement;
	}

    /**
     * Gets plat activity id.
     *
     * @return the plat activity id
     */
    public String getPlatActivityId() {
		return this.platActivityId;
	}

    /**
     * Sets plat activity id.
     *
     * @param platActivityId the plat activity id
     */
    public void setPlatActivityId(String platActivityId) {
		this.platActivityId = platActivityId;
	}

    /**
     * Gets plat activity label type.
     *
     * @return the plat activity label type
     */
    public String getPlatActivityLabelType() {
		return this.platActivityLabelType;
	}

    /**
     * Sets plat activity label type.
     *
     * @param platActivityLabelType the plat activity label type
     */
    public void setPlatActivityLabelType(String platActivityLabelType) {
		this.platActivityLabelType = platActivityLabelType;
	}

    /**
     * Gets plat activity name.
     *
     * @return the plat activity name
     */
    public String getPlatActivityName() {
		return this.platActivityName;
	}

    /**
     * Sets plat activity name.
     *
     * @param platActivityName the plat activity name
     */
    public void setPlatActivityName(String platActivityName) {
		this.platActivityName = platActivityName;
	}

    /**
     * Gets plat activity rule desc.
     *
     * @return the plat activity rule desc
     */
    public String getPlatActivityRuleDesc() {
		return this.platActivityRuleDesc;
	}

    /**
     * Sets plat activity rule desc.
     *
     * @param platActivityRuleDesc the plat activity rule desc
     */
    public void setPlatActivityRuleDesc(String platActivityRuleDesc) {
		this.platActivityRuleDesc = platActivityRuleDesc;
	}

    /**
     * Gets plat activity status.
     *
     * @return the plat activity status
     */
    public String getPlatActivityStatus() {
		return this.platActivityStatus;
	}

    /**
     * Sets plat activity status.
     *
     * @param platActivityStatus the plat activity status
     */
    public void setPlatActivityStatus(String platActivityStatus) {
		this.platActivityStatus = platActivityStatus;
	}

    /**
     * Gets plat other desc.
     *
     * @return the plat other desc
     */
    public String getPlatOtherDesc() {
		return this.platOtherDesc;
	}

    /**
     * Sets plat other desc.
     *
     * @param platOtherDesc the plat other desc
     */
    public void setPlatOtherDesc(String platOtherDesc) {
		this.platOtherDesc = platOtherDesc;
	}

}
