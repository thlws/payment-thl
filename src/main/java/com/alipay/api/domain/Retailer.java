package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零售商信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class Retailer extends AlipayObject {

	private static final long serialVersionUID = 7871896683397377135L;

	/**
	 * 零售商名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 零售商pid
	 */
	@ApiField("partner_id")
	private String partnerId;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return this.name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets partner id.
     *
     * @return the partner id
     */
    public String getPartnerId() {
		return this.partnerId;
	}

    /**
     * Sets partner id.
     *
     * @param partnerId the partner id
     */
    public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
