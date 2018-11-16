package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商城券的推荐
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:53:06
 */
public class VoucherRec extends AlipayObject {

	private static final long serialVersionUID = 5741727489673633581L;

	/**
	 * 总收藏量
	 */
	@ApiField("all_keep_count")
	private String allKeepCount;

	/**
	 * 判断券的类型
	 */
	@ApiField("code")
	private String code;

	/**
	 * 头图
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 人群
	 */
	@ApiField("crowds")
	private String crowds;

	/**
	 * 折扣券的折扣力度
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否有面向人群
	 */
	@ApiField("has_crowd")
	private String hasCrowd;

	/**
	 * 是否自动领取券
	 */
	@ApiField("is_auto_obtain")
	private String isAutoObtain;

	/**
	 * 是否是商圈发的券
	 */
	@ApiField("is_mall_voucher")
	private String isMallVoucher;

	/**
	 * 券品牌名称
	 */
	@ApiField("item_brand_name")
	private String itemBrandName;

	/**
	 * 券有效期结束时间
	 */
	@ApiField("item_gmt_end")
	private String itemGmtEnd;

	/**
	 * 券有效期开始时间
	 */
	@ApiField("item_gmt_start")
	private String itemGmtStart;

	/**
	 * 券id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 券名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 总量
	 */
	@ApiField("item_quantity")
	private String itemQuantity;

	/**
	 * 销售模式
	 */
	@ApiField("item_sales_mode")
	private String itemSalesMode;

	/**
	 * 销量
	 */
	@ApiField("item_sold_quantity")
	private String itemSoldQuantity;

	/**
	 * 原价
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * 每满threshold_amount元减perValueAmount元，封顶valueAmount元
	 */
	@ApiField("per_value_amount")
	private String perValueAmount;

	/**
	 * 泛行业商品详情图片
	 */
	@ApiField("picture_details")
	private String pictureDetails;

	/**
	 * 价格浮动模式
	 */
	@ApiField("price_mode")
	private String priceMode;

	/**
	 * 券领取类型
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 送单品名称
	 */
	@ApiField("send_item_name")
	private String sendItemName;

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
	 * 满N元可优惠
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 使用门槛
	 */
	@ApiField("use_condition_amount")
	private String useConditionAmount;

	/**
	 * 券使用的有效时间
	 */
	@ApiField("valid_times")
	private String validTimes;

	/**
	 * 金额
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券的跳转地址
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	/**
	 * 券地址
	 */
	@ApiField("voucher_logo_url")
	private String voucherLogoUrl;

	/**
	 * DISCOUNT_ALL 折扣券(全场) 
DISCOUNT_SINGLE 折扣券(单品) 
CASH_ALL 代金券(全场) 
CASH_SINGLE 金券(单品) 
 
以下券全部是单品券： 
EXCHANGE 兑换券(直接兑换, 加钱兑换) EXCHANGE_BUY 换购券 
REDUCE_TO 减至券 
BUY_SEND_SAME 买就送券(买a送a) 
BUY_SEND_OTHER 买就送券(买a送b)
	 */
	@ApiField("voucher_type")
	private String voucherType;

    /**
     * Gets all keep count.
     *
     * @return the all keep count
     */
    public String getAllKeepCount() {
		return this.allKeepCount;
	}

