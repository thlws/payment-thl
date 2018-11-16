package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险产品业务标记
 *
 * @author auto create
 * @since 1.0, 2017-09-22 16:53:23
 */
public class InsProdTag extends AlipayObject {

	private static final long serialVersionUID = 4848172556464127942L;

	/**
	 * 业务标记代码
	 */
	@ApiField("tag_code")
	private String tagCode;

	/**
	 * 业务标记值
	 */
	@ApiField("tag_value")
	private String tagValue;

    /**
     * Gets tag code.
     *
     * @return the tag code
     */
    public String getTagCode() {
		return this.tagCode;
	}

    /**
     * Sets tag code.
     *
     * @param tagCode the tag code
     */
    public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

    /**
     * Gets tag value.
     *
     * @return the tag value
     */
    public String getTagValue() {
		return this.tagValue;
	}

    /**
     * Sets tag value.
     *
     * @param tagValue the tag value
     */
    public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
