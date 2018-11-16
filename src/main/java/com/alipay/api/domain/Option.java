package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 展示文本和对应取值的映射关系
 *
 * @author auto create
 * @since 1.0, 2017-06-14 11:09:05
 */
public class Option extends AlipayObject {

	private static final long serialVersionUID = 7725956924889966244L;

	/**
	 * 文本，通常用于理解对应的取值
	 */
	@ApiField("text")
	private String text;

	/**
	 * 取值，通常使用简单的数字或字符串
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
		return this.text;
	}

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
		this.text = text;
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
