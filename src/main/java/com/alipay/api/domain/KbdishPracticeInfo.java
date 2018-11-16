package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品做法模型
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:26:51
 */
public class KbdishPracticeInfo extends AlipayObject {

	private static final long serialVersionUID = 5179636245857928686L;

	/**
	 * 口碑的菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 加价类型  add:直接加 multiply:乘以系数
	 */
	@ApiField("increase_mode")
	private String increaseMode;

	/**
	 * 加价金额
	 */
	@ApiField("increase_price")
	private String increasePrice;

	/**
	 * 做法名称
	 */
	@ApiField("practice_name")
	private String practiceName;

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
     * Gets increase mode.
     *
     * @return the increase mode
     */
    public String getIncreaseMode() {
		return this.increaseMode;
	}

    /**
     * Sets increase mode.
     *
     * @param increaseMode the increase mode
     */
    public void setIncreaseMode(String increaseMode) {
		this.increaseMode = increaseMode;
	}

    /**
     * Gets increase price.
     *
     * @return the increase price
     */
    public String getIncreasePrice() {
		return this.increasePrice;
	}

    /**
     * Sets increase price.
     *
     * @param increasePrice the increase price
     */
    public void setIncreasePrice(String increasePrice) {
		this.increasePrice = increasePrice;
	}

    /**
     * Gets practice name.
     *
     * @return the practice name
     */
    public String getPracticeName() {
		return this.practiceName;
	}

    /**
     * Sets practice name.
     *
     * @param practiceName the practice name
     */
    public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

}
