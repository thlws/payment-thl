package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料生产指令对象, 包括物料生产的相关信息: 订单明细ID, 申请单号, 模板ID, 物料名称, 物料图片Url, 数量,  申请日期,收货人姓名,联系人电话,收货人地址等.
 *
 * @author auto create
 * @since 1.0, 2018-06-14 12:55:54
 */
public class AssetProduceItem extends AlipayObject {

	private static final long serialVersionUID = 7326664871963857329L;

	/**
	 * 申请日期，格式yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 申请单号
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 收钱码吊牌和贴纸类型不为空; 
物料图片Url，供应商使用该图片进行物料打印
	 */
	@ApiField("asset_pic_url")
	private String assetPicUrl;

	/**
	 * 目前只有空码生产的码图片url从这里获取
	 */
	@ApiField("asset_resource")
	private String assetResource;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 业务渠道
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * city
	 */
	@ApiField("city")
	private String city;

	/**
	 * 数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 订单创建时间, 格式: yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 1 - 旧模式, 需要在生产完成时反馈运单号 ; 2 - 新模式, 不需要在生产完成时反馈运单号
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 区
	 */
	@ApiField("district")
	private String district;

	/**
	 * 物流公司代码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流运单号; 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 生产指令描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 1. 如果该物料是套组的子物料, 那么该值为套组物料id; 2, 其他情况和物料id(即, item_id)一致或者为空.
	 */
	@ApiField("parent_template_id")
	private String parentTemplateId;

	/**
	 * 收件人地址邮编; 收钱码吊牌和贴纸类型不为空
	 */
	@ApiField("postcode")
	private String postcode;

	/**
	 * 面单打印信息
	 */
	@ApiField("print_data")
	private String printData;

	/**
	 * 生产单号
	 */
	@ApiField("produce_order")
	private String produceOrder;

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
	 * 物料供应商PID，和调用方的供应商PID一致
	 */
	@ApiField("supplier_pid")
	private String supplierPid;

	/**
	 * 模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板名称，线下约定的物料名称
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
     * Gets apply order id.
     *
     * @return the apply order id
     */
    public String getApplyOrderId() {
		return this.applyOrderId;
	}

    /**
     * Sets apply order id.
     *
     * @param applyOrderId the apply order id
     */
    public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

    /**
     * Gets asset pic url.
     *
     * @return the asset pic url
     */
    public String getAssetPicUrl() {
		return this.assetPicUrl;
	}

    /**
     * Sets asset pic url.
     *
     * @param assetPicUrl the asset pic url
     */
    public void setAssetPicUrl(String assetPicUrl) {
		this.assetPicUrl = assetPicUrl;
	}

    /**
     * Gets asset resource.
     *
     * @return the asset resource
     */
    public String getAssetResource() {
		return this.assetResource;
	}

    /**
     * Sets asset resource.
     *
     * @param assetResource the asset resource
     */
    public void setAssetResource(String assetResource) {
		this.assetResource = assetResource;
	}

    /**
     * Gets assign item id.
     *
     * @return the assign item id
     */
    public String getAssignItemId() {
		return this.assignItemId;
	}

    /**
     * Sets assign item id.
     *
     * @param assignItemId the assign item id
     */
    public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

    /**
     * Gets biz tag.
     *
     * @return the biz tag
     */
    public String getBizTag() {
		return this.bizTag;
	}

    /**
     * Sets biz tag.
     *
     * @param bizTag the biz tag
     */
    public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
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
     * Gets data version.
     *
     * @return the data version
     */
    public String getDataVersion() {
		return this.dataVersion;
	}

    /**
     * Sets data version.
     *
     * @param dataVersion the data version
     */
    public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
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
     * Gets logistics code.
     *
     * @return the logistics code
     */
    public String getLogisticsCode() {
		return this.logisticsCode;
	}

    /**
     * Sets logistics code.
     *
     * @param logisticsCode the logistics code
     */
    public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

    /**
     * Gets logistics name.
     *
     * @return the logistics name
     */
    public String getLogisticsName() {
		return this.logisticsName;
	}

    /**
     * Sets logistics name.
     *
     * @param logisticsName the logistics name
     */
    public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

    /**
     * Gets logistics no.
     *
     * @return the logistics no
     */
    public String getLogisticsNo() {
		return this.logisticsNo;
	}

    /**
     * Sets logistics no.
     *
     * @param logisticsNo the logistics no
     */
    public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

    /**
     * Gets memo.
     *
     * @return the memo
     */
    public String getMemo() {
		return this.memo;
	}

    /**
     * Sets memo.
     *
     * @param memo the memo
     */
    public void setMemo(String memo) {
		this.memo = memo;
	}

    /**
     * Gets parent template id.
     *
     * @return the parent template id
     */
    public String getParentTemplateId() {
		return this.parentTemplateId;
	}

    /**
     * Sets parent template id.
     *
     * @param parentTemplateId the parent template id
     */
    public void setParentTemplateId(String parentTemplateId) {
		this.parentTemplateId = parentTemplateId;
	}

    /**
     * Gets postcode.
     *
     * @return the postcode
     */
    public String getPostcode() {
		return this.postcode;
	}

    /**
     * Sets postcode.
     *
     * @param postcode the postcode
     */
    public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

    /**
     * Gets print data.
     *
     * @return the print data
     */
    public String getPrintData() {
		return this.printData;
	}

    /**
     * Sets print data.
     *
     * @param printData the print data
     */
    public void setPrintData(String printData) {
		this.printData = printData;
	}

    /**
     * Gets produce order.
     *
     * @return the produce order
     */
    public String getProduceOrder() {
		return this.produceOrder;
	}

    /**
     * Sets produce order.
     *
     * @param produceOrder the produce order
     */
    public void setProduceOrder(String produceOrder) {
		this.produceOrder = produceOrder;
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
     * Gets supplier pid.
     *
     * @return the supplier pid
     */
    public String getSupplierPid() {
		return this.supplierPid;
	}

    /**
     * Sets supplier pid.
     *
     * @param supplierPid the supplier pid
     */
    public void setSupplierPid(String supplierPid) {
		this.supplierPid = supplierPid;
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
