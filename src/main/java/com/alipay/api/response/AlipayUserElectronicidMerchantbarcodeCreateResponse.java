package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.electronicid.merchantbarcode.create response.
 *
 * @author auto create
 * @since 1.0, 2018-08-23 14:05:01
 */
public class AlipayUserElectronicidMerchantbarcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4497827647366728989L;

	/** 
	 * 二维码码串
	 */
	@ApiField("barcode")
	private String barcode;

	/** 
	 * 二维码图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

    /**
     * Sets barcode.
     *
     * @param barcode the barcode
     */
    public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

    /**
     * Gets barcode.
     *
     * @return the barcode
     */
    public String getBarcode( ) {
		return this.barcode;
	}

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

}
