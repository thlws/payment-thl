package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbAdvertAdvResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.mission.promote response.
 *
 * @author auto create
 * @since 1.0, 2017-02-15 10:06:09
 */
public class KoubeiAdvertCommissionMissionPromoteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5383626936916956233L;

	/** 
	 * 广告详情
	 */
	@ApiField("advert")
	private KbAdvertAdvResponse advert;

	/** 
	 * true:可以二级分佣配置
false:不可以
	 */
	@ApiField("can_cascade_mission")
	private String canCascadeMission;

    /**
     * Sets advert.
     *
     * @param advert the advert
     */
    public void setAdvert(KbAdvertAdvResponse advert) {
		this.advert = advert;
	}

    /**
     * Gets advert.
     *
     * @return the advert
     */
    public KbAdvertAdvResponse getAdvert( ) {
		return this.advert;
	}

    /**
     * Sets can cascade mission.
     *
     * @param canCascadeMission the can cascade mission
     */
    public void setCanCascadeMission(String canCascadeMission) {
		this.canCascadeMission = canCascadeMission;
	}

    /**
     * Gets can cascade mission.
     *
     * @return the can cascade mission
     */
    public String getCanCascadeMission( ) {
		return this.canCascadeMission;
	}

}
