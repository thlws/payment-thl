package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询广告接口
 *
 * @author auto create
 * @since 1.0, 2018-05-10 13:53:23
 */
public class KoubeiMarketingAdvertisingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8591898662385522889L;

	/**
	 * 广告Id，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

    /**
     * Gets ad id.
     *
     * @return the ad id
     */
    public String getAdId() {
		return this.adId;
	}

    /**
     * Sets ad id.
     *
     * @param adId the ad id
     */
    public void setAdId(String adId) {
		this.adId = adId;
	}

}
