package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动基本信息
 *
 * @author auto create
 * @since 1.0, 2017-09-30 11:20:43
 */
public class CampBaseDto extends AlipayObject {

	private static final long serialVersionUID = 3869627349259913498L;

	/**
	 * 活动工单列表
	 */
	@ApiListField("activity_orders")
	@ApiField("activity_order_d_t_o")
	private List<ActivityOrderDTO> activityOrders;

	/**
	 * 活动审核状态，AUDITING为审核中,REJECT为驳回，不返回为成功
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 是否自动续期，Y为是，N为否，为空表示否
	 */
	@ApiField("auto_delay_flag")
	private String autoDelayFlag;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 活动id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 活动名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 招商状态,GOING招商中，ENDED招商结束，OFFLINE下架
	 */
	@ApiField("plan_status")
	private String planStatus;

	/**
	 * 启动时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态,CREATED:草稿，ENABLED：生效，DISABLED：无效，STARTED：启动，CLOSED：停止，FINISHED：完成
	 */
	@ApiField("status")
	private String status;

	/**
	 * 活动类型.DIRECT_SEND:直发奖,CONSUME_SEND:消费送
	 */
	@ApiField("type")
	private String type;

    /**
     * Gets activity orders.
     *
     * @return the activity orders
     */
    public List<ActivityOrderDTO> getActivityOrders() {
		return this.activityOrders;
	}

    /**
     * Sets activity orders.
     *
     * @param activityOrders the activity orders
     */
    public void setActivityOrders(List<ActivityOrderDTO> activityOrders) {
		this.activityOrders = activityOrders;
	}

    /**
     * Gets audit status.
     *
     * @return the audit status
     */
    public String getAuditStatus() {
		return this.auditStatus;
	}

    /**
     * Sets audit status.
     *
     * @param auditStatus the audit status
     */
    public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

    /**
     * Gets auto delay flag.
     *
     * @return the auto delay flag
     */
    public String getAutoDelayFlag() {
		return this.autoDelayFlag;
	}

    /**
     * Sets auto delay flag.
     *
     * @param autoDelayFlag the auto delay flag
     */
    public void setAutoDelayFlag(String autoDelayFlag) {
		this.autoDelayFlag = autoDelayFlag;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return this.id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets plan status.
     *
     * @return the plan status
     */
    public String getPlanStatus() {
		return this.planStatus;
	}

    /**
     * Sets plan status.
     *
     * @param planStatus the plan status
     */
    public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

}
