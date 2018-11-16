package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据活动id查询活动信息
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:55:25
 */
public class AlipayInsMarketingCampaignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8514635234725737765L;

	/**
	 * 保险营销活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 请求流水Id
	 */
	@ApiField("request_id")
	private String requestId;

    /**
     * Gets campaign id.
     *
     * @return the campaign id
     */
    public String getCampaignId() {
		return this.campaignId;
	}

    /**
     * Sets campaign id.
     *
     * @param campaignId the campaign id
     */
    public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

    /**
     * Gets request id.
     *
     * @return the request id
     */
    public String getRequestId() {
		return this.requestId;
	}

    /**
     * Sets request id.
     *
     * @param requestId the request id
     */
    public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
