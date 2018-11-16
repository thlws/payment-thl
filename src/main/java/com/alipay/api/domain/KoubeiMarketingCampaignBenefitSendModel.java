package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑权益发放接口
 *
 * @author auto create
 * @since 1.0, 2018-06-12 20:04:26
 */
public class KoubeiMarketingCampaignBenefitSendModel extends AlipayObject {

	private static final long serialVersionUID = 2817547632672865194L;

	/**
	 * 领券渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 优惠类型，CAMPAIGN：活动，ITEM：商品
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 触发权益的优惠id，当discount_type是ITEM的时候这个内容是商品id，当discount_type是CAMPAIGN的时候这个内容是活动id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部流水号，用于控制幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 领券的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

    /**
     * Gets channel.
     *
     * @return the channel
     */
    public String getChannel() {
		return this.channel;
	}

    /**
     * Sets channel.
     *
     * @param channel the channel
     */
    public void setChannel(String channel) {
		this.channel = channel;
	}

    /**
     * Gets discount type.
     *
     * @return the discount type
     */
    public String getDiscountType() {
		return this.discountType;
	}

    /**
     * Sets discount type.
     *
     * @param discountType the discount type
     */
    public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
     * Gets user id.
     *
     * @return the user id
     */
    public String getUserId() {
		return this.userId;
	}

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public void setUserId(String userId) {
		this.userId = userId;
	}

}
