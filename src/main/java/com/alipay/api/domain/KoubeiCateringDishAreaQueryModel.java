package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑餐区餐台查询api
 *
 * @author auto create
 * @since 1.0, 2018-08-03 17:50:00
 */
public class KoubeiCateringDishAreaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6161924472552831436L;

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
	 * 商户id
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
	 * 餐台id  根据餐台反查到餐区，再返回全模型
	 */
	@ApiField("tab_id")
	private String tabId;

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

}
