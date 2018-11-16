package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CampBaseDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingCampaignActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4788773891421621498L;

	/** 
	 * 活动列表
	 */
	@ApiListField("camp_sets")
	@ApiField("camp_base_dto")
	private List<CampBaseDto> campSets;

	/** 
	 * 总数量
	 */
	@ApiField("total_number")
	private String totalNumber;

    /**
     * Sets camp sets.
     *
     * @param campSets the camp sets
     */
    public void setCampSets(List<CampBaseDto> campSets) {
		this.campSets = campSets;
	}

    /**
     * Gets camp sets.
     *
     * @return the camp sets
     */
    public List<CampBaseDto> getCampSets( ) {
		return this.campSets;
	}

    /**
     * Sets total number.
     *
     * @param totalNumber the total number
     */
    public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}

    /**
     * Gets total number.
     *
     * @return the total number
     */
    public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
