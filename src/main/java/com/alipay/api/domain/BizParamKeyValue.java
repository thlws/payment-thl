package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务参数的KeyValue键值对
 *
 * @author auto create
 * @since 1.0, 2018-01-31 22:13:25
 */
public class BizParamKeyValue extends AlipayObject {

	private static final long serialVersionUID = 2792174191316455957L;

	/**
	 * 参数名key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 参数值value
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
