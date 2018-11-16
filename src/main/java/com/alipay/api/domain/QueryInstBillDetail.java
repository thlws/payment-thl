package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 欠费单具体明细说明
 *
 * @author auto create
 * @since 1.0, 2013-08-12 15:05:22
 */
public class QueryInstBillDetail extends AlipayObject {

	private static final long serialVersionUID = 8314733856898353771L;

	/**
	 * 明细key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 明细描述
	 */
	@ApiField("name")
	private String name;

	/**
	 * 明细对应值
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
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
