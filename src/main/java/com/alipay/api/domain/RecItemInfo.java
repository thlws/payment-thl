package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐结果
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:40:40
 */
public class RecItemInfo extends AlipayObject {

	private static final long serialVersionUID = 4863395397487211183L;

	/**
	 * 归属地区
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 业务分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展信息,JSONSTRING格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 图标地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * Item编码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 服务ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 推荐Item名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * Item分类
	 */
	@ApiField("type")
	private String type;

	/**
	 * Item地址
	 */
	@ApiField("url")
	private String url;

    /**
     * Gets area code.
     *
     * @return the area code
     */
    public String getAreaCode() {
		return this.areaCode;
	}

    /**
     * Sets area code.
     *
     * @param areaCode the area code
     */
    public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

    /**
     * Gets biz type.
     *
     * @return the biz type
     */
    public String getBizType() {
		return this.bizType;
	}

    /**
     * Sets biz type.
     *
     * @param bizType the biz type
     */
    public void setBizType(String bizType) {
		this.bizType = bizType;
	}

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
		return this.description;
	}

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
		this.description = description;
	}

    /**
     * Gets ext info.
     *
     * @return the ext info
     */
    public String getExtInfo() {
		return this.extInfo;
	}

    /**
     * Sets ext info.
     *
     * @param extInfo the ext info
     */
    public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon() {
		return this.icon;
	}

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
		this.icon = icon;
	}

    /**
     * Gets item code.
     *
     * @return the item code
     */
    public String getItemCode() {
		return this.itemCode;
	}

    /**
     * Sets item code.
     *
     * @param itemCode the item code
     */
    public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public String getItemId() {
		return this.itemId;
	}

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets service code.
     *
     * @return the service code
     */
    public String getServiceCode() {
		return this.serviceCode;
	}

    /**
     * Sets service code.
     *
     * @param serviceCode the service code
     */
    public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
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
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
		this.type = type;
	}

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
		return this.url;
	}

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
		this.url = url;
	}

}
