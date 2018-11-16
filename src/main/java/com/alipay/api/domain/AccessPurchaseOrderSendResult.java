package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商同步发货信息和物流信息处理完成结果对象
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:42:26
 */
public class AccessPurchaseOrderSendResult extends AlipayObject {

	private static final long serialVersionUID = 1877667648493913162L;

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
	 * 错误CODE
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 外部单号（调用方业务主键标识）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 处理是否成功
	 */
	@ApiField("success")
	private Boolean success;

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
     * Gets error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
		return this.errorCode;
	}

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

    /**
     * Gets error desc.
     *
     * @return the error desc
     */
    public String getErrorDesc() {
		return this.errorDesc;
	}

    /**
     * Sets error desc.
     *
     * @param errorDesc the error desc
     */
    public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
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
     * Gets success.
     *
     * @return the success
     */
    public Boolean getSuccess() {
		return this.success;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(Boolean success) {
		this.success = success;
	}

}
