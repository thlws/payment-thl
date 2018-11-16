package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模型查询参数
 *
 * @author auto create
 * @since 1.0, 2017-04-27 14:36:26
 */
public class ModelQueryParam extends AlipayObject {

	private static final long serialVersionUID = 1383871873826482312L;

	/**
	 * 条件查询参数
	 */
	@ApiField("key")
	private String key;

	/**
	 * 操作计算符，目前仅支持EQ
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 查询参数值
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
     * Gets operate.
     *
     * @return the operate
     */
    public String getOperate() {
		return this.operate;
	}

    /**
     * Sets operate.
     *
     * @param operate the operate
     */
    public void setOperate(String operate) {
		this.operate = operate;
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
