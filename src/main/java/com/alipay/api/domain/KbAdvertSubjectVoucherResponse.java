package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统标的（券）
 *
 * @author auto create
 * @since 1.0, 2017-07-11 13:44:23
 */
public class KbAdvertSubjectVoucherResponse extends AlipayObject {

	private static final long serialVersionUID = 4234375967143636815L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 适用城市ID列表
	 */
	@ApiListField("city_ids")
	@ApiField("string")
	private List<String> cityIds;

	/**
	 * 背景图片
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 日库存
	 */
	@ApiField("daily_inventory")
	private String dailyInventory;

	/**
	 * 结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 上架时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * logo图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 使用须知
	 */
	@ApiListField("manuals")
	@ApiField("kbadvert_voucher_manual")
	private List<KbadvertVoucherManual> manuals;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * BUY：购买模式
OBTAIN：认领
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 门店ID列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 起步金额
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 总库存
	 */
	@ApiField("total_inventory")
	private String totalInventory;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 以元为单位
	 */
	@ApiField("voucher_org_value")
	private String voucherOrgValue;

	/**
	 * 券类型
LIMIT-单品券
NO_LIMIT_DISCOUNT-全场折扣券
NO_LIMIT_CASH-全场代金券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券价值
	 */
	@ApiField("voucher_value")
	private String voucherValue;

    /**
     * Gets brand name.
     *
     * @return the brand name
     */
    public String getBrandName() {
		return this.brandName;
	}

    /**
     * Sets brand name.
     *
     * @param brandName the brand name
     */
    public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    /**
     * Gets city ids.
     *
     * @return the city ids
     */
    public List<String> getCityIds() {
		return this.cityIds;
	}

    /**
     * Sets city ids.
     *
     * @param cityIds the city ids
     */
    public void setCityIds(List<String> cityIds) {
		this.cityIds = cityIds;
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
     * Gets daily inventory.
     *
     * @return the daily inventory
     */
    public String getDailyInventory() {
		return this.dailyInventory;
	}

    /**
     * Sets daily inventory.
     *
     * @param dailyInventory the daily inventory
     */
    public void setDailyInventory(String dailyInventory) {
		this.dailyInventory = dailyInventory;
	}

    /**
     * Gets gmt end.
     *
     * @return the gmt end
     */
    public String getGmtEnd() {
		return this.gmtEnd;
	}

    /**
     * Sets gmt end.
     *
     * @param gmtEnd the gmt end
     */
    public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

    /**
     * Gets gmt start.
     *
     * @return the gmt start
     */
    public String getGmtStart() {
		return this.gmtStart;
	}

    /**
     * Sets gmt start.
     *
     * @param gmtStart the gmt start
     */
    public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
		return this.logo;
	}

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
		this.logo = logo;
	}

    /**
     * Gets manuals.
     *
     * @return the manuals
     */
    public List<KbadvertVoucherManual> getManuals() {
		return this.manuals;
	}

    /**
     * Sets manuals.
     *
     * @param manuals the manuals
     */
    public void setManuals(List<KbadvertVoucherManual> manuals) {
		this.manuals = manuals;
	}

    /**
     * Gets merchant name.
     *
     * @return the merchant name
     */
    public String getMerchantName() {
		return this.merchantName;
	}

    /**
     * Sets merchant name.
     *
     * @param merchantName the merchant name
     */
    public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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
     * Gets shop ids.
     *
     * @return the shop ids
     */
    public List<String> getShopIds() {
		return this.shopIds;
	}

    /**
     * Sets shop ids.
     *
     * @param shopIds the shop ids
     */
    public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
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
     * Gets total inventory.
     *
     * @return the total inventory
     */
    public String getTotalInventory() {
		return this.totalInventory;
	}

    /**
     * Sets total inventory.
     *
     * @param totalInventory the total inventory
     */
    public void setTotalInventory(String totalInventory) {
		this.totalInventory = totalInventory;
	}

    /**
     * Gets voucher id.
     *
     * @return the voucher id
     */
    public String getVoucherId() {
		return this.voucherId;
	}

    /**
     * Sets voucher id.
     *
     * @param voucherId the voucher id
     */
    public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

    /**
     * Gets voucher name.
     *
     * @return the voucher name
     */
    public String getVoucherName() {
		return this.voucherName;
	}

    /**
     * Sets voucher name.
     *
     * @param voucherName the voucher name
     */
    public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

    /**
     * Gets voucher org value.
     *
     * @return the voucher org value
     */
    public String getVoucherOrgValue() {
		return this.voucherOrgValue;
	}

    /**
     * Sets voucher org value.
     *
     * @param voucherOrgValue the voucher org value
     */
    public void setVoucherOrgValue(String voucherOrgValue) {
		this.voucherOrgValue = voucherOrgValue;
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

    /**
     * Gets voucher value.
     *
     * @return the voucher value
     */
    public String getVoucherValue() {
		return this.voucherValue;
	}

    /**
     * Sets voucher value.
     *
     * @param voucherValue the voucher value
     */
    public void setVoucherValue(String voucherValue) {
		this.voucherValue = voucherValue;
	}

}
