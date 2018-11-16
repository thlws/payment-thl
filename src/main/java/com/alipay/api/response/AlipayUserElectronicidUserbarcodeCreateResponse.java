package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.electronicid.userbarcode.create response.
 *
 * @author auto create
 * @since 1.0, 2018-07-16 10:20:00
 */
public class AlipayUserElectronicidUserbarcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5541463977176265412L;

	/** 
	 * 用户电子身份证码串
	 */
	@ApiField("barcode")
	private String barcode;

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

}
