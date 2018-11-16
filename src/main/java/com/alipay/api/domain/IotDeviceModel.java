package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Iot设备型号对象
 *
 * @author auto create
 * @since 1.0, 2017-09-14 22:22:34
 */
public class IotDeviceModel extends AlipayObject {

	private static final long serialVersionUID = 3624458625848481979L;

	/**
	 * 该型号所属类目的类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 型号支持的配网链接类型, 取值可为WiFi，BlueTooth
	 */
	@ApiListField("connection_types")
	@ApiField("string")
	private List<String> connectionTypes;

	/**
	 * 配网链接地址
	 */
	@ApiField("connection_url")
	private String connectionUrl;

	/**
	 * 关于型号的描述信息
	 */
	@ApiField("decription")
	private String decription;

	/**
	 * 型号的图标图片地址
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 制造商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 协议服务商用于唯一标识一个设备型号的型号id
	 */
	@ApiField("model_id")
	private String modelId;

	/**
	 * 设备型号的名称
	 */
	@ApiField("model_name")
	private String modelName;

    /**
     * Gets category id.
     *
     * @return the category id
     */
    public String getCategoryId() {
		return this.categoryId;
	}

    /**
     * Sets category id.
     *
     * @param categoryId the category id
     */
    public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

    /**
     * Gets connection types.
     *
     * @return the connection types
     */
    public List<String> getConnectionTypes() {
		return this.connectionTypes;
	}

    /**
     * Sets connection types.
     *
     * @param connectionTypes the connection types
     */
    public void setConnectionTypes(List<String> connectionTypes) {
		this.connectionTypes = connectionTypes;
	}

    /**
     * Gets connection url.
     *
     * @return the connection url
     */
    public String getConnectionUrl() {
		return this.connectionUrl;
	}

    /**
     * Sets connection url.
     *
     * @param connectionUrl the connection url
     */
    public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

    /**
     * Gets decription.
     *
     * @return the decription
     */
    public String getDecription() {
		return this.decription;
	}

    /**
     * Sets decription.
     *
     * @param decription the decription
     */
    public void setDecription(String decription) {
		this.decription = decription;
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
     * Gets manufacturer.
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
		return this.manufacturer;
	}

    /**
     * Sets manufacturer.
     *
     * @param manufacturer the manufacturer
     */
    public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

    /**
     * Gets entity id.
     *
     * @return the entity id
     */
    public String getModelId() {
		return this.modelId;
	}

    /**
     * Sets entity id.
     *
     * @param modelId the entity id
     */
    public void setModelId(String modelId) {
		this.modelId = modelId;
	}

    /**
     * Gets entity name.
     *
     * @return the entity name
     */
    public String getModelName() {
		return this.modelName;
	}

    /**
     * Sets entity name.
     *
     * @param modelName the entity name
     */
    public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
