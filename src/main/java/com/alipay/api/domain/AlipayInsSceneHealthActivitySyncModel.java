package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构同步健康检测产品信息
 *
 * @author auto create
 * @since 1.0, 2017-09-13 10:12:33
 */
public class AlipayInsSceneHealthActivitySyncModel extends AlipayObject {

	private static final long serialVersionUID = 7281572724845891196L;

	/**
	 * 活动编号参数，比如01
	 */
	@ApiField("activity_no")
	private String activityNo;

	/**
	 * 申请编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 业务数据，比如邮寄信息，结果信息等
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 订单编号唯一幂等校验
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 状态参数，比如0，初始状态，1完成状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets activity no.
     *
     * @return the activity no
     */
    public String getActivityNo() {
		return this.activityNo;
	}

    /**
     * Sets activity no.
     *
     * @param activityNo the activity no
     */
    public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}

    /**
     * Gets apply no.
     *
     * @return the apply no
     */
    public String getApplyNo() {
		return this.applyNo;
	}

    /**
     * Sets apply no.
     *
     * @param applyNo the apply no
     */
    public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

    /**
     * Gets biz data.
     *
     * @return the biz data
     */
    public String getBizData() {
		return this.bizData;
	}

    /**
     * Sets biz data.
     *
     * @param bizData the biz data
     */
    public void setBizData(String bizData) {
		this.bizData = bizData;
	}

    /**
     * Gets order no.
     *
     * @return the order no
     */
    public String getOrderNo() {
		return this.orderNo;
	}

    /**
     * Sets order no.
     *
     * @param orderNo the order no
     */
    public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
