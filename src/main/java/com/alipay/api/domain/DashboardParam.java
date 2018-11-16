package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 仪表盘操作运算参数
 *
 * @author auto create
 * @since 1.0, 2017-01-18 22:20:38
 */
public class DashboardParam extends AlipayObject {

	private static final long serialVersionUID = 1597218214853874371L;

	/**
	 * 仪表盘中的字段列名称
	 */
	@ApiField("key")
	private String key;

	/**
	 * 操作计算符，现支持的包括：EQ(等于),GT(大于),LT(小于),LTE(小于或等于),GTE(大于或等于),NOT_EQ(不等于),LIKE(like),NOT_LIKE(not like)
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 过滤条件值
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
