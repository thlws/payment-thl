package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * antlbs输出的口碑优惠券
 *
 * @author auto create
 * @since 1.0, 2017-11-03 16:59:45
 */
public class AntlbsKBDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 7793174867679431431L;

	/**
	 * 全场代金的门槛金额
	 */
	@ApiField("apply_condition")
	private String applyCondition;

	/**
	 * 买M送N的描述
	 */
	@ApiField("buy_send_desc")
	private String buySendDesc;

	/**
	 * 折扣率
仅当券类型为折扣券时有效
有效折扣率取值范围0.11-0.99
仅允许保留小数点后两位
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 最近店铺离当前用户的距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 优惠结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 券的图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 优惠id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 券的名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品的一些标签
	 */
	@ApiField("label")
	private String label;

	/**
	 * 减至券的原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("per_price")
	private String perPrice;

	/**
	 * 当券类型是代金券的时候，这个字段代表实际金额；当券类型是减至券的时候，这个字段代表减至到的金额
	 */
	@ApiField("price")
	private String price;

	/**
	 * 券推荐语
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 买A送B中，B的描述
	 */
	@ApiField("send_item_name")
	private String sendItemName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 券的店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 已领数
	 */
	@ApiField("sold")
	private String sold;

	/**
	 * 优惠开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("threshold_price")
	private String thresholdPrice;

	/**
	 * 每满减用的字段：每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("top_price")
	private String topPrice;

	/**
	 * 目前有discount:折扣券;cash:代金券;exchange:兑换券;limit_reduce_cash:减至券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券二级类型。all_discount:全场折扣;single_discount:单品折扣;all_cash:全场代金;single_cash：单品代金
	 */
	@ApiField("vol_type")
	private String volType;

    /**
     * Gets apply condition.
     *
     * @return the apply condition
     */
    public String getApplyCondition() {
		return this.applyCondition;
	}

    /**
     * Sets apply condition.
     *
     * @param applyCondition the apply condition
     */
    public void setApplyCondition(String applyCondition) {
		this.applyCondition = applyCondition;
	}

    /**
     * Gets buy send desc.
     *
     * @return the buy send desc
     */
    public String getBuySendDesc() {
		return this.buySendDesc;
	}

    /**
     * Sets buy send desc.
     *
     * @param buySendDesc the buy send desc
     */
    public void setBuySendDesc(String buySendDesc) {
		this.buySendDesc = buySendDesc;
	}

    /**
     * Gets discount.
     *
     * @return the discount
     */
    public String getDiscount() {
		return this.discount;
	}

    /**
     * Sets discount.
     *
     * @param discount the discount
     */
    public void setDiscount(String discount) {
		this.discount = discount;
	}

    /**
     * Gets distance.
     *
     * @return the distance
     */
    public String getDistance() {
		return this.distance;
	}

    /**
     * Sets distance.
     *
     * @param distance the distance
     */
    public void setDistance(String distance) {
		this.distance = distance;
	}

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
		return this.endTime;
	}

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

    /**
     * Gets image url.
     *
     * @return the image url
     */
    public String getImageUrl() {
		return this.imageUrl;
	}

    /**
     * Sets image url.
     *
     * @param imageUrl the image url
     */
    public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName() {
		return this.itemName;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
		return this.label;
	}

    /**
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(String label) {
		this.label = label;
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
     * Gets per price.
     *
     * @return the per price
     */
    public String getPerPrice() {
		return this.perPrice;
	}

    /**
     * Sets per price.
     *
     * @param perPrice the per price
     */
    public void setPerPrice(String perPrice) {
		this.perPrice = perPrice;
	}

    /**
     * Gets price.
     *
     * @return the price
     */
    public String getPrice() {
		return this.price;
	}

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(String price) {
		this.price = price;
	}

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public String getReason() {
		return this.reason;
	}

    /**
     * Sets reason.
     *
     * @param reason the reason
     */
    public void setReason(String reason) {
		this.reason = reason;
	}

    /**
     * Gets send item name.
     *
     * @return the send item name
     */
    public String getSendItemName() {
		return this.sendItemName;
	}

    /**
     * Sets send item name.
     *
     * @param sendItemName the send item name
     */
    public void setSendItemName(String sendItemName) {
		this.sendItemName = sendItemName;
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

    /**
     * Gets sold.
     *
     * @return the sold
     */
    public String getSold() {
		return this.sold;
	}

    /**
     * Sets sold.
     *
     * @param sold the sold
     */
    public void setSold(String sold) {
		this.sold = sold;
	}

    /**
     * Gets start time.
     *
     * @return the start time
     */
    public Date getStartTime() {
		return this.startTime;
	}

    /**
     * Sets start time.
     *
     * @param startTime the start time
     */
    public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

    /**
     * Gets threshold price.
     *
     * @return the threshold price
     */
    public String getThresholdPrice() {
		return this.thresholdPrice;
	}

    /**
     * Sets threshold price.
     *
     * @param thresholdPrice the threshold price
     */
    public void setThresholdPrice(String thresholdPrice) {
		this.thresholdPrice = thresholdPrice;
	}

    /**
     * Gets top price.
     *
     * @return the top price
     */
    public String getTopPrice() {
		return this.topPrice;
	}

    /**
     * Sets top price.
     *
     * @param topPrice the top price
     */
    public void setTopPrice(String topPrice) {
		this.topPrice = topPrice;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets vol type.
     *
     * @return the vol type
     */
    public String getVolType() {
		return this.volType;
	}

    /**
     * Sets vol type.
     *
     * @param volType the vol type
     */
    public void setVolType(String volType) {
		this.volType = volType;
	}

}
