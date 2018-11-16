package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品估清模型
 *
 * @author auto create
 * @since 1.0, 2018-09-11 15:27:09
 */
public class KbdishEstimatedInfo extends AlipayObject {

	private static final long serialVersionUID = 6336382828258947676L;

	/**
	 * 估清的菜品dishid或者skuid,该值对应的类型由dsType指定。目前暂时只支持dishid
	 */
	@ApiField("ds_id")
	private String dsId;

	/**
	 * skuid:sku维度估清
dishid:菜品维度估清
materialid:加料维度沽清
	 */
	@ApiField("ds_type")
	private String dsType;

	/**
	 * 估清后临时库存.大于等于0的数字。
status=open必须要传一个数。
在沽清类型为加料的时候，该项强制为0。
	 */
	@ApiField("inventory")
	private String inventory;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 状态。open:估清;stop:取消估清
	 */
	@ApiField("status")
	private String status;

	/**
	 * 估清最后修改人
	 */
	@ApiField("update_user")
	private String updateUser;

    /**
     * Gets ds id.
     *
     * @return the ds id
     */
    public String getDsId() {
		return this.dsId;
	}

    /**
     * Sets ds id.
     *
     * @param dsId the ds id
     */
    public void setDsId(String dsId) {
		this.dsId = dsId;
	}

    /**
     * Gets ds type.
     *
     * @return the ds type
     */
    public String getDsType() {
		return this.dsType;
	}

    /**
     * Sets ds type.
     *
     * @param dsType the ds type
     */
    public void setDsType(String dsType) {
		this.dsType = dsType;
	}

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    public String getInventory() {
		return this.inventory;
	}

    /**
     * Sets inventory.
     *
     * @param inventory the inventory
     */
    public void setInventory(String inventory) {
		this.inventory = inventory;
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

    /**
     * Gets update user.
     *
     * @return the update user
     */
    public String getUpdateUser() {
		return this.updateUser;
	}

    /**
     * Sets update user.
     *
     * @param updateUser the update user
     */
    public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
