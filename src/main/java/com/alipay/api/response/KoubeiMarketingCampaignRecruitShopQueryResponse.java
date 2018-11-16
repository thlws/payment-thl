package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecruitShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.recruit.shop.query response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingCampaignRecruitShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1733598746291579445L;

	/** 
	 * 招商活动id
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 总量
	 */
	@ApiField("shop_count")
	private String shopCount;

	/** 
	 * 招商门店确认详情
	 */
	@ApiListField("shop_info")
	@ApiField("recruit_shop_info")
	private List<RecruitShopInfo> shopInfo;

    /**
     * Sets plan id.
     *
     * @param planId the plan id
     */
    public void setPlanId(String planId) {
		this.planId = planId;
	}

    /**
     * Gets plan id.
     *
     * @return the plan id
     */
    public String getPlanId( ) {
		return this.planId;
	}

    /**
     * Sets shop count.
     *
     * @param shopCount the shop count
     */
    public void setShopCount(String shopCount) {
		this.shopCount = shopCount;
	}

    /**
     * Gets shop count.
     *
     * @return the shop count
     */
    public String getShopCount( ) {
		return this.shopCount;
	}

    /**
     * Sets shop info.
     *
     * @param shopInfo the shop info
     */
    public void setShopInfo(List<RecruitShopInfo> shopInfo) {
		this.shopInfo = shopInfo;
	}

    /**
     * Gets shop info.
     *
     * @return the shop info
     */
    public List<RecruitShopInfo> getShopInfo( ) {
		return this.shopInfo;
	}

}
