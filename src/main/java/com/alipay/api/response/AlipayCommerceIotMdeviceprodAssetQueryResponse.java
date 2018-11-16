package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.asset.query response.
 *
 * @author auto create
 * @since 1.0, 2018-09-14 16:00:00
 */
public class AlipayCommerceIotMdeviceprodAssetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8211743169346418945L;

	/** 
	 * 物料模板的图片url
	 */
	@ApiField("image_url")
	private String imageUrl;

	/** 
	 * 物料模板的名称
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 物料类型
	 */
	@ApiField("item_type")
	private String itemType;

	/** 
	 * 设备型号
	 */
	@ApiField("model_number")
	private String modelNumber;

    /**
     * Sets image url.
     *
     * @param imageUrl the image url
     */
    public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

    /**
     * Gets image url.
     *
     * @return the image url
     */
    public String getImageUrl( ) {
		return this.imageUrl;
	}

    /**
     * Sets item name.
     *
     * @param itemName the item name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}

    /**
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName( ) {
		return this.itemName;
	}

    /**
     * Sets item type.
     *
     * @param itemType the item type
     */
    public void setItemType(String itemType) {
		this.itemType = itemType;
	}

    /**
     * Gets item type.
     *
     * @return the item type
     */
    public String getItemType( ) {
		return this.itemType;
	}

    /**
     * Sets entity number.
     *
     * @param modelNumber the entity number
     */
    public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

    /**
     * Gets entity number.
     *
     * @return the entity number
     */
    public String getModelNumber( ) {
		return this.modelNumber;
	}

}
