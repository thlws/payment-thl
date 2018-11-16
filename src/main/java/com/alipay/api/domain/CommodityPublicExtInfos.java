package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁云服务插件扩展信息
 *
 * @author auto create
 * @since 1.0, 2016-11-30 21:06:38
 */
public class CommodityPublicExtInfos extends AlipayObject {

	private static final long serialVersionUID = 4893462696536499315L;

	/**
	 * 前置url
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 应用展台id
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * 类目
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 服务插件ID
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 创建者ID
	 */
	@ApiField("create_user_id")
	private String createUserId;

	/**
	 * 挂载ID，用于确认唯一记录的主键对象
	 */
	@ApiField("displayapp_id")
	private String displayappId;

	/**
	 * 城市服务说明
	 */
	@ApiField("displayapp_memo")
	private String displayappMemo;

	/**
	 * 服务别名
	 */
	@ApiField("displayapp_name")
	private String displayappName;

	/**
	 * 状态 1:上架；0：下架；2:维护中
	 */
	@ApiField("displayapp_status")
	private String displayappStatus;

	/**
	 * 用户访问地址
	 */
	@ApiField("displayapp_url")
	private String displayappUrl;

	/**
	 * 外部展示地址
	 */
	@ApiField("export_url")
	private String exportUrl;

	/**
	 * 属性ID
	 */
	@ApiField("property_id")
	private String propertyId;

    /**
     * Gets action url.
     *
     * @return the action url
     */
    public String getActionUrl() {
		return this.actionUrl;
	}

    /**
     * Sets action url.
     *
     * @param actionUrl the action url
     */
    public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

    /**
     * Gets app id.
     *
     * @return the app id
     */
    public String getAppId() {
		return this.appId;
	}

    /**
     * Sets app id.
     *
     * @param appId the app id
     */
    public void setAppId(String appId) {
		this.appId = appId;
	}

    /**
     * Gets category name.
     *
     * @return the category name
     */
    public String getCategoryName() {
		return this.categoryName;
	}

    /**
     * Sets category name.
     *
     * @param categoryName the category name
     */
    public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

    /**
     * Gets city name.
     *
     * @return the city name
     */
    public String getCityName() {
		return this.cityName;
	}

    /**
     * Sets city name.
     *
     * @param cityName the city name
     */
    public void setCityName(String cityName) {
		this.cityName = cityName;
	}

    /**
     * Gets commodity id.
     *
     * @return the commodity id
     */
    public String getCommodityId() {
		return this.commodityId;
	}

    /**
     * Sets commodity id.
     *
     * @param commodityId the commodity id
     */
    public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

    /**
     * Gets create user id.
     *
     * @return the create user id
     */
    public String getCreateUserId() {
		return this.createUserId;
	}

    /**
     * Sets create user id.
     *
     * @param createUserId the create user id
     */
    public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

    /**
     * Gets displayapp id.
     *
     * @return the displayapp id
     */
    public String getDisplayappId() {
		return this.displayappId;
	}

    /**
     * Sets displayapp id.
     *
     * @param displayappId the displayapp id
     */
    public void setDisplayappId(String displayappId) {
		this.displayappId = displayappId;
	}

    /**
     * Gets displayapp memo.
     *
     * @return the displayapp memo
     */
    public String getDisplayappMemo() {
		return this.displayappMemo;
	}

    /**
     * Sets displayapp memo.
     *
     * @param displayappMemo the displayapp memo
     */
    public void setDisplayappMemo(String displayappMemo) {
		this.displayappMemo = displayappMemo;
	}

    /**
     * Gets displayapp name.
     *
     * @return the displayapp name
     */
    public String getDisplayappName() {
		return this.displayappName;
	}

    /**
     * Sets displayapp name.
     *
     * @param displayappName the displayapp name
     */
    public void setDisplayappName(String displayappName) {
		this.displayappName = displayappName;
	}

    /**
     * Gets displayapp status.
     *
     * @return the displayapp status
     */
    public String getDisplayappStatus() {
		return this.displayappStatus;
	}

    /**
     * Sets displayapp status.
     *
     * @param displayappStatus the displayapp status
     */
    public void setDisplayappStatus(String displayappStatus) {
		this.displayappStatus = displayappStatus;
	}

    /**
     * Gets displayapp url.
     *
     * @return the displayapp url
     */
    public String getDisplayappUrl() {
		return this.displayappUrl;
	}

    /**
     * Sets displayapp url.
     *
     * @param displayappUrl the displayapp url
     */
    public void setDisplayappUrl(String displayappUrl) {
		this.displayappUrl = displayappUrl;
	}

    /**
     * Gets export url.
     *
     * @return the export url
     */
    public String getExportUrl() {
		return this.exportUrl;
	}

    /**
     * Sets export url.
     *
     * @param exportUrl the export url
     */
    public void setExportUrl(String exportUrl) {
		this.exportUrl = exportUrl;
	}

    /**
     * Gets property id.
     *
     * @return the property id
     */
    public String getPropertyId() {
		return this.propertyId;
	}

    /**
     * Sets property id.
     *
     * @param propertyId the property id
     */
    public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

}
