package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测苹果活动奖品可用状态
 *
 * @author auto create
 * @since 1.0, 2018-08-17 17:34:30
 */
public class AlipayOverseasTravelAppleCampprizeDetectModel extends AlipayObject {

	private static final long serialVersionUID = 6788931644454991527L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId() {
		return this.campId;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
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
