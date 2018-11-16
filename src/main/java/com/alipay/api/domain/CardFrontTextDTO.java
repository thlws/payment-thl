package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡面文案信息模型，展示在卡面上，形如：
 * 学校    武汉理工大学
 *
 * @author auto create
 * @since 1.0, 2017-08-11 10:46:16
 */
public class CardFrontTextDTO extends AlipayObject {

	private static final long serialVersionUID = 8198758682459395918L;

	/**
	 * 文案标签
	 */
	@ApiField("label")
	private String label;

	/**
	 * 展示文案
	 */
	@ApiField("value")
	private String value;

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
		return this.label;
	}

    /**
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(String label) {
		this.label = label;
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
