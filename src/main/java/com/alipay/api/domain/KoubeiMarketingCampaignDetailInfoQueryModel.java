package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询活动的详情信息
 *
 * @author auto create
 * @since 1.0, 2018-01-10 14:14:30
 */
public class KoubeiMarketingCampaignDetailInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6526272238183993614L;

	/**
	 * 营销活动id，配合《店铺优惠查询alipay.offline.market.shop.discount.query 》接口使用，该接口返回camp_list列表中的biz_id则对应该id。
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 适用门店限制返回数量
	 */
	@ApiField("shop_limit_count")
	private Long shopLimitCount;

    /**
     * Gets camp id.
     *
     * @return the camp id
     */
    public String getCampId() {
		return this.campId;
	}

    /**
     * Sets camp id.
     *
     * @param campId the camp id
     */
    public void setCampId(String campId) {
		this.campId = campId;
	}

    /**
     * Gets shop limit count.
     *
     * @return the shop limit count
     */
    public Long getShopLimitCount() {
		return this.shopLimitCount;
	}

    /**
     * Sets shop limit count.
     *
     * @param shopLimitCount the shop limit count
     */
    public void setShopLimitCount(Long shopLimitCount) {
		this.shopLimitCount = shopLimitCount;
	}

}
