package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除云凤蝶站点
 *
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:44
 */
public class AlipayMarketingToolFengdieSitesDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5628323559943779658L;

	/**
	 * 待删除的站点 ID
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id（即创建空间成员接口的入参），应确保 operator 是参数 space_id 对应的空间成员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲删除的站点所归属的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

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

}
