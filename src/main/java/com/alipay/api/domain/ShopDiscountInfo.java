package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺优惠信息查询
 *
 * @author auto create
 * @since 1.0, 2016-10-31 11:21:25
 */
public class ShopDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 5461468151879876327L;

	/**
	 * 图片url
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 优惠信息描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 是否全场。
全场：Y，单品：N
	 */
	@ApiField("is_all")
	private String isAll;

	/**
	 * 支付宝商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 子类型
	 */
	@ApiField("promo_sub_type")
	private String promoSubType;

	/**
	 * 优惠类型。
优惠：discount
商品：item
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/**
	 * 领用模式。自动领用：AUTO_OBTAIN。手动领用：OBTAIN
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 已用数量
	 */
	@ApiField("sales_quantity")
	private String salesQuantity;

	/**
	 * 优惠信息标题
	 */
	@ApiField("subject")
	private String subject;

    /**
     * Gets cover.
     *
     * @return the cover
     */
    public String getCover() {
		return this.cover;
	}

    /**
     * Sets cover.
     *
     * @param cover the cover
     */
    public void setCover(String cover) {
		this.cover = cover;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets is all.
     *
     * @return the is all
     */
    public String getIsAll() {
		return this.isAll;
	}

    /**
     * Sets is all.
     *
     * @param isAll the is all
     */
    public void setIsAll(String isAll) {
		this.isAll = isAll;
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
     * Gets promo sub type.
     *
     * @return the promo sub type
     */
    public String getPromoSubType() {
		return this.promoSubType;
	}

    /**
     * Sets promo sub type.
     *
     * @param promoSubType the promo sub type
     */
    public void setPromoSubType(String promoSubType) {
		this.promoSubType = promoSubType;
	}

    /**
     * Gets promotion type.
     *
     * @return the promotion type
     */
    public String getPromotionType() {
		return this.promotionType;
	}

    /**
     * Sets promotion type.
     *
     * @param promotionType the promotion type
     */
    public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

    /**
     * Gets purchase mode.
     *
     * @return the purchase mode
     */
    public String getPurchaseMode() {
		return this.purchaseMode;
	}

    /**
     * Sets purchase mode.
     *
     * @param purchaseMode the purchase mode
     */
    public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

    /**
     * Gets sales quantity.
     *
     * @return the sales quantity
     */
    public String getSalesQuantity() {
		return this.salesQuantity;
	}

    /**
     * Sets sales quantity.
     *
     * @param salesQuantity the sales quantity
     */
    public void setSalesQuantity(String salesQuantity) {
		this.salesQuantity = salesQuantity;
	}

    /**
     * Gets subject.
     *
     * @return the subject
     */
    public String getSubject() {
		return this.subject;
	}

    /**
     * Sets subject.
     *
     * @param subject the subject
     */
    public void setSubject(String subject) {
		this.subject = subject;
	}

}
