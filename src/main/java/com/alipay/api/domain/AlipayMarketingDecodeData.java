package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫码存放码值的类型
 *
 * @author auto create
 * @since 1.0, 2017-04-28 11:12:12
 */
public class AlipayMarketingDecodeData extends AlipayObject {

	private static final long serialVersionUID = 2649398682978479786L;

	/**
	 * 钱包二维码码值
	 */
	@ApiField("code")
	private String code;

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

}
