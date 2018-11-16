package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 明细数据标签
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:29
 */
public class DataTag extends AlipayObject {

	private static final long serialVersionUID = 3566326537924892649L;

	/**
	 * 聚合方式NONE,COUNT,COUNT_DISTINCT,DISTINCT,MIN,MAX,SUM
	 */
	@ApiField("aggregate")
	private String aggregate;

	/**
	 * 列别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 标签CODE
	 */
	@ApiField("code")
	private String code;

    /**
     * Gets aggregate.
     *
     * @return the aggregate
     */
    public String getAggregate() {
		return this.aggregate;
	}

    /**
     * Sets aggregate.
     *
     * @param aggregate the aggregate
     */
    public void setAggregate(String aggregate) {
		this.aggregate = aggregate;
	}

    /**
     * Gets alias.
     *
     * @return the alias
     */
    public String getAlias() {
		return this.alias;
	}

    /**
     * Sets alias.
     *
     * @param alias the alias
     */
    public void setAlias(String alias) {
		this.alias = alias;
	}

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
		return this.code;
	}

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
		this.code = code;
	}

}
