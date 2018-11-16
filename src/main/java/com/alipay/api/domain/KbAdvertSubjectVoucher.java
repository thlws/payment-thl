package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统标的(券)
 *
 * @author auto create
 * @since 1.0, 2017-07-11 13:44:17
 */
public class KbAdvertSubjectVoucher extends AlipayObject {

	private static final long serialVersionUID = 2515924984461713734L;

	/**
	 * 品牌名称(支持模糊匹配)
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 适用城市(命中一个即可搜出)
	 */
	@ApiListField("city_ids")
	@ApiField("string")
	private List<String> cityIds;

	/**
	 * 商家名称(支持模糊匹配)
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * OBTAIN：认领（默认值）
BUY：购买
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称(支持模糊匹配)
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券类型
LIMIT-单品券
NO_LIMIT_DISCOUNT-全场折扣券
NO_LIMIT_CASH-全场代金券
	 */
	@ApiField("voucher_type")
	private String voucherType;

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
