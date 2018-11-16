package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜谱查询
 *
 * @author auto create
 * @since 1.0, 2018-09-11 14:15:56
 */
public class KoubeiCateringDishCookQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1567715832652419778L;

	/**
	 * 菜谱id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜谱状态
	 */
	@ApiField("cook_status")
	private String cookStatus;

	/**
	 * 菜谱中菜品的分类id
	 */
	@ApiField("detail_catetory_big_id")
	private String detailCatetoryBigId;

	/**
	 * 菜谱中菜品分类小类id
	 */
	@ApiField("detail_catetory_small_id")
	private String detailCatetorySmallId;

	/**
	 * 菜谱中菜品的状态
	 */
	@ApiField("detail_status")
	private String detailStatus;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得
	 */
	@ApiField("merchant_id")
	private String merchantId;

    /**
     * Gets cook id.
     *
     * @return the cook id
     */
    public String getCookId() {
		return this.cookId;
	}

    /**
     * Sets cook id.
     *
     * @param cookId the cook id
     */
    public void setCookId(String cookId) {
		this.cookId = cookId;
	}

    /**
     * Gets cook status.
     *
     * @return the cook status
     */
    public String getCookStatus() {
		return this.cookStatus;
	}

    /**
     * Sets cook status.
     *
     * @param cookStatus the cook status
     */
    public void setCookStatus(String cookStatus) {
		this.cookStatus = cookStatus;
	}

    /**
     * Gets detail catetory big id.
     *
     * @return the detail catetory big id
     */
    public String getDetailCatetoryBigId() {
		return this.detailCatetoryBigId;
	}

    /**
     * Sets detail catetory big id.
     *
     * @param detailCatetoryBigId the detail catetory big id
     */
    public void setDetailCatetoryBigId(String detailCatetoryBigId) {
		this.detailCatetoryBigId = detailCatetoryBigId;
	}

    /**
     * Gets detail catetory small id.
     *
     * @return the detail catetory small id
     */
    public String getDetailCatetorySmallId() {
		return this.detailCatetorySmallId;
	}

    /**
     * Sets detail catetory small id.
     *
     * @param detailCatetorySmallId the detail catetory small id
     */
    public void setDetailCatetorySmallId(String detailCatetorySmallId) {
		this.detailCatetorySmallId = detailCatetorySmallId;
	}

    /**
     * Gets detail status.
     *
     * @return the detail status
     */
    public String getDetailStatus() {
		return this.detailStatus;
	}

    /**
     * Sets detail status.
     *
     * @param detailStatus the detail status
     */
    public void setDetailStatus(String detailStatus) {
		this.detailStatus = detailStatus;
	}

    /**
     * Gets dish id.
     *
     * @return the dish id
     */
    public String getDishId() {
		return this.dishId;
	}

    /**
     * Sets dish id.
     *
     * @param dishId the dish id
     */
    public void setDishId(String dishId) {
		this.dishId = dishId;
	}

    /**
     * Gets merchant id.
     *
     * @return the merchant id
     */
    public String getMerchantId() {
		return this.merchantId;
	}

    /**
     * Sets merchant id.
     *
     * @param merchantId the merchant id
     */
    public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
