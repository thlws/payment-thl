package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报表查询条件
 *
 * @author auto create
 * @since 1.0, 2018-05-03 09:41:08
 */
public class ReportQueryCondition extends AlipayObject {

	private static final long serialVersionUID = 8783944342637555977L;

	/**
	 * 字段名称
	 */
	@ApiField("key")
	private String key;

	/**
	 * 操作符号。可能值：EQ(等于),GT(大于),LT(小于),LTE(小于或等于),GTE(大于或等于),NOT_EQ(不等于),LIKE(like),NOT_LIKE(not like),IN(in),NOT_IN(not in),BETWEEN(between)
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 过滤值
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
