package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品查询
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:52:11
 */
public class KoubeiCateringDishQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2142464995231397736L;

	/**
	 * 分类字典大类的id
	 */
	@ApiField("catetory_big_id")
	private String catetoryBigId;

	/**
	 * 小类,商家自定义配置表例如 肉，酒水，素菜
	 */
	@ApiField("catetory_small_id")
	private String catetorySmallId;

	/**
	 * 菜系,商家自定义
	 */
	@ApiField("dish_cuisine")
	private String dishCuisine;

	/**
	 * 口碑的菜品id,新增的时候可以为空
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("dish_status")
	private String dishStatus;

	/**
	 * 拼音助记码
	 */
	@ApiField("en_remember_code")
	private String enRememberCode;

	/**
	 * 商户的支付宝user_id. 商户授权后,isv能获得
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 数字助记码
	 */
	@ApiField("nb_remember_code")
	private String nbRememberCode;

	/**
	 * sku的id 口碑生成
	 */
	@ApiField("sku_id")
	private String skuId;

    /**
     * Gets catetory big id.
     *
     * @return the catetory big id
     */
    public String getCatetoryBigId() {
		return this.catetoryBigId;
	}

    /**
     * Sets catetory big id.
     *
     * @param catetoryBigId the catetory big id
     */
    public void setCatetoryBigId(String catetoryBigId) {
		this.catetoryBigId = catetoryBigId;
	}

    /**
     * Gets catetory small id.
     *
     * @return the catetory small id
     */
    public String getCatetorySmallId() {
		return this.catetorySmallId;
	}

    /**
     * Sets catetory small id.
     *
     * @param catetorySmallId the catetory small id
     */
    public void setCatetorySmallId(String catetorySmallId) {
		this.catetorySmallId = catetorySmallId;
	}

    /**
     * Gets dish cuisine.
     *
     * @return the dish cuisine
     */
    public String getDishCuisine() {
		return this.dishCuisine;
	}

    /**
     * Sets dish cuisine.
     *
     * @param dishCuisine the dish cuisine
     */
    public void setDishCuisine(String dishCuisine) {
		this.dishCuisine = dishCuisine;
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
     * Gets dish name.
     *
     * @return the dish name
     */
    public String getDishName() {
		return this.dishName;
	}

    /**
     * Sets dish name.
     *
     * @param dishName the dish name
     */
    public void setDishName(String dishName) {
		this.dishName = dishName;
	}

    /**
     * Gets dish status.
     *
     * @return the dish status
     */
    public String getDishStatus() {
		return this.dishStatus;
	}

    /**
     * Sets dish status.
     *
     * @param dishStatus the dish status
     */
    public void setDishStatus(String dishStatus) {
		this.dishStatus = dishStatus;
	}

    /**
     * Gets en remember code.
     *
     * @return the en remember code
     */
    public String getEnRememberCode() {
		return this.enRememberCode;
	}

    /**
     * Sets en remember code.
     *
     * @param enRememberCode the en remember code
     */
    public void setEnRememberCode(String enRememberCode) {
		this.enRememberCode = enRememberCode;
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

    /**
     * Gets nb remember code.
     *
     * @return the nb remember code
     */
    public String getNbRememberCode() {
		return this.nbRememberCode;
	}

    /**
     * Sets nb remember code.
     *
     * @param nbRememberCode the nb remember code
     */
    public void setNbRememberCode(String nbRememberCode) {
		this.nbRememberCode = nbRememberCode;
	}

    /**
     * Gets sku id.
     *
     * @return the sku id
     */
    public String getSkuId() {
		return this.skuId;
	}

    /**
     * Sets sku id.
     *
     * @param skuId the sku id
     */
    public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
