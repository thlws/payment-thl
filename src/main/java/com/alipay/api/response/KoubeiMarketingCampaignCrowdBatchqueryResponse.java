package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.batchquery response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingCampaignCrowdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7392373182276421261L;

	/** 
	 * 人群组的基本信息，id表示人群分组的ID，name表示人群分组的名称，status表示人群分组的状态，目前只有status=ENABLE有效状态才返回，已经删除的为DISABLE的不返回
	 */
	@ApiField("crowd_group_sets")
	private String crowdGroupSets;

	/** 
	 * 返回接记录的总条数
	 */
	@ApiField("total_number")
	private String totalNumber;

    /**
     * Sets crowd group sets.
     *
     * @param crowdGroupSets the crowd group sets
     */
    public void setCrowdGroupSets(String crowdGroupSets) {
		this.crowdGroupSets = crowdGroupSets;
	}

    /**
     * Gets crowd group sets.
     *
     * @return the crowd group sets
     */
    public String getCrowdGroupSets( ) {
		return this.crowdGroupSets;
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
