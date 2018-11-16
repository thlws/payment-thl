package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isv删除店铺自定义展示内容的接口
 *
 * @author auto create
 * @since 1.0, 2018-01-17 14:48:17
 */
public class KoubeiMarketingCampaignOpenDeliveryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1169467791791869993L;

	/**
	 * 要删除店铺页投放内容的类型。目前支持的类型有：1. gift_card
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 商户的PID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 要删除内容投放的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

    /**
     * Gets delivery type.
     *
     * @return the delivery type
     */
    public String getDeliveryType() {
		return this.deliveryType;
	}

    /**
     * Sets delivery type.
     *
     * @param deliveryType the delivery type
     */
    public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
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

}
