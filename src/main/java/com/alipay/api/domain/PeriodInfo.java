package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期模型
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:33
 */
public class PeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 5328276787513477567L;

	/**
	 * 单位
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 周期值
	 */
	@ApiField("value")
	private Long value;

    /**
     * Gets dimension.
     *
     * @return the dimension
     */
    public String getDimension() {
		return this.dimension;
	}

    /**
     * Sets dimension.
     *
     * @param dimension the dimension
     */
    public void setDimension(String dimension) {
		this.dimension = dimension;
	}

    /**
     * Gets value.
     *
     * @return the value
     */
    public Long getValue() {
		return this.value;
	}

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(Long value) {
		this.value = value;
	}

}
