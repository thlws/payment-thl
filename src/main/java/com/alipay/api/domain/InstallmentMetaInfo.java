package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期对象的元数据信息
 *
 * @author auto create
 * @since 1.0, 2017-08-07 10:17:15
 */
public class InstallmentMetaInfo extends AlipayObject {

	private static final long serialVersionUID = 7532772316923654628L;

	/**
	 * 结束期数，包含此值
	 */
	@ApiField("end_term")
	private Long endTerm;

	/**
	 * 开始期数，包含此值
	 */
	@ApiField("start_term")
	private Long startTerm;

	/**
	 * 分期值（如还款方式、利率等）
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets end term.
     *
     * @return the end term
     */
    public Long getEndTerm() {
		return this.endTerm;
	}

    /**
     * Sets end term.
     *
     * @param endTerm the end term
     */
    public void setEndTerm(Long endTerm) {
		this.endTerm = endTerm;
	}

    /**
     * Gets start term.
     *
     * @return the start term
     */
    public Long getStartTerm() {
		return this.startTerm;
	}

    /**
     * Sets start term.
     *
     * @param startTerm the start term
     */
    public void setStartTerm(Long startTerm) {
		this.startTerm = startTerm;
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
