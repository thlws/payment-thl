package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户查询商品代金券详情
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:36:30
 */
public class KoubeiMarketingCampaignItemMerchantactivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4277832285881174626L;

	/**
	 * 运营活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部id
	 */
	@ApiField("external_unique_id")
	private String externalUniqueId;

    /**
     * Gets activity id.
     *
     * @return the activity id
     */
    public String getActivityId() {
		return this.activityId;
	}

    /**
     * Sets activity id.
     *
     * @param activityId the activity id
     */
    public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

    /**
     * Gets external unique id.
     *
     * @return the external unique id
     */
    public String getExternalUniqueId() {
		return this.externalUniqueId;
	}

    /**
     * Sets external unique id.
     *
     * @param externalUniqueId the external unique id
     */
    public void setExternalUniqueId(String externalUniqueId) {
		this.externalUniqueId = externalUniqueId;
	}

}