    /**
     * Sets all keep count.
     *
     * @param allKeepCount the all keep count
     */
    public void setAllKeepCount(String allKeepCount) {
		this.allKeepCount = allKeepCount;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

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
     * Gets crowds.
     *
     * @return the crowds
     */
    public String getCrowds() {
		return this.crowds;
	}

    /**
     * Sets crowds.
     *
     * @param crowds the crowds
     */
    public void setCrowds(String crowds) {
		this.crowds = crowds;
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
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets has crowd.
     *
     * @return the has crowd
     */
    public String getHasCrowd() {
		return this.hasCrowd;
	}

    /**
     * Sets has crowd.
     *
     * @param hasCrowd the has crowd
     */
    public void setHasCrowd(String hasCrowd) {
		this.hasCrowd = hasCrowd;
	}

    /**
     * Gets is auto obtain.
     *
     * @return the is auto obtain
     */
    public String getIsAutoObtain() {
		return this.isAutoObtain;
	}

    /**
     * Sets is auto obtain.
     *
     * @param isAutoObtain the is auto obtain
     */
    public void setIsAutoObtain(String isAutoObtain) {
		this.isAutoObtain = isAutoObtain;
	}

    /**
     * Gets is mall voucher.
     *
     * @return the is mall voucher
     */
    public String getIsMallVoucher() {
		return this.isMallVoucher;
	}

    /**
     * Sets is mall voucher.
     *
     * @param isMallVoucher the is mall voucher
     */
    public void setIsMallVoucher(String isMallVoucher) {
		this.isMallVoucher = isMallVoucher;
	}

    /**
     * Gets item brand name.
     *
     * @return the item brand name
     */
    public String getItemBrandName() {
		return this.itemBrandName;
	}

    /**
     * Sets item brand name.
     *
     * @param itemBrandName the item brand name
     */
    public void setItemBrandName(String itemBrandName) {
		this.itemBrandName = itemBrandName;
	}

    /**
     * Gets item gmt end.
     *
     * @return the item gmt end
     */
    public String getItemGmtEnd() {
		return this.itemGmtEnd;
	}

    /**
     * Sets item gmt end.
     *
     * @param itemGmtEnd the item gmt end
     */
    public void setItemGmtEnd(String itemGmtEnd) {
		this.itemGmtEnd = itemGmtEnd;
	}

    /**
     * Gets item gmt start.
     *
     * @return the item gmt start
     */
    public String getItemGmtStart() {
		return this.itemGmtStart;
	}

    /**
     * Sets item gmt start.
     *
     * @param itemGmtStart the item gmt start
     */
    public void setItemGmtStart(String itemGmtStart) {
		this.itemGmtStart = itemGmtStart;
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
     * Gets item quantity.
     *
     * @return the item quantity
     */
    public String getItemQuantity() {
		return this.itemQuantity;
	}

    /**
     * Sets item quantity.
     *
     * @param itemQuantity the item quantity
     */
    public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

    /**
     * Gets item sales mode.
     *
     * @return the item sales mode
     */
    public String getItemSalesMode() {
		return this.itemSalesMode;
	}

    /**
     * Sets item sales mode.
     *
     * @param itemSalesMode the item sales mode
     */
    public void setItemSalesMode(String itemSalesMode) {
		this.itemSalesMode = itemSalesMode;
	}

    /**
     * Gets item sold quantity.
     *
     * @return the item sold quantity
     */
    public String getItemSoldQuantity() {
		return this.itemSoldQuantity;
	}

    /**
     * Sets item sold quantity.
     *
     * @param itemSoldQuantity the item sold quantity
     */
    public void setItemSoldQuantity(String itemSoldQuantity) {
		this.itemSoldQuantity = itemSoldQuantity;
	}

    /**
     * Gets original amount.
     *
     * @return the original amount
     */
    public String getOriginalAmount() {
		return this.originalAmount;
	}

    /**
     * Sets original amount.
     *
     * @param originalAmount the original amount
     */
    public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

    /**
     * Gets per value amount.
     *
     * @return the per value amount
     */
    public String getPerValueAmount() {
		return this.perValueAmount;
	}

    /**
     * Sets per value amount.
     *
     * @param perValueAmount the per value amount
     */
    public void setPerValueAmount(String perValueAmount) {
		this.perValueAmount = perValueAmount;
	}

    /**
     * Gets picture details.
     *
     * @return the picture details
     */
    public String getPictureDetails() {
		return this.pictureDetails;
	}

    /**
     * Sets picture details.
     *
     * @param pictureDetails the picture details
     */
    public void setPictureDetails(String pictureDetails) {
		this.pictureDetails = pictureDetails;
	}

    /**
     * Gets price mode.
     *
     * @return the price mode
     */
    public String getPriceMode() {
		return this.priceMode;
	}

    /**
     * Sets price mode.
     *
     * @param priceMode the price mode
     */
    public void setPriceMode(String priceMode) {
		this.priceMode = priceMode;
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
     * Gets threshold amount.
     *
     * @return the threshold amount
     */
    public String getThresholdAmount() {
		return this.thresholdAmount;
	}

    /**
     * Sets threshold amount.
     *
     * @param thresholdAmount the threshold amount
     */
    public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

    /**
     * Gets use condition amount.
     *
     * @return the use condition amount
     */
    public String getUseConditionAmount() {
		return this.useConditionAmount;
	}

    /**
     * Sets use condition amount.
     *
     * @param useConditionAmount the use condition amount
     */
    public void setUseConditionAmount(String useConditionAmount) {
		this.useConditionAmount = useConditionAmount;
	}

    /**
     * Gets valid times.
     *
     * @return the valid times
     */
    public String getValidTimes() {
		return this.validTimes;
	}

    /**
     * Sets valid times.
     *
     * @param validTimes the valid times
     */
    public void setValidTimes(String validTimes) {
		this.validTimes = validTimes;
	}

    /**
     * Gets value amount.
     *
     * @return the value amount
     */
    public String getValueAmount() {
		return this.valueAmount;
	}

    /**
     * Sets value amount.
     *
     * @param valueAmount the value amount
     */
    public void setValueAmount(String valueAmount) {
		this.valueAmount = valueAmount;
	}

    /**
     * Gets voucher detail url.
     *
     * @return the voucher detail url
     */
    public String getVoucherDetailUrl() {
		return this.voucherDetailUrl;
	}

    /**
     * Sets voucher detail url.
     *
     * @param voucherDetailUrl the voucher detail url
     */
    public void setVoucherDetailUrl(String voucherDetailUrl) {
		this.voucherDetailUrl = voucherDetailUrl;
	}

    /**
     * Gets voucher logo url.
     *
     * @return the voucher logo url
     */
    public String getVoucherLogoUrl() {
		return this.voucherLogoUrl;
	}

    /**
     * Sets voucher logo url.
     *
     * @param voucherLogoUrl the voucher logo url
     */
    public void setVoucherLogoUrl(String voucherLogoUrl) {
		this.voucherLogoUrl = voucherLogoUrl;
	}

    /**
     * Gets voucher type.
     *
     * @return the voucher type
     */
    public String getVoucherType() {
		return this.voucherType;
	}

    /**
     * Sets voucher type.
     *
     * @param voucherType the voucher type
     */
    public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
