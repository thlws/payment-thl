package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动各阶段订单模型
 *
 * @author auto create
 * @since 1.0, 2017-09-30 11:20:54
 */
public class ActivityOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 2145893578944478423L;

	/**
	 * 工单中的审核信息
	 */
	@ApiListField("activity_audit_list")
	@ApiField("activity_audit_d_t_o")
	private List<ActivityAuditDTO> activityAuditList;

	/**
	 * INIT:初始化;AUDITING:审核中;REJECT:审核驳回;PASS:审核通过;CANCEL:审核撤销;FAIL:审核失败
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * INIT:初始化;DOING:处理中;SUCCESS:成功;FAIL:失败
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * CAMPAIGN_CREATE_ORDER:创建工单;CAMPAIGN_ENABLE_ORDER:生效工单;CAMPAIGN_START_ORDER:启动工单;CAMPAIGN_CLOSE_ORDER:关闭工单;CAMPAIGN_FINISH_ORDER:结束工单;CAMPAIGN_DELETE_ORDER:删除工单;CAMPAIGN_MODIFY_ORDER:修改工单
	 */
	@ApiField("order_type")
	private String orderType;

    /**
     * Gets activity audit list.
     *
     * @return the activity audit list
     */
    public List<ActivityAuditDTO> getActivityAuditList() {
		return this.activityAuditList;
	}

    /**
     * Sets activity audit list.
     *
     * @param activityAuditList the activity audit list
     */
    public void setActivityAuditList(List<ActivityAuditDTO> activityAuditList) {
		this.activityAuditList = activityAuditList;
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
     * Gets order id.
     *
     * @return the order id
     */
    public String getOrderId() {
		return this.orderId;
	}

    /**
     * Sets order id.
     *
     * @param orderId the order id
     */
    public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

    /**
     * Gets order status.
     *
     * @return the order status
     */
    public String getOrderStatus() {
		return this.orderStatus;
	}

    /**
     * Sets order status.
     *
     * @param orderStatus the order status
     */
    public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    /**
     * Gets order type.
     *
     * @return the order type
     */
    public String getOrderType() {
		return this.orderType;
	}

    /**
     * Sets order type.
     *
     * @param orderType the order type
     */
    public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
