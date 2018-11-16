package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.discount.whitelist.query response.
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:48:04
 */
public class AlipayMarketingCampaignDiscountWhitelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5831561155759797524L;

	/** 
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 活动id.白名单,","隔开，最多100个
	 */
	@ApiField("user_white_list")
	private String userWhiteList;

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
     * Sets user white list.
     *
     * @param userWhiteList the user white list
     */
    public void setUserWhiteList(String userWhiteList) {
		this.userWhiteList = userWhiteList;
	}

    /**
     * Gets user white list.
     *
     * @return the user white list
     */
    public String getUserWhiteList( ) {
		return this.userWhiteList;
	}

}
