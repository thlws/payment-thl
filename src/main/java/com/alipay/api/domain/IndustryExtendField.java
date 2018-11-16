package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业通用扩展字段，用来支持通用接口的一些扩展属性的录入 。
 *
 * @author auto create
 * @since 1.0, 2018-09-14 14:28:37
 */
public class IndustryExtendField extends AlipayObject {

	private static final long serialVersionUID = 4847127725243395279L;

	/**
	 * 扩展参数的key值
	 */
	@ApiField("key")
	private String key;

	/**
	 * 扩展参数的value值
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets key.
     *
     * @return the key
     */
    public String getKey() {
		return this.key;
	}

    /**
     * Sets key.
     *
     * @param key the key
     */
    public void setKey(String key) {
		this.key = key;
	}

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(String value) {
		this.value = value;
	}

}
