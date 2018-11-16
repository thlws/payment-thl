package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.activity.query response.
 *
 * @author auto create
 * @since 1.0, 2016-06-15 15:07:41
 */
public class KoubeiQualityTestCloudacptActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1112754148736339969L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activity_list")
	@ApiField("open_activity")
	private List<OpenActivity> activityList;

    /**
     * Sets activity list.
     *
     * @param activityList the activity list
     */
    public void setActivityList(List<OpenActivity> activityList) {
		this.activityList = activityList;
	}

    /**
     * Gets activity list.
     *
     * @return the activity list
     */
    public List<OpenActivity> getActivityList( ) {
		return this.activityList;
	}

}
