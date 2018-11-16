package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐区开台菜
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:51:30
 */
public class KbdishAreaFreeInfo extends AlipayObject {

	private static final long serialVersionUID = 3265355531594828682L;

	/**
	 * 餐区id
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 份数
	 */
	@ApiField("count")
	private String count;

	/**
	 * 口碑菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * sku_id
	 */
	@ApiField("dish_sku_id")
	private String dishSkuId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

    /**
     * Gets area id.
     *
     * @return the area id
     */
    public String getAreaId() {
		return this.areaId;
	}

    /**
     * Sets area id.
     *
     * @param areaId the area id
     */
    public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

    /**
     * Gets count.
     *
     * @return the count
     */
    public String getCount() {
		return this.count;
	}

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(String count) {
		this.count = count;
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
     * Gets dish sku id.
     *
     * @return the dish sku id
     */
    public String getDishSkuId() {
		return this.dishSkuId;
	}

    /**
     * Sets dish sku id.
     *
     * @param dishSkuId the dish sku id
     */
    public void setDishSkuId(String dishSkuId) {
		this.dishSkuId = dishSkuId;
	}

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
		return this.status;
	}

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
		this.status = status;
	}

}
