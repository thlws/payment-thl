package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.user.customer.identify接口专用结果对象，维护接口查询结果中的活动信息
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:42:37
 */
public class AlipayUserCustIdentifyActivity extends AlipayObject {

	private static final long serialVersionUID = 5723883581164694989L;

	/**
	 * 活动扩展信息，预留字段。例如通过连接引导参加运营活动，包含活动链接（或者参与方式）及活动信息。
	 */
	@ApiField("activity_info")
	private String activityInfo;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

    /**
     * Gets activity info.
     *
     * @return the activity info
     */
    public String getActivityInfo() {
		return this.activityInfo;
	}

    /**
     * Sets activity info.
     *
     * @param activityInfo the activity info
     */
    public void setActivityInfo(String activityInfo) {
		this.activityInfo = activityInfo;
	}

    /**
     * Gets activity name.
     *
     * @return the activity name
     */
    public String getActivityName() {
		return this.activityName;
	}

    /**
     * Sets activity name.
     *
     * @param activityName the activity name
     */
    public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

}
