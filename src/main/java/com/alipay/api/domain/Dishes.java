package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品类
 *
 * @author auto create
 * @since 1.0, 2017-12-22 14:47:14
 */
public class Dishes extends AlipayObject {

	private static final long serialVersionUID = 7159321395632157569L;

	/**
	 * 外部菜品ID
当dish_list[]不为空的时候，dish_id是必填字段。
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 菜品名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 菜品数量
	 */
	@ApiField("dish_num")
	private String dishNum;

	/**
	 * 菜品价格（单位分）
	 */
	@ApiField("dish_price")
	private String dishPrice;

	/**
	 * 菜品折后价格（单位分）
	 */
	@ApiField("dish_real_price")
	private String dishRealPrice;

	/**
	 * 1234
	 */
	@ApiField("dish_skuid")
	private String dishSkuid;

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
     * Gets dish price.
     *
     * @return the dish price
     */
    public String getDishPrice() {
		return this.dishPrice;
	}

    /**
     * Sets dish price.
     *
     * @param dishPrice the dish price
     */
    public void setDishPrice(String dishPrice) {
		this.dishPrice = dishPrice;
	}

    /**
     * Gets dish real price.
     *
     * @return the dish real price
     */
    public String getDishRealPrice() {
		return this.dishRealPrice;
	}

    /**
     * Sets dish real price.
     *
     * @param dishRealPrice the dish real price
     */
    public void setDishRealPrice(String dishRealPrice) {
		this.dishRealPrice = dishRealPrice;
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

}
