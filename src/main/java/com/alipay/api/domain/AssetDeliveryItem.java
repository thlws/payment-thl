package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料配送指令对象, 包括物料配送的相关信息: 订单明细ID, 申请单号, 模板ID, 物料名称, 数量, 收货人姓名,联系人电话,收货人地址等.
 *
 * @author auto create
 * @since 1.0, 2018-06-14 12:56:23
 */
public class AssetDeliveryItem extends AlipayObject {

	private static final long serialVersionUID = 6899723788225514182L;

	/**
	 * SEND - 发货指令(执行向目的地进行发货动作) , RECEIVE - 收货指令(执行从来源地进行收货动作)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 配送数量
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 申请单id
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	/**
	 * 配送订单唯一Id
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 支付宝内部的配送流水号, 可供物料商和物流商用于对账.
	 */
	@ApiField("assign_out_order_id")
	private String assignOutOrderId;

	/**
	 * 物料渠道标识
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 发送地址
	 */
	@ApiField("from_address")
	private AssetDeliveryAddress fromAddress;

	/**
	 * 配送指令生成日期, 格式:yyyy-MM-dd HH：mm:ss
	 */
	@ApiField("gmt_assign")
	private String gmtAssign;

	/**
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 物料名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 物流单信息
	 */
	@ApiField("logistics_info")
	private LogisticsInfo logisticsInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 1. 如果该物料是套组的子物料, 那么该值为套组物料id;
2, 其他情况和物料id(即, item_id)一致或者为空.
	 */
	@ApiField("parent_item_id")
	private String parentItemId;

	/**
	 * 面单信息
	 */
	@ApiField("print_data")
	private String printData;

	/**
	 * 生产调拨对应的生产指令.
	 */
	@ApiField("produce_order_item_id")
	private String produceOrderItemId;

	/**
	 * TO_CUSTOMER : 到客户的配送指令; INTERIM : 中转配送指令. 可选值详见openApi文档.
	 */
	@ApiField("record_type")
	private String recordType;

	/**
	 * 对应供应商pid
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 对应供应商名称
	 */
	@ApiField("supplier_name")
	private String supplierName;

	/**
	 * 接收地址(目的地址)
	 */
	@ApiField("to_address")
	private AssetDeliveryAddress toAddress;

    /**
     * Gets action type.
     *
     * @return the action type
     */
    public String getActionType() {
		return this.actionType;
	}

    /**
     * Sets action type.
     *
     * @param actionType the action type
     */
    public void setActionType(String actionType) {
		this.actionType = actionType;
	}

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount() {
		return this.amount;
	}

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(Long amount) {
		this.amount = amount;
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
     * Gets assign out order id.
     *
     * @return the assign out order id
     */
    public String getAssignOutOrderId() {
		return this.assignOutOrderId;
	}

    /**
     * Sets assign out order id.
     *
     * @param assignOutOrderId the assign out order id
     */
    public void setAssignOutOrderId(String assignOutOrderId) {
		this.assignOutOrderId = assignOutOrderId;
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
     * Gets from address.
     *
     * @return the from address
     */
    public AssetDeliveryAddress getFromAddress() {
		return this.fromAddress;
	}

    /**
     * Sets from address.
     *
     * @param fromAddress the from address
     */
    public void setFromAddress(AssetDeliveryAddress fromAddress) {
		this.fromAddress = fromAddress;
	}

    /**
     * Gets gmt assign.
     *
     * @return the gmt assign
     */
    public String getGmtAssign() {
		return this.gmtAssign;
	}

    /**
     * Sets gmt assign.
     *
     * @param gmtAssign the gmt assign
     */
    public void setGmtAssign(String gmtAssign) {
		this.gmtAssign = gmtAssign;
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
     * Gets item name.
     *
     * @return the item name
     */
    public String getItemName() {
		return this.itemName;
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
     * Gets logistics info.
     *
     * @return the logistics info
     */
    public LogisticsInfo getLogisticsInfo() {
		return this.logisticsInfo;
	}

    /**
     * Sets logistics info.
     *
     * @param logisticsInfo the logistics info
     */
    public void setLogisticsInfo(LogisticsInfo logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
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
     * Gets parent item id.
     *
     * @return the parent item id
     */
    public String getParentItemId() {
		return this.parentItemId;
	}

    /**
     * Sets parent item id.
     *
     * @param parentItemId the parent item id
     */
    public void setParentItemId(String parentItemId) {
		this.parentItemId = parentItemId;
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
     * Gets produce order item id.
     *
     * @return the produce order item id
     */
    public String getProduceOrderItemId() {
		return this.produceOrderItemId;
	}

    /**
     * Sets produce order item id.
     *
     * @param produceOrderItemId the produce order item id
     */
    public void setProduceOrderItemId(String produceOrderItemId) {
		this.produceOrderItemId = produceOrderItemId;
	}

    /**
     * Gets record type.
     *
     * @return the record type
     */
    public String getRecordType() {
		return this.recordType;
	}

    /**
     * Sets record type.
     *
     * @param recordType the record type
     */
    public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

    /**
     * Gets supplier id.
     *
     * @return the supplier id
     */
    public String getSupplierId() {
		return this.supplierId;
	}

    /**
     * Sets supplier id.
     *
     * @param supplierId the supplier id
     */
    public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

    /**
     * Gets supplier name.
     *
     * @return the supplier name
     */
    public String getSupplierName() {
		return this.supplierName;
	}

    /**
     * Sets supplier name.
     *
     * @param supplierName the supplier name
     */
    public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

    /**
     * Gets to address.
     *
     * @return the to address
     */
    public AssetDeliveryAddress getToAddress() {
		return this.toAddress;
	}

    /**
     * Sets to address.
     *
     * @param toAddress the to address
     */
    public void setToAddress(AssetDeliveryAddress toAddress) {
		this.toAddress = toAddress;
	}

}
