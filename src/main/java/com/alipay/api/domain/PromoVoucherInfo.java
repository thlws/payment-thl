package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺券信息
 *
 * @author auto create
 * @since 1.0, 2017-06-20 15:01:09
 */
public class PromoVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6245223966535212721L;

	/**
	 * 折扣（折扣券类型才有）
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 是否是自动领取券
	 */
	@ApiField("is_auto_obtain")
	private String isAutoObtain;

	/**
	 * 是否是商圈发的券 true/false
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
	private Date itemGmtEnd;

	/**
	 * 商品有效期开始时间
	 */
	@ApiField("item_gmt_start")
	private Date itemGmtStart;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 券图片地址
	 */
	@ApiField("item_logo")
	private String itemLogo;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 买a送b 送单品名称
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
	 * 券使用门槛金额(元)
	 */
	@ApiField("use_condition_amount")
	private String useConditionAmount;

	/**
	 * 代金券 减至券 兑换券 换购券 金额
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券跳转地址(h5)
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	/**
	 * DISCOUNT_ALL, // 折扣券(全场)
DISCOUNT_SINGLE, // 折扣券(单品)
CASH_ALL, // 代金券(全场)
CASH_SINGLE, // 代金券(单品)

// 以下券全部是单品券
EXCHANGE, // 兑换券(直接兑换，加钱兑换)
EXCHANGE_BUY, // 换购券
REDUCE_TO, // 减至券
BUY_SEND_SAME, // 买就送券(买a送a)
BUY_SEND_OTHER; // 买就送券(买a送b)
	 */
	@ApiField("voucher_type")
	private String voucherType;

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
    public Date getItemGmtEnd() {
		return this.itemGmtEnd;
	}

    /**
     * Sets item gmt end.
     *
     * @param itemGmtEnd the item gmt end
     */
    public void setItemGmtEnd(Date itemGmtEnd) {
		this.itemGmtEnd = itemGmtEnd;
	}

    /**
     * Gets item gmt start.
     *
     * @return the item gmt start
     */
    public Date getItemGmtStart() {
		return this.itemGmtStart;
	}

    /**
     * Sets item gmt start.
     *
     * @param itemGmtStart the item gmt start
     */
    public void setItemGmtStart(Date itemGmtStart) {
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
     * Gets item logo.
     *
     * @return the item logo
     */
    public String getItemLogo() {
		return this.itemLogo;
	}

    /**
     * Sets item logo.
     *
     * @param itemLogo the item logo
     */
    public void setItemLogo(String itemLogo) {
		this.itemLogo = itemLogo;
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
