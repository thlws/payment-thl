package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据维度关系模型
 *
 * @author auto create
 * @since 1.0, 2017-12-21 21:39:30
 */
public class DataDim extends AlipayObject {

	private static final long serialVersionUID = 1171521762142426951L;

	/**
	 * 维度名称，代表维度层级含义
不同维度间用“|”分割
	 */
	@ApiField("dim_name")
	private String dimName;

	/**
	 * 维度类型，并级或者层级
parallel     并列维度
hierarchical 层级维度
	 */
	@ApiField("dim_type")
	private String dimType;

	/**
	 * 维度值，代表维度层级的值
	 */
	@ApiField("dim_value")
	private String dimValue;

    /**
     * Gets dim name.
     *
     * @return the dim name
     */
    public String getDimName() {
		return this.dimName;
	}

    /**
     * Sets dim name.
     *
     * @param dimName the dim name
     */
    public void setDimName(String dimName) {
		this.dimName = dimName;
	}

    /**
     * Gets dim type.
     *
     * @return the dim type
     */
    public String getDimType() {
		return this.dimType;
	}

    /**
     * Sets dim type.
     *
     * @param dimType the dim type
     */
    public void setDimType(String dimType) {
		this.dimType = dimType;
	}

    /**
     * Gets dim value.
     *
     * @return the dim value
     */
    public String getDimValue() {
		return this.dimValue;
	}

    /**
     * Sets dim value.
     *
     * @param dimValue the dim value
     */
    public void setDimValue(String dimValue) {
		this.dimValue = dimValue;
	}

}
