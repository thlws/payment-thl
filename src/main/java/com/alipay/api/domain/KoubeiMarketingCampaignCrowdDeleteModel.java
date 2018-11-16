package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商户人群组删除接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:50
 */
public class KoubeiMarketingCampaignCrowdDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5591521293696929599L;

	/**
	 * 人群组的唯一标识ID
	 */
	@ApiField("crowd_group_id")
	private String crowdGroupId;

    /**
     * Gets crowd group id.
     *
     * @return the crowd group id
     */
    public String getCrowdGroupId() {
		return this.crowdGroupId;
	}

    /**
     * Sets crowd group id.
     *
     * @param crowdGroupId the crowd group id
     */
    public void setCrowdGroupId(String crowdGroupId) {
		this.crowdGroupId = crowdGroupId;
	}

}
