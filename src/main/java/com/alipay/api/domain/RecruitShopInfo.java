package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商活动信息
 *
 * @author auto create
 * @since 1.0, 2017-09-30 11:21:25
 */
public class RecruitShopInfo extends AlipayObject {

	private static final long serialVersionUID = 2615322982122975352L;

	/**
	 * 已确认还是未确认
	 */
	@ApiField("confirm_status")
	private String confirmStatus;

	/**
	 * 一级和二级类目名称
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

    /**
     * Gets confirm status.
     *
     * @return the confirm status
     */
    public String getConfirmStatus() {
		return this.confirmStatus;
	}

    /**
     * Sets confirm status.
     *
     * @param confirmStatus the confirm status
     */
    public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}

    /**
     * Gets shop category.
     *
     * @return the shop category
     */
    public String getShopCategory() {
		return this.shopCategory;
	}

    /**
     * Sets shop category.
     *
     * @param shopCategory the shop category
     */
    public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

    /**
     * Gets shop id.
     *
     * @return the shop id
     */
    public String getShopId() {
		return this.shopId;
	}

    /**
     * Sets shop id.
     *
     * @param shopId the shop id
     */
    public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Gets shop name.
     *
     * @return the shop name
     */
    public String getShopName() {
		return this.shopName;
	}

    /**
     * Sets shop name.
     *
     * @param shopName the shop name
     */
    public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
