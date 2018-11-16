package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保额
 *
 * @author auto create
 * @since 1.0, 2017-09-22 16:53:23
 */
public class InsSumInsured extends AlipayObject {

	private static final long serialVersionUID = 5897531157584764514L;

	/**
	 * 保额默认值;单位分
	 */
	@ApiField("default_value")
	private Long defaultValue;

	/**
	 * 保额最大值;单位分,当sum_insured_type=MONEY_RANGE时该值有效
	 */
	@ApiField("max_value")
	private Long maxValue;

	/**
	 * 保额最小值;单位分,当sum_insured_type=MONEY_RANGE时该值有效
	 */
	@ApiField("min_value")
	private Long minValue;

	/**
	 * 保额类型;MONEY_RANGE:金额范围,MONEY_LIST:金额可选值,ENUM_VALUE:枚举值
	 */
	@ApiField("sum_insured_type")
	private String sumInsuredType;

	/**
	 * 保额列表;列表里的值单位为分,当sum_insured_type=MONEY_LIST时该值有效
	 */
	@ApiListField("sum_insureds")
	@ApiField("number")
	private List<Long> sumInsureds;

    /**
     * Gets default value.
     *
     * @return the default value
     */
    public Long getDefaultValue() {
		return this.defaultValue;
	}

    /**
     * Sets default value.
     *
     * @param defaultValue the default value
     */
    public void setDefaultValue(Long defaultValue) {
		this.defaultValue = defaultValue;
	}

    /**
     * Gets max value.
     *
     * @return the max value
     */
    public Long getMaxValue() {
		return this.maxValue;
	}

    /**
     * Sets max value.
     *
     * @param maxValue the max value
     */
    public void setMaxValue(Long maxValue) {
		this.maxValue = maxValue;
	}

    /**
     * Gets min value.
     *
     * @return the min value
     */
    public Long getMinValue() {
		return this.minValue;
	}

    /**
     * Sets min value.
     *
     * @param minValue the min value
     */
    public void setMinValue(Long minValue) {
		this.minValue = minValue;
	}

    /**
     * Gets sum insured type.
     *
     * @return the sum insured type
     */
    public String getSumInsuredType() {
		return this.sumInsuredType;
	}

    /**
     * Sets sum insured type.
     *
     * @param sumInsuredType the sum insured type
     */
    public void setSumInsuredType(String sumInsuredType) {
		this.sumInsuredType = sumInsuredType;
	}

    /**
     * Gets sum insureds.
     *
     * @return the sum insureds
     */
    public List<Long> getSumInsureds() {
		return this.sumInsureds;
	}

    /**
     * Sets sum insureds.
     *
     * @param sumInsureds the sum insureds
     */
    public void setSumInsureds(List<Long> sumInsureds) {
		this.sumInsureds = sumInsureds;
	}

}
