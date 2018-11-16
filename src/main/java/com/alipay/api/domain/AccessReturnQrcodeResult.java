package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商回传码值处理结果对象
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:41:52
 */
public class AccessReturnQrcodeResult extends AlipayObject {

	private static final long serialVersionUID = 6256526533276252896L;

	/**
	 * 采购单ID
	 */
	@ApiField("asset_purchase_id")
	private String assetPurchaseId;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 物流单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 外部单号（调用方业务主键）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 二维码token值
	 */
	@ApiField("qrcode")
	private String qrcode;

	/**
	 * 处理结果（成功或失败）
	 */
	@ApiField("success")
	private Boolean success;

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
     * Gets qrcode.
     *
     * @return the qrcode
     */
    public String getQrcode() {
		return this.qrcode;
	}

    /**
     * Sets qrcode.
     *
     * @param qrcode the qrcode
     */
    public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
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
