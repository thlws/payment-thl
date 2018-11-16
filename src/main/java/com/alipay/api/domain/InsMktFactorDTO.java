package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销规则因子
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class InsMktFactorDTO extends AlipayObject {

	private static final long serialVersionUID = 8515837115594657277L;

	/**
	 * 规则因子
	 */
	@ApiField("key")
	private String key;

	/**
	 * 规则因子值
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
