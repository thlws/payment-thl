package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐菜
 *
 * @author auto create
 * @since 1.0, 2017-12-22 14:47:14
 */
public class DishRecommend extends AlipayObject {

	private static final long serialVersionUID = 5234817522717863391L;

	/**
	 * 购买可能性/商品热度得分
若type=CART_RECOMAND or DESIGN_FOR_YOU；则 buy_posibility有返回，内容为商品热度得分。
若type= ASSOCIATION_RECOMAND；则 buy_posibility有返回，内容为购买可能性。
若type=QUICK_ORDER；则 buy_posibility无返回。
	 */
	@ApiField("buy_posibility")
	private String buyPosibility;

	/**
	 * 菜品ID
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 10
	 */
	@ApiField("dish_num")
	private String dishNum;

	/**
	 * 1234
	 */
	@ApiField("dish_skuid")
	private String dishSkuid;

	/**
	 * 推荐理由对应的CODE
	 */
	@ApiField("info_code")
	private String infoCode;

    /**
     * Gets buy posibility.
     *
     * @return the buy posibility
     */
    public String getBuyPosibility() {
		return this.buyPosibility;
	}

    /**
     * Sets buy posibility.
     *
     * @param buyPosibility the buy posibility
     */
    public void setBuyPosibility(String buyPosibility) {
		this.buyPosibility = buyPosibility;
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
     * Gets dish num.
     *
     * @return the dish num
     */
    public String getDishNum() {
		return this.dishNum;
	}

    /**
     * Sets dish num.
     *
     * @param dishNum the dish num
     */
    public void setDishNum(String dishNum) {
		this.dishNum = dishNum;
	}

    /**
     * Gets dish skuid.
     *
     * @return the dish skuid
     */
    public String getDishSkuid() {
		return this.dishSkuid;
	}

    /**
     * Sets dish skuid.
     *
     * @param dishSkuid the dish skuid
     */
    public void setDishSkuid(String dishSkuid) {
		this.dishSkuid = dishSkuid;
	}

    /**
     * Gets info code.
     *
     * @return the info code
     */
    public String getInfoCode() {
		return this.infoCode;
	}

    /**
     * Sets info code.
     *
     * @param infoCode the info code
     */
    public void setInfoCode(String infoCode) {
		this.infoCode = infoCode;
	}

}
