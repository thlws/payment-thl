package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * xwbsss
 *
 * @author auto create
 * @since 1.0, 2018-01-12 14:06:20
 */
public class AlipayOpenAppXwbsssQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1127311828879421157L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

	/**
	 * 1
	 */
	@ApiListField("c")
	@ApiField("number")
	private List<Long> c;

	/**
	 * 描述描述描述描述
	 */
	@ApiField("effect_date")
	private String effectDate;

    /**
     * Gets a.
     *
     * @return the a
     */
    public String getA() {
		return this.a;
	}

    /**
     * Sets a.
     *
     * @param a the a
     */
    public void setA(String a) {
		this.a = a;
	}

    /**
     * Gets b.
     *
     * @return the b
     */
    public String getB() {
		return this.b;
	}

    /**
     * Sets b.
     *
     * @param b the b
     */
    public void setB(String b) {
		this.b = b;
	}

    /**
     * Gets c.
     *
     * @return the c
     */
    public List<Long> getC() {
		return this.c;
	}

    /**
     * Sets c.
     *
     * @param c the c
     */
    public void setC(List<Long> c) {
		this.c = c;
	}

    /**
     * Gets effect date.
     *
     * @return the effect date
     */
    public String getEffectDate() {
		return this.effectDate;
	}

    /**
     * Sets effect date.
     *
     * @param effectDate the effect date
     */
    public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}

}
