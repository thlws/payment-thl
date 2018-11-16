package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据条形码获取抬头
 *
 * @author auto create
 * @since 1.0, 2018-08-24 14:36:46
 */
public class AlipayEbppInvoiceTitleDynamicGetModel extends AlipayObject {

	private static final long serialVersionUID = 3283316933444942712L;

	/**
	 * 抬头动态码
	 */
	@ApiField("bar_code")
	private String barCode;

    /**
     * Gets bar code.
     *
     * @return the bar code
     */
    public String getBarCode() {
		return this.barCode;
	}

    /**
     * Sets bar code.
     *
     * @param barCode the bar code
     */
    public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

}
