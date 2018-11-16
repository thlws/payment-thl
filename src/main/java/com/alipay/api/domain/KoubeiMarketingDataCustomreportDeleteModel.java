package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表删除接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:26
 */
public class KoubeiMarketingDataCustomreportDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7187277435515331188L;

	/**
	 * 自定义报表规则的KEY
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
