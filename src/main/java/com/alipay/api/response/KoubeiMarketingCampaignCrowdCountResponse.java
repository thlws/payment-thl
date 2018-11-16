package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.count response.
 *
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class KoubeiMarketingCampaignCrowdCountResponse extends AlipayResponse {

	private static final long serialVersionUID = 6223864283973639843L;

	/** 
	 * 各个细分维度的值，label为标签code，value为该标签各个标签值对应的统计信息，本示例表示pam_gender这个标签的男有100人，女有1000人满足入参指定的圈人条件
	 */
	@ApiField("dimension_values")
	private String dimensionValues;

	/** 
	 * 人群组的汇总统计值total是人数，sum是交易金额
	 */
	@ApiField("summary_values")
	private String summaryValues;

    /**
     * Sets dimension values.
     *
     * @param dimensionValues the dimension values
     */
    public void setDimensionValues(String dimensionValues) {
		this.dimensionValues = dimensionValues;
	}

    /**
     * Gets dimension values.
     *
     * @return the dimension values
     */
    public String getDimensionValues( ) {
		return this.dimensionValues;
	}

    /**
     * Sets summary values.
     *
     * @param summaryValues the summary values
     */
    public void setSummaryValues(String summaryValues) {
		this.summaryValues = summaryValues;
	}

    /**
     * Gets summary values.
     *
     * @return the summary values
     */
    public String getSummaryValues( ) {
		return this.summaryValues;
	}

}
