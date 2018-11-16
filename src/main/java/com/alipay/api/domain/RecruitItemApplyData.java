package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名商品数据
 *
 * @author auto create
 * @since 1.0, 2016-11-18 11:48:44
 */
public class RecruitItemApplyData extends AlipayObject {

	private static final long serialVersionUID = 8733552766643555235L;

	/**
	 * 活动价格，单位为元，活动期间以此价格售卖。注：预热期间仍然以原价售卖，但是不消耗活动的库存。
	 */
	@ApiField("activity_price")
	private String activityPrice;

	/**
	 * 活动总库存，活动锁定的库存，是从商品总库存中隔离出来的库存。只有活动期间购买商品会消耗活动库存。
	 */
	@ApiField("activity_stock")
	private String activityStock;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品原价，单位为元
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 折扣，8.5表示八五折，9表示九折
	 */
	@ApiField("sales")
	private String sales;

    /**
     * Gets activity price.
     *
     * @return the activity price
     */
    public String getActivityPrice() {
		return this.activityPrice;
	}

    /**
     * Sets activity price.
     *
     * @param activityPrice the activity price
     */
    public void setActivityPrice(String activityPrice) {
		this.activityPrice = activityPrice;
	}

    /**
     * Gets activity stock.
     *
     * @return the activity stock
     */
    public String getActivityStock() {
		return this.activityStock;
	}

    /**
     * Sets activity stock.
     *
     * @param activityStock the activity stock
     */
    public void setActivityStock(String activityStock) {
		this.activityStock = activityStock;
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
     * Gets original price.
     *
     * @return the original price
     */
    public String getOriginalPrice() {
		return this.originalPrice;
	}

    /**
     * Sets original price.
     *
     * @param originalPrice the original price
     */
    public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

    /**
     * Gets sales.
     *
     * @return the sales
     */
    public String getSales() {
		return this.sales;
	}

    /**
     * Sets sales.
     *
     * @param sales the sales
     */
    public void setSales(String sales) {
		this.sales = sales;
	}

}
