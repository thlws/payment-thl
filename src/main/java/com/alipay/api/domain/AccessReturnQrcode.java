package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商回传码物料对应的码值记录对象
 *
 * @author auto create
 * @since 1.0, 2017-11-21 17:40:30
 */
public class AccessReturnQrcode extends AlipayObject {

	private static final long serialVersionUID = 4724859946887674988L;

	/**
	 * 采购单ID
	 */
	@ApiField("asset_purchase_id")
	private String assetPurchaseId;

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

}
