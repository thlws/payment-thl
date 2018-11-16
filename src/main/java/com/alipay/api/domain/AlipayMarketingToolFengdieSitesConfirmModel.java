package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云凤蝶站点发布审批
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:18:01
 */
public class AlipayMarketingToolFengdieSitesConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5361463528656242842L;

	/**
	 * 欲审批发布的站点 Id
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 下线时间（注意：会覆盖创建站点接口设置的下线时间）
	 */
	@ApiField("offline_time")
	private String offlineTime;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id（即创建空间成员接口的入参），应确保 operator 是参数 space_id 对应的空间成员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲审批的站点所归属的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

	/**
	 * 是否允许发布该站点，值为 "AGREED" 表示允许，此时会将站点发布出去；值为 "REFUSED" 表示不允许，此时会将站点变为审批不通过状态
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public Long getActivityId() {
		return this.activityId;
	}

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets offline time.
     *
     * @return the offline time
     */
    public String getOfflineTime() {
		return this.offlineTime;
	}

    /**
     * Sets offline time.
     *
     * @param offlineTime the offline time
     */
    public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

    /**
     * Gets operator.
     *
     * @return the operator
     */
    public String getOperator() {
		return this.operator;
	}

    /**
     * Sets operator.
     *
     * @param operator the operator
     */
    public void setOperator(String operator) {
		this.operator = operator;
	}

    /**
     * Gets space id.
     *
     * @return the space id
     */
    public String getSpaceId() {
		return this.spaceId;
	}

    /**
     * Sets space id.
     *
     * @param spaceId the space id
     */
    public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
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

}
