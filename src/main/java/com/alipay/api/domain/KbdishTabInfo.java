package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐台模型
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:51:30
 */
public class KbdishTabInfo extends AlipayObject {

	private static final long serialVersionUID = 5664565814168656817L;

	/**
	 * 餐台所属餐区的id
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 餐台创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 餐台服务费
	 */
	@ApiField("fee_price")
	private String feePrice;

	/**
	 * 餐台座位人数
	 */
	@ApiField("seat_count")
	private String seatCount;

	/**
	 * 餐台id
	 */
	@ApiField("tab_id")
	private String tabId;

	/**
	 * 餐台名称
	 */
	@ApiField("tab_name")
	private String tabName;

	/**
	 * 餐台序号
	 */
	@ApiField("tab_sort")
	private String tabSort;

	/**
	 * 餐台状态 empty:空闲 hold:站位  clean:清扫
	 */
	@ApiField("tab_tstatus")
	private String tabTstatus;

	/**
	 * 餐区修改人
	 */
	@ApiField("update_user")
	private String updateUser;

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
     * Gets create user.
     *
     * @return the create user
     */
    public String getCreateUser() {
		return this.createUser;
	}

    /**
     * Sets create user.
     *
     * @param createUser the create user
     */
    public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

    /**
     * Gets fee price.
     *
     * @return the fee price
     */
    public String getFeePrice() {
		return this.feePrice;
	}

    /**
     * Sets fee price.
     *
     * @param feePrice the fee price
     */
    public void setFeePrice(String feePrice) {
		this.feePrice = feePrice;
	}

    /**
     * Gets seat count.
     *
     * @return the seat count
     */
    public String getSeatCount() {
		return this.seatCount;
	}

    /**
     * Sets seat count.
     *
     * @param seatCount the seat count
     */
    public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

    /**
     * Gets tab id.
     *
     * @return the tab id
     */
    public String getTabId() {
		return this.tabId;
	}

    /**
     * Sets tab id.
     *
     * @param tabId the tab id
     */
    public void setTabId(String tabId) {
		this.tabId = tabId;
	}

    /**
     * Gets tab name.
     *
     * @return the tab name
     */
    public String getTabName() {
		return this.tabName;
	}

    /**
     * Sets tab name.
     *
     * @param tabName the tab name
     */
    public void setTabName(String tabName) {
		this.tabName = tabName;
	}

    /**
     * Gets tab sort.
     *
     * @return the tab sort
     */
    public String getTabSort() {
		return this.tabSort;
	}

    /**
     * Sets tab sort.
     *
     * @param tabSort the tab sort
     */
    public void setTabSort(String tabSort) {
		this.tabSort = tabSort;
	}

    /**
     * Gets tab tstatus.
     *
     * @return the tab tstatus
     */
    public String getTabTstatus() {
		return this.tabTstatus;
	}

    /**
     * Sets tab tstatus.
     *
     * @param tabTstatus the tab tstatus
     */
    public void setTabTstatus(String tabTstatus) {
		this.tabTstatus = tabTstatus;
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
