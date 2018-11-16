package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险批单项
 *
 * @author auto create
 * @since 1.0, 2018-04-03 11:28:52
 */
public class InsEndorseItem extends AlipayObject {

	private static final long serialVersionUID = 2521893813544841755L;

	/**
	 * 批单项新值
	 */
	@ApiField("new_value")
	private String newValue;

	/**
	 * 批单项旧值
	 */
	@ApiField("old_value")
	private String oldValue;

	/**
	 * 批单类型;303:保单改期;311:批改保单标的
	 */
	@ApiField("type")
	private Long type;

    /**
     * Gets new value.
     *
     * @return the new value
     */
    public String getNewValue() {
		return this.newValue;
	}

    /**
     * Sets new value.
     *
     * @param newValue the new value
     */
    public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

    /**
     * Gets old value.
     *
     * @return the old value
     */
    public String getOldValue() {
		return this.oldValue;
	}

    /**
     * Sets old value.
     *
     * @param oldValue the old value
     */
    public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

    /**
     * Gets type.
     *
     * @return the type
     */
    public Long getType() {
		return this.type;
	}

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(Long type) {
		this.type = type;
	}

}
