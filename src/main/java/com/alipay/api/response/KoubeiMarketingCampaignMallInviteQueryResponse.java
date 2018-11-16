package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.mall.invite.query response.
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:54:58
 */
public class KoubeiMarketingCampaignMallInviteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1256568384746288776L;

	/** 
	 * 平台活动招商信息列表
	 */
	@ApiListField("activity_plan_info_list")
	@ApiField("activity_plan_info")
	private List<ActivityPlanInfo> activityPlanInfoList;

    /**
     * Sets activity plan info list.
     *
     * @param activityPlanInfoList the activity plan info list
     */
    public void setActivityPlanInfoList(List<ActivityPlanInfo> activityPlanInfoList) {
		this.activityPlanInfoList = activityPlanInfoList;
	}

    /**
     * Gets activity plan info list.
     *
     * @return the activity plan info list
     */
    public List<ActivityPlanInfo> getActivityPlanInfoList( ) {
		return this.activityPlanInfoList;
	}

}
