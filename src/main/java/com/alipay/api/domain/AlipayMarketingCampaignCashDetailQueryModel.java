package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 现金活动详情查询
 *
 * @author auto create
 * @since 1.0, 2018-07-19 14:27:35
 */
public class AlipayMarketingCampaignCashDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3446991139955765534L;

	/**
	 * 要查询的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

    /**
     * Gets crowd no.
     *
     * @return the crowd no
     */
    public String getCrowdNo() {
		return this.crowdNo;
	}

    /**
     * Sets crowd no.
     *
     * @param crowdNo the crowd no
     */
    public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

}
