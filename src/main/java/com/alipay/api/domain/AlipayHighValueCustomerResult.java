package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活跃高价值用户返回
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:52:58
 */
public class AlipayHighValueCustomerResult extends AlipayObject {

	private static final long serialVersionUID = 3494119118493477936L;

	/**
	 * Z0-Z7
	 */
	@ApiField("level")
	private String level;

    /**
     * Gets level.
     *
     * @return the level
     */
    public String getLevel() {
		return this.level;
	}

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(String level) {
		this.level = level;
	}

}
