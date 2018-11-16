package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业征信基本单元
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:33:12
 */
public class EpElement extends AlipayObject {

	private static final long serialVersionUID = 4168412276178152662L;

	/**
	 * 企业征信数据key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 企业征信数据value，字段长度不定。
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
