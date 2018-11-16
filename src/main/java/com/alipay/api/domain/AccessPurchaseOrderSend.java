package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商同步的发货信息和物流信息对象
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:40:07
 */
public class AccessPurchaseOrderSend extends AlipayObject {

	private static final long serialVersionUID = 4343634287993851724L;

	/**
	 * 申请单明细号
	 */
	@ApiField("asset_item_id")
	private String assetItemId;

	/**
	 * 申请单号
	 */
	@ApiField("asset_order_id")
	private String assetOrderId;

	/**
	 * 采购单ID
	 */
	@ApiField("asset_purchase_id")
	private String assetPurchaseId;

	/**
	 * 物流公司code
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("express_name")
	private String expressName;

	/**
	 * 物流单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 外部单号（供应商主键标识）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * PO单号
	 */
	@ApiField("po_no")
	private String poNo;

	/**
	 * 回传码值数量1000(不是码物料时为0)
	 */
	@ApiField("return_qrcode_count")
	private String returnQrcodeCount;

	/**
	 * 本次发货数量
	 */
	@ApiField("ship_count")
	private String shipCount;

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
     * Gets express code.
     *
     * @return the express code
     */
    public String getExpressCode() {
		return this.expressCode;
	}

    /**
     * Sets express code.
     *
     * @param expressCode the express code
     */
    public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

    /**
     * Gets express name.
     *
     * @return the express name
     */
    public String getExpressName() {
		return this.expressName;
	}

    /**
     * Sets express name.
     *
     * @param expressName the express name
     */
    public void setExpressName(String expressName) {
		this.expressName = expressName;
	}

    /**
     * Gets express no.
     *
     * @return the express no
     */
    public String getExpressNo() {
		return this.expressNo;
	}

    /**
     * Sets express no.
     *
     * @param expressNo the express no
     */
    public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

    /**
     * Gets out biz no.
     *
     * @return the out biz no
     */
    public String getOutBizNo() {
		return this.outBizNo;
	}

    /**
     * Sets out biz no.
     *
     * @param outBizNo the out biz no
     */
    public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

    /**
     * Gets po no.
     *
     * @return the po no
     */
    public String getPoNo() {
		return this.poNo;
	}

    /**
     * Sets po no.
     *
     * @param poNo the po no
     */
    public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

    /**
     * Gets return qrcode count.
     *
     * @return the return qrcode count
     */
    public String getReturnQrcodeCount() {
		return this.returnQrcodeCount;
	}

    /**
     * Sets return qrcode count.
     *
     * @param returnQrcodeCount the return qrcode count
     */
    public void setReturnQrcodeCount(String returnQrcodeCount) {
		this.returnQrcodeCount = returnQrcodeCount;
	}

    /**
     * Gets ship count.
     *
     * @return the ship count
     */
    public String getShipCount() {
		return this.shipCount;
	}

    /**
     * Sets ship count.
     *
     * @param shipCount the ship count
     */
    public void setShipCount(String shipCount) {
		this.shipCount = shipCount;
	}

}
