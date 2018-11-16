package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提供给ISV、开发者操作广告的接口
 *
 * @author auto create
 * @since 1.0, 2017-08-18 15:35:55
 */
public class AlipayMarketingCdpAdvertiseOperateModel extends AlipayObject {

	private static final long serialVersionUID = 1464386499342526341L;

	/**
	 * 广告ID，唯一标识一条广告
	 */
	@ApiField("ad_id")
	private String adId;

	/**
	 * 操作类型，目前包括上线和下线，分别传入：online(ONLINE)和offline(OFFLINE)
	 */
	@ApiField("operate_type")
	private String operateType;

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

    /**
     * Gets operate type.
     *
     * @return the operate type
     */
    public String getOperateType() {
		return this.operateType;
	}

    /**
     * Sets operate type.
     *
     * @param operateType the operate type
     */
    public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
