package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.activity.offline.create response.
 *
 * @author auto create
 * @since 1.0, 2017-04-07 18:22:19
 */
public class AlipayMarketingCampaignActivityOfflineCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4868715989757624444L;

	/** 
	 * 创建成功的活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 创建成功的券模版id
	 */
	@ApiField("prize_id")
	private String prizeId;

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId( ) {
		return this.campId;
	}

    /**
     * Sets prize id.
     *
     * @param prizeId the prize id
     */
    public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

    /**
     * Gets prize id.
     *
     * @return the prize id
     */
    public String getPrizeId( ) {
		return this.prizeId;
	}

}
