package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险机构
 *
 * @author auto create
 * @since 1.0, 2017-09-22 16:53:23
 */
public class InsMerchant extends AlipayObject {

	private static final long serialVersionUID = 8452731962521292918L;

	/**
	 * 机构全称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 机构简称
	 */
	@ApiField("short_name")
	private String shortName;

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
     * Gets service phone.
     *
     * @return the service phone
     */
    public String getServicePhone() {
		return this.servicePhone;
	}

    /**
     * Sets service phone.
     *
     * @param servicePhone the service phone
     */
    public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

    /**
     * Gets short name.
     *
     * @return the short name
     */
    public String getShortName() {
		return this.shortName;
	}

    /**
     * Sets short name.
     *
     * @param shortName the short name
     */
    public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
