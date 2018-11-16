package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑餐区模型
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:51:30
 */
public class KbdishAreaInfo extends AlipayObject {

	private static final long serialVersionUID = 4431427626251563423L;

	/**
	 * 餐区开台菜列表
	 */
	@ApiListField("area_free_list")
	@ApiField("kbdish_area_free_info")
	private List<KbdishAreaFreeInfo> areaFreeList;

	/**
	 * 餐区id
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 餐区名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 餐区排序序号
	 */
	@ApiField("area_sort")
	private String areaSort;

	/**
	 * 创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 餐区服务费
	 */
	@ApiField("fee_price")
	private String feePrice;

	/**
	 * 商家id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 门店id 支付宝的
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 餐区的餐桌数量
	 */
	@ApiField("tab_count")
	private String tabCount;

	/**
	 * 餐区下的餐台列表
	 */
	@ApiListField("tab_list")
	@ApiField("kbdish_tab_info")
	private List<KbdishTabInfo> tabList;

	/**
	 * 修改人
	 */
	@ApiField("update_user")
	private String updateUser;

    /**
     * Gets area free list.
     *
     * @return the area free list
     */
    public List<KbdishAreaFreeInfo> getAreaFreeList() {
		return this.areaFreeList;
	}

    /**
     * Sets area free list.
     *
     * @param areaFreeList the area free list
     */
    public void setAreaFreeList(List<KbdishAreaFreeInfo> areaFreeList) {
		this.areaFreeList = areaFreeList;
	}

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
     * Gets area name.
     *
     * @return the area name
     */
    public String getAreaName() {
		return this.areaName;
	}

    /**
     * Sets area name.
     *
     * @param areaName the area name
     */
    public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

    /**
     * Gets area sort.
     *
     * @return the area sort
     */
    public String getAreaSort() {
		return this.areaSort;
	}

    /**
     * Sets area sort.
     *
     * @param areaSort the area sort
     */
    public void setAreaSort(String areaSort) {
		this.areaSort = areaSort;
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
     * Gets tab count.
     *
     * @return the tab count
     */
    public String getTabCount() {
		return this.tabCount;
	}

    /**
     * Sets tab count.
     *
     * @param tabCount the tab count
     */
    public void setTabCount(String tabCount) {
		this.tabCount = tabCount;
	}

    /**
     * Gets tab list.
     *
     * @return the tab list
     */
    public List<KbdishTabInfo> getTabList() {
		return this.tabList;
	}

    /**
     * Sets tab list.
     *
     * @param tabList the tab list
     */
    public void setTabList(List<KbdishTabInfo> tabList) {
		this.tabList = tabList;
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
