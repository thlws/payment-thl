package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动详情
 *
 * @author auto create
 * @since 1.0, 2017-09-30 11:20:37
 */
public class CampDetail extends AlipayObject {

	private static final long serialVersionUID = 7369964412319611952L;

	/**
	 * 活动工单列表
	 */
	@ApiListField("activity_orders")
	@ApiField("activity_order_d_t_o")
	private List<ActivityOrderDTO> activityOrders;

	/**
	 * 活动子状态，如审核中
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 是否自动续期该活动,Y表示是，N表示否，默认为N
	 */
	@ApiField("auto_delay_flag")
	private String autoDelayFlag;

	/**
	 * 预算信息
	 */
	@ApiField("budget_info")
	private BudgetInfo budgetInfo;

	/**
	 * 活动约束信息
	 */
	@ApiField("constraint_info")
	private ConstraintInfo constraintInfo;

	/**
	 * 活动描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

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
	 * 营销工具
	 */
	@ApiListField("promo_tools")
	@ApiField("promo_tool")
	private List<PromoTool> promoTools;

	/**
	 * 投放渠道信息
	 */
	@ApiListField("publish_channels")
	@ApiField("publish_channel")
	private List<PublishChannel> publishChannels;

	/**
	 * 招商信息
	 */
	@ApiField("recruit_info")
	private RecruitInfo recruitInfo;

	/**
	 * 活动开始时间
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
     * Gets budget info.
     *
     * @return the budget info
     */
    public BudgetInfo getBudgetInfo() {
		return this.budgetInfo;
	}

    /**
     * Sets budget info.
     *
     * @param budgetInfo the budget info
     */
    public void setBudgetInfo(BudgetInfo budgetInfo) {
		this.budgetInfo = budgetInfo;
	}

    /**
     * Gets constraint info.
     *
     * @return the constraint info
     */
    public ConstraintInfo getConstraintInfo() {
		return this.constraintInfo;
	}

    /**
     * Sets constraint info.
     *
     * @param constraintInfo the constraint info
     */
    public void setConstraintInfo(ConstraintInfo constraintInfo) {
		this.constraintInfo = constraintInfo;
	}

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
     * Gets promo tools.
     *
     * @return the promo tools
     */
    public List<PromoTool> getPromoTools() {
		return this.promoTools;
	}

    /**
     * Sets promo tools.
     *
     * @param promoTools the promo tools
     */
    public void setPromoTools(List<PromoTool> promoTools) {
		this.promoTools = promoTools;
	}

    /**
     * Gets publish channels.
     *
     * @return the publish channels
     */
    public List<PublishChannel> getPublishChannels() {
		return this.publishChannels;
	}

    /**
     * Sets publish channels.
     *
     * @param publishChannels the publish channels
     */
    public void setPublishChannels(List<PublishChannel> publishChannels) {
		this.publishChannels = publishChannels;
	}

    /**
     * Gets recruit info.
     *
     * @return the recruit info
     */
    public RecruitInfo getRecruitInfo() {
		return this.recruitInfo;
	}

    /**
     * Sets recruit info.
     *
     * @param recruitInfo the recruit info
     */
    public void setRecruitInfo(RecruitInfo recruitInfo) {
		this.recruitInfo = recruitInfo;
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
