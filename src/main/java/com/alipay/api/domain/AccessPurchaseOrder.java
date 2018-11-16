package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料采购单详情
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:40:45
 */
public class AccessPurchaseOrder extends AlipayObject {

	private static final long serialVersionUID = 3197835194972346911L;

	/**
	 * 申请日期, 格式:
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 申请订单明细号
	 */
	@ApiField("asset_item_id")
	private String assetItemId;

	/**
	 * 申请订单号
	 */
	@ApiField("asset_order_id")
	private String assetOrderId;

	/**
	 * 采购单号（订单汇总表ID）
	 */
	@ApiField("asset_purchase_id")
	private String assetPurchaseId;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 订单创建日期, 格式: yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 是否需要生产
	 */
	@ApiField("is_produce")
	private String isProduce;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 收货人地址
	 */
	@ApiField("receiver_address")
	private String receiverAddress;

	/**
	 * 联系人电话
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/**
	 * 收货人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 物料类型
	 */
	@ApiField("stuff_attr_name")
	private String stuffAttrName;

	/**
	 * 物料材质
	 */
	@ApiField("stuff_material")
	private String stuffMaterial;

	/**
	 * 物料尺寸
	 */
	@ApiField("stuff_size")
	private String stuffSize;

	/**
	 * 物料属性
	 */
	@ApiField("stuff_type")
	private String stuffType;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称，线下约定的物料名
	 */
	@ApiField("template_name")
	private String templateName;

    /**
     * Gets apply date.
     *
     * @return the apply date
     */
    public String getApplyDate() {
		return this.applyDate;
	}

    /**
     * Sets apply date.
     *
     * @param applyDate the apply date
     */
    public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

    /**
     * Gets asset item id.
     *
     * @return the asset item id
     */
    public String getAssetItemId() {
		return this.assetItemId;
	}

    /**
     * Sets asset item id.
     *
     * @param assetItemId the asset item id
     */
    public void setAssetItemId(String assetItemId) {
		this.assetItemId = assetItemId;
	}

    /**
     * Gets asset order id.
     *
     * @return the asset order id
     */
    public String getAssetOrderId() {
		return this.assetOrderId;
	}

    /**
     * Sets asset order id.
     *
     * @param assetOrderId the asset order id
     */
    public void setAssetOrderId(String assetOrderId) {
		this.assetOrderId = assetOrderId;
	}

    /**
     * Gets asset purchase id.
     *
     * @return the asset purchase id
     */
    public String getAssetPurchaseId() {
		return this.assetPurchaseId;
	}

    /**
     * Sets asset purchase id.
     *
     * @param assetPurchaseId the asset purchase id
     */
    public void setAssetPurchaseId(String assetPurchaseId) {
		this.assetPurchaseId = assetPurchaseId;
	}

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
		return this.city;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
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
     * Gets create date.
     *
     * @return the create date
     */
    public String getCreateDate() {
		return this.createDate;
	}

    /**
     * Sets create date.
     *
     * @param createDate the create date
     */
    public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

    /**
     * Gets district.
     *
     * @return the district
     */
    public String getDistrict() {
		return this.district;
	}

    /**
     * Sets district.
     *
     * @param district the district
     */
    public void setDistrict(String district) {
		this.district = district;
	}

    /**
     * Gets is produce.
     *
     * @return the is produce
     */
    public String getIsProduce() {
		return this.isProduce;
	}

    /**
     * Sets is produce.
     *
     * @param isProduce the is produce
     */
    public void setIsProduce(String isProduce) {
		this.isProduce = isProduce;
	}

    /**
     * Gets province.
     *
     * @return the province
     */
    public String getProvince() {
		return this.province;
	}

    /**
     * Sets province.
     *
     * @param province the province
     */
    public void setProvince(String province) {
		this.province = province;
	}

    /**
     * Gets receiver address.
     *
     * @return the receiver address
     */
    public String getReceiverAddress() {
		return this.receiverAddress;
	}

    /**
     * Sets receiver address.
     *
     * @param receiverAddress the receiver address
     */
    public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

    /**
     * Gets receiver mobile.
     *
     * @return the receiver mobile
     */
    public String getReceiverMobile() {
		return this.receiverMobile;
	}

    /**
     * Sets receiver mobile.
     *
     * @param receiverMobile the receiver mobile
     */
    public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

    /**
     * Gets receiver name.
     *
     * @return the receiver name
     */
    public String getReceiverName() {
		return this.receiverName;
	}

    /**
     * Sets receiver name.
     *
     * @param receiverName the receiver name
     */
    public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

    /**
     * Gets stuff attr name.
     *
     * @return the stuff attr name
     */
    public String getStuffAttrName() {
		return this.stuffAttrName;
	}

    /**
     * Sets stuff attr name.
     *
     * @param stuffAttrName the stuff attr name
     */
    public void setStuffAttrName(String stuffAttrName) {
		this.stuffAttrName = stuffAttrName;
	}

    /**
     * Gets stuff material.
     *
     * @return the stuff material
     */
    public String getStuffMaterial() {
		return this.stuffMaterial;
	}

    /**
     * Sets stuff material.
     *
     * @param stuffMaterial the stuff material
     */
    public void setStuffMaterial(String stuffMaterial) {
		this.stuffMaterial = stuffMaterial;
	}

    /**
     * Gets stuff size.
     *
     * @return the stuff size
     */
    public String getStuffSize() {
		return this.stuffSize;
	}

    /**
     * Sets stuff size.
     *
     * @param stuffSize the stuff size
     */
    public void setStuffSize(String stuffSize) {
		this.stuffSize = stuffSize;
	}

    /**
     * Gets stuff type.
     *
     * @return the stuff type
     */
    public String getStuffType() {
		return this.stuffType;
	}

    /**
     * Sets stuff type.
     *
     * @param stuffType the stuff type
     */
    public void setStuffType(String stuffType) {
		this.stuffType = stuffType;
	}

    /**
     * Gets template id.
     *
     * @return the template id
     */
    public String getTemplateId() {
		return this.templateId;
	}

    /**
     * Sets template id.
     *
     * @param templateId the template id
     */
    public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

    /**
     * Gets template name.
     *
     * @return the template name
     */
    public String getTemplateName() {
		return this.templateName;
	}

    /**
     * Sets template name.
     *
     * @param templateName the template name
     */
    public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
