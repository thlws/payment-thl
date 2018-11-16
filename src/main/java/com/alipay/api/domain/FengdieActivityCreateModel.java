package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶站点返回值
 *
 * @author auto create
 * @since 1.0, 2018-05-17 16:01:24
 */
public class FengdieActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2345444143252855333L;

	/**
	 * 云凤蝶站点的 id
	 */
	@ApiField("activity_id")
	private Long activityId;

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

}
