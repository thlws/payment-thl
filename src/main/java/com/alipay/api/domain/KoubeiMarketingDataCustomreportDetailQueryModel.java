package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表规则详情查询接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:13
 */
public class KoubeiMarketingDataCustomreportDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7591639937293547243L;

	/**
	 * 自定义报表的规则KEY
	 */
	@ApiField("condition_key")
	private String conditionKey;

    /**
     * Gets condition key.
     *
     * @return the condition key
     */
    public String getConditionKey() {
		return this.conditionKey;
	}

    /**
     * Sets condition key.
     *
     * @param conditionKey the condition key
     */
    public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

}
