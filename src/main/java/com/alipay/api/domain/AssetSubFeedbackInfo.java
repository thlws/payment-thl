package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AssetSubFeedbackInfo 存放子信息
 *
 * @author auto create
 * @since 1.0, 2018-09-18 17:06:19
 */
public class AssetSubFeedbackInfo extends AlipayObject {

	private static final long serialVersionUID = 6627149948164673857L;

	/**
	 * 返回的信息code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 返回值的描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 具体的值，例如SN号
	 */
	@ApiField("value")
	private String value;

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

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
		return this.desc;
	}

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
		this.desc = desc;
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
