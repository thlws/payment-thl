package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 松贤测试xxx
 *
 * @author auto create
 * @since 1.0, 2018-08-09 22:08:42
 */
public class AlipayOpenEchoSendModel extends AlipayObject {

	private static final long serialVersionUID = 5854458977669425233L;

	/**
	 * city
	 */
	@ApiField("city")
	private String city;

	/**
	 * xxx
	 */
	@ApiField("name")
	private String name;

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
		return this.city;
	}

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
		this.city = city;
	}

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

}
